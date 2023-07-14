import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputMahasiswa {
    public static void main(String[] args) {
        List<Mahasiswa> daftarMahasiswa = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);

        boolean isRunning = true;
        while (isRunning) {
            System.out.println("=== Aplikasi Input Data Mahasiswa ===");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tampilkan Daftar Mahasiswa");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    // Kode untuk tambah mahasiswa
                    System.out.print("Masukkan nama mahasiswa: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan umur mahasiswa: ");
                    int umur = scanner.nextInt();
                    scanner.nextLine();
                    System.out.print("Masukkan jurusan mahasiswa: ");
                    String jurusan = scanner.nextLine();

                    Mahasiswa mahasiswa = new Mahasiswa(nama, umur, jurusan);
                    daftarMahasiswa.add(mahasiswa);
                    System.out.println("Data mahasiswa berhasil ditambahkan.");
                    System.out.println();

                    break;
                case 2:
                    // Kode untuk tampilkan daftar mahasiswa
                    System.out.println("Daftar Mahasiswa:");
                    for (int i = 0; i < daftarMahasiswa.size(); i++) {
                        Mahasiswa m = daftarMahasiswa.get(i);
                        System.out.println("Mahasiswa " + (i + 1) + ":");
                        System.out.println("Nama: " + m.getNama());
                        System.out.println("Umur: " + m.getUmur());
                        System.out.println("Jurusan: " + m.getJurusan());
                        System.out.println();
                    }

                    break;
                case 3:
                    // Kode untuk keluar
                    isRunning = false;
                    System.out.println("Terima kasih!");
    
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
                    System.out.println();
                    break;
            }
        }

        scanner.close();
    }
}
