import java.io.IOException;
import java.util.Scanner;

public class Ex1019 {
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        int N, minutes, hours, seconds;
        
        N = input.nextInt();
        
        hours = N/3600;
        minutes = (N%3600)/60;
        seconds =  (N%3600)%60;
        
        System.out.println(hours + ":" + minutes + ":" +
        seconds);
    }
}
