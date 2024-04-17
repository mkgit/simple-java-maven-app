pipeline {
    agent {
        docker {
            label 'docker-maven-jdk8'
            image 'maven:3.8.7-openjdk-18'
            args '-v /root/.m2:/root/.m2'
        }
    }
    stages {
        stage('Build') {
            steps {
                sh 'mvn -B -DskipTests clean package'
            }
        }
        stage('Test') {
            steps {
                sh 'mvn test'
            }
            post {
                always {
                    junit 'target/surefire-reports/*.xml'
                }
            }
        }
        stage('Deliver') { 
            steps {
                sh 'pwd'
                sh './jenkins/scripts/deliver.sh'
            }
        }
    }
}

