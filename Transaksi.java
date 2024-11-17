// Kelas Transaksi adalah subclass dari Produk, yang menambahkan fungsionalitas untuk transaksi pembelian
class Transaksi extends Produk {
    private String noFaktur;   // Atribut nomor faktur yang hanya ada di kelas Transaksi
    private int jumlahBeli;    // Atribut jumlah barang yang dibeli
    private double total;      // Atribut total harga berdasarkan jumlah beli

    // Konstruktor untuk inisialisasi atribut produk dan transaksi
    public Transaksi(String kodeBarang, String namaBarang, double hargaBarang, String noFaktur, int jumlahBeli) {
        super(kodeBarang, namaBarang, hargaBarang);  // Memanggil konstruktor superclass Produk
        this.noFaktur = noFaktur;
        this.jumlahBeli = jumlahBeli;
        this.total = 0;
    }

    // Metode untuk menghitung total harga berdasarkan jumlah beli
    public void hitungTotal() {
        try {
            // Validasi jika jumlahBeli atau hargaBarang kurang dari 0, maka lempar exception
            if (jumlahBeli < 0 || hargaBarang < 0) {
                throw new IllegalArgumentException("Jumlah beli dan harga barang harus bernilai positif.");
            }
            total = jumlahBeli * hargaBarang;  // Menghitung total harga
        } catch (IllegalArgumentException e) {
            // Menangkap exception dan menampilkan pesan kesalahan jika ada nilai negatif
            System.out.println("Error: " + e.getMessage());
            total = 0;  // Mengatur total menjadi 0 jika terjadi kesalahan
        }
    }

    // Metode untuk menampilkan faktur pembelian
    public String displayInvoice() {
        return "No Faktur: " + noFaktur + "\n"
                + displayInfo() + "\n"  // Menampilkan informasi produk dengan metode dari superclass
                + "Jumlah Beli: " + jumlahBeli + "\n"
                + "Total: " + total;
    }
}
