using System;
using System.Collections.Generic;


namespace Ejercicio_05
{
    class Program
    {
        static void Main(string[] args)
        {
            //Realiza un programa que reciba n letras por teclado y almacene en una lista solo las vocales, mayusculas o minusculas
            Console.WriteLine("Labo 05 - Ejercicio 05");
            Console.WriteLine("Ingrese el total de letras que ingresara");
            int total = Convert.ToInt32(Console.ReadLine());

            List<char> vocales = new List<char>(new []{'a','e','i','o','u'});
            List<char> vocalesMayu = new List<char>(new[] {'A', 'E', 'I', 'O', 'U'});
            
            List<char> LisVocalesMin = new List<char>();
            List<char> LisVocalesMayu = new List<char>();
            
            Console.WriteLine("Ingrese las letras 1 por 1 ");
            for (int i = 0; i < total; i++)
            {
                char letra = Convert.ToChar(Console.ReadLine());

                if (char.IsLetter(letra) && vocales.Contains(letra))
                {
                    LisVocalesMin.Add(letra);
                }else if (char.IsLetter(letra) && vocalesMayu.Contains(letra))
                {
                    LisVocalesMayu.Add(letra);
                }
            }
            Console.WriteLine("Vocales mayusculas ingresadas");
            foreach (var vocal in LisVocalesMayu)
            {
                Console.WriteLine(vocal);
            }
            Console.WriteLine("Vocales minusculas ingresadas");
            foreach (var vocal in LisVocalesMin)
            {
                Console.WriteLine(vocal);
            }
        }
    }
}