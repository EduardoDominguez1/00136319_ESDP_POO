using System;

namespace Ejercicio_01
{
    public class Evaluacion
    {
        protected int porcentaje;
        public int Porcentaje1 => porcentaje;


        protected String nombre;
        public string Nombre => nombre;


        public Evaluacion(int porcentaje = 0,
            String nombre = "Sin nombre")
        {
            this.porcentaje = porcentaje;
            this.nombre = nombre;
        }
    }
}