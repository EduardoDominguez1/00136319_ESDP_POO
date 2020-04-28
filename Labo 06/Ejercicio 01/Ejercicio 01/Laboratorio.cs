using System;

namespace Ejercicio_01
{
    public class Laboratorio : Evaluacion
    {
        private String tipo;

        public Laboratorio(String tipo, int porcentaje = 0, String nombre = "Sin nombre") : base(porcentaje, nombre)
        {
            this.tipo = tipo;
        }
    }
}