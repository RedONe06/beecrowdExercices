import java.io.IOException;
import java.util.Scanner;

public class Ex1018 {
    public static void main(String[] args) throws IOException {
 
        Scanner input = new Scanner(System.in);
        int hundred, fifty, twenty, ten, five, two, one, N;
        int restHundred, restFifty, restTwenty, restTen, restFive;
        N = input.nextInt();
        
        hundred = N/100;
        restHundred = N%100;
        fifty = restHundred/50;
        restFifty = restHundred%50;
        twenty = restFifty/20;
        restTwenty = restFifty%20;
        ten = restTwenty/10;
        restTen = restTwenty%10;
        five =restTen/5;
        restFive = restTen%5;
        two = restFive/2;
        one = restFive%2;
        
        System.out.println(N);
        System.out.println(hundred + " nota(s) de R$ 100,00");
        System.out.println(fifty + " nota(s) de R$ 50,00");
        System.out.println(twenty + " nota(s) de R$ 20,00");
        System.out.println(ten + " nota(s) de R$ 10,00");
        System.out.println(five + " nota(s) de R$ 5,00");
        System.out.println(two + " nota(s) de R$ 2,00");
        System.out.println(one + " nota(s) de R$ 1,00");
 
    }
}
