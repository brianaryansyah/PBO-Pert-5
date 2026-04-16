import java.util.*;

public class LatihanCollection{
    public static void main(String[] args) {

        // ======================================================
        // LATIHAN 1 (Halaman 28)
        // ======================================================
        System.out.println("=== LATIHAN 1 ===");
        
        // Menggunakan TreeSet agar otomatis terurut dan tidak ada duplikat
        Set<String> buku = new TreeSet<>();

        buku.add("Dilan 1990");
        buku.add("Laskar Pelangi");
        buku.add("Mahaguru");
        buku.add("Mengejar Matahari");
        buku.add("Dilan 1991");
        buku.add("Milea");
        buku.add("Perahu Kertas");
        buku.add("Laskar Pelangi"); // Duplikat
        buku.add("Perahu Kertas");  // Duplikat

        System.out.println("Daftar Buku (Terurut & Tanpa Duplikat):");
        Iterator<String> it = buku.iterator();
        int urutan = 1;
        while (it.hasNext()) {
            System.out.println(urutan + ". " + it.next());
            urutan++;
        }


        // ======================================================
        // LATIHAN 2 (Halaman 29)
        // ======================================================
        System.out.println("\n=== LATIHAN 2 ===");

        // Mengecek kewujudan buku menggunakan method contains
        if (buku.contains("Mahaguru")) {
            System.out.println("Buku 'Mahaguru' tersedia untuk dipinjam.");
        } else {
            System.out.println("Buku 'Mahaguru' tidak ditemukan.");
        }

        //Hapus buku mahaguru jika dipinjam
        buku.remove("Mahaguru");

        // Menampilkan daftar buku menggunakan looping for
        System.out.println("\nDaftar Buku setelah Mahaguru dipinjam:");
        int i = 1;
        for (String itemBuku : buku) {
            System.out.println(i + ". " + itemBuku);
            i++;
        }


        // ======================================================
        // LATIHAN 3 (Halaman 30)
        // ======================================================
        System.out.println("\n=== LATIHAN 3 ===");

        // Menggunakan HashMap
        Map<String, String> data = new HashMap<>();

        // Data berdasarkan tabel
        data.put("Microsoft", "Bill Gates");
        data.put("Apple", "Steven Paul Jobs");
        data.put("Linux", "Linux Benedict Torvalds");
        data.put("Facebook", "Mark Zuckerberg");
        data.put("Twitter", "Jack Dorsey");
        data.put("Instagram", "Kevin Systrom");

        // Menampilkan output dengan key (Nama Perusahaan) menjadi HURUF BESAR
        int no = 1;
        for (String key : data.keySet()) {
            System.out.println(no + ". " + key.toUpperCase() + " dikembangkan oleh " + data.get(key));
            no++;
        }

        // cetak key (huruf besar)
        System.out.print("Key: ");
        for (String key : data.keySet()) {
            System.out.print(key.toUpperCase() + ", ");
        }

        // cetak value
        System.out.print("\nValue: ");
        for (String key : data.keySet()) {
            System.out.print(data.get(key) + ", ");
        }

        // cetak semua data
        System.out.println("\nSemua Data: " + data);
    }
}