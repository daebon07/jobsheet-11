import java.util.Scanner;

public class percobaan6_20 {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
         int p,l,t,L,vol;
         System.out.println("masukan panjang");
         p = input.nextInt();
         System.out.println("masukan lebar");
         l = input.nextInt();
         System.out.println("masukan tinggi");
         t = input.nextInt();

         L=p*l;
         System.out.println("luas persegi panjang adalah " + L);
         vol= p*l*t;
         System.out.println("volume persgi panjang adalah "+vol);
}
}
