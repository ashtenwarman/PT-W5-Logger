package loggerProject;

public class AsteriskLogger implements Logger {

	@Override
	public void log(String log) {
		System.out.println("***" + log + "***");
		
	}

	@Override
	public void error(String error) {
		String s = "";
		
		for (int i = 0; i < error.length() + 6; i++) {
			s += "*";
		} System.out.println(s + "\n" + "***" + error + "***" + "\n" + s);
		
	}

	
}
