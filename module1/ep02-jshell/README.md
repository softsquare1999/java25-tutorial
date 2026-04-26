# EP 02: JShell — ลองโค้ด Java แบบไม่ต้องสร้างโปรเจกต์

> **Java Version:** Java 9+  
> **Tool:** JShell (REPL — Read-Eval-Print Loop)  
> **ระดับ:** 🟢 Beginner

---

## JShell คืออะไร?

**JShell** คือ **REPL** ของ Java — เหมือนกับ:
- Python: พิมพ์ `python3` แล้วรันโค้ดได้เลย
- Node.js: พิมพ์ `node` แล้วรัน JavaScript ได้เลย
- **JShell**: พิมพ์ `jshell` แล้วรัน Java ได้เลย

ไม่ต้องสร้าง class, ไม่ต้อง compile, ไม่ต้องสร้างโปรเจกต์ — **ทดลองได้ทันที**

---

## เริ่มต้นใช้ JShell

```bash
# เปิด JShell
jshell

# เปิดแบบ verbose (แสดงผลละเอียด)
jshell -v

# รันไฟล์ script
jshell JShellDemo.jsh
```

เมื่อเปิดแล้วจะเห็น prompt:
```
|  Welcome to JShell -- Version 25
jshell>
```

---

## คำสั่งสำคัญใน JShell

| คำสั่ง | ความหมาย |
|--------|----------|
| `/help` | แสดง help |
| `/list` | แสดงโค้ดทั้งหมดที่พิมพ์ไป |
| `/vars` | แสดง variables ทั้งหมด |
| `/methods` | แสดง methods ทั้งหมด |
| `/imports` | แสดง imports ที่ active |
| `/edit <name>` | แก้ไข snippet ที่ระบุ |
| `/open <file>` | โหลดไฟล์ `.jsh` เข้า JShell |
| `/save <file>` | บันทึก session ลงไฟล์ |
| `/exit` | ออกจาก JShell |

---

## ตัวอย่างการใช้งานทีละขั้น

### 1. ทดสอบ Expression
```java
jshell> 5 + 3
$1 ==> 8

jshell> "Hello" + " " + "Java!"
$2 ==> "Hello Java!"

jshell> Math.sqrt(144)
$3 ==> 12.0
```

### 2. สร้าง Variable
```java
jshell> int age = 25
age ==> 25

jshell> var name = "Alice"
name ==> "Alice"

jshell> var list = new java.util.ArrayList<String>()
list ==> []
```

### 3. สร้าง Method
```java
jshell> int square(int n) { return n * n; }
|  created method square(int)

jshell> square(7)
$4 ==> 49
```

### 4. ใช้ Tab Completion
```java
jshell> "hello".<Tab>
// จะแสดงรายการ method ทั้งหมดของ String
```

### 5. ทดสอบ API ใหม่
```java
jshell> import java.time.*
jshell> LocalDate.now()
$5 ==> 2025-01-15
```

---

## เมื่อไหร่ควรใช้ JShell?

| สถานการณ์ | ใช้ JShell? |
|-----------|-------------|
| ทดสอบ method ก่อนเอาใส่โปรเจกต์ | ✅ |
| สำรวจ API ที่ไม่รู้จัก | ✅ |
| Debug regex หรือ string formatting | ✅ |
| เขียนโปรเจกต์จริง | ❌ ใช้ IDE |
| เขียน unit test | ❌ ใช้ JUnit |

---

## ไฟล์ในโฟลเดอร์นี้

| ไฟล์ | คำอธิบาย |
|------|----------|
| `JShellDemo.jsh` | script ตัวอย่างที่รันใน JShell |
| `Exercise02.jsh` | แบบฝึกหัด |
