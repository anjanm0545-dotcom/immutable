pipeline {
    agent any

    tools {
        maven 'maven'
    }

    stages {

        stage('checkout') {
            steps {
                git branch: 'main',
                url: 'https://github.com/anjanm0545-dotcom/immutable.git'
            }
        }

        stage('compile') {
            steps {
                sh 'mvn compile'
            }
        }

        stage('test') {
            steps {
                sh 'mvn test'
            }
        }

        stage('package') {
            steps {
                sh 'mvn package'
            }
        }

        stage('run application') {
            steps {
                sh 'mvn exec:java -Dexec.mainClass="com.example.App"'
            }
        }
    }

    post {
        success {
            echo 'Build deployed successfully'
        }

        failure {
            echo 'Build failed'
        }
    }
}
