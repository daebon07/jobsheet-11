public class kafe20 {
public static void menu( String namapelanggan, boolean ismember, String promo) {
    System.out.println("selamat datang " + namapelanggan + " !");

    if (promo.equals("DISKON50")) {
        System.out.println("Anda mendapatkan diskon 50%!");
    } else if (promo.equals("DISKON30")) {
        System.out.println("Anda mendapatkan diskon 30%!");
    } else {
        System.out.println("Kode promo tidak valid.");
    }

    if (ismember){
        System.out.println("anda adalah member dapatkan diskon 10% untuk setiap pembelian");
    }

    System.out.println("==== MENU RESTO KAFE ====");
    System.out.println("1. kopi hitam - Rp 15,000");
    System.out.println("2. cappuccino - Rp 20,000");
    System.out.println("3. latte - Rp 22,000");
    System.out.println("4. teh tarik - Rp 12,000");
    System.out.println("5. roti bakat - Rp 10,000");
    System.out.println("6. mie goreng - Rp 18,000");
    System.out.println("=========================");
    System.out.println("silahkan pilih menu yang anda inginkan");
    
}
public static void main(String[] args) {
    menu("Andi", true, "DISKON50"); 
    menu("shabran", false, "DISKON30"); 
    menu("solohin", true, "INVALID");   
}
}