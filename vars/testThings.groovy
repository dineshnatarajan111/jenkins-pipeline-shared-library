def call(body){
    echo "Start Deploy"
    new GetCommits(script:this).bat_cmd(body)
    echo "Deployed"

    currentBuild.result = 'SUCCESS' //FAILURE to fail
}