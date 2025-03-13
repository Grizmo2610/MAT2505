# **1. Tìm số ngày trong tháng của một năm**

## **Đề bài**
Trong một năm dương lịch, các tháng 1, 3, 5, 7, 8, 10, 12 có 31 ngày; các tháng 4, 6, 9, 11 có 30 ngày. 

Tháng 2 của năm thường có 28 ngày, của năm nhuận có 29 ngày. 

Năm nhuận là các năm (với số năm) chia hết cho 4 nhưng không chia hết cho 100, hoặc là các năm chia hết cho 400. 

Ví dụ các năm 2000, 1996 là năm nhuận; các năm 2001, 2100 là năm thường.

Lập chương trình cho phép nhận 02  số nguyên từ đối dòng lệnh, theo thứ tự ứng với tháng và năm. 

Kiểm tra nếu đó là tháng - năm phù hợp (năm là số nguyên lớn hơn 0, tháng là số từ 1 đến 12) thì in ra số ngày của tháng đó. 

Ngược lại, in ra thông báo: `Incorrect!` (xâu ký tự, **không** gồm 2 dấu nháy kép, có dấu ! ở cuối).

Chương trình (`class`) cần có hàm/phương thức `SoNgay(int thang, int nam)` với đầu vào theo thứ tự ứng với tháng, và năm, trả về số ngày của tháng nếu phù hợp, ngược lại trả về `0`.

Phương thức `main` cho phép nhận các giá trị nguyên ứng với tháng, năm (theo thứ tự này) từ đối dòng lệnh và in ra kết quả.
Có thể xây dựng thêm các hàm/phương thức khác nếu cần thiết!

```java
/**
 * Chương trình tính số ngày trong một tháng của một năm với
 * tháng/năm là các số nguyên tương ứng nhận từ đối dòng lệnh
 * Bổ sung thêm các hàm/phương thức khác nếu cần thiết
 * */
public class ngaytrongthang{
     
     public static int SoNgay(int thang, int nam){
         // Editing begin here
         
     }
     
     public static void main(String args[]){
         
         
     }
    
}
```
---

## **Lời giải**

```java
public class ngaytrongthang{
     
     public static int SoNgay(int thang, int nam){
         // Editing begin here
        if (thang < 0 || thang >12 || nam <0 ){
		    return 0;
		}
		switch(thang){
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				return 31;
			case 4:
			case 6:
			case 9:
			case 11:
				return 30;
			case 2:
				if (nam%400 ==0 || (nam % 4 ==0 && nam%100 != 0)){
					return 29;
				} else {
					return 28;
				}
			default:return 0;
		}
     }
     
     public static void main(String args[]){
		int thang = Integer.parseInt(args[0]);
		int nam = Integer.parseInt(args[1]);
        int SoNgay = SoNgay(thang, nam);
		if (SoNgay == 0){
			System.out.println("Incorrect!");
		} else {
			System.out.println (SoNgay); 
		}
         
     }
    
}
```

---

## **Giải thích**

---

# **2. Tính n!!**
## **Đề bài**
Nhập vào một số nguyên dương `n` từ bàn phím (Scanner)

Viết chương trình tính và in ra giai thừa kép của n ký hiệu là n!!

Biết rằng 

$n!! = 1\times3\times5\times \dots \times n$ nếu $n$ lẻ,
$n!! = 2\times4\times6\times \dots \times n$ nếu chẵn.
Chú ý chỉ in ra duy nhất giá trị $n!!$, ví dụ `n=6` thì kết quả in ra là
```bash
48
```

```java
class Factorial{
    
}
```

---

## **Lời giải**
```java
import java.util.Scanner;
class Factorial {
	public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int fac = 1;
            if (n%2 == 0){
                for (int i =2; i<=n; i+=2){
                    fac *= i;
                }
            } else { 
                for (int i=1; i<=n; i+=2){
                    fac *=i;
                }
        }
        System.out.println(fac);
        sc.close();
	}
}
```


---

## **Giải thích**

---

# **3. Tối giản phân số**
## **Đề bài**
Viết chương trình cho phép nhập tử số và mẫu số của một phân số, tìm dạng tối giản của phân số đó. 

Yêu cầu: Chương trình (lớp - class) cần có
 - Phương thức printSimplest(int Nume, int Denom) với tham đối đầu vào là tử số Nume, mẫu số Denom kiểu int. Phương thức sẽ tìm và in ra phân số tối giản tương ứng theo dạng `N/D`.

Ví dụ đầu vào là `Nume =  12`, `Denom = 21` thì in ra `4/7`.

- Phương thức main cho phép nhận 2 số nguyên từ đối dòng lệnh, theo thứ tự sẽ là tử số và mẫu số, sau đó gọi phương thức `printSimplest` để in ra dạng tối giản của phân số tương ứng.

- Thiết lập thêm các hàm/phương thức khác nếu cần.


Gợi ý: Giả sử ước số chung lớn nhất của `Nume` và `Denom` là `G=gcd(Nume, Denom)`, lúc đó dạng tối giản của `Nume/Denom` là `N/D`, với `N = Nume/G`, `D = Denom/G`.


> **CHÚ Ý**, bài này nhập tử số và mẫu số từ đối dòng lệnh
```java
/**
 * Chương trình tìm phân số tối giản với đầu vào là tử số và mẫu số kiểu int được nhập qua đối dòng lệnh. 
 * Chương trình tính và in ra kết quả dạng N/D (Ví dụ: Đầu vào: 4  18, in ra: 2/9)
 * Cần giữ lại các phương thức trong khung dưới đây, có thể bổ sung thêm các hàm/phương thức khác nếu cần
 **/
 public class SimplifyFrac{
     
     // tử số là Nume, mẫu số là Denom, tính và in ra dạng tối giản của Nume/Denom
     public static void  printSimplest(int Nume, int Denom){
         //edit method here
         
     }
     
     public static void main(String args[]){
         //edit method main here
         
     }
 }
```
---

