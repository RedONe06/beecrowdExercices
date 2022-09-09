import java.io.IOException;
import java.util.Scanner;

public class Ex1241 {
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        
        int N, i;
        String A, B;
        i = 0;
        
        N = input.nextInt();
        
        while(i<N){
            
            A = input.next();
            B = input.next();
            
            if(A.endsWith(B)){
                System.out.println("encaixa");
            } else {
                System.out.println("nao encaixa");
            }
            
            i++;
        }
         
        
        
        
 
    }
}
