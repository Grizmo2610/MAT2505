# **1. Tìm giá trị nhỏ nhất và lớn nhất của mảng**
## **Đề bài**

Viết chương trình nhập vào số nguyên `n` và 1 mảng `a[]` gồm `n` số nguyên từ bàn phím.

- Tìm và in ra giá trị nhỏ nhất và lớn nhất trong mảng `a[]` trên cùng dòng, cách nhau bởi `01` khoảng trống.

Ví dụ,

Input:
```bash
n = 5
a = { 1, 3, 0, 2, 9}
```

Ouput:
```bash
0 9
```

* `FindMinMax.java`

```java
/**
 * Chương trình nhập một số nguyên n và mảng gồm n số nguyên
 * sau đó in ra giá trị nhỏ nhất và lớn nhất của mảng trên cùng dòng, 
 * cách nhau bởi một khoảng trống. Cần giữ khung chương trình.
 * */
//import <libraries needed here>

public class FindMinMax{
    
    public static int findMin(int a[]){
        //editing here
    }
    
    public static int findMax(int a[]){
        //editing here
    }
    
    public static void main(String args[]){
        // editing here
    }
    
}
```

---

## **Lời giải**

```java
package week05;

import java.util.Scanner;
public class FindMinMax{

    public static int findMin(int[] a){
        int min = a[0];
        for (int i = 1; i < a.length; i++){
            min = Math.min(a[i], min);
        }
        return min;
    }

    public static int findMax(int[] a){
        int max = a[0];
        for (int i = 1; i < a.length; i++){
            max = Math.max(a[i], max);
        }
        return max;
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        sc.close();

        int min = findMin(arr);
        int max = findMax(arr);
        System.out.println(min + " " + max);
    }
}
```

---

## **Giải thích**

---

# **2. In ra các số nguyên tố trong mảng**
## **Đề bài**
Viết chương trình nhập vào số nguyên `n` từ bàn phím,

- Nhập mảng `arr` gồm `n` số nguyên, in ra màn hình các số nguyên tố có trong mảng `arr` theo đúng thứ tự.

Ví dụ:
```bash
n = 5

arr = 1 3 4 5 7
```
Kết quả in ra màn hình là:
```bash
3 5 7
```

---

## **Lời giải**
```java
import java.util.Scanner;

public class PrimesInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        printPrimesInArray(arr);
        sc.close();
    }

    public static void printPrimesInArray(int[] a) {
         for (int i = 0; i < a.length; i++) {
            if (isPrime(a[i])) {
                System.out.print(a[i] + " ");
            }
        }
    }

    public static boolean isPrime(int a) {
        if (a < 2) {
            return false;
        }
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }
}
```

---

## **Giải thích**

---


# **3. Cộng 2 mảng**
## **Đề bài**

- Viết chương trình nhập số nguyên dương `n` từ bàn phím

- Nhập mảng `a` gồm `n` số nguyên từ bàn phím

- Nhập mảng `b` gồm `n` số nguyên từ bàn phím

- Tính mảng `c = a + b`, in các phần tử trong `c` ra màn hình

Ví dụ: 
```bash
n = 5
a = 1 2 3 4 5
b = 2 1 3 4 1
```
Kết quả in ra màn hình là
```bash
3 3 6 8 6
```

---

## **Lời giải**
```java
import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] a = readArr(sc, n);
        int[] b = readArr(sc, n);
        int[] c = addArr(a, b);
        
        print(c);
        sc.close();
    }

    public static void print(int[] a) {
        for (int x : a) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static int[] addArr(int[] a, int[] b) {
        if (a.length != b.length) {
            return null;
        }

        int[] c = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            c[i] = a[i] + b[i]; 
        }

        return c;
    }

    public static int[] readArr(Scanner sc, int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
```

---

## **Giải thích**

---

# **4. Tính kỳ vọng và phương sai mẫu**
## **Đề bài**
Viết chương trình thực hiện các chức năng sau:

1. nhập vào số nguyên dương `n`

2. Nhập vào mảng array gồm `n` số nguyên

3. Tính giá trị trung bình của mảng `array`

4. Tính phương sai của mảng `array`

5. In ra màn hình giá trị trung bình và phương sai của mảng array.

