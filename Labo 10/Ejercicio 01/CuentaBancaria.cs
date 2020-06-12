namespace Ejercicio_01
{
    public class CuentaBancaria
    {
        public string NombrePropietario;
        public double SaldoActual;

        public CuentaBancaria(string nombrePropietario = "unnamed", double saldoActual = 0)
        {
            NombrePropietario = nombrePropietario;
            SaldoActual = saldoActual;
        }
    }
}