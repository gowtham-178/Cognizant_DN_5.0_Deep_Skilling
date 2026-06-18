public class Logger {
    private  static Logger logger;
    public static Logger getInstance(){
        if(logger==null)
            logger = new Logger();
        return logger;
    }
    public void getMessage(String message){
        System.out.println(message);
    }
}
