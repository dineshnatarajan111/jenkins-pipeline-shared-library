class GetCommits{
    Script script

    def commits(body){
        // script.echo("$body.KLI_img")
        // script.echo("$body.GPEF_img")

        git shortlog body.KLI_img body.GPEF_img
    }
}