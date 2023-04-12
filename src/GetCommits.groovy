class GetCommits{
    Script script

    def commits(body){
        script.echo("$body.KLI_img")
        script.echo("$body.GPEF_img")

        script.bat "git shortlog ${body.KLI_img} ${body.GPEF_img}"
    }
}