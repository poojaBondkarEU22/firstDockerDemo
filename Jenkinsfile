pipeline {
    agent any
    
    tools{
        maven "mvn2"
    }

    stages {
        stage('Git checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/poojaBondkarEU22/firstDockerDemo.git'
            }
        }
        stage('mvn compile') {
            steps {
                sh "mvn clean compile"
            }
        }
        stage('mvn build') {
            steps {
                sh "mvn clean install -DskipTests=true"
            }
        }
    }
}
