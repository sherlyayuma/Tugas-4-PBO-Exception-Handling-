import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.println("Masukkan No Faktur: ");
            String noFaktur = scanner.nextLine();
            System.out.println("Masukkan Kode Barang: ");
            String kodeBarang = scanner.nextLine();
            System.out.println("Masukkan Nama Barang: ");
            String namaBarang = scanner.nextLine();
            System.out.println("Masukkan Harga Barang: ");
            // Parsing hargaBarang sebagai double dan menangkap jika ada kesalahan format
            double hargaBarang = Double.parseDouble(scanner.nextLine());
            System.out.println("Masukkan Jumlah Beli: ");
            // Parsing jumlahBeli sebagai int dan menangkap jika ada kesalahan format
            int jumlahBeli = Integer.parseInt(scanner.nextLine());
            // Membuat objek transaksi dengan data yang dimasukkan
            Transaksi transaksi = new Transaksi(kodeBarang, namaBarang, hargaBarang, noFaktur, jumlahBeli);
            transaksi.hitungTotal();  // Menghitung total harga berdasarkan jumlah beli
            System.out.println("\n--- Faktur Pembelian ---");
            // Menampilkan faktur transaksi
            System.out.println(transaksi.displayInvoice());
        } catch (NumberFormatException e) {
            // Menangkap kesalahan input jika hargaBarang atau jumlahBeli tidak valid
            System.out.println("Input salah! Pastikan harga barang adalah angka dan jumlah beli adalah bilangan bulat");
        } finally {
            // Menutup scanner setelah penggunaan
            scanner.close();
        }
    }
}

