public class TransaksiSewa {
    Ruko ruko;
    Penyewa penyewa;
    int lamaSewa;

    public TransaksiSewa(Ruko ruko, Penyewa penyewa, int lamaSewa) {
        this.ruko = ruko;
        this.penyewa = penyewa;
        this.lamaSewa = lamaSewa;
    }

    public double hitungTotal() {
        return ruko.hargaSewa * lamaSewa;
    }
}
