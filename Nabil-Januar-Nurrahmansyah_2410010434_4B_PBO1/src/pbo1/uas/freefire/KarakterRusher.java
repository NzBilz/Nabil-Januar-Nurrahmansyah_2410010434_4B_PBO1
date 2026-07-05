package pbo1.uas.freefire;

// 8. INHERITANCE (Menggunakan kata kunci extends)
public class KarakterRusher extends Karakter {
    private String skillName;

    // 4. CONSTRUCTOR Subclass
    public KarakterRusher(String nama, int hp, String skillName) {
        super(nama, hp); // Memanggil constructor dari Superclass
        this.skillName = skillName;
    }

    // 9. POLYMORPHISM (Method Overriding dari class Karakter)
    @Override
    public void gunakanSkill() {
        System.out.println("[SKILL RUSHER] " + getNama() + " mengaktifkan '" + skillName + "'! Kecepatan lari meningkat 20%!");
    }

    @Override
    public void infoKarakter() {
        System.out.println("Role: Rusher  | Nama: " + getNama() + " | Skill: " + skillName + " | HP: " + getHp());
    }
}