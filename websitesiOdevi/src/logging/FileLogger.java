package logging;

public class FileLogger implements Logger {

	@Override
	public void getData(String Data) {
		System.out.println("Veri loglandı: File -  "+Data);
		
	}

}
