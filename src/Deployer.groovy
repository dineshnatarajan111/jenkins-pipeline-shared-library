@Grab(group = 'org.codehaus.groovy.modules.scriptom', module='scriptom', version = '1.6.0')
// @Grab(group = 'org.apache.commons', module = 'commons-lang3', version = '3.6')
// import org.apache.commons.lang3.StringUtils
import org.codehaus.groovy.scriptom.ActiveXObject

class Deployer{
    // int tries = 0
    Script script

    def run(){
        def excelObj = new ActiveXObject('Excel.Application')
        
        def workBook = excelObj.Workbooks.Open("GPF_KLI_Dummy.xlsx")

        //To get a sheet by index
        def sheetByIndex = workBook.Sheets.Item[1]
        
        //To get the active sheet in the workbook
        def sheetActive = workBook.ActiveSheet
        
        //To get the sheet by name
        def sheetByName = workBook.Sheets('Sheet1')

        def cellValue = sheet.Cells(2,1).Value

        // while (tries < 10) {
        //     Thread.sleep(1000)
        //     tries++
        //     script.echo("tries is numeric: " + StringUtils.isAlphanumeric("" + tries))
        // }

    }
}