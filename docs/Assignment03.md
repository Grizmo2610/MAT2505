# **A. Tìm tổng các ước của một số**
## **Đề bài:**
Viết chương trình nhập một số nguyên dương n từ đối dòng lệnh. Tính và in ra tổng các ước nhỏ hơn n của n

## **Lời giải:**
```java
public class SumDivisors {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int sum = 1;
        for (int i = 2; i < n; i ++){
            if (n % i == 0){
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
```
## **Giải thích:**
Ta khởi tạo một biến `sum = 1` (vì tất cả các số tự nhiên lớn hơn 0 đều có ước là 1) để làm biến lưu trữ kết quả tính tổng.

Tiếp theo đó ta kiểm tra từ 2 cho tới n - 1 (Kiểm tra các số nguyên trong đoạn [2; n - 1]), với $\forall i \in [2; n - 1]$ sao cho `n % i = 0` (`i` chia hết cho `n` $\Rightarrow$ `n` khi chia cho `i` sẽ không có phần dư) thì ta đem `sum += i`.

---

# **B. Hàm kiểm tra số nguyên tố**
## **Đề bài:**
Hoàn thiện hàm isPrime trong file `NumberProps.java`

Hàm `isPrime` nhận đối số là một số nguyên `k`, kiểm tra `k` có phải số nguyên tố hay không,

Nếu `k` là số nguyên tố hàm trả lại giá trị `true`, ngược lại hàm trả lại giá trị `false`.

### NumberProps.java
```java
// Hoàn thiện hàm kiểm tra số nguyên tố isPrime
// Sinh viên có thể viết thêm các hàm khác nếu cần, tuy nhiên cần giữ nguyên khuôn mẫu hàm isPrime


public class NumberProps{
    //Sinh viên hoàn thiện hàm isPrime, giữ nguyên nguyên mẫu hàm
    public static boolean isPrime(int k){
        
        return false;
    }   
}
```

## **Lời giải:**

```java
public class NumberProps{
    public static boolean isPrime(int k){
        if (k < 2){
            return false;
        }else if(k == 2 || k == 3){
            return true;
        }
        else if (k % 2 == 0){
            return false;
        }

        for (int i = 3; i <= Math.sqrt(k); i += 2){
            if (k % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

## **Giải thích:**

> Số nguyên tố là số tự nhiên lớn hơn 1 và chỉ chia hết cho 1 và chính nó.

Tại hàm này chúng ta kiểm tra lần lượt như sau:
* Kiểm tra xem số `k` có có nhỏ hơn `2` hay không? (Tất cả các số nhỏ hơn đều không phải số nguyên tố)

* Kiểm tra 2 trường hợp đặc biệt là 2 (Số nguyên tố chẵn duy nhất) và 3

* Ta kiểm tra xem số `k` có phải là số chẵn không (Tất cả các số chẵn khác 2 đều không phải số nguyên tố)

* Sau đó ta kiểm tra vòng lặp (kiểm tra tất cả các số còn lại) từ 3 cho tới $\sqrt{k}$. Ta bỏ qua số 2 và các số chẵn (Bước nhảy = 2) vì đã kiểm tra ở điều kiện trước đó. Nếu ta tìm được 1 ước của `k`, hay nói cách khác là tìm được 1 số `i` chia hết cho `k` (`k % i = 0`) thì số `k` không phải số nguyên tố.

* Nếu sau khi kiểm tra tất cả các số, chúng ta không tìm được số `i` nào thỏa mãn. Ta kết luận rằng số `k` là số nguyên tố.

* Tại từng bước. Chúng ta sử dụng `return` để *dừng chương trình* và **Bỏ qua** các bước kiểm tra tiếp theo. (Ví dụ: Ta kiểm tra thấy `k < 1` thì không cần phải kiểm tra `k` có phải số chẵn hay không nữa.)


### Biểu diễn uớc của một số (Giải thích tại sao chỉ kiểm tra tới $\sqrt{k}$):

Nếu $n$ có ước khác 1 và chính nó, thì nó có thể được biểu diễn thành tích hai số nhỏ hơn $n$: Giả sử $n$ có một ước số $d$ khác 1 và $n$ (tức là $d$ chia hết $n$), khi đó $n$ có thể được viết dưới dạng tích hai số: $n = a \times b$. 

Nếu cả $a$ và $b$ đều lớn hơn $\sqrt{n}$, thì tích của chúng sẽ lớn hơn $n$, điều này mâu thuẫn. Do đó, ít nhất một trong hai số $a$ hoặc $b$ phải nhỏ hơn hoặc bằng $\sqrt{n}$.

Hệ quả: Nếu $n$ không phải là số nguyên tố, thì nó chắc chắn có ít nhất một ước số nhỏ hơn hoặc bằng $\sqrt{n}$. Nếu ta không tìm thấy ước số nào trong khoảng $[2, \sqrt{n}]$, thì $n$ chắc chắn là số nguyên tố.

---

# C. **Tìm trung bình cộng các số lẻ**
## **Đề bài**
Nhập vào một số nguyên dương n từ đối dòng lệnh. Tính và in ra trung bình cộng của các số lẻ nhỏ hơn hoặc bằng n.
## **Lời giải:**

```java
public class AverageEvens {

