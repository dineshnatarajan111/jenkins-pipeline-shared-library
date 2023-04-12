// @Grab(group = 'org.apache.commons', module = 'commons-lang3', version = '3.6')
// import org.apache.commons.lang3.StringUtils
@Grab(group = 'net.sourceforge.jexcelapi', module = 'jxl', version = '2.6.12')
import jxl.*

class Deployer{
    // int tries = 0
    Script script

    def run(body){
        script.echo("$body")
        Workbook workbook = Workbook.getWorkbook(new File("$body/GPF_KLI_Dummy.xls"))
        Sheet sheet1 = workbook.getSheet("Sheet1")
        def rows = sheet1.getRows()
        def cols = sheet1.getColumns()
        script.echo( "Row Count =" + rows )
        script.echo( "Column Count =" + cols ) 

        GetCommits getcommit = new GetCommits(script:script)

        for(int i=1;i<rows;i++) { 
            Cell cell_KLI_img = sheet1.getCell(2,i)
            Cell cell_GPEF_img = sheet1.getCell(4,i) 
            Cell cell_KLI_branch = sheet1.getCell(3,i)
            Cell cell_GPEF_branch = sheet1.getCell(5,i)

            if(cell_KLI_branch.getContents() == cell_GPEF_branch.getContents()){
                script.echo(cell_KLI_branch.getContents() + " KLI H")
                script.echo(cell_GPEF_branch.getContents() + " GPERF H")
                getcommits(KLI_img: cell_KLI_img.getContents() , GPEF_img: cell_GPEF_img.getContents())
                // new GetCommits(script:this).commits([KLI_img: cell_KLI_img.getContents() , GPEF_img: cell_GPEF_img.getContents() ])
            }
            // for(int j=0;j<cols;j++) { 
            // script.echo( cell.getContents() )
            // } 
        }
    }
}