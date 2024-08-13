public class LogApp {
    public static void main(String[] args) {
        LogWriter logWriter = new LogWriter();
        LogReader logReader = new LogReader();
        String logFileName = "logfile.txt";
        logWriter.writeLog(logFileName, "Hi,This is the first log message.");
        logWriter.writeLog(logFileName, "Hey,This is the second log message.");
        logWriter.writeLog(logFileName, "Hello,This is the third log message.");
        System.out.println("Reading from the existing log file:");
        logReader.readLogs(logFileName);
        System.out.println("\nAttempting to read from a non-existent file:");
        logReader.readLogs("nonexistentfile.txt");
    }
}