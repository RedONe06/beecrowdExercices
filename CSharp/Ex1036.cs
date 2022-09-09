using System;
using System.Globalization;

class URI
{
    private static void Main(string[] args)
    {
        string nums = Console.ReadLine();

        string[] numsArray = nums.Split(' ');

        double A = Convert.ToDouble(numsArray[0]);
        double B = Convert.ToDouble(numsArray[1]);
        double C = Convert.ToDouble(numsArray[2]);

        double delta = B * B - 4 * A * C;
        double factor2 = 2 * A;

        double x;

        if (delta < 0 || factor2 == 0)
        {
            Console.WriteLine("Impossivel calcular");
        }
        else
        {
            x = (-B + Math.Sqrt(delta)) / factor2;
            Console.WriteLine("R1 = " + x.ToString("0.00000", CultureInfo.InvariantCulture));
            x = (-B - Math.Sqrt(delta)) / factor2;
            Console.WriteLine("R2 = " + x.ToString("0.00000", CultureInfo.InvariantCulture));
        }
    }
}