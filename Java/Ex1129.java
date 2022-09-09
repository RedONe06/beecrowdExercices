import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex1129 {
    public static int answerIndex(ArrayList<Integer> numbers){
        int cont = 0;
        int index = 5;
        
        for(int i = 0; i<5; i++){
            if(numbers.get(i)<=127){
                cont++;
                if(cont == 1){
                    index = i;
                } else { 
                    index = 5;
                }
            }
        }
        return index;
    } 
 
    public static void main(String[] args) throws IOException {
        
        ArrayList<Integer> numbers = new ArrayList();
        Scanner input = new Scanner(System.in);
        
        int indexx, N, question;
        
        N = 1;
        
        do{
            N = input.nextInt();
            question = 0;
        
            while(question<N){
                
                numbers.clear();
            
                for(int i = 0; i<5; i++){
                    numbers.add(input.nextInt());
                }
        
                indexx = answerIndex(numbers);
        
                switch(indexx){
                    case 0:
                        System.out.println("A");
                        break;
                    case 1:
                        System.out.println("B");
                        break;
                    case 2:
                        System.out.println("C");
                        break;
                    case 3:
                        System.out.println("D");
                        break;
                    case 4:
                        System.out.println("E");
                        break;
                    case 5:
                        System.out.println("*");
                        break;
                }
                question++;
            }
        }while(N != 0);
    }
}
