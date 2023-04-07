#!/usr/bin/env groovy

def excelLoader(body){
    echo "Start Deploy"
    new Deployer(script:this).run()
    echo "Deployed"

    currentBuild.result = 'SUCCESS' //FAILURE to fail
    
    return this
}