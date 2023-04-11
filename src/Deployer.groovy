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
        for(int i=0;i<rows;i++) { 
            Cell cell_KLI = sheet1.getCell(i,3)
            Cell cell_GPEF = sheet1.getCell(i,5) 
            script.echo(cell_KLI.getContents() + "KLI")
            script.echo(cell_GPEF.getContents() + "GPERF")
            // for(int j=0;j<cols;j++) { 
            // script.echo( cell.getContents() )
            // } 
        }
    }
}