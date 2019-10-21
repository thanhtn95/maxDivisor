import java.util.Scanner;

public class MaxDivisor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a: ");
        int a = Math.abs(sc.nextInt());
        System.out.println("Enter b: ");
        int b = Math.abs(sc.nextInt());
        if (a == 0 || b == 0) {
            System.out.println("No greatest common factor");
        }else{
            while( a!=b){
                if(a>b){
                    a = a-b;
                }else b = b-a;
            }
            System.out.println("Greatest common factor: " + a);
        }


    }
}
