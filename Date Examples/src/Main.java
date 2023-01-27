import java.sql.Date;
		import java.text.SimpleDateFormat;
		import java.util.Calendar;

		public class Main {


			public static void main(String[] args) {
				
				java.util.Date utilDate= new java.util.Date();  //Normal Date
//				System.out.println("java.util.Date= "+ utilDate);
				
				java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());  //Sql için Date
				
//				System.out.println("java.sql.Date= "+ sqlDate);


				SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyy hh:mm.ss"); //Custom Date Hazirlama
				
				String date = dateFormat.format(utilDate); 
				
				System.out.println(date);
				

			}

		}


