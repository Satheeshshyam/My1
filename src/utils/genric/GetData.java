package utils.genric;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class GetData {

		public static String fromexcel(String fp,String sn,int rI,int cI) 
		{
		
			String str = null;
			try {
				File f=new File(fp);
				FileInputStream fis=new FileInputStream(f);
				Workbook wb = WorkbookFactory.create(fis);
				Sheet s=wb.getSheet(sn);
				Row r=s.getRow(rI);
				Cell c=r.getCell(cI);
				str = c.toString();
				
			    } catch (Exception e) 
			{
				
			}
			return str;
		}
		
	}


