# **1. Bài lập trình Hello world**
Viết chương trình in ra 10 lần dòng chữ Hello world

Lời giải
```java
public class HelloWorld{
	public static void main(String[] args) {
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
	}
}
```

---

# **2. Tính trung bình cộng 03 số thực**
Chương trình cho phép nhận 03 số thực từ đối dòng lệnh (command line arguments) và tính trung bình cộng của chúng.

Sử dụng hàm: 
```java
Double.parseDouble(String strNumber)
``` 
để chuyển một xâu dạng số thực thành một giá trị double.

Kết quả được in ra màn hình.

Để đổi một xâu dạng số sang giá trị số, sử dụng các phương thức tương ứng sau

```java
(double)
Double.parseDouble(String)
```

Lời giải
```java
public class AverageThree {
	public static void main (String[] args){
		double a = Double.parseDouble (args[0]);
		double b = Double.parseDouble (args[1]);
		double c = Double.parseDouble (args[2]);
		
		double avg = (a+b+c)/3;
		System.out.println(avg);
	}
}
```

---

# **3. Kiểm tra 3 giá trị bằng nhau hay không**

Viết chương trình cho phép đọc 3 tham số từ đối dòng lệnh và trả về kết quả là true nếu 3 giá trị bằng nhau và là false nếu ngược lại.

- **Chú ý**:
    - Giá trị của tham số là kiểu xâu ký tự (String) chứ không bắt buộc phải là số.
    - Kết quả được in ra bằng lệnh `println()`

Lời giải:
```java
class TripleEquals {
	public static void main(String[] args) {
        String a = args[0];
        String b = args[1];
        String c = args[2];
        boolean check = a.equals(b) && a.equals(c) ;
        System.out.println(check);
	}
}
```

---

# 4. Bài tập đổi đơn vị
Viết chương trình `ConvertUnit1.java` cho phép nhập một số thực `x` qua đối dòng lệnh, sau đó coi `x` là chiều dài tính bằng **mét**, hãy in ra số đo `y` của chiều dài đó tính bằng **inches**.

> 1 meter = 39.3700787 inches

Kết quả được làm tròn đến 2 số phần thập phân, sử dụng công thức `Math.round(a * 100.0) / 100.0` để làm tròn số `a`

Lời giải:
```java
class ConvertUnit1{ 
	public static void main(String[] args){
        double x = Double.parseDouble(args[0]);
        double y = x*39.3700787;
        System.out.println(Math.round(y*100.0)/100.00);
	}
}
```