using System;
using System.Collections.Generic;

namespace Ejercicio_01
{
    internal class Program
    {
        
        public static List<Evaluacion> Evaluaciones = new List<Evaluacion>();
        public static void Main(string[] args)
        {
            int op = 0;
            String MostrarMenu = "1) Agregar evaluacion\n" +
                                 "2) Mostrar evaluaciones almacenadas\n" +
                                 "3) Eliminar evaluacion\n" +
                                 "4) Calcular Nota y cerrar programa\n";
            var Evaluaciones = new List<Evaluacion>();
            do
            {
                
                Console.WriteLine(MostrarMenu);
                op = Convert.ToInt32(Console.ReadLine());
                switch (op)
                {
                case 1:
                    AgregarEvaluacion();
                    break;
                case 2:
                    MostrarEvaluacionesAlmacenadas();
                    break;
                case 3:
                    EliminarEvaluacion();
                    break;
                case 4:
                    //CalcularNota.Calcular(Evaluaciones);
                    Console.WriteLine("Saliendo del programa (:");
                    break;
                default: Console.WriteLine("Opcion Erronea!");
                    break; 
                } 
            }while (op != 4);
        }

        public static void AgregarEvaluacion()
        {
            Console.WriteLine("AgregandoXD");
        }

        public static void MostrarEvaluacionesAlmacenadas()
        {
            Console.WriteLine("Mostrando");
        }

        public static void EliminarEvaluacion()
        {
            Console.WriteLine("Eliminando");
        }
    }
}