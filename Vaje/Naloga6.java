import java.util.Scanner;

class Naloga6{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);


        System.out.println("Skupna cena");
        double cena = sc.nextDouble();

        System.out.println("DDV na izdleku: ");
        double ddv = sc.nextDouble();

        System.out.println("Skupna cena:  "+cena+"DDV izdelka:  " +ddv);



        System.out.println("Cena brez DDV:  "+cena / (1+(ddv/100)));



    }
}