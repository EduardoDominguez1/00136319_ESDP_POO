using System;
using System.Collections.Generic;
using System.Linq;

namespace Ejercicio_01
{
    internal class Program
    {
        
        public static List<Evaluacion> Evaluaciones = new List<Evaluacion>();
        public static int TotalPorcentaje = 0;
        public static void Main(string[] args)
        {
            int op = 0;
            String MostrarMenu = "1) Agregar evaluacion\n" +
                                 "2) Mostrar evaluaciones almacenadas\n" +
                                 "3) Eliminar evaluacion\n" +
                                 "4) Calcular Nota y cerrar programa\n";
            do
            {
                Console.WriteLine("Porcentaje total actual de las evaluaciones: "+ TotalPorcentaje + "%");
                Console.WriteLine(MostrarMenu);
                try {
                    op = Convert.ToInt32(Console.ReadLine());
                }
                catch (FormatException e){
                    Console.WriteLine("*****ERROR INGRESE UN DATO VALIDO*****");
                    op = 5;
                }
                switch (op)
                {
                    
                case 1:
                    try
                    {
                        AgregarEvaluacion();
                    }
                    catch (FormatException e)
                    {
                        Console.WriteLine("ERROR: Ingreso un tipo no valido");
                    }catch (LimitedExceeded e)
                    {
                        Console.WriteLine(e.Message);
                    }
                    break;
                case 2:
                    MostrarEvaluacionesAlmacenadas();
                    break;
                case 3:
                    EliminarEvaluacion();
                    break;
                case 4:
                    Console.WriteLine("Se procedera a asignar las notas de las evaluaciones para calcular la nota final: ");
                    Console.WriteLine("La Nota final: "+CalcularNota.Calcular(Evaluaciones));
                    Console.WriteLine("Saliendo del programa....");
                    break;
                case 5: break;    //Caso por si ponen una letra tira hacia aqui para evitar otros bug
                default: Console.WriteLine("Opcion Erronea!");
                    break; 
                } 
            }while (op != 4);
        }

        public static void AgregarEvaluacion()
        {
            int opcion = 0;
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
                    TotalPorcentaje += porcentaje;
                    if (TotalPorcentaje > 100)
                    {
                        TotalPorcentaje -= porcentaje;//Se le resta el porcentaje no valido para mantener normal el contador global
                        throw new LimitedExceeded("\nERROR: El porcentaje total no puede sobrepasar el 100%\n");
                    }
                    else
                    {
                        Evaluaciones.Add(new Laboratorio(tipo, porcentaje, nombreAct)); //Se agrega la actividad labo a la lista
                        Console.WriteLine("Agregado correctamente :)\n");
                    }
            }else if (opcion == 2) 
            {
                Console.WriteLine("*A elegido agregar Parcial*");
                Console.Write("Ingrese la cantidad de preguntas: ");
                    cantidadPreguntas = Convert.ToInt32(Console.ReadLine());
                Console.Write("Ingrese el porcentaje de la actividad: ");
                    porcentaje = Convert.ToInt32(Console.ReadLine());
                Console.Write("Ingrese el nombre del Parcial: ");
                    nombreAct = Console.ReadLine();
                    TotalPorcentaje += porcentaje;
                    if(TotalPorcentaje>100)
                    {
                        TotalPorcentaje -= porcentaje;//Se le resta el porcentaje no valido para mantener normal el contador global
                        throw new LimitedExceeded("\nERROR: El porcentaje total no puede sobrepasar el 100%\n");
                    }
                    else
                    {
                        Evaluaciones.Add(new Parcial(cantidadPreguntas,porcentaje,nombreAct));  //Se agrega la actividad Parcial a la lista
                        Console.WriteLine("Agregado correctamente :)\n");
                    }
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
                    TotalPorcentaje += porcentaje;
                    if(TotalPorcentaje>100)
                    {
                        TotalPorcentaje -= porcentaje;//Se le resta el porcentaje no valido para mantener normal el contador global
                        throw new LimitedExceeded("\nERROR: El porcentaje total no puede sobrepasar el 100%\n");
                    }
                    else
                    {
                        Evaluaciones.Add(new Tarea(fechaEntrega,porcentaje,nombreAct));  //Se agrega la actividad Tarea a la lista
                        Console.WriteLine("Agregado correctamente :)\n");
                    }
            }
            else
            {
                Console.WriteLine("Opcion no valida");
            }
        }

        public static void MostrarEvaluacionesAlmacenadas()
        {
            int totalporcentajes = 0;
            Console.WriteLine("Mostrando evaluaciones almacenadas: ");
            
            
            foreach (var evaluacion in Evaluaciones)
            {
                Console.WriteLine(evaluacion.ToString());
                totalporcentajes += evaluacion.Porcentaje1;
            }
            TotalPorcentaje = totalporcentajes;
            Console.WriteLine("Total de porcentajes: " +totalporcentajes + "%\n");
        }

        public static void EliminarEvaluacion()
        {
            Console.Write("Ingrese el nombre de la actividad a eliminar: ");
                string nombreAeliminar = Console.ReadLine();
                Evaluacion aux = null;
                int porcentajeARestar = 0;
                foreach (var evaluacion in Evaluaciones)
                {
                    if (evaluacion.Nombre == nombreAeliminar)
                        aux = evaluacion;
                        porcentajeARestar = evaluacion.Porcentaje1;
                }
                if (aux != null)
                {
                    Evaluaciones.Remove(aux);
                    TotalPorcentaje -= porcentajeARestar;
                    Console.WriteLine("Evaluacion eliminada correctamente\n");
                }else
                    Console.WriteLine("Evaluacion no encontrada, no se pudo eliminar.\n"); 
        }
    }
}
