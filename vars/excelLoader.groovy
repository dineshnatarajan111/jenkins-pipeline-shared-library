def excel_loader(){
    echo "Start Deploy"
    new Deployer(script:this).run()
    echo "Deployed"
}