
using System;
using System.Collections.Generic;

namespace Ejercicio_01
{
    public static class CalcularNota
    {
        public static double Calcular(List<Evaluacion> evaluaciones)
        {
            double notaIngresada, nota = 0d;
            int porcentaje;
            foreach(var evaluacion in evaluaciones)
            {
                Console.WriteLine("\nIngrese la nota obtenida para la siguiente evaluacion:\n");
                Console.WriteLine(evaluacion);
                Console.Write("Nota: ");
                notaIngresada = Convert.ToDouble(Console.ReadLine());
                porcentaje = evaluacion.Porcentaje1;
                nota += (notaIngresada * porcentaje);
            }
            nota = nota / 100;
            return nota;
        }
    }
}