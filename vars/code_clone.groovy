def call(String url, String branch){
    echo 'Cloning code from Github'
    git url: '${url}', branch: '${branch}'
    echo 'Cloning code from Github is Completed'
}