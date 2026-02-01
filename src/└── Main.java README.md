Java
public class Main {
    public static void main(String[] args) {

        // 1. Membuat objek Ruko
        Ruko ruko = new Ruko(
            "R01",
            "Jl. Merdeka No. 10",
            5000000
        );

        // 2. Membuat objek Penyewa
        Penyewa penyewa = new Penyewa(
            "Andi",
            "08123456789"
        );

        // 3. Membuat transaksi sewa
        TransaksiSewa transaksi = new TransaksiSewa(
            ruko,
            penyewa,
            2
        );

        // 4. Menampilkan hasil
        System.out.println("=== DATA SEWA RUKO ===");
        System.out.println("Kode Ruko   : " + ruko.kodeRuko);
        System.out.println("Alamat      : " + ruko.alamat);
        System.out.println("Penyewa     : " + penyewa.nama);
        System.out.println("Lama Sewa   : 2 Tahun");
        System.out.println("Total Biaya : " + transaksi.hitungTotal());
    }
}
