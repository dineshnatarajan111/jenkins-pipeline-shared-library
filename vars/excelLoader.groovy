def excelLoader(){
    echo "Start Deploy"
    new Deployer(script:this).run()
    echo "Deployed"
}