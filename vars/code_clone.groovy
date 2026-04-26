def call(url, branch){
    echo 'Cloning code from Github'
    git url: url, branch: branch
    echo 'Cloning code from Github is Completed'
}