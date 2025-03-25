import java.util.Scanner;
public class mahasiswaDemo20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumlahmhs = sc.nextInt();
        sc.nextLine();
        mahasiswaPrestasi20 list = new mahasiswaPrestasi20(jumlahmhs);

        for (int i=0; i< jumlahmhs; i++){
            System.out.println("Masukkan data mahasiswa ke-"+(i+1));
            System.out.print("NIM: ");
            String nim = sc.nextLine();
            System.out.print("Nama: ");
            String nama = sc.nextLine();
            System.out.print("Kelas: ");
            String kelas = sc.nextLine();
            System.out.print("IPK: ");
            double ipk = sc.nextDouble();
            sc.nextLine();
            System.out.println("-------------------------------------------------");
            mahasiswa20 m = new mahasiswa20(nim, nama, kelas, ipk);
            list.tambah(m);
        }
        list.tampil();
        System.out.println("-------------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("-------------------------------------------------");
        System.out.println("masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();
        System.out.println("menggunakan sequential searching");
        double posisi = list.sequentialSearching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
        System.out.println("menggunakan binary searching");
        list.insertion();
        double posisi2 = list.findBinarySearch(cari, 0, jumlahmhs-1);
        int pss2 = (int)posisi2;
        list.tampilPosisi(cari, pss2);
        list.tampilDataSearch(cari, pss2);
        sc.close();
    }
}
