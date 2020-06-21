import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner masukan = new Scanner(System.in);
        String nama, nim, prodi, kode;
        double ip;
        for (int i = 0; i < 3; i++) {
            String pilihan = "ya";
            Mahasiswa mahasisw = new Mahasiswa();
            System.out.println("\t\t\t SIAM UB \t");
            System.out.println("\t\t..........................");
            System.out.println("DAFTAR MATA KULIAH \t :");
            mahasisw.cetakData();
            System.out.println("");
            System.out.println("\t\t..........................");
            System.out.print("Nama          : ");
            nama = masukan.nextLine();
            mahasisw.setNama(nama);
            System.out.print("NIM           : ");
            nim = masukan.nextLine();
            mahasisw.setNim(nim);
            System.out.print("Program Studi : ");
            prodi = masukan.nextLine();
            mahasisw.setProdi(prodi);
            System.out.print("IP            : ");
            ip = masukan.nextDouble();
            mahasisw.setIp(ip);

            mahasisw.cekIp();
            System.out.println("");

            do {
                System.out.print("Masukkan kode matakuliah : ");
                kode = masukan.next();
                mahasisw.setKodeAmbil(kode);
                System.out.println("Jumlah SKS yang masih bisa diambil : " + mahasisw.getSKSMaks());
                System.out.println("Mata Kuliah Berhasil di Tambahkan");
                System.out.print("Apakah anda ingin menambah mata kuliah lagi? (ya/tidak) : ");
                pilihan = masukan.next();
                System.out.println("----------------------------------------------------------------");
            } while (!pilihan.equalsIgnoreCase("tidak"));
            System.out.println("");
            System.out.println("====================================================================");
            System.out.println("");
            System.out.println("                    INFORMASI AKADEMIK MAHASISWA                   ");
            System.out.println("");
            System.out.println("Nama            : " + mahasisw.getNama());
            System.out.println("NIM             : " + mahasisw.getNim());
            System.out.println("Program Studi   : " + mahasisw.getProdi());
            System.out.println("");
            System.out.println("                    Daftar Mata Kuliah yang Diambil                 ");
            System.out.println("");
            mahasisw.info();
            System.out.println("");
            System.out.println("====================================================================");
        }
    }
}

