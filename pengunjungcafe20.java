public class pengunjungcafe20 {
    public static void daftarpengunjung(String... namapengunnjung) {
        System.out.println("daftar nama pengunjung");
        for (int i = 0; i <namapengunnjung.length ; i ++) {
            System.out.println("- " + namapengunnjung[i]);
        }
    }
    public static void main(String[] args) {
        daftarpengunjung("andi","budi","citra");
        
    }
}
