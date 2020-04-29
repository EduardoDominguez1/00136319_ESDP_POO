using System;
using System.Collections.Generic;
using System.Linq;

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
            int opcion = 0,TotalPorcentajes = 0;
            String nombreAct,tipo;
            int porcentaje, cantidadPreguntas;
            DateTime fechaEntrega;
            
            Console.WriteLine("Agregando");
            Console.WriteLine("Que tipo de evaluacion desea agregar:\n" +
                              "1) Laboratorio\n" +
                              "2) Parcial\n" +
                              "3) Tarea");
            opcion = Convert.ToInt32(Console.ReadLine());
            if (opcion == 1)
            {
                Console.WriteLine("*A elegido agregar laboratorio*");
                Console.Write("Ingrese el tipo: ");
                    tipo = Console.ReadLine();
                Console.Write("Ingrese el porcentaje de la actividad: ");
                    porcentaje = Convert.ToInt32(Console.ReadLine());
                Console.Write("Ingrese el nombre del labo: ");
                    nombreAct = Console.ReadLine();
                Evaluaciones.Add(new Laboratorio(tipo,porcentaje,nombreAct));  //Se agrega la actividad labo a la lista
                Console.WriteLine("Agregado correctamente :)\n");
                
            }else if (opcion == 2) 
            {
                Console.WriteLine("*A elegido agregar Parcial*");
                Console.Write("Ingrese la cantidad de preguntas: ");
                    cantidadPreguntas = Convert.ToInt32(Console.ReadLine());
                Console.Write("Ingrese el porcentaje de la actividad: ");
                    porcentaje = Convert.ToInt32(Console.ReadLine());
                Console.Write("Ingrese el nombre del Parcial: ");
                    nombreAct = Console.ReadLine();
                Evaluaciones.Add(new Parcial(cantidadPreguntas,porcentaje,nombreAct));  //Se agrega la actividad Parcial a la lista
                Console.WriteLine("Agregado correctamente :)\n");
                

            }else if (opcion == 3)
            {
                //Tarea, fecha de entrega, porcentaje, nombre.
                Console.WriteLine("*A elegido agregar Tarea*");
                Console.Write("Ingrese la fecha de entrega(Dia - Mes - Año): ");
                fechaEntrega = Convert.ToDateTime(Console.ReadLine());
                Console.Write("Ingrese el porcentaje de la actividad: ");
                    porcentaje = Convert.ToInt32(Console.ReadLine());
                Console.Write("Ingrese el nombre de la Tarea: ");
                    nombreAct = Console.ReadLine();
                Evaluaciones.Add(new Tarea(fechaEntrega,porcentaje,nombreAct));  //Se agrega la actividad Tarea a la lista
                Console.WriteLine("Agregado correctamente :)\n");
                
            }
            else
            {
                Console.WriteLine("Opcion no valida");
            }
        }

        public static void MostrarEvaluacionesAlmacenadas()
        {
            int Totalporcentajes = 0;
            Console.WriteLine("Mostrando evaluaciones almacenadas: ");
            
            
            foreach (var Evaluacion in Evaluaciones)
            {
                Console.WriteLine(Evaluacion.ToString());
                Totalporcentajes += Evaluacion.Porcentaje1;
            }
            
            Console.WriteLine("Total de porcentajes: " +Totalporcentajes + "%\n");
        }

        public static void EliminarEvaluacion()
        {
            Console.WriteLine("Eliminando");
            Console.WriteLine("Ingrese el nombre de la actividad a eliminar");
        }
    }
}