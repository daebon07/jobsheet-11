import java.util.Scanner;

public class tugas2 {
    static String[] menu = {"Kopi", "Teh", "Es Degan", "Roti Bakar", "Gorengan"};
    static int[][] penjualan = new int[5][7]; 

    public static void inputPenjualan() {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < menu.length; i++) {
            System.out.println("Masukkan data penjualan untuk menu " + menu[i] + ":");
            for (int j = 0; j < 7; j++) {
                System.out.print("Hari ke-" + (j + 1) + ": ");
                penjualan[i][j] = scanner.nextInt();
            }
        }
    }

    public static void tampilkanDataPenjualan() {
        System.out.println("\nRekap Penjualan:");
        System.out.println("Menu\t\tHari 1\tHari 2\tHari 3\tHari 4\tHari 5\tHari 6\tHari 7");
        for (int i = 0; i < menu.length; i++) {
            System.out.print(menu[i] + "\t");
            if (menu[i].length() < 8) System.out.print("\t");
            for (int j = 0; j < 7; j++) {
                System.out.print(penjualan[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void menuPenjualanTertinggi() {
        int maxPenjualan = 0;
        String menuTerlaris = "";

        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += penjualan[i][j];
            }
            if (totalPenjualan > maxPenjualan) {
                maxPenjualan = totalPenjualan;
                menuTerlaris = menu[i];
            }
        }

        System.out.println("\nMenu dengan penjualan tertinggi: " + menuTerlaris + " (Total: " + maxPenjualan + ")");
    }

    public static void rataRataPenjualan() {
        System.out.println("\nRata-rata Penjualan per Menu:");
        for (int i = 0; i < menu.length; i++) {
            int totalPenjualan = 0;
            for (int j = 0; j < 7; j++) {
                totalPenjualan += penjualan[i][j];
            }
            double rataRata = totalPenjualan / 7.0;
            System.out.println(menu[i] + ": " + String.format("%.2f", rataRata));
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan data penjualan untuk 7 hari:");
        inputPenjualan();

        tampilkanDataPenjualan();

        menuPenjualanTertinggi();

        rataRataPenjualan();
    }
}
