def call(){
    echo 'Cleaning images and containers from Docker'
    sh 'docker rm -f $(docker ps -aq) && docker rmi -f $(docker images -aq)'
    echo 'Cleaning images and containers from Docker is Completed'
}