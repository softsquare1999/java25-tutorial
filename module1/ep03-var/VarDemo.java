// EP 03: var — Local Variable Type Inference
// รันด้วย: java VarDemo.java

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

void main() {
    System.out.println("=== EP 03: var Demo ===");
    System.out.println();

    demoBasicVar();
    demoCollections();
    demoForLoop();
    demoNonDenotable();
}

void demoBasicVar() {
    System.out.println("--- 1. Basic var ---");

    // compiler รู้ว่า type คือ String
    var message = "Hello, Java 25!";
    System.out.println("message : " + message);
    System.out.println("class   : " + message.getClass().getSimpleName());

    // compiler รู้ว่า type คือ int
    var count = 100;
    System.out.println("count   : " + count);
    System.out.println("class   : " + ((Object) count).getClass().getSimpleName());

    // compiler รู้ว่า type คือ double
    var price = 49.99;
    System.out.println("price   : " + price);
    System.out.println();
}

void demoCollections() {
    System.out.println("--- 2. var กับ Collections ---");

    // แบบเก่า: ArrayList<String> names = new ArrayList<String>();
    var names = new ArrayList<String>();
    names.add("Alice");
    names.add("Bob");
    names.add("Charlie");
    System.out.println("names  : " + names);

    // แบบเก่า: HashMap<String, Integer> scores = new HashMap<>();
    var scores = new HashMap<String, Integer>();
    scores.put("Alice", 95);
    scores.put("Bob",   80);
    scores.put("Charlie", 88);
    System.out.println("scores : " + scores);
    System.out.println();
}

void demoForLoop() {
    System.out.println("--- 3. var ใน for loop ---");

    var fruits = List.of("Apple", "Banana", "Cherry", "Durian");

    // var ใน enhanced for loop
    System.out.print("fruits: ");
    for (var fruit : fruits) {
        System.out.print(fruit + " ");
    }
    System.out.println();

    // var ใน traditional for loop
    System.out.print("index : ");
    for (var i = 0; i < fruits.size(); i++) {
        System.out.print(i + " ");
    }
    System.out.println();
    System.out.println();
}

void demoNonDenotable() {
    System.out.println("--- 4. Non-Denotable Types (เทคนิคพิเศษ) ---");

    // Anonymous class ที่มี method พิเศษ
    // ปกติจะตั้งชื่อ type นี้ไม่ได้ แต่ var จำได้
    var helper = new Object() {
        String greet(String name) {
            return "สวัสดี " + name + "! ยินดีต้อนรับ";
        }
        int doubleOf(int n) {
            return n * 2;
        }
    };

    System.out.println(helper.greet("นักเรียน"));
    System.out.println("doubleOf(21) = " + helper.doubleOf(21));
    System.out.println();
}
