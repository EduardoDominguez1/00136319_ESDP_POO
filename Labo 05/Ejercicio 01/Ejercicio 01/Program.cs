using System;

namespace Ejercicio_01
{
    class Program
    {
        static void Main(string[] args)
        {
            //Realiza un programa que a traves de un solo for imprima los primeros n terminos de fibonacci
            Console.WriteLine("Labo 05 - Ejercicio 01");

            Console.WriteLine("Ingrese el valor hasta el que se aplicara la serie Fibonacci");
            int n = 0;
            n = Convert.ToInt32(Console.ReadLine());

            int fibo = 1, fibo2 = 1, aux = 0;

            for (int i = 0; i < n; i++)
            {
                Console.Write("[" +fibo+ "] ");
                aux = fibo + fibo2;
                fibo = fibo2;
                fibo2 = aux;
            }
        }
    }
}