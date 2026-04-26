def call(){
    echo 'Running docker compose'
    sh 'docker compose up -d'
    echo 'Running Docker compose is Completed'
}