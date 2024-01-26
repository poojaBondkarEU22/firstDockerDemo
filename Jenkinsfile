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
        stage('docker build image') {
            steps {
                script {
                    sh "docker build -t sp_docker_first_demo ."
                }
            }
        }
        stage('docker push image') {
            steps {
                script {
                    withCredentials([string(credentialsId: 'dockerHubPwd', variable: 'dockerHubPwd')]) {
                        sh "docker login -u bpooja06 -p ${dockerHubPwd}"
                    }
                    sh "docker tag sp_docker_first_demo bpooja06/sp_docker_first_demo:latest"
                    sh "docker push bpooja06/sp_docker_first_demo:latest"
                }
            }
        }
        stage('docker deploye image') {
            steps {
                script {
                    withCredentials([string(credentialsId: 'dockerHubPwd', variable: 'dockerHubPwd')]) {
                       // sh "docker login -u bpooja06 -p ${dockerHubPwd}"
                       sh "docker run -p 8085:8085 bpooja06/sp_docker_first_demo:latest"
                    }
                }
            }
        }
    }
}
