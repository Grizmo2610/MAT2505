# 1. Bài thực hành Cộng 2 ma trận
## Đề bài
Viết chương trình nhập vào 2 số nguyên `rows`, `columns` từ bàn phím.

- Nhập ma trận số nguyên `matrixA` kích thước `rows` $\times$ `columns` từ bàn phím.
- Nhập ma trận số nguyên `matrixB` kích thước `rows` $\times$ `columns` từ bàn phím.

- Tính ma trận `matrixC = 2*matrixA + 3*matrixB`, in ma trận matrixC ra màn hình.

Ví dụ,

Input:
```
rows = 2
columns = 3
```
```
matrixA =
1 2 3
2 1 3
```

```
matrixB =
1 1 1
2 2 2
```


Ouput:
```
5 7 9
10 8 12
```
* `AddMatrix.java`

```java
import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        // input rows
        // inputs columns
        // if using inputMatrix, allocate matrix first, and then pass matrix to inputMatrix method
        // if using generateMatrix, pass rows and columns to generateMatrix method, and then allocate matrix
        // call addMatrix to add the matrices
        // print matrix
        /* TODO */
    }
    
    public static void inputMatrix(int[][] matrix, Scanner keyboard) {
        /* TODO */
    }
    
    public static int[][] generateMatrix(int rows, int columns, Scanner keyboard) {
        /* TODO */
    }
    
    public static int[][] addMatrix(int[][] matrixA, int[][] matrixB) {
        /* TODO */
    }
    
    public static void print(int[][] matrix) {
        /* TODO */
    }
}
```
---

## Lời giải
```java
package week06;

import java.util.Scanner;

public class AddMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // input rows
        int rows = sc.nextInt();
        // inputs columns
        int cols = sc.nextInt();
        // if using inputMatrix, allocate matrix first, and then pass matrix to inputMatrix method
        int[][] matrixA = new int[rows][cols];
        inputMatrix(matrixA, sc);
        // if using generateMatrix, pass rows and columns to generateMatrix method, and then allocate matrix
        int[][] matrixB = generateMatrix(rows, cols, sc);

        // call addMatrix to add the matrices
        // print matrix
        /* TODO */
    }

    public static void inputMatrix(int[][] matrix, Scanner keyboard) {
        for(int i = 0;i < matrix.length;i++){
            for(int j =0; j< matrix[0].length;j++){
                matrix[i][j] = keyboard.nextInt();
            }
        }
    }

    public static int[][] generateMatrix(int rows, int columns, Scanner keyboard) {
        int[][] matrix = new int[rows][columns];
        for(int i = 0;i < matrix.length;i++){
            for(int j =0; j< matrix[0].length;j++){
                matrix[i][j] = keyboard.nextInt();
            }
        }
        return matrix;
    }

    public static int[][] addMatrix(int[][] matrixA, int[][] matrixB) {
        int[][] matrix = new int[matrixA.length][matrixB.length];
        for (int i = 0; i < matrixA.length; i++){
            for (int j = 0; j < matrixA[0].length; j++){
                matrix[i][j] = 3 * matrixB[i][j] + 2 * matrixA[i][j];
            }
        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        for ( int i = 0; i < matrix.length;i++){
            for (int j = 0; j < matrix[0].length;j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
```

---

## GIải thích

---

# 2. Tính tổng phần tử mỗi cột của ma trận
## Đề bài
- In ra tổng của các phần tử của mỗi cột trong số columns cột, các tổng được viết trên cùng một dòng, các nhau bởi 01 khoảng trống.

Ví dụ
```
rows = 3
columns =4
```

```
matrix =
1 2 4 6
2 1 2 2
5 7 1 9
```

Cần in ra
```
8 10 7 17
```
* SumColumns.java

```java
import java.util.Scanner;

public class SumColumns {
    public static void main (String[] args) {
        // input rows
        // input columns
        // call inputMatrix method to input values of the matrix
        // call sumColumns to sum columns of the matrix
        // print array
        /* TODO */
    }
    
    public static void inputMatrix(int[][] matrix, Scanner keyboard) {
        /* TODO */
    } 
    
    public static int[] sumColumns(int[][] matrix) {
        /* TODO */
    }
    
    public static void printArray(int[] array) {
        /* TODO */
    }
}
```
---

## Lời giải
```java
import java.util.Scanner;

public class SumColumns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int c = sc.nextInt();
        int[][] m = new int[r][c];
        inputMatrix(m, sc);
        int[] a = sumColumns(m);
        printArray(a);
    }

    public static void inputMatrix(int[][] matrix, Scanner keyboard) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = keyboard.nextInt();
            }
        }
    }

    public static int[] sumColumns(int[][] matrix) {
        int[] result = new int[matrix[0].length];
        for (int j = 0; j < matrix[0].length; j++) {
            int sum = matrix[0][j];
            for (int i = 1; i < matrix.length; i++) {
                sum += matrix[i][j];
            }
            result[j] = sum;
        }
        return result;
    }

    public static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
```

---

## Giải thích

---

# 3. Xóa một cột của ma trận
## Đề bài
Viết chương trình cho phép nhập các số nguyên dương `rows`, `columns` và `index` trong khoảng `[0, columns - 1]`.

