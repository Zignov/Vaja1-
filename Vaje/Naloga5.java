import java.util.Scanner;

class Naloga5{
    public static void main(String[]args){

        Scanner sc = new Scanner(System.in);


        System.out.println("Cena izdleka: ");
        double cena = sc.nextDouble();

        System.out.println("DDV na izdleku: ");
        double ddv = sc.nextDouble();

        System.out.println("Cena vasega izdelka:  "+cena+"DDV izdelka:  " +ddv);



        System.out.println("Skupna cena:  "+cena * (1+(ddv/100)));



    }
}