// EP 03: แบบฝึกหัด — var
// รันด้วย: java Exercise03.java
//
// คำสั่ง: แก้ทุก TODO แล้วรันดูผล

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

void main() {
    System.out.println("=== แบบฝึกหัด EP 03: var ===");
    System.out.println();

    // ----- Exercise 1 (ง่าย) -----
    // TODO: ประกาศตัวแปรด้านล่างทั้งหมดด้วย var แทนการระบุ type
    String firstName = "Somchai";    // แก้เป็น var
    int age = 30;                    // แก้เป็น var
    double salary = 35000.50;        // แก้เป็น var
    boolean isActive = true;         // แก้เป็น var
    System.out.println("[Ex1] " + firstName + ", อายุ " + age);
    System.out.println("[Ex1] salary=" + salary + ", active=" + isActive);
    System.out.println();

    // ----- Exercise 2 (กลาง) -----
    // TODO: สร้าง ArrayList<String> โดยใช้ var
    //       ใส่ชื่อประเทศ 5 ประเทศ แล้วพิมพ์ออกมา
    // var countries = ...
    System.out.println("[Ex2] TODO: สร้าง ArrayList<String> ประเทศ 5 ประเทศ");
    System.out.println();

    // ----- Exercise 3 (กลาง) -----
    // TODO: สร้าง HashMap<String, Integer> โดยใช้ var
    //       ใส่ชื่อวิชา 3 วิชาพร้อมคะแนน แล้วพิมพ์ออกมา
    // var subjectScores = ...
    System.out.println("[Ex3] TODO: สร้าง HashMap วิชา-คะแนน");
    System.out.println();

    // ----- Exercise 4 (ท้าทาย) -----
    // TODO: ลองใช้ var กับ Non-Denotable Type
    //       สร้าง anonymous object ที่มี method calculateBMI(double weight, double height)
    //       สูตร: weight / (height * height)
    //       แล้วทดสอบด้วยข้อมูลของคุณเอง
    System.out.println("[Ex4] TODO: BMI Calculator ด้วย anonymous object + var");
}
