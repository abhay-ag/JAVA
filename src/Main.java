import java.util.Scanner;

// Pattern 1

public class Main {
    public static void main(String[] args) {
        Scanner s1 = new Scanner(System.in);

        int n = s1.nextInt();
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println();
        int f = n;
        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= n; j++){
                if(j < f){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            f--;
            System.out.println();
        }
    }
}
