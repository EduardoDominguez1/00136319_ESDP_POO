package com.ESDP.x00136319;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Ticket> Parqueo = new ArrayList<>();
        RegistroTiempo tiempos = new RegistroTiempo();
        double ganancias = 0;
        int op = 0, hora = 0, salida = 0;

        do {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, mostarMenu()));

            switch (op) {
                case 1:
                    String placa = JOptionPane.showInputDialog(null, "Num. Placa: ");
                    hora = Integer.parseInt(JOptionPane.showInputDialog(null, "Hora de entrada (Ingrese formato militar) "));
                    Parqueo.add(new Ticket(placa, hora));
                    break;
                case 2:
                    String SacarAuto = JOptionPane.showInputDialog(null, "Auto a sacar: ");
                    double total = 0;
                    Moneda gasto = new Moneda(total);
                    for (Ticket compara : Parqueo) {
                        if (compara.getAutoingresado().equals(SacarAuto)) {

                            salida = Integer.parseInt(JOptionPane.showInputDialog(null, "Hora de salida: (Ingrese formato militar) "));
                            int t1 = tiempos.getHoraEntrada();
                            int t2 = salida;
                            int t3 = tiempos.CalcularTiempo(t1,t2);
                            ganancias = CalcularTotal(t3);
                            Parqueo.removeIf(s -> s.getAutoingresado().equals(SacarAuto));

                        } else
                            JOptionPane.showMessageDialog(null, "Placa no encontrada");
                    }

                    break;
                case 3:
                    if (Parqueo.size() == 0) {
                        JOptionPane.showMessageDialog(null, "No hay tickets");
                    } else {
                        Parqueo.forEach(s ->
                                JOptionPane.showMessageDialog(null, s.toString())
                        );
                    }
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Ganancia total del parqueo: $" + ganancias + "\nSaliendo del programa. . .");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "ERROR, ingrese una opcion valida.");
            }
        } while (op != 4);

    }

    static String mostarMenu() {
        return " 1. Ingresar automovil \n 2. Salir del parqueo \n 3. Consultar tiket \n 4. Salir\n";
    }

    static double CalcularTotal(int Tiempo) {

        double total = 0;
        if (Tiempo <= 30) {
            total = 0;
            Cobro(total);
            return 0;
        } else if (Tiempo >= 100 && Tiempo < 200) {
            total = 0.50;
            Cobro(total);
            return 0.50;
        } else if (Tiempo >= 200 && Tiempo <= 230) {
            total = 1.00;
            Cobro(total);
            return 1.00;
        } else if (Tiempo >= 230) {
            total = 5.00;
            Cobro(total);
            return 5.00;
        }
        return total;
    }

    static void Cobro(double total) {
        float valorMoneda;
        double Sumapaga = 0, vuelto = 0, ganancia = 0;

        while (Sumapaga < total) {
            valorMoneda = Float.parseFloat(JOptionPane.showInputDialog("Ingrese monedas 1 por 1(Las denominaciones pueden ser $0.05,$0.10,$0.25,$1.00)"));
            Sumapaga += valorMoneda;
            JOptionPane.showMessageDialog(null, Sumapaga);
        }
        if (Sumapaga > total) {
            vuelto = Sumapaga - total;
            JOptionPane.showMessageDialog(null, "Su cambio es de: $" + vuelto);
        } else {
            JOptionPane.showMessageDialog(null, "Pago realizado correctamente");
        }
    }
}