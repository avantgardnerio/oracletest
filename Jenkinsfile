pipeline {
    agent { dockerfile true }
    environment {
        PATH = "/usr/local/bin:$PATH"
    }
    stages {
        stage('Test') {
            steps {
                sh './gradlew build'
            }
        }
    }
}