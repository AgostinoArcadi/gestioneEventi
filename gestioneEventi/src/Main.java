import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

       Evento riunione1 = new Riunione(OffsetDateTime.now(), "Completamento progetto");
       Evento promemoria1 = new Promemoria(OffsetDateTime.now(), "Mangiare");
       GestioneEventi gestioneEventi = new GestioneEventi();

       gestioneEventi.stampaEventi(new ArrayList<>(Arrays.asList(riunione1,promemoria1)));
    }
}