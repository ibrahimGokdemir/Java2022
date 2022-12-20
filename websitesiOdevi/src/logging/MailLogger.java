package logging;

public class MailLogger implements Logger{

	@Override
	public void getData(String Data) {
		System.out.println("Veri loglandı: Mail -  "+Data);
		
	}

}
