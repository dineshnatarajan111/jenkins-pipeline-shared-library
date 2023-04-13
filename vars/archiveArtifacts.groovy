

def call(body){
    archiveArtifacts "GPF_KLI_Dummy.xls"

    currentBuild.result = 'SUCCESS'
}