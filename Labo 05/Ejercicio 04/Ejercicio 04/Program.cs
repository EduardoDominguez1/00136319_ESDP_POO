using System;

namespace Ejercicio_04
{
    class Program
    {
        static void Main(string[] args)
        {
            //Realiza un programa que remplace todos los caracteres "a" por un caracter "b" de una cadena de texto luego muestra la cadena modificada.
            Console.WriteLine("Labo 05 - Ejercicio 04");
            Console.WriteLine("Programa que remplace todos los caracteres A por un caracter B (no cambia minus si se pone mayus)");
            Console.Write("Ingrese una frase: ");
                string frase = Console.ReadLine();
            Console.WriteLine("A continuacion: ");
            char a, b;
            Console.WriteLine("Ingrese el valor de las letras a cambiar");
            a = Convert.ToChar(Console.ReadLine());
            Console.WriteLine("Ingrese el valor por el cual cambiaran");
            b = Convert.ToChar(Console.ReadLine());
            Console.WriteLine("Cambiando las " + a + " por "+ b);
                string fraseCambiada = frase.Replace(a, b);
            Console.WriteLine(fraseCambiada);
        }
    }
}