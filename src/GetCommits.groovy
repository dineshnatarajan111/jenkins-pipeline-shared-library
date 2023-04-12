class GetCommits implements Serializable {
    Script script
    def steps
    GetCommits(steps) {this.steps = steps}
    def commits(body){
        def KLI = body.KLI_img
        def GPEF = body.GPEF_img

        script.echo("$KLI")
        script.echo("$GPEF")

    }

    def bat_cmd(args){
        steps.bat "git shortlog ${args.KLI} ${args.GPEF}"
    }
}