**Chú ý:**

- Dữ liệu được nhập từ bàn phím, kết quả in ra màn hình

- Kết quả in ra màn hình lấy đến 3 chữ số phần thập phân

**Ví d**ụ:

```
n = 5
array = {1, 2, 3, 4, 5}
mean = (1+2+3+4+5)/5 = 3.000

var = (4+1+0+1+4)/5 = 2.000
```
kết quả in ra màn hình là:
```
3.000

2.000
```

---

* Statistic.java
```java
import java.util.Scanner;
public class Statistic{

    // Hoàn thiện phương thức readArray thực hiện nhập và trả lại mảng a theo hướng dẫn sau:
    // 1. Nhập vào kích thước mảng là số nguyên dương n
    // 2. Khai báo mảng số nguyên a có kích thước n
    // 3. Nhập vào n số nguyên cho mảng a
    // 4. trả lại kết quả của hàm là mảng a (return a)
    public static int[] readArray(Scanner reader)
    {
        return null;
    }
    // Hoàn thiện phương thức mean, thực hiện tính kỳ vọng (trung bình) của mảng array
    // 1. Tính tổng các phần tử trong mảng (sum)
    // 2. Tính giá trị trung bình bằng sum chia cho số phần tử, chú ý giá trị trung bình là số thực
    public static double mean(int[] array)
    {
        return 0.0;
    }
    // Hoàn thiện phương thức variance thực hiện tính phương sai của mảng a
    // 1. Tính tổng bình phương của (từng giá trị trong mảng array - mean(array),
    //    chú ý nên đặt 1 biến lưu giá trị mean(array) để tránh phải tính lại nhiều lần.
    // 2. Chia tổng này cho số phần tử trong mảng array, chú ý phương sai là số thực
    public static double variance(int[] array)
    {

        return 0.0;
    }

    // Hàm main được viết sẵn, sinh viên không cần viết, chỉnh sửa, 
    // tuy nhiên chương trình chỉ chạy đúng nếu các phương thức trên sinh viên làm đúng
    public static void main(String[] args){
        Scanner reader = new Scanner(System.in);
        int[] array = readArray(reader);
        System.out.printf("%.3f\n",mean(array));
        System.out.printf("%.3f",variance(array));
    }
    
} 
```
## **Lời giải**
```java
package week05;

import java.util.Scanner;

public class Statistic {
    public static int[] readArray(Scanner reader) {
        int n = reader.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = reader.nextInt();
        }
        return a;
    }

    public static double mean(int[] array) {
        double sum = 0;
        for (int number : array) {
            sum += number;
        }
        return  sum / array.length;
    }

    public static double variance(int[] array) {
        double mean = mean(array);
        double variance = 0;

        for (int number: array){
            variance += (mean - number) * (mean - number);
        }
        return variance / array.length;
    }
    
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] array = readArray(reader);
        System.out.printf("%.3f\n", mean(array));
        System.out.printf("%.3f", variance(array));
    }


}
```
---

## **Giải thích**
* Tính trung bình, sử dụng vòng lặp `for-each` để tính tổng. Sau đấy chia tổng đó cho độ dài của mảng (bằng với số lượng
phần tử của mảng). Ở đây ta khởi tạo biến `double sum` có kiểu dữ liệu là `double` thì khi tính toán chia, ta không cần 
ép kiểu về số thực nữa mà có thể thực hiện chia trực tiếp

* Tính phương sai
Công thức của phương sai như sau:
$$
\sum_{i=1}^n\frac{(a_i - mean(a))^2}{n}
$$

Trong đó $a$ là mảng chưa các số nguyên và $mean(a)$ là trung bình của mảng. $a_i$ là phần tử tại vị trí $i$

---

# **5. Bài thực hành Kiểm tra dãy tăng**
## **Đề bài**
Viết chương trình nhập vào số nguyên `n` và  mảng `a[]` gồm `n` số nguyên từ bàn phím.

