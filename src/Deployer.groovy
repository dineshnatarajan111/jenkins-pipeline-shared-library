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
        for(int i=1;i<rows;i++) { 
            for(int j=0;j<cols;j++) { 
            Cell cell = sheet1.getCell(j,i) 
            script.echo( cell.getContents() )
            } 
        }
    }
}