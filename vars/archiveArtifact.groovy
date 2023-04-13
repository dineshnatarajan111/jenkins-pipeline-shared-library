

def call(body){
    echo hello()
    this.archiveArtifacts "GPF_KLI_Dummy.xls"

    currentBuild.result = 'SUCCESS'
}