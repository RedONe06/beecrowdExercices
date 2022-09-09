import java.io.IOException;
import java.io.PrintStream;
import java.util.Locale;
import java.util.Scanner;

public class Ex1011 {
    public static void main(String[] args) throws IOException {
 
        Locale.setDefault(Locale.US);

        Scanner input = new Scanner (System.in);
        double raio = input.nextDouble();

        double pi = 3.14159;
        double volume = (4.0/3.0) * pi * Math.pow(raio, 3); 

        System.out.printf("VOLUME = %.3f%n", volume);
        input.close();
 
    }
}
