package pbo1.uas.freefire;

// 1. CLASS & 7. ENCAPSULATION
public class Karakter {
    // 3. ATRIBUT (di-set private agar tidak bisa diakses langsung dari luar class)
    private String nama;
    private int hp;

    // 4. CONSTRUCTOR (Inisialisasi objek karakter)
    public Karakter(String nama, int hp) {
        this.nama = nama;
        this.hp = hp;
    }

    // 6. ACCESSOR (Getter untuk mengambil nama)
    public String getNama() {
        return nama;
    }

    // 6. ACCESSOR (Getter untuk mengambil HP)
    public int getHp() {
        return hp;
    }

    // 5. MUTATOR (Setter untuk mengubah HP saat bertempur)
    public void setHp(int hp) {
        this.hp = hp;
    }

    // Method dasar yang akan di-override di subclass (Polymorphism)
    public void gunakanSkill() {
        System.out.println(nama + " menggunakan skill standar.");
    }

    public void infoKarakter() {
        System.out.println("Karakter: " + nama + " | HP: " + hp);
    }
}