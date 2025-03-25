import java.util.Scanner;
public class dosenMain20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        dataDosen20 listDosen = new dataDosen20();

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampilkan Data Dosen");
            System.out.println("3. Sorting ASC (Usia termuda ke tertua - Bubble Sort)");
            System.out.println("4. Sorting DSC (Usia tertua ke termuda - Selection Sort)");
            System.out.println("5. Sorting DSC (Usia tertua ke termuda - Insertion Sort)");
            System.out.println("6. Cari Dosen Berdasarkan Nama (sequential)");
            System.out.println("7. Cari Dosen Berdasarkan Usia (binary)");
            System.out.println("8. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan kode dosen: ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan nama dosen: ");
                    String nama = sc.nextLine();
                    System.out.print("Masukkan jenis kelamin (L = Laki-laki / P = Perempuan): ");
                    char jk = sc.next().charAt(0);
                    boolean jenisKelamin = (jk == 'L' || jk == 'l');
                    System.out.print("Masukkan usia: ");
                    int usia = sc.nextInt();
                    sc.nextLine();

                    dosen20 dosenBaru = new dosen20(kode, nama, jenisKelamin, usia);
                    listDosen.tambah(dosenBaru);
                    break;

                case 2:
                    listDosen.tampil();
                    break;

                case 3:
                    listDosen.sortingASC();
                    listDosen.tampil();
                    break;

                case 4:
                    listDosen.sortingDSC();
                    listDosen.tampil();
                    break;

                case 5:
                    listDosen.insertionSort();
                    listDosen.tampil();
                    break;

                case 6:
                    System.out.print("Masukkan nama dosen yang dicari: ");
                    String cariNama = sc.nextLine();
                    listDosen.pencarianDataSequential(cariNama);
                    break;

                case 7:
                    System.out.print("Masukkan usia dosen yang dicari: ");
                    int cariUsia = sc.nextInt();
                    sc.nextLine();
                    listDosen.sortingASC();
                    listDosen.pencarianDataBinary(cariUsia);
                    break;

                case 8:
                    System.out.println("Terima kasih! Program selesai.");
                    sc.close();
                    return;

                default:
                    System.out.println("Pilihan tidak valid! Silakan pilih lagi.");
            }
        }
    }
}
