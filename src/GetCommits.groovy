class GetCommits{
    Script script

    def commits(body){
        def KLI = body.KLI_img
        def GPEF = body.GPEF_img

        script.echo("$KLI")
        script.echo("$GPEF")

        bat_cmd(KLI:KLI, GPEF:GPEF)
    }

    def bat_cmd(args){
        script.bat "git shortlog ${args.KLI} ${args.GPEF}"
    }
}