package pbo1.uas.freefire;

// 8. INHERITANCE
public class KarakterSupport extends Karakter {
    private String skillName;

    // 4. CONSTRUCTOR Subclass
    public KarakterSupport(String nama, int hp, String skillName) {
        super(nama, hp);
        this.skillName = skillName;
    }

    // 9. POLYMORPHISM (Method Overriding dari class Karakter)
    @Override
    public void gunakanSkill() {
        System.out.println("[SKILL SUPPORT] " + getNama() + " mengaktifkan '" + skillName + "'! Memulihkan HP rekan satu tim di sekitar!");
    }

    @Override
    public void infoKarakter() {
        System.out.println("Role: Support | Nama: " + getNama() + " | Skill: " + skillName + " | HP: " + getHp());
    }
}