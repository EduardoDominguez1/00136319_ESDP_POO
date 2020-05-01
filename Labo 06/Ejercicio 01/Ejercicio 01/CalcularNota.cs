
using System;
using System.Collections.Generic;

namespace Ejercicio_01
{
    public static class CalcularNota
    {
        public static double Calcular(List<Evaluacion> evaluaciones)
        {
            double notaIngresada, nota = 0d;
            int porcentaje,seguir=0;
            foreach(var evaluacion in evaluaciones)
            {
                do
                {
                    Console.WriteLine("\nIngrese la nota para la siguiente evaluacion:");
                Console.WriteLine("(Nota entre 0 y 10)\n");
                Console.WriteLine(evaluacion);
                Console.Write("Nota: ");
                notaIngresada = Convert.ToDouble(Console.ReadLine());
                if (notaIngresada <= 10 && notaIngresada >= 0)
                {
                    porcentaje = evaluacion.Porcentaje1;
                    nota += (notaIngresada * porcentaje);
                    seguir = 1;
                }
                else Console.WriteLine("Ingrese nota valida");
                } while (seguir != 1);
            }
                
            nota = nota / 100;
            return nota;
        }
    }
}