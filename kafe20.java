import java.util.Scanner;

public class kafe20 {
    public static void menu(String namapelanggan, boolean ismember, String promo) {
        System.out.println("Selamat datang " + namapelanggan + " !");

        if (promo.equals("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50%!");
        } else if (promo.equals("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30%!");
        } else {
            System.out.println("Kode promo tidak valid.");
        }

        if (ismember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian.");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("=========================");
        System.out.println("Silahkan pilih menu yang Anda inginkan, masukkan angka menu dan jumlah item.");
        System.out.println("Masukkan angka menu 0 untuk selesai memilih.");
    }

    public static int hitunghargatotal(int pilihanmenu, int banyakitem, String kodePromo) {
        int[] hargaitems = {15000, 20000, 22000, 12000, 10000, 18000};
        int hargatotal = hargaitems[pilihanmenu - 1] * banyakitem;

       
        if (kodePromo.equals("DISKON50")) {
            hargatotal -= hargatotal / 2; 
            System.out.println("Anda mendapatkan diskon 50% dari total harga.");
        } else if (kodePromo.equals("DISKON30")) {
            hargatotal -= hargatotal * 30 / 100; 
            System.out.println("Anda mendapatkan diskon 30% dari total harga.");
        } else {
            System.out.println("Kode promo tidak valid. Tidak ada diskon.");
        }

        return hargatotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Masukkan nama pelanggan:");
        String namapelanggan = sc.nextLine();

        System.out.println("Apakah Anda member? (true/false):");
        boolean ismember = sc.nextBoolean();

        System.out.println("Masukkan kode promo (jika ada):");
        String kodePromo = sc.next();

        menu(namapelanggan, ismember, kodePromo);

        int totalHargaKeseluruhan = 0;
        int pilihanmenu;
        int banyakitem;

        while (true) {
            System.out.println("Masukkan nomor menu yang ingin Anda pesan:");
            pilihanmenu = sc.nextInt();

            if (pilihanmenu == 0) {
                break; 
            }

            System.out.println("Masukkan jumlah item yang ingin Anda pesan:");
            banyakitem = sc.nextInt();

            
            int totalharga = hitunghargatotal(pilihanmenu, banyakitem, kodePromo);

            totalHargaKeseluruhan += totalharga;

            System.out.println("Harga untuk pesanan Anda: Rp " + totalharga);
        }

        
        System.out.println("Total keseluruhan pesanan Anda: Rp " + totalHargaKeseluruhan);
    }
}
