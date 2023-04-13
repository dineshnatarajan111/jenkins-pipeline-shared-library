class GetCommits implements Serializable{
    Script script

    // def commits(body){
    //     def KLI = body.KLI_img
    //     def GPEF = body.GPEF_img

    //     script.echo("$KLI")
    //     script.echo("$GPEF")

    //     script.echo("$script")

    // }

    def bat_cmd(args){
        script.bat "git shortlog 75fdf46 07321b2"
    }
}