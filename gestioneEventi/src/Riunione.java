import java.time.OffsetDateTime;

public class Riunione implements Evento {
    private OffsetDateTime dataOra;

    private String titolo;

    public Riunione(OffsetDateTime dataOra, String titolo) {
        this.dataOra = dataOra;
        this.titolo = titolo;
    }

    public void setDataOra(OffsetDateTime dataOra) {
        this.dataOra = dataOra;
    }

    public String getTitolo() {
        return titolo;
    }

    public void setTitolo(String titolo) {
        this.titolo = titolo;
    }

    @Override
    public OffsetDateTime getDataOra() {
        return dataOra;
    }

    @Override
    public TipoEventiEnum getTipo() {
        return TipoEventiEnum.RIUNIONE;
    }
}
