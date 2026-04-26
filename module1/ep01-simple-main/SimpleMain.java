// EP 01: Instance Main Methods + Unnamed Classes
// Java 25  : java SimpleMain.java
// Java 21-24: java --enable-preview --source 24 SimpleMain.java

// ไม่ต้องมี public class SimpleMain { ... }
// Java จะ wrap Unnamed Class ให้อัตโนมัติ

void main() {
    System.out.println("=== EP 01: Modern Java Main ===");
    System.out.println();

    // ใช้ local variables ได้ปกติ
    String language = "Java 25";
    int year = 2025;
    System.out.println("ยินดีต้อนรับสู่ " + language + " ปี " + year);

    // เรียก helper methods ใน Unnamed Class ได้เลย
    greet("นักเรียน Java");
    showDifference();
}

// helper method — ประกาศนอก main ได้ใน Unnamed Class
void greet(String who) {
    System.out.println();
    System.out.println("สวัสดี " + who + "!");
    System.out.println("บทเรียนนี้จะพาคุณไปรู้จัก Java 25 ตั้งแต่ต้น");
}

void showDifference() {
    System.out.println();
    System.out.println("--- เปรียบเทียบ ---");
    System.out.println("Java แบบเก่า : public static void main(String[] args) { ... }");
    System.out.println("Java 25      : void main() { ... }");
    System.out.println();
    System.out.println("ลด boilerplate code ได้ทันที!");
}
