package logging;

public class DatabaseLogger implements Logger {

	@Override
	public void getData(String Data) {

		System.out.println("Veri loglandı: Database -  "+Data);
		
	}

}
