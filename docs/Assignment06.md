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
```java
import java.util.Scanner;

public class TimesMatrix {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] matrixA = inputMatrix(rows, columns, scanner);
        int[][] matrixB = inputMatrix(columns, rows, scanner);
        int[][] matrixC = multiplyMatrices(matrixA, matrixB, rows, columns, rows);
        printMatrix(matrixC);

        scanner.close();
    }


    public static int[][] inputMatrix(int rows, int cols, Scanner scanner) {
        int[][] matrix = new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
        return matrix;
    }


    public static int[][] multiplyMatrices(int[][] A, int[][] B, int rA, int cA, int cB) {
        int[][] result = new int[rA][cB];
        for (int i = 0; i < rA; i++) {
            for (int j = 0; j < cB; j++) {
                for (int k = 0; k < cA; k++) {
                    result[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return result;
    }


    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
```

---

## GIải thích

---

# Bài tập mảng 2 chiều
## Đề bài
Hoàn thiện các hàm trong chương trình theo mẫu đã cho, thực hiện các công việc sau:

- Nhập vào kích thước ma trận. Nhập vào các phần tử của ma trận theo kích thước đã cho. In ra ma trận đã nhập.

- Nhập vào kích thước ma trận. Nhập vào 2 ma trận. In ra ma trận là tổng của 2 ma trận đã nhập.

- Nhập vào kích thước ma trận. Nhập vào các phần tử của ma trận. In ra tổng của các cột của ma trận đã nhập.

- Nhập vào kích thước ma trận. Nhập vào các phần tử của ma trận. Xóa một cột của ma trận và in ra ma trận kết quả.

- Nhập vào kích thước ma trận. Nhập vào các phần tử của ma trận. In ra ma trận tam giác trên của ma trận đã nhập.

- Nhập vào kích thước ma trận. Nhập vào các phần tử của ma trận. In ra theo thứ tự tăng dần các phần tử là số nguyên tố nằm trong ma trận tam giác trên của ma trận đã nhập.

**Matrix.java**
```java
import java.util.Random;
import java.util.Scanner;


public class Matrix {

  public static void main(String[] args) {
      
      /* TODO */
  
      
  }
  
  /* Method to generate random matrix, used to test program */
  public static int[][] generateMatrix(int rows, int columns) {
    if ((rows <= 0) || (columns <= 0)) {
      return null;
    }
    
    Random randomGenerator = new Random();
    int[][] newMatrix = new int[rows][columns];
    for (int i = 0; i < rows; i++) {
      for (int j = 0; j < columns; j++) {
        newMatrix[i][j] = Math.abs(randomGenerator.nextInt()) % 100;
      }
    }
    
    return newMatrix;
  }
  
  /* Method to check valid matrix */ 
  public static boolean isValid(int[][] matrix) {
    if ((matrix == null) || (matrix.length == 0) || (matrix[0].length ==0)) {
      return false;
    }
    return true;
  }
  
  /* Method to check valid array */
  public static boolean isValid(int[] array) {
    if ((array == null) || (array.length == 0)) {
      return false;
    }
    
    return true;
  }

  public static void inputMatrix(int[][] matrix, Scanner keyboard) {
    if (!isValid(matrix)) {
      return;
    }
    
    /* TODO */
  }

  public static int[][] inputMatrix(int rows, int columns, Scanner keyboard) {
    if ((rows <= 0) || (columns <= 0)) {
      return null;
    }
    
    /* TODO */
  }
  
  /* Method to print a array */
  public static void printArray(int[] array) {
    if (!isValid(array)) {
      return;
    }
    
    StringBuilder arrayString = new StringBuilder();
    for (int elem : array) {
      arrayString.append(elem).append(" ");
    }
    System.out.print(arrayString.toString().trim());
  }

  /* Method to print a matrix (2d array) */
  public static void printMatrix(int[][] matrix) {
    if (!isValid(matrix)) {
      return;
    }

    StringBuilder stringRow = new StringBuilder();
    for (int[] row : matrix) {
      stringRow.setLength(0);
      for (int elem : row) {
        stringRow.append(elem).append(" ");
      }
      System.out.println(stringRow.toString().trim());
    }
  }
  
  /* Method to add 2 matrices */
  public static int[][] addMatrices(int[][] leftMatrix, int[][] rightMatrix) {
    if ((!isValid(leftMatrix)) || (!isValid(rightMatrix))) {
      return null;
    }
    
    if ((leftMatrix.length != rightMatrix.length) 
         || (leftMatrix[0].length != rightMatrix[0].length)) {
      return null; 
    }
    
    /* TODO */
  }
  
  /* Method to sum columns of matrix */
  public static int[] sumColumns(int[][] matrix) {
    if (!isValid(matrix)) {
      return null;
    }
    
    /* TODO */
  }
  
  /* Method to print sum of columns of matrix */
  public static void printSumColumns(int[][] matrix) {
    int[] sumArray = sumColumns(matrix);
    printArray(sumArray);
  }
  
  /* Method to delete a column of matrix */
  public static int[][] deleteColumn(int[][] matrix, int index) {
    if (!isValid(matrix)) {
      return null;
    }
    
    if ((index < 0) || (index >= matrix[0].length)) {
      return matrix;
    }
    
    if (matrix[0].length == 1) {
      return null;
    }
    
    /* TODO */
  }
  
  /* Method to print the matrix having a column deleted */
  public static void printDeleteColumnMatrix(int[][] matrix, int index) {
    int[][] deleteMatrix = deleteColumn(matrix, index);
    printMatrix(deleteMatrix);
  }
  
  /* Method to get upper triangular matrix of a matrix */
  public static int[][] getUpperTriangularMatrix(int[][] matrix) {
    if (!isValid(matrix)) {
      return null;
    }
    
    if (matrix.length != matrix[0].length) {
      return null;
    }
    
    /* TODO */
  }
  
  /* Method to print upper triangular matrix of a matrix */
  public static void printUpperTriangularMatrix(int[][] matrix) {
    int[][] upperTriangularMatrix = getUpperTriangularMatrix(matrix);
    printMatrix(upperTriangularMatrix);
  }
  
  /* Method to check if a number is a prime */
  public static boolean isPrime(int number) {
    /* TODO */
  }
  
  /* Method to get all primes in upper triangular matrix of a matrix */
  public static int[] getPrimesInUpperTriangularMatrix(int[][] matrix) {
    /* TODO */
  }
  
  /* Method to sort an array */
  public static void sortArrayInAscendingOrderUsingSelectionSort(int[] array) {
    if (!isValid(array)) {
      return;
    }

    int temp;
    int minIndex;
    for (int i = 0; i < array.length - 1; i++) {
      minIndex = i;
      // find index of the smallest element
      for (int j = i + 1; j < array.length; j++) {
        if (array[j] < array[minIndex]) {
          minIndex = j;
        }
      }

      // swap the smallest element and ith element
      if (minIndex != i) {
        temp = array[i];
        array[i] = array[minIndex];
        array[minIndex] = temp;
      }
    }
  }
}
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
