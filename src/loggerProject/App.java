package loggerProject;

public class App {

	public static void main(String[] args) {

		Logger astLogger = new AsteriskLogger();
		
		astLogger.log("Hello");
		System.out.println();
		astLogger.error("Error: Hello");
		
		System.out.println("\n");
		
		Logger sLogger = new SpacedLogger();
		
		sLogger.log("Hello");
		System.out.println();
		sLogger.error("Hello");
	}

	
	}


