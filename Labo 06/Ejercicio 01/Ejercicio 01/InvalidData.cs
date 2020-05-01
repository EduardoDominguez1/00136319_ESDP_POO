using System;

namespace Ejercicio_01
{
    public class InvalidData : Exception
    {
        public InvalidData(string message) : base(message)
        {
        }
    }
}