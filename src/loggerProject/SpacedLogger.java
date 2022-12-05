package loggerProject;

public class SpacedLogger implements Logger {

	@Override
	public void log(String log) {
		
		String result = "";
		
		for (int i = 0; i < log.length(); i++) {
			result += log.charAt(i) + " ";
		} System.out.println(result);
		
	}

	@Override
	public void error(String error) {

		String result = "";
		
		for (int i = 0; i < error.length(); i++) {
			result += error.charAt(i) + " ";
		} System.out.println("ERROR: " + result);
		
	}

}
