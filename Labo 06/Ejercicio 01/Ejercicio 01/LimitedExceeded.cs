using System;


namespace Ejercicio_01
{
    public class LimitedExceeded : Exception
    {
        public LimitedExceeded(string message) : base(message)
        {
        }
    }
}