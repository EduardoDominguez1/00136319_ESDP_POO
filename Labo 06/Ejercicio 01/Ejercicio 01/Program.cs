using System;
using System.Collections.Generic;

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
                    Console.WriteLine("\n*****ERROR INGRESE UN DATO VALIDO*****\n");
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
                        Console.WriteLine("\nERROR: Ingreso un tipo de dato valido\n");
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
                    try
                    {
                        Console.WriteLine("Se procedera a asignar las notas de las evaluaciones para calcular la nota final: ");
                        Console.WriteLine("Se calculara la nota segun el porcentaje de las evaluaciones actuales: "+TotalPorcentaje+"%");
                        Console.WriteLine("En caso de no llegar al 100% el resto de actividades se tomara como nota 0");
                        Console.WriteLine("La Nota final: "+CalcularNota.Calcular(Evaluaciones));
                        op = 6;
                        Console.WriteLine("Saliendo del programa....");
                    }
                    catch (FormatException e)
                    {
                        Console.WriteLine("\nERROR: Ingreso un tipo de dato valido, volviendo al menu\n");
                    }
                    break;
                case 5: break;    //Caso por si ponen una letra tira hacia aqui para evitar otros bug
                default: Console.WriteLine("Opcion Erronea!");
                    break; 
                } 
            }while (op != 6);
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
                Console.Write("Ingrese la fecha de entrega(Mes / Dia / Año): ");
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
                int porcentajeARestar = 0, NombresRepetidos = 0;
                foreach (var evaluacion in Evaluaciones)
                {
                    if (evaluacion.Nombre.Equals(nombreAeliminar, StringComparison.InvariantCultureIgnoreCase))
                    {
                        NombresRepetidos++;
                        aux = evaluacion; 
                        porcentajeARestar = evaluacion.Porcentaje1;
                    }
                }

                if (NombresRepetidos == 0 || aux == null)//La lista esta vacia o no se encontro la Evaluacion solicitada
                {
                    Console.WriteLine("Evaluacion no encontrada o Lista Vacia");
                }else if(NombresRepetidos == 1)
                {
                    Evaluaciones.Remove(aux);
                    TotalPorcentaje -= porcentajeARestar;
                    Console.WriteLine("Evaluacion eliminada correctamente\n");
                }else if (NombresRepetidos > 1)
                {
                    Console.WriteLine("Existe mas de 1 evaluacion con ese nombre!!");
                    Console.WriteLine("Especifique la Evaluacion a eliminar:\n");

                    foreach (var evaluacion in Evaluaciones){
                        if(evaluacion.Nombre.Equals(nombreAeliminar, StringComparison.InvariantCultureIgnoreCase))
                        {
                            Console.WriteLine("--------------------------------------------------------------");
                            Console.WriteLine(evaluacion+"\nEsta es la evaluacion que desea Eliminar??? (S/N)");
                            String eleccion = Console.ReadLine();
                            if(eleccion.Equals("S",StringComparison.InvariantCultureIgnoreCase))
                            {
                                aux = evaluacion;
                                porcentajeARestar = evaluacion.Porcentaje1;
                                TotalPorcentaje -= porcentajeARestar;
                                Console.WriteLine("Evaluacion eliminada correctamente\n");
                                break;
                            }else if (eleccion.Equals("N", StringComparison.InvariantCultureIgnoreCase))
                                Console.WriteLine("Cargando....");
                            else
                            {
                                Console.WriteLine("No es una opcion valida..");
                                break;
                            }
                        }
                    }
                    Evaluaciones.Remove(aux);
                }
        }
    }
}
