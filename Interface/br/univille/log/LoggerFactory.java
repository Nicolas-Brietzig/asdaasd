package br.univille.log;

public class LoggerFactory {
    public static Logger onConsole(){
        Logger l = new LoggerConsole();
        return l;
    };

    public static Logger onFile(){
        Logger l = new LoggerFile();
        return l;
    };
}
