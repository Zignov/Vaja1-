import java.util.Scanner;


class Naloga0 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        int stevilo = 17;
        String beseda;
        beseda = "besedilo";
        System.out.println("Naloga0 " + stevilo +" "+ beseda);

        System.out.println("Vnesi stevilko: ");
        Scanner sc = new Scanner(System.in);
        
        int uporabniskiVhod = sc.nextInt();  //String => nextline
        System.out.println(uporabniskiVhod);
    }
}