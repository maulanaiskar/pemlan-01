public class Mahasiswa {
    private String nama;
    private String nim;
    private String prodi;
    private double ip;
    private String kodeAmbil;

    int sksMaks = 0;
    int [] hasil = new int [100];
    int index = 0;
    MataKuliah m9=new MataKuliah();

    public void cetakData(){
        m9.namaKode();
        m9.namaMatkul();
        m9.jumlahSKS();
        for (int i = 0; i<m9.sks.length;i++)
            System.out.printf("%-15s%-45s%s\n", m9.kode[i], m9.matkul[i], m9.sks[i]);
    }
    public int cekIp(){
        if (ip<=1 && ip>=0){
            System.out.println("Anda diperkenankan mengambil maksimal 12 sks");
            sksMaks = 12;
        }
        else if (ip>1 && ip<=2){
            System.out.println("Anda diperkenankan mengambil maksimal 15 sks");
            sksMaks = 15;
        }
        else if (ip>2 && ip<3){
            System.out.println("Anda diperkenankan mengambil maksimal 18 sks");
            sksMaks = 18;
        }
        else if (ip>=3 && ip<=4){
            System.out.println("Anda diperkenankan mengambil maksimal 24 sks");
            sksMaks = 24;
        }
        else{
            System.out.println("IP tidak valid");
            System.exit(0);
        }
        return sksMaks;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setNim(String nim) {
        this.nim = nim;
    }
    public void setProdi(String prodi) {
        this.prodi = prodi;
    }
    public void setIp(double ip) {
        this.ip = ip;
    }
    public String setKodeAmbil(String kodeAmbil){
        if(sksMaks<menentukanSKS(kodeAmbil)){
            System.out.println("IP TIDAK MENCUKUPI");
        }
        else {
            this.kodeAmbil = kodeAmbil;
            proses(kodeAmbil);
        }
        return kodeAmbil;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public String getProdi() {
        return prodi;
    }

    public double getIp() {
        return ip;
    }

    public int getSKSMaks(){
        return sksMaks;
    }
    public int proses(String kodeAmbil){
        if(kodeAmbil.equals(m9.kode[0])){
            sksMaks -= m9.sks[0];
            hasil[index] = 0;
            index++;
        }
        else if(kodeAmbil.equals(m9.kode[1])){
            sksMaks -= m9.sks[1];
            hasil[index] = 1;
            index++;
        }
        else if(kodeAmbil.equals(m9.kode[2])){
            sksMaks -= m9.sks[2];
            hasil[index] = 2;
            index++;
        }
        else if(kodeAmbil.equals(m9.kode[3])){
            sksMaks -= m9.sks[3];
            hasil[index] = 3;
            index++;
        }
        else if(kodeAmbil.equals(m9.kode[4])){
            sksMaks -= m9.sks[4];
            hasil[index] = 4;
            index++;
        }
        else if(kodeAmbil.equals(m9.kode[5])){
            sksMaks -= m9.sks[5];
            hasil[index] = 5;
            index++;
        }
        else if(kodeAmbil.equals(m9.kode[6])){
            sksMaks -= m9.sks[6];
            hasil[index] = 6;
            index++;
        }
        else if(kodeAmbil.equals(m9.kode[7])){
            sksMaks -= m9.sks[7];
            hasil[index] = 7;
            index++;
        }
        else{
            System.out.println("Kode salah");
        }
        return sksMaks;
    }

    public int menentukanSKS(String kodeAmbil){
        int temp = 0;
        if(kodeAmbil.equals(m9.kode[0])){
            temp = m9.sks[0];

        }
        else if(kodeAmbil.equals(m9.kode[1])){
            temp = m9.sks[1];

        }
        else if(kodeAmbil.equals(m9.kode[2])){
            temp = m9.sks[2];

        }
        else if(kodeAmbil.equals(m9.kode[3])){
            temp = m9.sks[3];

        }
        else if(kodeAmbil.equals(m9.kode[4])){
            temp = m9.sks[4];

        }

        else if(kodeAmbil.equals(m9.kode[5])){
            temp = m9.sks[5];
        }
        else if(kodeAmbil.equals(m9.kode[6])){
            temp = m9.sks[6];
        }
        else if(kodeAmbil.equals(m9.kode[7])){
            temp = m9.sks[7];
        }
        else{
            System.out.println("Kode salah");
        }
        return temp;
    }
    public void info(){
        for(int i=0; i<index; i++){
            System.out.printf("%-10s %-30s %-2s \n", m9.kode[hasil[i]], m9.matkul[hasil[i]], m9.sks[hasil[i]]);
        }
    }
    public String toString(){
        return null;
    }
    public void Ambil(MataKuliah mk){
        System.out.println(""+m9.kode[0]);
    }
    public String cetakMatkul(){
        System.out.println(m9.sks);
        return null;
    }
}

