import java.io.IOException;
import java.util.Scanner;

public class Ex1016 {
    public static void main(String[] args) throws IOException {
        int d, t;
        
        Scanner input = new Scanner(System.in);
        
        d = input.nextInt();
        t = d*2;
        System.out.println(t + " minutos");
        input.close();
    }
}
