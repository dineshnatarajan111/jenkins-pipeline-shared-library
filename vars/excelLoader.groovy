def excelLoader(body){
    echo "Start Deploy"
    new Deployer(script:this).run()
    echo "Deployed"

    return this
}