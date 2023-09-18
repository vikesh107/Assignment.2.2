pipeline {
    agent any

    stages {
        stage('Checkout') {
            steps {
                // Checkout your source code from Git
                checkout scm
            }
        }

        stage('Build') {
            steps {
                // Build the Spring Boot application using 'mvnw.cmd' for Windows
                bat 'mvnw clean package'
            }
        }

        stage('Test') {
            steps {
                // Run tests using 'mvnw.cmd' for Windows
                bat 'mvnw test'
            }
        }

    }
}