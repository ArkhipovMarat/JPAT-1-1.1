import java.text.SimpleDateFormat;
import java.util.Date;

public class Logger {
    private static Logger loggerInstance;

    private Date date;
    private SimpleDateFormat formatForDateNow;

    protected int num = 1;

    private Logger() {
        this.date = new Date();
        this.formatForDateNow = new SimpleDateFormat("E yyyy.MM.dd 'и время' hh:mm:ss a zzz");
    }

    public static Logger getInstance() {
        if (loggerInstance == null) loggerInstance = new Logger();
        return loggerInstance;
    }

    public void log(String msg) {
        System.out.println("[" + formatForDateNow.format(date) + " №" + num++ + "] " + msg);
    }
}
