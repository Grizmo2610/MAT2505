# **1. Bài tập tính khoảng cách của hai điểm**
## **Đề bài**

Viết chương trình nhập vào 4 số thực `x1`, `y1`, `x2`, `y2` từ đối dòng lệnh

Tính  và in ra khoảng cách Euclid giữa hai điểm `(x1, y1)` và `(x2, y2)`. 

Kết quả được làm tròn đến 2 số phần thập phân, sử dụng công thức `Math.round(a * 100.0) / 100.0` để làm tròn số a

## **Lời giải**
```java
public class Distance {
    public static void main(String[] args) {
        

        double x1 = Double.parseDouble(args[0]);
        double y1 = Double.parseDouble(args[1]);
        double x2 = Double.parseDouble(args[2]);
        double y2 = Double.parseDouble(args[3]);

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println(Math.round(distance * 100.0) / 100.0);
    }
}

```

---

# **2. Bài lập trình Three Sort**

## **Đề bài**
Viết chương trình đầu vào là 3 số nguyên nhận từ đối dòng lệnh, kết quả là 3 số theo thứ tự tăng dần in trên 1 dòng. (dùng phương thức `println` in kết quả)

Để đổi một xâu dạng số sang giá trị số, sử dụng các phương thức tương ứng sau

```java
(int)
Integer.parseInt(String)
```

Để tính `min` (tương ứng `max`) của hai số a, b, sử dụng phương thức sau

```java
minimum = Math.min(a, b);
maximum = Math.max(a, b);
```

## **Lời giải**
```java
public class ThreeSort {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        int min = Math.min(a, Math.min(b, c));
        int max = Math.max(a, Math.max(b, c));
        int middle = a + b + c - min - max;

        System.out.println(min + " " + middle + " " + max);
    }
}
```

## **Giải thích**

* **Tìm số lớn nhất (Tương tự với bé nhất) trong 3 số**: Ta chọn ra số (Ở đây là `b` và `c`) trong 3 số sau đó so sánh để tìm ra số lớn hơn (Giả sử ở đây là `b`). Ta đem so sánh số này với số còn lại (Ở đây là `a`). Nếu `a > b`, `b > c` Thì theo tính chất bắc cầu `a > c` hoặc nếu `b > a` và `b > c` $\Rightarrow$ `b` là số lớn nhất

* **Tìm số đứng giữa**: Sau khi có 2 số lớn nhất và bé nhất, ta sẽ cộng tổng ba số này lại ta được `a + b + c = max + min + mid` (với `max` là số lớn nhất, `min` là số bé nhất và `mid` là số ở giữa). Đổi về và ta được công thức: `mid = a + b + c - min - max`

---

# **3. Đổi độ dài từ km sang dặm**
## **Đề bài**
Viết chương trình `ConvertUnit2.java` cho phép nhập một số thực `x` qua đối dòng lệnh, sau đó coi `x` là chiều dài tính bằng **km**, in ra số đo `y` của chiều dài đó tính bằng **dặm**

> 1 dặm = 1609 m

Kết quả được làm tròn đến 2 số phần thập phân, sử dụng lệnh in có định dạng `printf` để in kết quả.

## **Lời giải**
```java
public class ConvertUnit2 {
    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        double y = x * (1 / 1.609);
        System.out.printf("%.2f\n", y);
    }
}
```

## **Giải thích**

Ta có công thức $1 \text{ mile} = 1609 \text{ m} = 1.609 \text{ km}$. $\Rightarrow$ $1 \text{ km} = 1/1609 \text{ mile}$

---

# **4. Đổi nhiệt độ từ thang Celsius sang thang Fahrenheit**
## **Đề bài**
Viết chương trình ConvertUnit3.java cho phép nhập một số thực `x` qua đối dòng lệnh, sau đó coi `x` là nhiệt độ Celsius, in ra số đo `y` của nhiệt độ đó tính theo thang Fahrenheit theo công thức: 

$$\frac{C}{5} = \frac{F-32}{9}$$ 

