class GetCommits{
    Script script

    def commits(body){
        def KLI = body.KLI_img
        def GPEF = body.GPEF_img

        script.echo("$KLI")
        script.echo("$GPEF")

        bat_cmd(script, KLI:KLI, GPEF:GPEF)
    }

    static def bat_cmd(script, KLI, GPERF){
        script.bat "git shortlog ${KLI} ${GPEF}"
    }
}