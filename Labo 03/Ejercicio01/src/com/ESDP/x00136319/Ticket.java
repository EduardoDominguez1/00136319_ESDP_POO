package com.ESDP.x00136319;

public class Ticket {
    private String autoingresado;
    private RegistroTiempo estadia;

    public Ticket(String autoingresado, int estadia) {
        this.autoingresado = autoingresado;
        this.estadia = new RegistroTiempo(estadia);
    }

    public String getAutoingresado() {
        return autoingresado;
    }

    public RegistroTiempo getEstadia() {
        return estadia;
    }

    @Override
    public String toString() {
        return "Ticket{" +
                "Placa = " + autoingresado+ '\'' +
                ", Hora de entrada = " + estadia.getHoraEntrada() +
                '}';
    }
}