Trong đó: 
* C – nhiệt độ theo thang Celsius
* F – nhiệt độ theo thang Fahrenheit.

Kết quả được làm tròn đến 2 số phần thập phân, sử dụng lệnh in có định dạng `printf` để in kết quả.
## **Lời giải**
```java
public class ConvertUnit3{
    public static void main(String[] args){
        double x = Double.parseDouble(args[0]);
        double y = x * 9 / 5.0 + 32;
        System.out.printf("%.2f\n", y);
    }
}
```

---

# **5. Tính thời gian di chuyển trong chuyển động nhanh dần đều**
## **Đề bài**
Quãng đường S đi được trong chuyển động nhanh dần đều tính theo công thức: $S = v_0 \times t + a\times t\times t/2$, với $v_0$ là vận tốc ban đầu, $t$ là thời gian đi và $a$ là gia tốc.
Xây dựng lớp (chương trình) `MovementTime.java`, trong đó có phương thức `main` cho phép nhập các giá trị $S$, $v_0$ và $a$ kiểu `double` (theo thứ tự đó) qua **đối dòng lệnh**. Sau đó kiểm tra nếu cả ba giá trị đều dương thì tính thời gian $t$ từ công thức trên (thời gian $t > 0$ - tính bằng giây) và in ra màn hình. Ngược lại thì in ra màn hình $-1$.

Yêu cầu: Kết quả cần làm tròn đến **2 chữ số phần** thập phân, sử dụng `x = (Math.round(x*100.0))/100.0` để làm tròn.

* Hướng dẫn: 
    * Giải phương trình bậc 2 ứng với ẩn số $t$
    * Sử dụng hàm `Double.parseDouble(String number)` để chuyển xâu `number` thành giá trị số.

## **Lời giải**

```java
public class MovementTime {
    public static void main(String[] args) {
        double S = Double.parseDouble(args[0]);
        double v0 = Double.parseDouble(args[1]);
        double a = Double.parseDouble(args[2]);

        if (S <= 0 || v0 < 0 || a <= 0) {
            System.out.println("-1");
            return;
        }

        double A = a / 2;
        double B = v0;
        double C = -S;

        double delta = B * B - 4 * A * C;

        if (delta < 0) {
            System.out.println("-1");
            return;
        }

        double t1 = (-B + Math.sqrt(delta)) / (2 * A);
        double t2 = (-B - Math.sqrt(delta)) / (2 * A);

        if (t1 > 0){
            System.out.printf("%.2f\n",t1);
        }else if(t2 > 0){
            System.out.printf("%.2f\n",t1);
        }else{
            System.out.printf("-1");
        }
    }
}

```

## **Giải thích**

Để cho đơn giản, ta sẽ viết lại công thức và chuyển vế $S$ như sau $\frac{a}{2}t^2 + v_0t - S = 0$. Khi này ta có thể thấy đây là một phương trình bậc 2 với ẩn là $t$. Hay nói cách khác là giải phương trình bậc trình $f(t) = 0$

Ta xác định các hệ số trong phương trình bậc 2: $f(x) = Ax^2 + Bx + C = 0$ như sau $A = \frac{a}{2}, B = v_0, C = -S$

Thế vào phương trình $f(t) = 0$ ta có thể tính $\Delta$ (`delta`) và tìm nghiệm của phương trình bậc 2 như đã học ở phổ thông

Sử dụng câu lệnh `Math.sqrt(x)` để tính căn bậc 2 của số `x`.

Ta kiểm tra lần lượt xem `t1 > 0` hay không? Nếu có thì in ra `t1`, nếu không ta chuyển sang so sánh `t2`. Nếu `t2 > 0`  thì in ra `t2` nếu `t2 < 0` thì in ra `-1`.

---

# **6. Kiểm tra ba số có tạo thành ba cạnh của tam giác hay không**

## **Đề bài:**

Hoàn thiện phương thức `isTriangle (double a, double b, double c)` cho trong tệp RightTriangle cho phép kiểm tra xem ba số thực có tạo thành ba cạnh của tam giác hay không? Hàm này trả về kết quả true nếu ba số a, b, c tạo thành ba cạnh của tam giác, trả về kết quả false nếu ngược lại

