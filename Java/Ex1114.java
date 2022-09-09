import java.io.IOException;
import java.util.Scanner;

public class Ex1114 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
         boolean cond = false;
         while (cond == false) {
 
             int password = input.nextInt();
 
             if (password == 2002) {
                 System.out.println("Acesso Permitido");
                 cond = true;
             } else {
                 System.out.println("Senha Invalida");
             }
         }
      }
}
