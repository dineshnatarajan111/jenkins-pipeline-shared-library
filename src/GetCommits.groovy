class GetCommits implements Serializable {
    Script script

    def commits(body){
        def KLI = body.KLI_img
        def GPEF = body.GPEF_img

        script.echo("$KLI")
        script.echo("$GPEF")

        script.bat "git shortlog ${KLI} ${GPEF}"
    }
}