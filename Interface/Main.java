import br.univille.log.Level;
import br.univille.log.LoggerFactory;

public class Main {
    public static void main(String[] args) {
        LoggerFactory.onConsole().log(Level.DEBUG, "Mensagem de Debug");
        LoggerFactory.onConsole().log(Level.WARNING, "Mensagem de Warning");
        LoggerFactory.onConsole().log(Level.ERROR, "Mensagem de Error");

        LoggerFactory.onFile().log(Level.DEBUG, "Mensagem de Debug");
        LoggerFactory.onFile().log(Level.WARNING, "Mensagem de Warning");
        LoggerFactory.onFile().log(Level.ERROR, "Mensagem de Error");
    }
}