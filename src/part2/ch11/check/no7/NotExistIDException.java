package part2.ch11.check.no7;

public class NotExistIDException  extends Exception{
    public NotExistIDException() {
    }

    public NotExistIDException(String message) {
        super(message);
    }
}
