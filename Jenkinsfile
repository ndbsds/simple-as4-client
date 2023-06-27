#!groovy

def tagVersion

pipeline {

    agent {
        label 'gradle-java11'
    }

    options {
        skipDefaultCheckout true
        parallelsAlwaysFailFast()
        buildDiscarder(logRotator(numToKeepStr: '10', daysToKeepStr: '30'))
    }

    stages {
        stage('Compile') {
            steps {
                checkout scmGit(branches: [[name: '**']], extensions: [], gitTool: 'default', userRemoteConfigs: [[credentialsId: 'ndbsds-bot-ci', url: 'https://github.com/ndbsds/simple-as4-client.git']])
                sh 'chmod +x gradlew'
                sh './gradlew jar'

                script {
                    tagVersion = sh(script: './gradlew printVersion -q', returnStdout: true)
                    echo "Building tag version $tagVersion with Commit Id ${env.GIT_COMMIT} "
                }

                dir('.') {
                    stash name: 'built-project', allowEmpty: false, useDefaultExcludes: false, includes: '**'
                }

                archiveArtifacts artifacts: 'as4-client/build/libs/as4-client-*.jar', followSymlinks: false
            }
        }

        stage('Run tests') {
            steps {
                sh 'chmod +x gradlew'
                sh './gradlew test'

                step([$class: 'JUnitResultArchiver', testResults: '**/TEST-*.xml'])
                jacoco deltaBranchCoverage: '3', deltaClassCoverage: '3', deltaComplexityCoverage: '3', deltaInstructionCoverage: '3', deltaLineCoverage: '3', deltaMethodCoverage: '3',
                        maximumBranchCoverage: '36', maximumClassCoverage: '64', maximumComplexityCoverage: '44', maximumInstructionCoverage: '57', maximumLineCoverage: '60', maximumMethodCoverage: '60',
                        minimumBranchCoverage: '35', minimumClassCoverage: '63', minimumComplexityCoverage: '43', minimumInstructionCoverage: '56', minimumLineCoverage: '58', minimumMethodCoverage: '56',
                        execPattern: '**/jacoco/**.exec', exclusionPattern: '**/src/test/java'
            }
        }

        stage('Publish artifacts') {
            steps {
                cleanWs()

                dir('.') {
                    unstash('built-project')
                }

                withCredentials([usernamePassword(credentialsId: 'artifactory-jenkins', passwordVariable: 'ARTIFACTORY_PASSWORD', usernameVariable: 'ARTIFACTORY_USER')]) {
                    sh 'chmod +x gradlew'
                    sh "./gradlew as4-client:publish -PrepoUser=$ARTIFACTORY_USER -PrepoPassword=$ARTIFACTORY_PASSWORD -PartifactoryBaseUrl=$ARTIFACTORY_URL"
                }
            }
        }
    }
}