Sau đó nhập ma trận nguyên `matrix` kích thước `rows` $\times$ `columns`, rồi xóa đi cột chỉ số `index` từ ma trận.

In ma trận kết quả ra màn hình, mỗi dòng ma trận trên một dòng, các phần tử trong dòng cách nhau bởi 01 khoảng trống.

Ví dụ đầu vào:
```
rows = 4
columns = 5
index = 3
```

```
matrix =
1  3  7  9  10
2 6  3  11  20
5 9 13 12 1
5 5 7  10  1
```

Đầu ra:

```
1 3 7 10
2 6 3 20
5 9 13 1
5 5 7 1
```
* ColumnDeletion.java
```java
import java.util.Scanner;

public class ColumnDeletion {
    public static void main(String[] args) {
        // input rows
        // input columns
        // input index
        // input matrix
        // call deleteColumn method to delete column of the matrix
        // print matrix
        /* TODO */
    }

    public static void inputMatrix(int[][] matrix, Scanner keyboard) {
        // input matrix via keyboard
        /* TODO */
    }

    public static int[][] deleteColumn(int[][] matrix, int index) {
        /* TODO */
    }

    public static void print(int[][] matrix) {
        /* TODO */
    }
} 
```

---

## Lời giải
```java
import java.util.Scanner;

public class ColumnDeletion {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        int rows = keyboard.nextInt();
        int columns = keyboard.nextInt();
        int index = keyboard.nextInt();
        int[][] matrix = new int[rows][columns];
        inputMatrix(matrix, keyboard);

        int[][] result = deleteColumn(matrix, index);

        print(result);
    }

    public static void inputMatrix(int[][] matrix, Scanner keyboard) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = keyboard.nextInt();
            }
        }
    }

    public static int[][] deleteColumn(int[][] matrix, int index) {
        int[][] result = new int[matrix.length][matrix[0].length - 1];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                if (j < index) {
                    result[i][j] = matrix[i][j];
                }
                else if (j > index) {
                    result[i][j-1] = matrix[i][j];
                }
            }
        }
        return result;
    }

    public static void print(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
```

---

## Giải thích

---

# 4. Kiểm tra ma trận N * N có chứa các số từ 1 đến N * N?
## Đề bài
Viết chương trình cho phép nhập số nguyên size. Sau đó nhập vào một ma trận cỡ size x size với các phần tử nguyên.
Kiểm tra phần tử của ma trận có chứa tất cả các giá trị từ 1 đến size x size hay không, nếu đúng thì in ra màn hình YES, ngược lại in ra NO (chính xác các xâu ký tự này).

Ví dụ:

Đầu vào 1:
```
size = 5
```

```
matrix =
1  2  3  4  5
6  7  8  9  10
11 12 13 14 15
16 17 18 19 20
21 22 23 24 25
```

Đầu ra:
```
YES
```
Đầu vào 2:
```
size = 3
```

```
matrix =
1 3 4
10 2 1
2 4 51
```

Đầu ra:
```
NO
```
* CheckMatrix.java


```java
import java.util.Scanner;
 
public class CheckMatrix {
    public static void main (String[] args) {
        // input size
        // call inputMatrix to input values of the matrix
        // call checkMatrix to check matrix
        // print result
        /* TODO */
    }

    public static int[][] inputMatrix(int size, Scanner keyboard) {
        /* TODO */
    }
    
    public static boolean checkMatrix(int[][] matrix) {
        /* TODO */
    }
}
```
---

## Lời giải
```java
package week06;

import java.util.Scanner;

public class CheckMatrix {
    public static void main (String[] args) {
        // input size
        // call inputMatrix to input values of the matrix
        // call checkMatrix to check matrix
        // print result
        /* TODO */
        Scanner keyboard = new Scanner(System.in);
        int size = keyboard.nextInt();
        int[][] matrix = inputMatrix(size, keyboard);

        if (checkMatrix(matrix)) {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }

    public static int[][] inputMatrix(int size, Scanner keyboard) {
        int[][] matrix = new int[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = keyboard.nextInt();
            }
        }
        return matrix;
    }

    public static boolean checkMatrix(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[i][j] < 1 || matrix[i][j] > matrix.length * matrix.length) {
                    return false;
                }
            }
        }
        return true;
    }

}
```

---

## Giải thích

---

# 5. Bài thực hành Nhân 2 ma trận
## Đề bài
Viết chương trình nhập vào 2 số nguyên rows, columns  từ bàn phím.

- Nhập ma trận số nguyên matrixA kích thước rows x columns từ bàn phím.

- Nhập ma trận số nguyên matrixB kích thước columns x rows từ bàn phím.

- Tính ma trận matrixC = matrixA x matrixB, in ma trận matrixC ra màn hình.

Ví dụ,

Input:

rows = 2

columns = 3

matrixA =

1 2 3

2 1 3


```
matrixB =
1 1
1 2
2 2
```

Ouput:

```
9 11
9 10
```
---

## Lời giải


---

## GIải thích

---

#
## Đề bài

---

## Lời giải


---

## GIải thích

---

#
## Đề bài

---

## Lời giải


---

## GIải thích

---
