pipeline {
    agent { label 'job' }

    stages {
        stage('Docker Cleanup') {
            steps {
                echo 'Cleaning images and containers from Docker'
                sh 'docker rm -f $(docker ps -aq) && docker rmi -f $(docker images -aq)'
                echo 'Cleaning images and containers from Docker is Completed'
            }
        }
        stage('Github Code Clone') {
            steps {
                echo 'Cloning code from Github'
                git url: 'https://github.com/RabbiSE/note-app-django-docker-project.git', branch: 'main'
                echo 'Cloning code from Github is Completed'
            }
        }
        stage('Docker Build and Deployment') {
            steps {
                echo 'Running docker-compose'
                sh 'docker compose up -d'
                echo 'Running Docker-compose is Completed'
            }
        }
        stage('Image to Dockerhub') {
            steps {
                echo 'Pushing image to Dockerhub'
                withCredentials([usernamePassword(
                    credentialsId: 'dockerhub-tocken',
                    usernameVariable:'dockerhubUsername',
                    passwordVariable:'dockerhubPassword')]){
                sh 'docker login -u $dockerhubUsername -p $dockerhubPassword'
                sh 'docker tag django-app-django:latest $dockerhubUsername/django-app-django:latest'
                sh 'docker push $dockerhubUsername/django-app-django:latest'
                echo 'Pushing image to Dockerhub is Completed'
                }
            }
        }
    }
}