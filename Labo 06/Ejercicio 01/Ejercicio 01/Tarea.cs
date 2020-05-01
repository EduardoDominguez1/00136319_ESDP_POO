using System;

namespace Ejercicio_01
{
    public class Tarea : Evaluacion
    {
        private DateTime fechaEntrega;
        public DateTime FechaEntrega => fechaEntrega;

        public Tarea(DateTime fechaEntrega, int porcentaje = 0, string nombre = "Sin nombre") : base(porcentaje, nombre)
        {
            this.fechaEntrega = fechaEntrega;
        }

        public override string ToString()
        {
            return $"Laboratorio: {nameof(nombre)}: {nombre}, {nameof(fechaEntrega)}: {fechaEntrega.ToShortDateString()}, {nameof(porcentaje)}: {porcentaje}";
        }
    }
}