using System;

namespace Ejercicio_03
{
    class Program
    {
        static void Main(string[] args)
        {
            //Realice una funcion recursiva que imprima la siguiente secuencia desde 1 hasta n: si n = 3, 1 2 3 2 1
            Console.WriteLine("Labo 05 - Ejercicio 03");
            Console.WriteLine("Ingrese el valor de N");

            int n = Convert.ToInt32(Console.ReadLine());
            int x = 1, contador = 1;
            FuncionRecursiva(n, x, contador);
        }

        static void FuncionRecursiva(int n, int x, int contador)
        {
            if (x < n && contador < n)
            {
                Console.Write(x +" ");
                x++;
                contador++;
                FuncionRecursiva(n,x,contador);
            }else if (x == n)
            {
                Console.Write(x +" ");
                x--;
                FuncionRecursiva(n,x,contador);
                contador++;
            }else if (x < n && x > 0)
            {
                Console.Write(x +" ");
                x--;
                FuncionRecursiva(n,x,contador);
            }else if (x == 0)
                return;
        }
    }
}