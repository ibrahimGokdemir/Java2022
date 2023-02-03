import java.sql.Date;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.List;

		public class Main {


			public static void main(String[] args) {
				
				java.util.Date utilDate= new java.util.Date();  //Normal Date
//				System.out.println("java.util.Date= "+ utilDate);
				
				java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());  //Sql için Date
				
//				System.out.println("java.sql.Date= "+ sqlDate);


				SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyy hh:mm.ss"); //Custom Date Hazirlama
				
				String date = dateFormat.format(utilDate); 
				
//				
				
				LocalDate lDate ; // LocalDate.now(); // varsayılan ttarihi oluşturma
//				lDate = LocalDate.of(2023,01,28);		// Custom date oluşturma
//				lDate = LocalDate.parse("2023-01-29");
				lDate = LocalDate.now(ZoneId.systemDefault());
				
				LocalDateTime lDateTime = LocalDateTime.now(); //Ustteki medotlar burada da geçerli
				
//				System.out.println(lDateTime); //Cikti --> 2023-01-27T17:21:20.612221
				
				LocalTime time = LocalTime.now();
				
				time = LocalTime.MIDNIGHT; //00:00
				time = LocalTime.NOON;		//12:00
//				System.out.println(time);
				
				LocalDate yarin = LocalDate.now().plusDays(1); //1 gun sonra
//				System.out.println(LocalDate.now().withMonth(6));

				
				
				/*
				 * LocalDate.now();
				 * LocalDate y = LocalDate.now().minusDays(1);
				 * LocalDate t = LocalDate.now().plusDays(1);
				 * LocalDate t = LocalDate.of(2023, 1, 29, 23, 19, 0, 0);
				 * LocalDate.now().withMonth(6);
				 * LocalTime.of(13, 12, 11) 13:12:11
				 *LocalTime.MIDNIGHT 00:00
				 *LocalTime.NOON 12:00
				 *LocalTime.now() Current time from system clock
				 *LocalTime.MAX The maximum supported local time 23:59:59.999999999
				 *LocalTime.MIN The minimum supported local time 00:00
				 *LocalTime.ofSecondOfDay(84399) 23:59:59 , Obtains Time from second-of-day value
				 *LocalTime.ofNanoOfDay(2000000000) 00:00:02 , Obtains Time from nanos-of-day value
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 * 
				 */

				
				
				List test = new ArrayList();
			ArrayList<String> test2;
			
			String[] stringArray = {"foo", "bar", "baz"};
			List<String> stringList = Arrays.asList(stringArray);

			
			
			
			}

		}


		
		
		
		
		
		
		
		
		
		
		
		
		
