#!/usr/bin/env groovy

def call(body){
    echo "Start Deploy"
    new Deployer(script:this).run(body)
    echo "Deployed"

    currentBuild.result = 'SUCCESS' //FAILURE to fail

    return this
}