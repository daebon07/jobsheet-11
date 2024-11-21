import java.util.Scanner;

public class percobaan6_20 {

static int hitungluas (int pjg,int lb){
    int luas = pjg*lb;
    return luas;
}
static int hitungvolume (int tg,int a,int b){
    int vol = tg*a*b;
    return vol;
}

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int p,l,t,L,vol;
    System.out.println("masukan panjang");
    p = input.nextInt();
    System.out.println("masukan lebar");
    l = input.nextInt();
    System.out.println("masukan tinggi");
    t = input.nextInt();

    L=hitungluas(p,l);
    System.out.println("luas persegi panjang adalah " + L);
    vol= hitungvolume(p,l,t);
    System.out.println("volume persgi panjang adalah "+vol);
}


}
