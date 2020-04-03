package com.ESDP.x00136319;

public final class IdGenerator {
    private static int contador = 0;

    private IdGenerator(){}

    public static int newId(){
        contador++;
        return contador;
    }
}
