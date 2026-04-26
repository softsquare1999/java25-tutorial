# EP 03: `var` — ลด Code ขยะ แต่ยัง Type-Safe เหมือนเดิม

> **Java Version:** Java 10+  
> **Feature:** Local Variable Type Inference (JEP 286)  
> **ระดับ:** 🟢 Beginner

---

## `var` คืออะไร?

`var` ให้ Java **Compiler** อนุมาน (infer) **type** ของ local variable ให้อัตโนมัติ
โดยดูจากค่าที่ assign ให้ทางขวามือ

> ⚠️ **สำคัญ:** `var` ≠ dynamic type!  
> Java ยัง **statically typed** เหมือนเดิม — compiler แค่เดา type ให้ตอน compile time

---

## เปรียบเทียบ: ก่อน / หลัง `var`

```java
// ❌ แบบเก่า — verbose
ArrayList<String> names = new ArrayList<String>();
HashMap<String, Integer> scores = new HashMap<String, Integer>();
Map.Entry<String, Integer> entry = scores.entrySet().iterator().next();

// ✅ แบบใหม่ — ใช้ var
var names   = new ArrayList<String>();
var scores  = new HashMap<String, Integer>();
var entry   = scores.entrySet().iterator().next();
```

---

## กฎการใช้ `var`

### ✅ ใช้ได้

```java
// Local variable ที่ initialize ทันที
var x    = 42;
var name = "Alice";
var list = new ArrayList<String>();

// ใน for loop
for (var item : list) { ... }
for (var i = 0; i < 10; i++) { ... }

// ใน try-with-resources
try (var reader = new BufferedReader(new FileReader("file.txt"))) { ... }
```

### ❌ ใช้ไม่ได้

```java
var count;            // ❌ ไม่มีค่าเริ่มต้น compiler ไม่รู้ type
var x = null;         // ❌ null บอก type ไม่ได้
void go(var x) { }    // ❌ method parameter ใช้ var ไม่ได้
var getVal() { }      // ❌ return type ใช้ var ไม่ได้
// var field = 10;    // ❌ class field ใช้ var ไม่ได้ (เฉพาะ local เท่านั้น)
```

---

## เมื่อไหร่ควร / ไม่ควรใช้ `var`?

### ✅ ควรใช้ — type ชัดเจนจากค่าด้านขวา

```java
var message = "Hello World";          // ชัดเจน: String
var count   = 0;                       // ชัดเจน: int
var users   = new ArrayList<User>();   // ชัดเจน: ArrayList<User>
var path    = Path.of("/tmp/file");    // ชัดเจน: Path
```

### ❌ ไม่ควรใช้ — type ไม่ชัดเจน อ่านยาก

```java
var result = processData(input);   // processData return อะไร? ไม่รู้!
var x      = getValue();           // อ่านแล้วงง

// ดีกว่าถ้าระบุ type ชัดๆ
ProcessResult result = processData(input);  // อ่านง่ายกว่า
```

---

## เทคนิคพิเศษ: Non-Denotable Types

`var` จับ type ที่ปกติตั้งชื่อไม่ได้ เช่น Anonymous Class:

```java
// สร้าง anonymous class ที่มี extra method
var obj = new Object() {
    String name = "Secret";
    void greet() {
        System.out.println("Hi from " + name);
    }
};

obj.greet();      // ✅ ทำได้เพราะ var จำ type ไว้
// Object o = obj;
// o.greet();     // ❌ Object ไม่มี greet()
```

---

## เปรียบเทียบกับภาษาอื่น

| ภาษา | Syntax | Type System |
|------|--------|-------------|
| Java `var` | `var x = 42` | Static (compile time) |
| Kotlin `val`/`var` | `val x = 42` | Static (compile time) |
| JavaScript `let` | `let x = 42` | Dynamic (runtime) |
| Python | `x = 42` | Dynamic (runtime) |

Key insight: Java `var` เป็น **syntactic sugar** ไม่ได้เปลี่ยน type system

---

## ไฟล์ในโฟลเดอร์นี้

| ไฟล์ | คำอธิบาย |
|------|----------|
| `VarDemo.java` | ตัวอย่างที่รันได้ |
| `Exercise03.java` | แบบฝึกหัด |