## **Lời giải**
```java

public class SimplifyFrac {
    public static void main(String[] args) {
        int nume = Integer.parseInt(args[0]);
        int denom = Integer.parseInt(args[1]);

        printSimplest(nume, denom);
    }

    public static int gcd(int a, int b) {
        while (b != 0) {
            int num = b;
            b = a % b;
            a = num;
        }
        return Math.abs(a);
    }

    public static void printSimplest(int nume, int denom) {
        int gcd = gcd(nume, denom);
        nume = nume / gcd;
        denom = denom / gcd;

        if (denom < 0) {
            nume = nume * (-1);
            denom = denom * (-1);
        }

        System.out.println(nume + "/" + denom);
    }
}

```


---

## **Giải thích**

---

# **4. Tìm phần tử thứ n của cấp số cộng**
## **Đề bài**

Viết chương trình thực hiện Nhập 3 số nguyên dương  `a, d, n` từ bàn phím.

Tìm và in ra phần tử thứ `n` của cấp số cộng với cộng bội `d` và phần tử đầu tiên là `a`.

ví dụ `a = 1, d = 2, n = 5` thì kết quả in ra là
```bash
9
```

---

## **Lời giải**

```java
import java.util.Scanner;
public class ArithSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int d = sc.nextInt();
        int n = sc.nextInt();
        int S = (a+d*(n-1));
        System.out.println(S);
        sc.close();
    }
}
```


---

## **Giải thích**

---

# **5. Kiểm tra số đối xứng**
## **Đề bài**
Hoàn thiện phương thức `isPalindrome (int n)` cho phép kiểm tra một số `n` có phải là số đối xứng hay không?

Số đối xứng là số có nghịch đảo của số đó bằng chính nó

Ví dụ; `n = 1221` là số đối xứng, vì số nghịch đảo của `n` là `1221` bằng `n`

số `1321` không là số đối xứng vì nghịch đảo của `1321` là `1231` $\neq$ `1321`

Gợi ý: Tính số nghịch đảo của `n`

Ví dụ `n = 1234` thì `n` có thể phân tích thành $n = 1\times10^4 + 2 \times 10^3  + 3\times10^2 + 4$

Số đảo ngược của n là 4321 có thể phân tích thành
$$
\begin{align}
4\times10^4 + 3\times10^3 + 2\times10^2 + 1
    &= 1 + 423\times10 \\
    &= 1 + (42\times10 + 3) \\
    &= 1 + ((4\times10 + 2) \times 10 + 3) \\
\end{align}
$$
Từ quan sát trên, tại mỗi bước lặp, tách chữ số tận cùng bên phải của `n`, 
```
temp = n%10; // Lấy chữ số bên phải nhất của n
```

Cộng dần giá trị vào biến
```
sum = sum*10 + temp;
```
Tính lại 

```
n = n/10; //Giảm xóa chữ số bên phải nhất của n để làm với chữ số tiếp theo
``` 
Chừng nào `n >0`, chúng ta còn tiếp tục lặp. Khi `n = 0`, đã tính hết các chữ số

Kết thúc lặp, giá trị của `sum` chính là giá trị số đảo ngược của `n`

---

## **Lời giải**
```java
package week04;

import java.util.Scanner;

public class Palindrome {
    public static boolean isPalindrome(int n) {
        int num = n;
        int temp;
        int sum = 0;

        while (n > 0) {
            temp = n % 10;
            sum = sum * 10 + temp;
            n /= 10;
        }

        return (sum == num);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if (isPalindrome(n)) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

        sc.close();
    }
}
```
---

## **Giải thích**

---

# **6. Phân tích số**
## **Đề bài**
Nhập vào số nguyên dương `n` từ bàn phím. Hãy chỉ ra cách phân tích số nguyên dương n thành tích của các số nguyên tố

Ví dụ 1:

```
n = 10
```

- Đầu ra: 
```
2 5
```

Ví dụ 2
```
n = 18
```

- Đầu ra:
```
2 3 3
```

Gợi ý:

Chia số `n` cho các số `i` từ $2 \rightarrow n$ đến khi nào không thể chia được nữa.

Từ đó ta nhận thấy là các số phía sau `i` thì `n` không bao giờ chia hết nếu nó là bội của `i` mà chỉ có thể chia hết cho các số khác `i` chưa được kiểm tra, mà các số chưa kiểm tra đó chính là các số nguyên tố. Do vậy chúng ta sẽ không cần kiểm tra các số có là số nguyên tố hay không.

Ví dụ với `n =  18`.

`i = 2  (18%2 ==0)` lấy `18/2 = 9`, `(9%2  != 0 )` do đó tăng `i` lên `1`

`i = 3 (9%3 == 0)` lấy `9/3 = 3`, `(3%3 = 0)` lấy `3/3 = 1` kết thúc

vậy kết quả được phép phân tích là $18 = 2 \times 3 \times 3$

Chú ý kết quả chỉ in ra các số trong cách phân tích được sắp tăng dần in trên 1 dòng mỗi số cách nhau 1 dấu cách, ví dụ `n = 18` thì kết quả in ra là
```
2 3 4
```
---

## **Lời giải**
```java
import java.util.Scanner;
public class NumberAnalysis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        if (n <= 0) {
            System.out.println("Vui lòng nhập số nguyên dương.");
            return;
        }
        boolean first = true;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (!first) {
                    System.out.print(" ");
                }
                System.out.print(i);
                n /= i;
                first = false;
            }
        }

        scanner.close();
    }
}
```


---

## **Giải thích**

---
