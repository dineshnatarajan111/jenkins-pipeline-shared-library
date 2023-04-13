def call(body){
    echo "Start Deploy"
    new GetCommits(script:this).run(body)
    echo "Deployed"

    currentBuild.result = 'SUCCESS' //FAILURE to fail
}