```java
class RightTriangle{
    
    static boolean isTriangle(double a, double b, double c){
        // begin edit 
        
        //end edit
    }
    public static void main (String args[]){
        
    }
}
```

## **Lời giải**

```java
public class RightTriangle{
    static boolean isTriangle(double a, double b, double c){
        // begin edit 
        if( a>0 && b>0 && c>0 && a+b > c && a+c>b && b+c>a ) {
			return true;
        } else {
			return false;
        }
        //end edit
    }
    public static void main (String args[]){
        double a = Double.parseDouble (args[0]);
		double b = Double.parseDouble (args[1]);
		double c = Double.parseDouble (args[2]);
		boolean check = isTriangle(a,b,c);
		System.out.println(check);
		if (check == true){
			System.out.println("la mot tam giac");
        } else {
			System.out.println("khong phai la mot tam giac");
		}
    }
}
```

---

# **7. Tính diện tích tam giác**

## **Đề bài**

Hoàn thiện phương thức `getArea (double a, double b, double c)`  cho trong lớp `Triangle`. 

Phương thức này cho phép tính diện tích tam giác tạo bởi ba số thực `a, b, c` (nếu có). Ngược lại, nếu `a, b, c` không tạo thành ba cạnh của tam giác. Phương thức này trả về `0`

```java
public class Triangle{
    static double getArea(double a, double b, double c){
         
    }
    public static void main(String [] args){
        
    }
}
```

## **Lời giải:**

```java
class Triangle{
    static double getArea(double a, double b, double c) {
        if( a>0 && b>0 && c>0 && a+b > c && a+c>b && b+c>a ) {
			double p = (a + b +c) / 2;
			return Math.sqrt( p * ( p - a ) * ( p - b ) * ( p - c ));
        } else { 
            return 0; 
        }
}
    public static void main(String [] args){
        double a = Double.parseDouble (args[0]);
		double b = Double.parseDouble (args[1]);
		double c = Double.parseDouble (args[2]);  
        System.out.println(getArea(a,b,c));
    }
}
```

---


# **8. Tính tổng các số nguyên dương chẵn nhỏ hơn n**

## **Đề bài:**
Viết chương trình nhập số nguyên  n từ đối dòng lệnh.
Tính tổng các giá trị là số chẵn nhỏ hơn n.
Ví dụ `n = 10`

kết quả là `20 = 0 + 2 + 4 + 6 +8`

ví dụ chạy chương trình:

```bash
java SumEven 10
```

Kết quả in ra màn hình là 

```
20
```

**Gợi ý**, sử dụng vòng lặp `for`, mỗi bước tăng 2 đơn vị 

## **Lời giải:**

```java
public class SumEven {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 0;
        for (int i = 2; i < n; i +=2){
            sum += i;
        }
        System.out.println(sum);
    }
}
```
## **Giải thích:**

* Sử dụng `Integer.parseInt(args[0])` để ép kiểu dữ liệu về số nguyên. 

* Ta khởi tạo một biến `sum` để lưu trữ kết quả của việc tính tổng. Ta gán giá trị ban đầu là `0` để khi thực hiện tính toán sẽ không bị ảnh hưởng bởi giá trị khởi tạo ban đầu (Nếu khởi tạo `sum = x` thì kết quả sau sẽ bị lệch đi `x`).

* Sử dụng vòng lặp `for`, ta khởi tạo `int i = 2` (số chẵn nhỏ nhất lớn hơn `0`) và chạy cho tới khi `i < n` (Duyệt hết tất cả các số bé hơn `n`) đồng thời ta cho bước nhảy là `i += 2` (vì các số chẵn cách nhau đúng 2 đơn vị). Tại mỗi bước lặp ta sẽ lấy `sum + i` sau đó gán lại vào `sum` $\rightarrow$ `sum = sum + i` hoặc viết ngắn gọn sẽ thành `sum += i`.