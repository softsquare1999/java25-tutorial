// EP 02: JShell Demo Script
// รันด้วย: jshell JShellDemo.jsh
//
// Script นี้แสดงการใช้งาน JShell ในแบบต่างๆ

System.out.println("=== EP 02: JShell Demo ===");
System.out.println();

// ---- Section 1: Arithmetic ----
System.out.println("--- 1. Arithmetic ---");
int a = 10;
int b = 3;
System.out.println(a + " + " + b + " = " + (a + b));
System.out.println(a + " - " + b + " = " + (a - b));
System.out.println(a + " * " + b + " = " + (a * b));
System.out.println(a + " / " + b + " = " + (a / b));    // integer division
System.out.println(a + " % " + b + " = " + (a % b));    // remainder
System.out.println();

// ---- Section 2: String Methods ----
System.out.println("--- 2. String Methods ---");
String text = "Hello, Java 25!";
System.out.println("original  : " + text);
System.out.println("uppercase : " + text.toUpperCase());
System.out.println("lowercase : " + text.toLowerCase());
System.out.println("length    : " + text.length());
System.out.println("contains  : " + text.contains("Java"));
System.out.println("replace   : " + text.replace("Java", "World"));
System.out.println("substring : " + text.substring(7, 11));
System.out.println("strip     : " + "  spaces  ".strip());
System.out.println();

// ---- Section 3: Math ----
System.out.println("--- 3. Math ---");
System.out.println("sqrt(144) = " + Math.sqrt(144));
System.out.println("pow(2,10) = " + (int)Math.pow(2, 10));
System.out.println("max(5,9)  = " + Math.max(5, 9));
System.out.println("abs(-7)   = " + Math.abs(-7));
System.out.println("PI        = " + Math.PI);
System.out.println();

// ---- Section 4: User-defined Method ----
System.out.println("--- 4. Custom Method ---");

String repeat(String s, int n) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) sb.append(s);
    return sb.toString();
}

System.out.println(repeat("Java! ", 3));
System.out.println(repeat("*", 20));
System.out.println();

// ---- Section 5: Collections ----
System.out.println("--- 5. Collections ---");
var fruits = new java.util.ArrayList<String>();
fruits.add("Apple");
fruits.add("Banana");
fruits.add("Cherry");
System.out.println("fruits: " + fruits);
System.out.println("size  : " + fruits.size());
System.out.println("get(1): " + fruits.get(1));
System.out.println();

System.out.println("=== JShell Demo เสร็จแล้ว! ===");
/exit
