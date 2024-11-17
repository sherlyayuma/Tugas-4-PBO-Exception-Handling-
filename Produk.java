// Kelas Produk adalah superclass yang digunakan sebagai dasar untuk kelas Transaksi
class Produk {
    protected String kodeBarang;   // Atribut kode barang yang dapat diakses oleh subclass
    protected String namaBarang;   // Atribut nama barang yang dapat diakses oleh subclass
    protected double hargaBarang;  // Atribut harga barang yang dapat diakses oleh subclass

    // Konstruktor untuk inisialisasi atribut
    public Produk(String kodeBarang, String namaBarang, double hargaBarang) {
        this.kodeBarang = kodeBarang;
        this.namaBarang = namaBarang;
        this.hargaBarang = hargaBarang;
    }

    // Metode untuk menampilkan informasi produk
    public String displayInfo() {
        return "Kode: " + kodeBarang + ", Nama: " + namaBarang + ", Harga: " + hargaBarang;
    }
}