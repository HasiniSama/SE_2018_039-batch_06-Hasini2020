import java.util.Scanner;

class B{
    public static void printHailstone(int a){
        while(a!=1){
            if(a%2==0){
                a = a/2;
                System.out.println(a);
            }
            else{
                a = (a*3)+ 1;
                System.out.println(a);
            }
        }

    }
    public static void main (String args[]){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = input.nextInt();

        B.printHailstone(n);
        input.close();
    } 
 }