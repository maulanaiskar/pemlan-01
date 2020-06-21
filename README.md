# pemlan-01
Praktikum Pemrograman Lanjut Bab 1. Class dan Object

Buatlah sebuah sistem dimana terdapat Class Mahasiswa, Class MataKuliah, Class Main, dengan definisi sebagai berikut:

Mahasiswa
nama: String
nim: String
ip: double
totalSKS: int
matkul: MataKuliah[8]
Ambil(MataKuliah): void
cetakMatkul(): String
toString(): String

MataKuliah
kode: String
nama: String
sks: int
toString(): String

Class main berisi perintah untuk menginputkan mahasiswa, dan mata kuliah. Ketentuan:
1. IP mahasiswa menentukan jumlah SKS yang dapat diambil
24 SKS = IP 3-4
21 SKS = IP 2.5-3
18 SKS = IP 2-2.5
15 SKS = IP 1.5-2
12 SKS = IP < 1.5

2. Input Matkuliah berdasarkan kode matakuliah (berikan keterangan bila berhasil ditambahkan, ip tidak cukup, atau kode tidak ditemukan.
