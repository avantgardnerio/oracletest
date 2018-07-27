pipeline {
    agent { dockerfile true }
    environment {
        PATH = "/usr/local/bin:$PATH"
    }
    stages {
        stage('setup') {
            steps {
                sh "env"
                sh "docker -v"
            }
        }
        stage('Test') {
            steps {
                sh './gradlew build'
            }
        }
    }
}