import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Locale;

public class GestioneEventi {
    public void stampaEventi(ArrayList<Evento> eventiList) {
        String RESET = "\u001B[0m";
        String RED = "\u001B[31m";
        for(Evento evento1 : eventiList) {

            if(evento1.getTipo() == TipoEventiEnum.PROMEMORIA) {
                System.out.println(RED);
                String dateString = evento1.getDataOra().format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
                System.out.println(dateString);
                System.out.println(evento1.getTipo());
                System.out.println("-------------------------------------------");
                System.out.println(RESET);
            }
            if(evento1.getTipo() == TipoEventiEnum.RIUNIONE) {
                String dateString = evento1.getDataOra().format(DateTimeFormatter.ofPattern("dd MMMM yyyy", Locale.ITALY));
                System.out.println(dateString);
                System.out.println(evento1.getTipo());
                System.out.println("&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&&");
            }
        }
    }
}
