# EP 01: เลิกเขียน `public static void main` ยาวๆ

> **Java Version:** Java 21+ (Preview) → Java 25 (Standard)  
> **Feature:** Instance Main Methods + Unnamed Classes (JEP 445 → 512)  
> **ระดับ:** 🟢 Beginner

---

## ปัญหาคืออะไร?

เวลาสอน newbie วันแรก Java บังคับให้พิมพ์ boilerplate code เยอะมาก:

```java
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
```

**คำถามที่ newbie ถามเสมอ:**
- `public` คืออะไร? ต่างจาก `private` ยังไง?
- `static` หมายความว่าอะไร?
- `void` ทำไมต้องใส่?
- `String[] args` มาจากไหน? ถ้าไม่ใส่ได้ไหม?

Java 25 แก้ปัญหานี้ด้วย **Instance Main Methods** และ **Unnamed Classes**

---

## Concept ที่ 1: Instance Main Methods

JVM สามารถเรียก `main()` แบบ instance method ได้แล้ว ไม่ต้อง `static`

**ลำดับที่ JVM ค้นหา main method (สูงสุด → ต่ำสุด):**

| ลำดับ | Signature | หมายเหตุ |
|-------|-----------|----------|
| 1 | `public static void main(String[])` | แบบดั้งเดิม ยังรองรับ |
| 2 | `static void main(String[])` | static ไม่มี args |
| 3 | `static void main()` | static สั้น |
| 4 | `void main(String[])` | instance มี args |
| 5 | `void main()` | **ใหม่ สั้นสุด** |

---

## Concept ที่ 2: Unnamed Classes

ไฟล์ที่ไม่มี `class` declaration เรียกว่า **Unnamed Class**
Java Compiler จะ wrap class ให้อัตโนมัติ

```java
// ✅ รันได้ใน Java 25 — ไม่ต้องมี class!
void main() {
    System.out.println("สวัสดี Java 25!");
}
```

ภายใน Unnamed Class สามารถมีได้:
- **fields** (instance หรือ static)
- **methods** (instance หรือ static)
- **void main()** เป็น entry point

---

## เปรียบเทียบ: Java เก่า vs Java 25

```java
// ❌ Java แบบเก่า (5 บรรทัด ต้องเข้าใจหลายอย่างก่อน)
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello!");
    }
}

// ✅ Java 25 (3 บรรทัด เรียนรู้ทีละขั้น)
void main() {
    System.out.println("Hello!");
}
```

---

## วิธีรัน

```bash
# Java 25 — รันตรงได้เลย
java SimpleMain.java

# Java 21-24 — ต้องเปิด --enable-preview
java --enable-preview --source 24 SimpleMain.java
```

---

## สรุป

| | Java แบบเก่า | Java 25 |
|--|------------|--------|
| บรรทัดที่ต้องพิมพ์ | 5 | 3 |
| ต้องเข้าใจ `static` ก่อน | ✅ | ❌ |
| เหมาะ newbie | ❌ | ✅ |
| รันแบบเดิมได้ | — | ✅ |

---

## ไฟล์ในโฟลเดอร์นี้

| ไฟล์ | คำอธิบาย |
|------|----------|
| `SimpleMain.java` | ตัวอย่างที่รันได้ |
| `Exercise01.java` | แบบฝึกหัด |
