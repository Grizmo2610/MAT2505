# **1. Tìm tổng các ước của một số**
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

# **2. Hàm kiểm tra số nguyên tố**
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

# 3. **Tìm trung bình cộng các số lẻ**
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
