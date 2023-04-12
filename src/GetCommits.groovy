class GetCommits{
    Script script

    def commits(body){
        def KLI = body.KLI_img
        def GPEF = body.GPEF_img

        script.echo("$KLI")
        script.echo("$GPEF")

        script.echo("$script")

    }

    def bat_cmd(args){
        script.sh "git shortlog ${args.KLI_img} ${args.GPEF_img}"
    }
}