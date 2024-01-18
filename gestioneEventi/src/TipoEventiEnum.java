public enum TipoEventiEnum {
    PROMEMORIA ("Promemoria"),
    RIUNIONE ("Riunione");

    private final String tipoEvento;

    TipoEventiEnum(String tipoEvento) {
        this.tipoEvento = tipoEvento;
    }

    public String getTipoEvento() {
        return tipoEvento;
    }
}
