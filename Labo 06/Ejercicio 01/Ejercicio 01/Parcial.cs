using System;

namespace Ejercicio_01
{
    public class Parcial : Evaluacion
    {
        private int CantPreguntas;

        public Parcial(int cantPreguntas, int porcentaje = 0, String nombre = "Sin nombre") : base(porcentaje, nombre)
        {
            CantPreguntas = cantPreguntas;
        }
        
        public override string ToString()
        {
            return $"Parcial: {nameof(nombre)}: {nombre}, {nameof(CantPreguntas)}: {CantPreguntas}, {nameof(porcentaje)}: {porcentaje}";
        }
    }
}