    public static double averageEvens(int n){
        int sum = 0;
        for (int i = 1; i <= n; i += 2){
            sum += i;
        }

        int amout = (n + 1) / 2;
        return 1.0 * sum / amout;
    }
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        System.out.println(averageEvens(n));
    }
}
```


## **Giải thích:**
* Việc tính tổng các số lẻ xem lại ở bài `/week02/SumEven.java`. Ở đây chỉ khác ở chỗ ta sử dụng `i <= n` và khởi tạo bắt đầu tại số lẻ đầu tiên lớn hơn 0 là 1 vì để bài yêu cầu tính tất cả các số chẵn **nhỏ hơn hoặc bằng** `n`.

* Việc tính số lượng các số lẻ nhỏ hơn hoặc bằng `n` tả sử dụng công thức `k = (n + 1) / 2` sau đó ta lấy số nguyên lớn nhất nhỏ hơn hoặc bằng `k`. Ví dụ `n = 5` thì `k = 3` $\Rightarrow$ có 3 số lẻ (1, 3, 5). Ví dụ với `n = 8` thì `k = 4` $\Rightarrow$ có 4 số lẻ (1, 3, 5, 7).

---

# **1. Kiểm tra một số có là số hoàn hảo hay không**
## **Đề bài**
Hoàn thiên phương thức `isPerfect` cho trong lớp `PerfectNumber` để kiểm tra một số nguyên dương `n` có phải là số hoàn hảo hay không.

Số hoàn hảo là số có tổng các ước nhỏ hơn nó bằng chính số đó

Ví dụ: $6$ được gọi là số hoàn hảo do $6 = 1 + 2 + 3$
## **Lời giải**
```java
import java.util.Scanner;

public class PerfectNumber{
    public static boolean isPerfect(int n){
        // begin edit
        if ( n<=1 ) {
            return false;
        }
		int sum = 0;
		for(int i = 1; i<n ; i++){
		    if(n%i==0){
			    sum+=i;
			}
		}
        return sum == n;
        //end edit
    }
    public static void main(String []args){
	    Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		System.out.println(isPerfect(n););
		sc.close();
        
    }
}
```
## **Giải thích**

* Tại sao lại là `return sum == n`? Ta đều biết biểu thức này sẽ cho chúng ta kết quả là `True` hoặc là `False`, mà chúng là tại kiểm tra xem `sum == n == True` thì lại `return True` và ngược lại. Điều này sẽ khiến đoạn code dài hơn, trong khi có thể rút ngắn mà chương trình không thay đổi.

* Trong hàm `main`, thay vì phải gán giá trị vào một biến  `k`, ta có thể trực tiếp in ra mà không lo bị ảnh hưởng.
---

# **2. In ra các số hoàn hảo nhỏ hơn n**
## **Đề bài**
Viết chương trình thực hiện in ra số hoàn hảo nhỏ hơn `n`.

Hoàn thiện các phương thức cho trong lớp `NPerfects`

Ví dụ: $n = 100$ kết quả là

```bash
6 28
```

## **Lời giải**
```java
import java.util.Scanner;
public class NPerfects{
    public static boolean isPerfect(int n){
        //begin edit
        if (n<2){
            return false;
        }
        int sum = 0;
		for(int i = 1; i<n ; i++){
            if( n%i==0 ){
                sum+=i;
                }
            }
		return sum == n;
    }
    
