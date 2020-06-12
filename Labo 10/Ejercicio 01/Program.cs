using System;
using System.Collections.Generic;
using System.Linq;

namespace Ejercicio_01
{
    internal class Program
    {
        private delegate void myDelegate(List<CuentaBancaria> CB);
        private static myDelegate Cuentas;
        
        private static  List<CuentaBancaria> CuentasB = new List<CuentaBancaria>();
        public static void Main(string[] args)
        {
            
            
            bool menuOn = true;
            int op = 0;
            string menu = "-------------------------------------------------------------------\n" +
                          "1. Agregar una cuenta.\n" +
                          "2. Ver cuentas almacenadas.\n" +
                          "3. Ver cuentas almacenadas y total.\n" +
                          "4. Ver cuentas almacenadas, total y nombre con vocal como inicial.\n" +
                          "5. Salir del programa.\n"+
                          "";
            do
            {
                Console.WriteLine(menu);
                try
                {
                    op = Convert.ToInt32(Console.ReadLine());
                }
                catch (FormatException e)
                {
                    Console.WriteLine("Ingrese una opcion valida");
                    op = 0;
                }
                switch (op)
                {
                    case 0: break; // Para evitar bugs de try catch
                    
                    case 1:
                        AgregarCuenta();
                        break;
                    case 2:
                        foreach (var Acc in CuentasB)
                        {
                            Console.WriteLine($"Nombre del titular: {Acc.NombrePropietario}, Saldo: {Acc.SaldoActual}");
                        }
                        break;
                    case 3: //Ver cuentas almacenadas y total de las cuentas (suma de saldos)  (Usando delegate explícito)

                        #region Delegate desde 0 (Mostrar cuentas y total)

                        Cuentas = new myDelegate(VerCuentas); //Sub 1 
                        Cuentas += new myDelegate(VerSaldos); //Sub 2 
                        
                        Cuentas.Invoke(CuentasB);
                        #endregion
                        break;
                    case 4: //Ver cuentas almacenadas, el total de las cuentas, y las cuentas de las personas que su nombre inicie con una vocal (Usando Action)

                        #region Utilizando Action

                        Action<List<CuentaBancaria>> BankAccounts = (obj) => //Sub 1
                        {
                            obj.ForEach((acc) =>
                            {
                                Console.WriteLine($"Nombre: {acc.NombrePropietario}, Saldo: ${acc.SaldoActual}");
                            });
                        };
                        BankAccounts += (obj2) =>  //Sub 2 
                        {
                            double Saldos = 0;
                                obj2.ForEach(obj =>
                            {
                                Saldos += obj.SaldoActual;
                            });
                            Console.WriteLine($"Suma de Saldos: ${Saldos}");
                        };
                        BankAccounts += (obj3) => //Sub 3 
                        {
                            Console.WriteLine("Cuentas cuyo propietario inicia con Vocal");
                            var vocales = new[] {'A', 'a', 'E', 'e', 'I', 'i', 'O', 'o', 'U', 'u'};
                            obj3.ForEach(acc =>
                            {
                                if (vocales.Contains(acc.NombrePropietario[0]))
                                {
                                    Console.WriteLine($"Nombre del titular: {acc.NombrePropietario}, Saldo: {acc.SaldoActual}");
                                }
                            });
                        };
                        BankAccounts.Invoke(CuentasB);
                        #endregion
                        break;
                    case 5:
                        string cancel;
                        Console.WriteLine("Saliendo del programa. . . .\n" +
                                          "Precione Enter para terminar o F para cancelar.");
                        cancel = Console.ReadLine();
                        if (cancel.Equals(("F")) || cancel.Equals("f"))
                            Console.WriteLine("Regresando al menu....");
                        else menuOn = false;
                        break;
                }
            } while (menuOn != false);
        }

        #region Agregar cuenta funcion
        public static void AgregarCuenta()
        {
            string nombre;
            double saldo;
            try
            {
                Console.Write("Ingrese el nombre de propietario de la cuenta: ");
                nombre = Console.ReadLine();
                Console.Write("Ingrese el saldo: ");
                saldo = Convert.ToDouble(Console.ReadLine());
                CuentasB.Add(new CuentaBancaria(nombre, saldo));
                Console.WriteLine("Cuenta agregada correctamente!");
            }
            catch (FormatException e)
            {
                Console.WriteLine("Ingrese un dato valido");
            }
        }
        #endregion

        public static void VerCuentas(List<CuentaBancaria> AccB)
        {
            AccB.ForEach((obj) =>
            {
              Console.WriteLine($"Nombre: {obj.NombrePropietario}, Saldo: ${obj.SaldoActual}");
            });
        }

        public static void VerSaldos(List<CuentaBancaria> AccB)
        {
            double Saldos = 0;
            
            AccB.ForEach(obj =>
            {
                Saldos += obj.SaldoActual;
            });
            Console.WriteLine($"Suma de Saldos: ${Saldos}");
        }
    }
}
//Deberá existir un delegate con dos suscripciones para la opción 3
//y un Action con tres suscripciones para la opción 4.
//Si usted decide suscribir al delegate/Action a métodos creados, entonces el otro deberá suscribirlo a lambdas y viceversa, no pueden estar ambos suscritos a un mismo método.