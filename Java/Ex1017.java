import java.io.IOException;
import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex1017 {
    public static void main(String[] args) throws IOException {
        
        int t, v;
        double d, l;
        
        Scanner input = new Scanner(System.in);
        DecimalFormat f = new DecimalFormat("0.000");
        
        t = input.nextInt();
        v = input.nextInt();
        
        d = t*v;
        l = d/12.0;
        
        System.out.println(f.format(l));
        input.close();

    }
}
