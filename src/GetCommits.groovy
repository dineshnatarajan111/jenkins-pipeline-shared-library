class GetCommits{
    Script script

    def get_commits = new GetCommits(script)

    def commits(body){
        def KLI = body.KLI_img
        def GPEF = body.GPEF_img

        script.echo("$KLI")
        script.echo("$GPEF")

        get_commits.bat_cmd(script, KLI:KLI, GPEF:GPEF)
    }

    static def bat_cmd(script, KLI, GPEF){
        script.bat "git shortlog ${KLI} ${GPEF}"
    }
}