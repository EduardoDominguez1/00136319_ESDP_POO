package com.ESDP.x00136319;

import javax.swing.*;

public class RegistroTiempo {
    private int HoraEntrada, HoraSalida;

    public RegistroTiempo(){}

    public RegistroTiempo(int horaEntrada) {
        HoraEntrada = horaEntrada;
        HoraSalida = 0;
    }

    public int getHoraEntrada() {
        return HoraEntrada;
    }

    public void setHoraSalida(int horaSalida) {
        this.HoraSalida = horaSalida;
    }

    public int CalcularTiempo(int t1,int t2){
        HoraEntrada=t1;
        HoraSalida=t2;
        int tiempoParqueo = 0;
            tiempoParqueo = HoraSalida - HoraEntrada;
        return tiempoParqueo;
    }

}
