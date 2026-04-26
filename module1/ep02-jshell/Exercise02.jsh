// EP 02: แบบฝึกหัด JShell
// รันด้วย: jshell Exercise02.jsh
//
// คำสั่ง: แก้ทุก TODO แล้วรันดูผล

System.out.println("=== แบบฝึกหัด EP 02: JShell ===");
System.out.println();

// ----- Exercise 1 (ง่าย) -----
// TODO: คำนวณพื้นที่วงกลมที่มี radius = 7
// สูตร: pi * r * r
double radius = 7.0;
double area   = 0.0; // TODO: คำนวณ
System.out.println("[Ex1] พื้นที่วงกลม r=" + radius + " = " + area);

// ----- Exercise 2 (กลาง) -----
// TODO: เขียน method ชื่อ isPalindrome(String s)
// คืนค่า true ถ้าข้อความอ่านหน้าหลังเหมือนกัน
// เช่น "racecar", "level", "madam"
boolean isPalindrome(String s) {
    // TODO: implement
    return false;
}
System.out.println("[Ex2] racecar palindrome? " + isPalindrome("racecar"));
System.out.println("[Ex2] hello   palindrome? " + isPalindrome("hello"));

// ----- Exercise 3 (กลาง) -----
// TODO: สร้าง ArrayList<Integer> ใส่เลข 1-5
// แล้วคำนวณผลรวมทั้งหมด
var numbers = new java.util.ArrayList<Integer>();
// TODO: เพิ่มเลข 1-5 ลงใน numbers
int sum = 0;
for (var n : numbers) sum += n;
System.out.println("[Ex3] sum of 1-5 = " + sum);

// ----- Exercise 4 (ท้าทาย) -----
// TODO: เขียน method fizzBuzz(int n)
// ถ้าหาร 3 ลงตัว คืน "Fizz"
// ถ้าหาร 5 ลงตัว คืน "Buzz"
// ถ้าหาร 15 ลงตัว คืน "FizzBuzz"
// นอกนั้น คืน String ของตัวเลขนั้น
String fizzBuzz(int n) {
    // TODO: implement
    return String.valueOf(n);
}
System.out.println("[Ex4] FizzBuzz 1-15:");
for (int i = 1; i <= 15; i++) System.out.print(fizzBuzz(i) + " ");
System.out.println();

/exit
