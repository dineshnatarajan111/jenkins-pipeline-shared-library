@Grab(group = 'org.codehaus.groovy.modules.scriptom', module='scriptom', version = '1.6.0')
import org.codehaus.groovy.scriptom.ActiveXObject

def excel_loader(){
    def excelObj = new ActiveXObject('Excel.Application')
    
    def workBook = excelObj.Workbooks.Open(1c:/codelooru.xlsx1)

    //To get a sheet by index
    def sheetByIndex = workBook.Sheets.Item[1]
    
    //To get the active sheet in the workbook
    def sheetActive = workBook.ActiveSheet
    
    //To get the sheet by name
    def sheetByName = workBook.Sheets('Sheet1')

    def cellValue = sheet.Cells(2,1).Value

}