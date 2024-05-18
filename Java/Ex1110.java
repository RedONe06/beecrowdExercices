import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;

public class Ex1110 {
    public static void main(String[] args) throws IOException {
        
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> discarted = new ArrayList<Integer>();
        String d = "Discarded cards: ";

        int n = input.nextInt();

        while (n != 0) {
            for (int i = 0; i < n; i++) {
                list.add(i + 1);
            }
            
            while (list.size() > 1){
                int prox = list.get(1);
                list.add(prox);
                list.remove(1);
                discarted.add(list.get(0));
                list.remove(0);  
            }
            for(int i = 0; i<discarted.size();i++){
                if(i == 0){
                    d+= discarted.get(i);
                } else {
                    d+= ", " + discarted.get(i);
                }
            }
            System.out.println(d);
            System.out.println("Remaining card: " + list.get(0));

            n = input.nextInt();
            discarted.clear();
            list.clear();
            d = "Discarded cards: ";
        }
 
    }
}
