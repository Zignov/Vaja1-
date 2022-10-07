import java.util.Scanner;


class Naloga4 {
    public static void main(String[]args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Prva stevilka");
        int a = sc.nextInt();
        System.out.println("Druga stevilka");
        int b = sc.nextInt();
        
        
        System.out.println("Pred zamenjavo: "+a +" "+b);
        
        
        int c = b;
        b = a;
        a = c;

        System.out.println("Po zamenjavi: "+ a +" "+ b);


    }
}