pipeline {
    agent any
    tools {
        maven "MAVEN_HOME"
    }
    stages {
        stage('Build Artifact') {
            steps {
                sh "mvn clean package -DskipTests=true"
                archive 'target/*.jar'
            }
        }
    }
}