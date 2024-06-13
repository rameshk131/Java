package programAskedByCompany;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Test1 {

	public static void main(String[] args) throws ParseException {
		System.out.println("running...........");
		
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-mm-dd");
        Date date1 = simpleDateFormat.parse("2021-12-06");
        Date date2 = simpleDateFormat.parse("2022-12-06");
        
        if(date2.after(date1))
        System.out.println("date2 is latest");
        else
        	System.out.println("date1 is latest");
        	

	}

}