- Kiểm tra mảng vừa nhập có tạo thành một dãy tăng hay không (`a[i] < a[i+1]` với mọi `i = 0, 1 ... (n-2))`. In ra màn hình `YES` nếu dãy tăng và `NO` nếu ngược lại.

Ví dụ 1
```
n = 5

a = {1, 2, 3, 4, 6}
```
Kết quả in ra là
```
YES
```
Ví dụ 2
```
n = 5

a = {1, 2, 3, 4, 4}
```
Kết quả in ra là
```
NO
```
---

## **Lời giải**
```java
package week05;

import java.util.Scanner;

public class DayTang {
    public static String check(int[] arr){
        for (int i = 0; i < arr.length - 1; i++){
            if (arr[i] >= arr[i + 1]){
                return "NO";
            }
        }
        return "YES";
    }
    public static int[] readArray(Scanner reader) {
        int n = reader.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = reader.nextInt();
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] a = readArray(reader);

        System.out.println(check(a));
        reader.close();
    }
}

```
---

## **Giải thích**
Chúng ta duyệt các phần tử từ `i` đến `n` sau đó kiểm tra xem `a[i]` có nhỏ hơn `a[i + 1]` hay không?
`a[i] >= a[i + 1]` nếu như điều này xảy ra, chúng ta ngay lập tức trả về "NO" và dừng vòng lặp. Lưu ý ở đây. dùng `return`
sẽ ngay lập tức dừng vòng lặp và không thực hiện các phần còn lại nữa. Và vì chỉ cần 1 cặp số không tuân theo quy tắc là
toàn bộ là sai. Chính vì thế ta không cần kiểm tra thêm

Lưu ý: Ở đây ta chỉ cho `i` chạy từ 0 đến `n-1` vì ta sử dụng so sánh `a[i + 1]`. Để tránh bị lỗi `IndexOutOfBound` thì 
chúng ta dừng ở `n-1`

---

# **6. Bài thực hành Sắp xếp mảng số tăng dần**
## **Đề bài**
Viết chương trình nhập vào số nguyên `n` và 1 mảng `a[]` gồm `n` số nguyên từ bàn phím.

- Sắp xếp mảng `a` theo thứ tự tăng dần về giá trị và in các phần tử của mảng sau khi sắp xếp ra màn hình trên một dòng, 
mỗi phần tử cách nhau bởi một khoảng trống.

Ví dụ,

Input:
```
n = 5

a = { 1, 3, 0, 2, 9}
```
Ouput:
```
0 1 2 3 9
```
* SortArray.java
```java
/**
 * Nhập số nguyên N và một mảng A gồm N số nguyên từ bàn phím
 * Sắp xếp A tăng dần về giá trị và in ra mảng đã sắp xếp
 * */
 class SortArray{
     
     
 }
```
---

## **Lời giải**
```java

import java.util.Scanner;

public class SortArray {
    public static int[] readArray(Scanner reader) {
        int n = reader.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = reader.nextInt();
        }
        return a;
    }

    public static void sortArray(int[] arr){
        int n = arr.length;
        for (int i = 1; i < n; i++){
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key){
                arr[j + 1] = arr[j];
                j -= 1;
            }
            arr[j + 1] = key;
        }
    }

    public static void printArray(int[] array){
        for (int number: array){
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] a = readArray(reader);
        sortArray(a);
        printArray(a);
    }
}

```
---

## **Giải thích**

Sử dụng giải thuật *selection sort*.

1. Ý tưởng của Selection Sort
   Hãy tưởng tượng bạn có một danh sách số lộn xộn, và bạn muốn sắp xếp chúng từ bé đến lớn. Cách làm của Selection Sort rất đơn giản:

Tìm số nhỏ nhất trong danh sách.
Đặt số nhỏ nhất này lên đầu danh sách.
Lặp lại với phần còn lại của danh sách (bỏ qua phần đã sắp xếp).
Làm vậy cho đến khi không còn phần tử nào chưa sắp xếp nữa, danh sách sẽ hoàn toàn có thứ tự.

2. Ví dụ minh họa
   Cho danh sách sau:
   [5, 3, 8, 6, 2]

* Bước 1: Tìm số nhỏ nhất trong cả danh sách (số 2), đổi chỗ nó với phần tử đầu tiên:
[2, 3, 8, 6, 5]

* Bước 2: Bỏ qua số 2 (vì đã đúng chỗ), tìm số nhỏ nhất trong phần còn lại (3), không cần đổi chỗ vì nó đã ở đúng vị trí.

* Bước 3: Bỏ qua 2 và 3, tìm số nhỏ nhất trong phần còn lại (5), đổi chỗ với 8:
[2, 3, 5, 6, 8]

* Bước 4: Bỏ qua 2, 3, 5, tìm số nhỏ nhất trong phần còn lại (6), không cần đổi chỗ.

* Bước 5: Bỏ qua 2, 3, 5, 6, chỉ còn 8, không cần làm gì nữa.

Kết quả cuối cùng:
[2, 3, 5, 6, 8]

Xem thêm tại:
* https://www.geeksforgeeks.org/selection-sort-algorithm-2/
* https://www.youtube.com/watch?v=g-PGLbMth_g
* https://www.youtube.com/watch?v=FllEXZV1Z58


---

# **7. Phân loại phần tử mảng**
## **Đề bài**
Viết chương trình cho phép nhập một số nguyên dương `n`, và một mảng gồm `n` phần tử nguyên. Sau đó viết hàm/phương thức 
để xếp tất cả các phần tử giá trị lẻ về đầu mảng, các phần tử giá trị chẵn về cuối mảng. Thứ tự xuất hiện các giá trị 
trong mỗi nhóm cần được giữ nguyên.

In mảng kết quả ra màn hình trên một dòng, các giá trị cách nhau bởi 01 khoảng trống.
Ví dụ:

Đầu vào
```
10

1 24 7 13 20 14 37 0 12 8
```
Cần có đầu ra:
```
1 7 13 37 24 20 14 0 12 8
```
* GroupArray.java
```java
/**
 * chương trình nhập số nguyên n và mảng gồm n số nguyên
 * hàm/phương thức groupArray xếp số lẻ về đầu, số chẵn về cuối mảng
 * Bổ sung thêm các hàm/phương thức khác nếu cần
 * */
 
public class GroupArray{
    
    // Định nghĩa hàm/phương thức groupArray() ở đây
    // .....  groupArray(.....)
    
    public static void main(String args[]){
        
        // ... editing 
    }
}
```

---

## **Lời giải**
```java
import java.util.Scanner;

public class GroupArray{

   public static int[] groupArray(int[] arr){
      int[] groupArray = new int[arr.length];
      int index = 0;
      for (int number: arr){
         if (number % 2 != 0){
            groupArray[index] = number;
            index++;
         }
      }
      for (int number: arr){
         if (number % 2 == 0){
            groupArray[index] = number;
            index++;
         }
      }

      return groupArray;
   }

   public static void printArray(int[] array){
      for (int number: array){
         System.out.print(number + " ");
      }
      System.out.println();
   }

   public static int[] readArray(Scanner reader) {
      int n = reader.nextInt();
      int[] a = new int[n];

      for (int i = 0; i < n; i++){
         a[i] = reader.nextInt();
      }
      return a;
   }

   public static void main(String[] args){
      Scanner reader = new Scanner(System.in);
      int[] array = readArray(reader);
      reader.close();
      printArray(groupArray(array));
   }
}
```
---

## **Giải thích**

Ta khởi tạo 1 mảng chứa kết quả cùng kiểu dữ liệu và cùng kích thước với mảng gốc. Đồng thời tạo thêm 1 biến `index` để
làm con trỏ (Vị trí hiện tại trong mảng gốc) để gán giá trị vào vị trí tương ứng.

Ta sẽ duyệt 2 lần. 1 lần đầu tiên là sẽ xếp hết các phần tử lẻ vào mảng theo thứ tự. Đồng thời mỗi lần gán giá trị ta sẽ
tăng `index` lên 1. (Lưu ý chỉ tăng khi gán). Việc này tương đương ới việc đánh dấu ô đã được sử dụng và ta tiến tới ô
gán ở ô tiếp theo. Cứ thế lặp lại đến giá trị cuối.

Tại lần lặp thứ 2. Ta tìm các biến chẵn sau đấy làm tương tự. Chỉ khác lúc này chúng ta không gán `index = 0` nữa mà tiếp 
tục thực hiện vì giá trị lúc này đã là tại phần tử trống tiếp theo. 

---

# **8. Đếm số lần xuất hiện của mỗi giá trị trong mảng**
## **Đề bài**
Viết chương trình cho phép nhập một số nguyên dương `n` và một mảng `A` gồm `n` số nguyên.

Đếm và in ra số lần xuất hiện của mỗi giá trị có mặt trong mảng `A` (không lặp lại).

Kết quả cần in ra trên một dòng, mỗi cặp giá trị - số lần sẽ theo quy tắc: <giá trị>:<số lần xuất hiện> (được viết sát 
nhau) và giữa các cặp này sẽ cách nhau bởi 01 khoảng trống. Thứ tự xuất hiện của các cặp sẽ theo thứ tự giá trị xuất 
hiện trong mảng (giá trị nào xuất hiện trong mảng trước thì cặp giá trị - số đếm sẽ được in ra trước). Các được in ra 
giá trị không lặp lại.

Ví dụ đầu vào:
```
n = 10;

A = {2, 3, 2, 7, 1, 2, 3, 7, 7, 2}
```
thì cần in ra:
```
2:4 3:2 7:3 1:1
```
Hướng dẫn (có thể chọn cách khác nếu cho kết quả đúng):

- Sử dụng cách xóa các giá trị lặp trong mảng `A` để thu được mảng mới `B` chỉ còn toàn các giá trị khác nhau

- Duyệt mảng `B`, ứng với phần từ `B[k]`, duyệt mảng `A`, mỗi lần gặp giá trị bằng `B[k]` thì đếm thêm 1. Trả lại các 
số đếm trong một mảng hoặc in ra theo đúng yêu cầu.

---

## **Lời giải**
```java
package week05;

import java.util.Scanner;

public class Countvalues{
    public static void printArray(int[] array){
        for (int number: array){
            System.out.print(number + " ");
        }
        System.out.println();
    }

    public static int[] readArray(Scanner reader) {
        int n = reader.nextInt();
        int[] a = new int[n];

        for (int i = 0; i < n; i++){
            a[i] = reader.nextInt();
        }
        return a;
    }

   public static void process(int[] A){
      StringBuilder result = new StringBuilder();
      int n = A.length;
      boolean[] counted = new boolean[n];

      for (int i = 0; i < n; i++) {
         if (counted[i]) {
            continue;
         }

         int value = A[i];
         int count = 1;

         for (int j = i + 1; j < n; j++) {
            if (A[j] == value) {
               count++;
               counted[j] = true;
            }
         }
         result.append(value).append(":").append(count).append(" ");
      }
      System.out.println(result);
   }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int[] A = readArray(reader);
        reader.close();
        process(A);
    }
}
```
---

## **Giải thích**

Ta sẽ khởi tạo một mảng `boolean[] counted` để kiểm tra xem các `index` đã được đếm hay chưa. Mảng này sẽ có kích thươớc
tương đương với mảng gốc. Ta sẽ bắt đầu vòng lặp qua mảng A. Lần lượt kiểm tra xem phần tử `A[i]` đã được đếm chưa bằng
cách kiểm tra `counted[i]` nếu đã được đếm, ta cùng `continue` để bỏ qua các câu lệnh phía bên dưới.

Nếu chưa được đếm, ta sẽ khởi tạo biến `count = 1` để bắt đầu đếm. Sau đấy ta chỉ cần đếm các phần tử còn lại trong mảng(
bắt đầu từ `i+1` vì ta đã khởi tạo `count = 1` nên bỏ qua phần tử tại vị trí `i`) Ta không kiểm tra các phần tử phía bên
trái vì chắc chắc các phần tử khác `A[i]` (Vì nếu có phần tử giống `A[i]` thì `counted[i]==true`). Mỗi khi gặp các phần
tử `A[j]` == `A[i]` thì sẽ tăng `count` lên 1 và đồng thời gán `counted[j] =true` biểu thì việc đã đếm.

Sau cùng ta sử dụng `StringBuilder` để hiển thị kết quả (Tránh bị khoảng trắng cuối). Sử dụng phương thức `append()`
để thêm phần tử vào phía sau. Lưu ý thêm khoảng trắng sau mỗi cặp `<value>:<count>`
---