    public static void printNPerfect(int n){
        for (int j = 1; j < n ; j++){
            if (isPerfect(j)){
                System.out.print(j + " ");
            }
        }
		
		
    }
    public static void main (String args[]){
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		printNPerfect(n);
        sc.close();
    }
}
```

## **Giải thích**

---

# **3. Bài thực hành lập trình In ra n số nguyên tố đầu tiên**
## **Đề bài**
Viết chương trình thực hiện in ra `n` số nguyên tố đầu tiên, với `n` được nhập từ bàn phím.

ví dụ với `n = 5` kết quả là

```bash
2 3 5 7 11
```

## **Lời giải**
```java
package week03;
import java.util.Scanner;
public class NPrimes {
	public static boolean checkPrime(int n){
		if (n < 2){
            return false;
        }else if(n == 2 || n == 3){
            return true;
        }
        else if (n % 2 == 0){
            return false;
        }

        for (int i = 3; i <= Math.sqrt(n); i += 2){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
	}

    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		
		int count = 0;
		int primeNum = 2;
		
		while(count<n) {
			if(checkPrime(primeNum)){
				System.out.print(primeNum + " ");
				count++;
			}
			primeNum++;
		}
		System.out.println();
	}
}
```

Cách khác, với các hàm khác tương tự, chúng ta chỉ thay đổi ở hàm main như sau:

```java
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    sc.close();
    for (int i = 2, count = 0; count < n; i ++){
        if (checkPrime(i)){
            count++;
            System.out.print(i + " ");
        }
    }
}
```

## **Giải thích**
* Kiểm tra số nguyên tố, xem lại trong bài *B. Hàm kiểm tra số nguyên tố* lớp `NumberProps.java`

* Cấu trúc của vòng lặp `for` là: 
```java
for (<data type> <variable1> = <value1>, <variable2> = <value2>,...; <condition>; <change>){

}
```

Trong đó 
* `<data type>` là kiểu dữ liệu

* `<variable>`: là tên các biến

* `<value>`: Các giá trị khởi tạo cho các biến tương ứng

* `Điều kiện dừng`: Điều kiện dừng vòng lặp `for`

* `change`: Sự thay đổi sau mỗi vòng lặp (Có thể để trống)

Trong các bài giảng, thường được viết ngắn gọn lại thành là
```java
for (int i = 0; i < n; i++){

}
```

Điều này đúng, nhưng chưa đủ bản chất, Chúng ta có thể tạo nhiều hơn 1 biến ở trong vòng lặp `for`, và điều kiện thì không nhất thiết phải là `i < n`, đó có thể là một điều kiện khác phức tạp hơn, hoặc không phụ thuộc vào biến `i`.



---

# **4. Bài lập trình số siêu nguyên tố**
## **Đề bài**
Bài tập lập trình kiểm tra một số có `n` nhập từ bàn phím có phải là một số siêu nguyên tố hay không? Số siêu nguyên tố là số nguyên tố mà khi bỏ 1 số tùy ý các chữ số bên phải của nó thì phần còn lại vẫn là số nguyên tố
ví dụ: 
* Với `n = 5939` kết quả là

```bash
True
```

* Với `n = 26` kết quả là 

```bash
False
```
## **Lời giải**
```java
import java.util.Scanner;

public class SuperPrime {
    public static boolean isPrime(int n) {
		if (n < 2){
            return false;
        }else if(n == 2 || n == 3){
            return true;
        }
        else if (n % 2 == 0){
            return false;
        }

        for (int i = 3; i * i <= n; i += 2){
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSuperPrime(int n) {
        while (n > 0) {
            if (!isPrime(n)) {
                return false;
            }
            n /= 10;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(isSuperPrime(n));
    }
}
```
## **Giải thích**
* Hàm `isPrime` xem lại các bài trước

Ta sẽ *bỏ* lần lượt các chữ chỗ bên phải bằng cách chia `n` cho `10` (Lưu ý lại về chia số nguyên cho số nguyên). Sau đó ta kiểm tra lần lượt, nếu phát hiện tại một thời điểm khi ta bỏ chữ số bên phải thì không còn là một số nguyên tố nữa (Sử dụng `isPrime()` để kiểm tra số nguyên tố, và sử dụng `!` để phủ định kết quả (`true` thành `false` và ngược lại)).

Sau khi đã chia số về 0, thì sẽ trả về kết quả là `true`, vì 0 không chia được nữa, cho nên là chương trình dừng.


---

# **5. Bài tập lập trình tính $e^x$**
## **Đề bài**
Viết chương trình tính giá trị $e^x$ theo khai triển Taylor

$$
e^x = 1 + x + \frac{x^2}{2!} + \frac{x^3}{3!} + \dots + \frac{x^n}{n!}
$$

Với `x`, và `n` là đối được nhập từ dòng lệnh 
```bash
java exp x n
```

- `x` là số thực (double)
- `n` là số nguyên (int)
- Kết quả được làm tròn đến **2** số phần thập phân, sử dụng công thức `Math.round(a * 100.0) / 100.0` để làm tròn số
- Dùng lệnh `System.out.println()` để in kết quả

## **Lời giải**
```java
public class Exp {
    public static double computeExp(double x, int n) {
        double sum = 1.0;
        double term = 1.0;
        for (int i = 1; i <= n; i++) {
            term *= x / i;
            sum += term;
        }
        return Math.round(sum * 100.0) / 100.0;
    }

    public static void main(String[] args) {
        double x = Double.parseDouble(args[0]);
        int n = Integer.parseInt(args[1]);
        
        System.out.println(computeExp(x, n));
    }
}
```

## **Giải thích**

* Công thức khai triển Taylor và tính chất xem lại ở môn Giải tích 1.

* Ta khởi tạo 2 biến `sum` và `term` để lưu trữ lần lượt là kết quả tính tống (Kết quả của $e^x$ tại bước thứ $i$ và kết của $\frac{x^i}{i|}$)

* Ta có công thức như sau:
$$
\frac{x^i}{i!} =\frac{x^{i-1} * x}{(i-1)! * i} = \frac{x^{i-1}}{(i-1)!} * \frac{x}{i}
$$

Chính vì thế tại từng bước `i` ta chỉ việc lấy kêt quả của bước `i-1` nhân với `x / i` là sẽ thu được kết quả mong muốn. Lưu ý là các kiểu dữ liệu cần để là số thực để tránh lỗi về phạm vị của kiểu dữ liệu.

