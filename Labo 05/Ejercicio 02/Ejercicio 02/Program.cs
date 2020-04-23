using System;
using System.Linq;
using System.Text;


namespace Ejercicio_02
{
    class Program
    {
        static void Main(string[] args)
        {
            //Hacer una funcion que determine si una frase es palindrome o no e imprima el valor de verdad
            
            Console.WriteLine("Labo 05 - Ejercicio 02");
            Console.WriteLine("True = palindrome \nFalse = No es palindrome");
            Console.WriteLine(palindrome());
        }

        static bool palindrome(){
            bool palindrome = false;
            string palabra, palabraRev;
            Console.Write("Escriba una palabra: ");
            
            palabra = Console.ReadLine();
            
            char[] pch = palabra.ToCharArray();
            
            Array.Reverse(pch);
            palabraRev = new string(pch);
            if(palabra.Equals(palabraRev, StringComparison.OrdinalIgnoreCase))
            {
                palindrome = true;

            }
            return palindrome;
        }
    }
}