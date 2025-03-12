pipeline {
    agent any
    stages {
        stage('Checkout Code') {
            steps {
                git 'https://github.com/araganlapally/git-maven-simple.git'
            }
        }
        stage('Build') {
            steps {
                bat 'mvn clean package'
            }
        }
        stage('Test') {
            steps {
                bat 'mvn test'
            }
        }
        stage('Deploy') {
            steps {
                bat 'java -jar target/simple-maven-jenkin-0.0.1-SNAPSHOT.jar'
            }
        }
    }
