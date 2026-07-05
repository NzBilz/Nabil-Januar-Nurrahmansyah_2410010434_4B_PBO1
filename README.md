# Proyek Akhir Pemrograman Berbasis Objek 1

Proyek ini adalah contoh sederhana aplikasi simulasi pemilihan dan pertempuran karakter Game Free Fire menggunakan Java sebagai tugas akhir dari mata kuliah pemrograman berbasis objek 1.

## Deskripsi

Aplikasi ini menerima input berupa pilihan nomor karakter dari user, lalu menampilkan informasi detail karakter tersebut beserta kemampuan skill unik yang dimilikinya saat memasuki medan pertempuran. Aplikasi juga mensimulasikan perubahan stat HP (Health Points) ketika karakter terkena serangan musuh.

Aplikasi ini mengimplementasikan beberapa konsep penting dalam pemrograman berorientasi objek (OOP) seperti Class, Object, Atribut, Method Constructor, Method Mutator, Method Accessor, Encapsulation, Inheritance, Overriding, Seleksi, Perulangan, IO Sederhana, Array, dan Error Handling.

## Penjelasan Kode

Berikut adalah bagian kode yang relevan dengan konsep OOP yang dijelaskan:

1. **Class** adalah template atau blueprint dari object. Pada kode ini, `Karakter`, `KarakterRusher`, `KarakterSupport`, dan `Main` adalah contoh dari class.

java
public class Karakter {
    ...
}

public class KarakterRusher extends Karakter {
    ...
}

public class KarakterSupport extends Karakter {
    ...
}

public class Main {
    ...
}

## Object adalah instance dari class. Pada kode ini, listKarakter[0] = new KarakterRusher("Alok", 200, "Drop the Beat"); adalah contoh pembuatan object.

listKarakter[0] = new KarakterRusher("Alok", 200, "Drop the Beat");

# Atribut adalah variabel yang ada dalam class. Pada kode ini, nama, hp, and skillName adalah contoh atribut.

private String nama;
private int hp;
private String skillName;

# Constructor adalah method yang pertama kali dijalankan pada saat pembuatan object. Pada kode ini, constructor ada di dalam class Karakter, KarakterRusher, dan KarakterSupport.

public Karakter(String nama, int hp) {
    this.nama = nama;
    this.hp = hp;
}

public KarakterRusher(String nama, int hp, String skillName) {
    super(nama, hp);
    this.skillName = skillName;
}

Mutator atau setter digunakan untuk mengubah nilai dari suatu atribut. Pada kode ini, setHp adalah contoh method mutator.

public void setHp(int hp) {
    this.hp = hp;
}

Accessor atau getter digunakan untuk mengambil nilai dari suatu atribut. Pada kode ini, getNama dan getHp adalah contoh method accessor.

public String getNama() {
    return nama;
}

public int getHp() {
    return hp;
}

Encapsulation adalah konsep menyembunyikan data dengan membuat atribut menjadi private dan hanya bisa diakses melalui method. Pada kode ini, atribut nama dan hp dienkapsulasi dan hanya bisa diakses melalui method getter dan setter.

private String nama;
private int hp;

Inheritance adalah konsep di mana sebuah class bisa mewarisi property dan method dari class lain. Pada kode ini, KarakterRusher mewarisi Karakter dengan sintaks extends.

public class KarakterRusher extends Karakter {
    ...
}

Polymorphism adalah konsep di mana sebuah nama dapat digunakan untuk merujuk ke beberapa tipe atau bentuk objek berbeda. Ini memungkinkan metode-metode dengan nama yang sama untuk berperilaku berbeda tergantung pada tipe objek yang mereka manipulasi. Pada kode ini, method gunakanSkill() di KarakterRusher merupakan override dari method gunakanSkill() di class Karakter.

@Override
public void gunakanSkill() {
    System.out.println("[SKILL RUSHER] " + getNama() + " mengaktifkan '" + skillName + "'! Kecepatan lari meningkat 20%!");
}

Seleksi adalah statement kontrol yang digunakan untuk membuat keputusan berdasarkan kondisi. Pada kode ini, digunakan seleksi if else untuk menentukan aksi berdasarkan nomor pilihan karakter yang dimasukkan oleh user.

if (pilihan >= 1 && pilihan <= 3) {
    ...
} else {
    System.out.println("[!] Pilihan Anda salah. Zona tidak aman, karakter Anda tereliminasi!");
}

Perulangan adalah statement kontrol yang digunakan untuk menjalankan blok kode berulang kali. Pada kode ini, digunakan loop for untuk membaca indeks array dan menampilkan daftar pilihan karakter yang tersedia.

for (int i = 0; i < listKarakter.length; i++) {
    System.out.print((i + 1) + ". ");
    listKarakter[i].infoKarakter();
}

Input Output Sederhana digunakan untuk menerima input dari user dan menampilkan output ke user. Pada kode ini, digunakan class Scanner untuk menerima input pilihan user dan method System.out.println untuk menampilkan output antarmuka game.

Scanner scanner = new Scanner(System.in);
System.out.print("\nMasukkan nomor pilihan Anda (1-3): ");
int pilihan = scanner.nextInt();

Array adalah struktur data yang digunakan untuk menyimpan beberapa nilai dalam satu variabel. Pada kode ini, Karakter[] listKarakter = new Karakter[3]; adalah contoh penggunaan array objek untuk menampung berbagai tipe karakter game.

Karakter[] listKarakter = new Karakter[3];

Error Handling digunakan untuk menangani error yang mungkin terjadi saat runtime. Pada kode ini, digunakan try catch untuk mengantisipasi kesalahan jika user salah memasukkan data non-angka pada menu pilihan.

try {
    // code that might throw an exception
} catch (Exception e) {
    System.out.println("[ERROR] Terjadi kesalahan! Mohon masukkan angka pilihan yang valid!");
}

## Usulan nilai

| No  | Materi         |  Nilai  |
| :-: | -------------- | :-----: |
|  1  | Class          |    5    |
|  2  | Object         |    5    |
|  3  | Atribut        |    5    |
|  4  | Constructor    |    5    |
|  5  | Mutator        |    5    |
|  6  | Accessor       |    5    |
|  7  | Encapsulation  |    5    |
|  8  | Inheritance    |    5    |
|  9  | Polymorphism   |   10    |
| 10  | Seleksi        |    5    |
| 11  | Perulangan     |    5    |
| 12  | IO Sederhana   |   10    |
| 13  | Array          |   15    |
| 14  | Error Handling |   15    |
|     | **TOTAL**      | **100** |

## Cara Menjalankan Program

1. Pastikan Anda telah menginstal **Java Development Kit (JDK)** di perangkat Anda.
2. Buat package bernama `pbo1.uas.freefire` di dalam folder project Java Anda.
3. Masukkan seluruh file source code Java (`Karakter.java`, `KarakterRusher.java`, `KarakterSupport.java`, dan `Main.java`) ke dalam package tersebut.
4. Buka file `Main.java` di IDE Anda (NetBeans / IntelliJ IDEA / Eclipse).
5. Klik kanan pada file `Main.java` lalu pilih **Run File** atau tekan tombol **Run**.
6. Masukkan angka pilihan karakter (1-3) pada terminal interaktif ketika diminta oleh sistem untuk memulai simulasi pertempuran.

## Pembuat

Nama: Nabil Januar Nurrahmansyah
NPM: 2410010434
Kelas: 4B
Mata Kuliah: PBO 1
