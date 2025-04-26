# **MẢNG HAI CHIỀU (MA TRẬN)**
> Ma trận (mảng hai chiều) trong Java là một cấu trúc dữ liệu lưu trữ các phần tử theo dạng bảng gồm nhiều dòng và cột, 
> được khai báo như `int[][] matrix`. Mỗi phần tử truy cập bằng hai chỉ số: chỉ số dòng và chỉ số cột. Ma trận thường 
> được dùng để biểu diễn dữ liệu bảng, phép toán đại số tuyến tính như cộng, trừ, nhân, chuyển vị... Khi làm việc với ma 
> trận, thường sử dụng vòng lặp lồng nhau để duyệt toàn bộ phần tử. Kích thước ma trận có thể cố định hoặc nhập từ bàn phím.

## **THAO TÁC CƠ BẢN VỚI MA TRẬN**

### **Đề bài**
Hãy thực hiện các thao tác cơ bản với ma trận (mảng 2 chiều) trong Java:

1. Nhập ma trận từ bàn phím.
2. In ra ma trận.
3. Lấy giá trị phần tử tại vị trí cụ thể trong ma trận.
4. Sao chép một ma trận.
5. Lấy kích thước của ma trận (số hàng và số cột).
6. Thực hiện một số thao tác khác như tạo ma trận rỗng, cộng và nhân ma trận.

### **Yêu cầu:**

1. **inputMatrix(int row, int col, Scanner keyboard)**: Nhập ma trận từ bàn phím, trả về ma trận đã nhập.
2. **inputMatrix(int[][] matrix, Scanner keyboard)**: Nhập giá trị cho từng phần tử trong ma trận đã cho.
3. **printMatrix(int[][] matrix)**: In ra ma trận, mỗi phần tử cách nhau một dấu cách, mỗi hàng của ma trận nằm trên một dòng mới.
4. **get(int[][] matrix, int row, int col)**: Trả về giá trị phần tử tại vị trí `(row, col)` trong ma trận.
5. **copyMatrix(int[][] matrix)**: Trả về một bản sao của ma trận đã cho.
6. **getSize(int[][] matrix)**: Trả về một mảng gồm số hàng và số cột của ma trận.
7. **randomMatrix(int row, int col, Random random)**: Tạo một ma trận ngẫu nhiên có kích thước `row * col` với giá trị các phần tử được sinh ngẫu nhiên trong một khoảng cho trước.

### **Requested File**
* `SimpleMatrix.java`

```java
import java.util.Random;
import java.util.Scanner;

public class SimpleMatrix {

    public static int[][] inputMatrix(int row, int col, Scanner keyboard) {
        /*
         * Truyền tham số đầu vào lần lượt là số hàng và số cột của ma trận và biến Scanner.
         * Thực hiện nhập ma trận từ bàn phím, trả về ma trận đã nhập.
         */
        return null;
    }

    public static void inputMatrix(int[][] matrix, Scanner keyboard) {
        /*
         * Truyền tham số đầu vào là ma trận và biến Scanner.
         * Thực hiện nhập giá trị cho từng phần tử trong ma trận.
         */
    }

    public static int[][] randomMatrix(int[][] matrix, Random random) {
        /*
         * Tạo ma trận ngẫu nhiên với các phần tử trong khoảng giá trị ngẫu nhiên.
         * Trả về ma trận đã tạo.
         */
        return null;
    }

    public static int[][] randomMatrix(int row, int col, Random random) {
        /*
         * Tạo một ma trận ngẫu nhiên có kích thước row x col.
         * Trả về ma trận ngẫu nhiên đã tạo.
         */
        return null;
    }

    public static void printMatrix(int[][] matrix) {
        /*
         * Truyền vào một ma trận.
         * Thực hiện in ra ma trận: mỗi phần tử cách nhau một dấu cách,
         * mỗi hàng của ma trận nằm trên một dòng mới.
         */
    }

    public static int get(int[][] matrix, int row, int col) {
        /*
         * Truyền vào ma trận và vị trí (row, col).
         * Trả về giá trị phần tử tại vị trí đó trong ma trận.
         */
        return 0;
    }

    public static int[][] copyMatrix(int[][] matrix) {
        /*
         * Truyền vào một ma trận.
         * Tạo và trả về một bản sao (copy) của ma trận đó.
         */
        return null;
    }

    public static int[] getSize(int[][] matrix) {
        /*
         * Truyền vào một ma trận.
         * Trả về mảng gồm 2 phần tử: [số hàng, số cột].
         */
        return null;
    }
}
```

---

## **MatrixOperations**

### **Đề bài**

Trong bài tập này, bạn sẽ thực hiện các thao tác cơ bản trên ma trận, bao gồm:

1. **Chuyển vị ma trận** (transpose).
2. **Cộng hai ma trận**.
3. **Nhân hai ma trận**.
4. **Biến đổi ma trận về dạng tam giác trên** (Upper Triangular Matrix).

Các thao tác này sẽ giúp bạn làm quen với các phép toán ma trận cơ bản, từ đó có thể áp dụng trong các bài toán tính toán số học hay đại số tuyến tính.

### **Yêu cầu**

1. **`transposeMatrix(int[][] matrix)`**:
    - Truyền vào một ma trận vuông hoặc chữ nhật.
    - Trả về ma trận chuyển vị (hoán đổi các hàng thành cột).

2. **`sumMatrix(int[][] matrixA, int[][] matrixB)`**:
    - Truyền vào hai ma trận cùng kích thước.
    - Trả về ma trận là tổng của hai ma trận tương ứng phần tử (ma trận A + B).

3. **`multiplyMatrix(int[][] matrixA, int[][] matrixB)`**:
    - Truyền vào hai ma trận: A kích thước m×n và B kích thước n×p.
    - Trả về ma trận kết quả kích thước m×p (ma trận A * B).
    - Lưu ý: Đảm bảo phép nhân ma trận hợp lệ (số cột của A bằng số dòng của B).

4. **`upperTriangle(int[][] matrix)`**:
    - Truyền vào một ma trận vuông.
    - Biến đổi ma trận về dạng tam giác trên (Upper Triangular Matrix), tức là tất cả các phần tử dưới đường chéo chính đều bằng 0.
    - Trả về ma trận đã biến đổi.

### **Requested File**
* `MatrixOperations.java`

```java
public class MatrixOperations{
    public static int[][] transposeMatrix(int[][] matrix){
        /*
         * Truyền vào một ma trận.
         * Trả về ma trận chuyển vị (hoán đổi hàng thành cột).
         */
        return null;
    }

    public static int[][] sumMatrix(int[][] matrixA, int[][] matrixB){
        /*
         * Truyền vào hai ma trận cùng kích thước.
         * Trả về ma trận là tổng của hai ma trận tương ứng phần tử.
         */
        return null;
    }

    public static int[][] multiplyMatrix(int[][] matrixA, int[][] matrixB){
        /*
         * Truyền vào hai ma trận (A kích thước m*n, B kích thước n*p).
         * Thực hiện nhân ma trận A * B và trả về ma trận kết quả kích thước m*p.
         */
        return null;
    }
    
    public static int[][] upperTriangle(int[][] matrix){
        /*
         * Truyền vào một ma trận vuông.
         * Biến đổi ma trận về dạng tam giác trên (Upper Triangular Matrix),
         * tức là tất cả các phần tử dưới đường chéo chính đều bằng 0.
         */
        return null;
    }

    public static int[][] lowerTriangle(int[][] matrix){
        /*
         * Truyền vào một ma trận vuông.
         * Biến đổi ma trận về dạng tam giác dưới (Lower Triangular Matrix),
         * tức là tất cả các phần tử dưới đường chéo chính đều bằng 0.
         */
        return null;
    }
}
```

---

## **AdvancedMatrix**

### **Đề bài**
Trong bài tập này, bạn sẽ thực hiện các thao tác nâng cao với ma trận như khử Gauss-Jordan, tính định thức, xóa hàng và xóa cột. Cụ thể:

1. Khử Gauss-Jordan một ma trận vuông hoặc không vuông để đưa nó về dạng bậc thang rút gọn (RREF).
2. Tính định thức của ma trận vuông.
3. Xóa một hàng trong ma trận.
4. Xóa một cột trong ma trận.

### **Yêu cầu**

1. **gaussJordanElimination(int[][] matrix)**:
    - Truyền vào một ma trận.
    - Thực hiện khử Gauss-Jordan để đưa ma trận về dạng bậc thang rút gọn (RREF).
    - Trả về ma trận đã được khử Gauss-Jordan.

2. **determinant(int[][] matrix)**:
    - Truyền vào một ma trận vuông.
    - Tính định thức của ma trận đó.
    - Sử dụng phương pháp Laplace hoặc Gaussian elimination để tính định thức.

3. **removeRow(int[][] matrix, int row)**:
    - Truyền vào một ma trận và chỉ số của hàng cần xóa.
    - Trả về ma trận mới sau khi đã xóa hàng chỉ định.

4. **removeColumn(int[][] matrix, int col)**:
    - Truyền vào một ma trận và chỉ số của cột cần xóa.
    - Trả về ma trận mới sau khi đã xóa cột chỉ định.

### **Requested File**
* `AdvancedMatrix.java`

```java
public class AdvancedMatrix{

    // Khử Gauss-Jordan, đưa ma trận về dạng bậc thang rút gọn (RREF)
    public static int[][] gaussJordanElimination(int[][] matrix){
        /*
         * Truyền vào một ma trận.
         * Thực hiện khử Gauss-Jordan để đưa ma trận về dạng bậc thang rút gọn (RREF).
         * Trả về ma trận đã được khử Gauss-Jordan.
         */
        return null;
    }

    // Tính định thức của ma trận vuông
    public static int determinant(int[][] matrix){
        /*
         * Truyền vào một ma trận vuông.
         * Tính định thức của ma trận đó.
         * Sử dụng phương pháp Laplace hoặc Gaussian elimination để tính định thức.
         */
        return 0;
    }

    // Xóa một hàng trong ma trận
    public static int[][] removeRow(int[][] matrix, int row){
        /*
         * Truyền vào một ma trận và chỉ số của hàng cần xóa.
         * Trả về ma trận mới sau khi đã xóa hàng chỉ định.
         */
        return null;
    }

    // Xóa một cột trong ma trận
    public static int[][] removeColumn(int[][] matrix, int col){
        /*
         * Truyền vào một ma trận và chỉ số của cột cần xóa.
         * Trả về ma trận mới sau khi đã xóa cột chỉ định.
         */
        return null;
    }
}
```

---

# **LỚP VÀ ĐỐI TƯỢNG**

---

## **Triangle**

### **Đề bài**
Tạo lớp `Triangle` mô tả một tam giác với ba cạnh. Có khả năng tính diện tích, chu vi.

### **Requested File**
* `Triangle.java`

### **Danh sách thuộc tính**
| Thuộc tính | Kiểu dữ liệu | Mô tả                      |
|:-----------|:-------------|:---------------------------|
| `- sideA`  | `double`     | Cạnh thứ nhất của tam giác |
| `- sideB`  | `double`     | Cạnh thứ hai của tam giác  |
| `- sideC`  | `double`     | Cạnh thứ ba của tam giác   |

### **Danh sách phương thức**
| Phương thức                                            | Mô tả                                               |
|:-------------------------------------------------------|:----------------------------------------------------|
| `+ Triangle()`                                         | Hàm khởi tạo không tham số, mặc định ba cạnh bằng 1 |
| `+ Triangle(double sideA, double sideB, double sideC)` | Hàm khởi tạo đầy đủ ba cạnh                         |
| `+ double getPerimeter()`                              | Tính và trả về chu vi tam giác                      |
| `+ double getArea()`                                   | Tính và trả về diện tích tam giác (công thức Heron) |

---

## **Fraction**

### **Đề bài**
Tạo lớp `Fraction` quản lý phân số: nhập phân số, tối giản, cộng và nhân phân số.

### **Requested File**
* `Fraction.java`

### **Danh sách thuộc tính**
| Thuộc tính      | Kiểu dữ liệu | Mô tả              |
|:----------------|:-------------|:-------------------|
| `- numerator`   | `int`        | Tử số của phân số  |
| `- denominator` | `int`        | Mẫu số của phân số |

### **Danh sách phương thức**
| Phương thức                                  | Mô tả                                               |
|:---------------------------------------------|:----------------------------------------------------|
| `+ Fraction()`                               | Hàm khởi tạo không tham số, phân số mặc định là 0/1 |
| `+ Fraction(int numerator, int denominator)` | Hàm khởi tạo với tử và mẫu số tùy chỉnh             |
| `+ void simplify()`                          | Tối giản phân số                                    |
| `+ Fraction add(Fraction other)`             | Cộng hai phân số, trả về phân số mới                |
| `+ Fraction multiply(Fraction other)`        | Nhân hai phân số, trả về phân số mới                |

---

## **Student**

### **Đề bài**
Tạo lớp `Student` quản lý thông tin sinh viên: tên, mã số sinh viên, GPA.

### **Requested File**
* `Student.java`

### **Danh sách thuộc tính**
| Thuộc tính    | Kiểu dữ liệu | Mô tả               |
|:--------------|:-------------|:--------------------|
| `- name`      | `String`     | Tên sinh viên       |
| `- studentId` | `String`     | Mã số sinh viên     |
| `- gpa`       | `double`     | Điểm trung bình GPA |

### **Danh sách phương thức**
| Phương thức                                            | Mô tả                                            |
|:-------------------------------------------------------|:-------------------------------------------------|
| `+ Student()`                                          | Hàm khởi tạo không tham số, các giá trị mặc định |
| `+ Student(String name, String studentId)`             | Hàm khởi tạo với tên và mã số sinh viên          |
| `+ Student(String name, String studentId, double gpa)` | Hàm khởi tạo đầy đủ thông tin                    |
| `+ void printInfo()`                                   | In thông tin sinh viên (tên, mã số, GPA)         |
| `+ boolean isPassed()`                                 | Kiểm tra nếu GPA >= 2.0 thì đậu, ngược lại rớt   |

---

# **GIAO DIỆN VÀ KẾ THỪA (INTERFACE & INHERITANCE)**

---

## **Animal (Cat, Dog, Duck)**

### **Đề bài**
Tạo giao diện `Animal` yêu cầu các phương thức về tiếng kêu, số chân. Các lớp `Cat`, `Dog`, `Duck` triển khai interface này.
```
Animal (interface)
│
├── Cat
├── Dog
└── Duck
```
### **Requested File**
* `Animal.java`
* `Cat.java`
* `Dog.java`
* `Duck.java`

### **Danh sách Interface**
| Giao diện | Phương thức            | Mô tả                         |
|:----------|:-----------------------|:------------------------------|
| `Animal`  | `+ String sound()`     | Trả về tiếng kêu của động vật |
|           | `+ int numberOfLegs()` | Trả về số lượng chân          |

### **Danh sách Class**
| Lớp    | Thuộc tính       | Mô tả       |
|:-------|:-----------------|:------------|
| `Cat`  | `- name: String` | Tên con mèo |
| `Dog`  | `- name: String` | Tên con chó |
| `Duck` | `- name: String` | Tên con vịt |

| Lớp    | Phương thức        | Mô tả          |
|:-------|:-------------------|:---------------|
| `Cat`  | `+ sound()`        | Trả về "Meow"  |
|        | `+ numberOfLegs()` | Trả về 4       |
| `Dog`  | `+ sound()`        | Trả về "Bark"  |
|        | `+ numberOfLegs()` | Trả về 4       |
| `Duck` | `+ sound()`        | Trả về "Quack" |
|        | `+ numberOfLegs()` | Trả về 2       |

---

## **Shape (Triangle, Rectangle, Square)**

### **Đề bài**
Tạo giao diện `Shape` với các phương thức tính diện tích và chu vi. `Square` kế thừa `Rectangle` nhưng chỉ cần chiều dài.

```
Shape (interface)
│
├── Triangle
├── Rectangle
    └── Square
```
### **Requested File**
* `Shape.java`
* `Triangle.java`
* `Rectangle.java`
* `Square.java`

### **Danh sách Interface**
| Giao diện | Phương thức               | Mô tả          |
|:----------|:--------------------------|:---------------|
| `Shape`   | `+ double getArea()`      | Tính diện tích |
|           | `+ double getPerimeter()` | Tính chu vi    |

### **Danh sách Class**
| Lớp         | Thuộc tính         | Mô tả                      |
|:------------|:-------------------|:---------------------------|
| `Triangle`  | `- sideA: double`  | Cạnh đầu tiên của tam giác |
|             | `- sideC: double`  | Cạnh thứ hai của tam giác  |
|             | `- sideB: double`  | Cạnh thứ ba của tam giác   |
| `Rectangle` | `- width: double`  | Chiều rộng hình chữ nhật   |
|             | `- height: double` | Chiều cao hình chữ nhật    |
| `Square`    |                    |                            |

| Lớp         | Phương thức        | Mô tả          |
|:------------|:-------------------|:---------------|
| `Triangle`  | `+ getArea()`      | Tính diện tích |
|             | `+ getPerimeter()` | tính chu vi    |
| `Rectangle` | `+ getArea()`      | Tính diện tích |
|             | `+ getPerimeter()` | tính chu vi    |
| `Square`    | `+ getArea()`      | Tính diện tích |
|             | `+ getPerimeter()` | tính chu vi    |

---

## **Point (2D, 3D, Line)**

### **Đề bài**
Xây dựng các lớp `Point2D`, `Point3D`, `Line2D`, `Line3D` với các thuộc tính tọa độ và tính khoảng cách.
```
Point2D
│
└── Line2D
│
Point3D
│
└── Line3D

```
### **Requested File**
* `Point2D.java`
* `Point3D.java`
* `Line2D.java`
* `Line3D.java`

### **Danh sách Class**
| Lớp       | Thuộc tính       | Mô tả                       |
|:----------|:-----------------|:----------------------------|
| `Point2D` | `- x: double`    | Tọa độ x                    |
|           | `- y: double`    | Tọa độ y                    |
| `Point3D` | `- z: double`    | Tọa độ z                    |
| `Line2D`  | `- end: Point2D` | Điểm cuối của đoạn thẳng 2D |
| `Line3D`  | `- end: Point3D` | Điểm cuối của đoạn thẳng 3D |

### **Danh sách Phương thức**
| Lớp       | Phương thức                 | Mô tả                             |
|:----------|:----------------------------|:----------------------------------|
| `Point2D` | `+ distance(Point2D other)` | Tính khoảng cách giữa hai điểm 2D |
| `Point3D` | `+ distance(Point3D other)` | Tính khoảng cách giữa hai điểm 3D |
| `Line2D`  | `+ length()`                | Tính độ dài đoạn thẳng 2D         |
| `Line3D`  | `+ length()`                | Tính độ dài đoạn thẳng 3D         |

---

## **Room (Prime, Luxury, Norm)**

### **Đề bài**
Tạo interface `Room` để quản lý thông tin phòng, bao gồm loại phòng `Prime`, `Luxury`, `Normal` với hệ số giá khác nhau.
```
Room (interface)
│
├── PrimeRoom
├── LuxuryRoom
└── NormalRoom
```
### **Requested File**
* `Room.java`
* `PrimeRoom.java`
* `LuxuryRoom.java`
* `NormalRoom.java`

### **Danh sách Interface**
| Giao diện | Phương thức                 | Mô tả                                    |
|:----------|:----------------------------|:-----------------------------------------|
| `Room`    | `+ double calculatePrice()` | Tính giá phòng dựa trên hệ số và giá gốc |
|           | `+ boolean isRented()`      | Kiểm tra trạng thái thuê                 |
|           | `+ void rentRoom()`         | Thuê phòng                               |
|           | `+ void vacateRoom()`       | Trả phòng                                |

### **Danh sách Class**
| Lớp        | Thuộc tính            | Mô tả                       |
|:-----------|:----------------------|:----------------------------|
| PrimeRoom  | `- id: String`        | ID phòng                    |                               
|            | `- basePrice: double` | Giá cơ bản                  |                 
|            | `- rented: boolean `  | Trạng thái đã thuê hay chưa |
|            | `- alpha: double`     | Prime room (hệ số 1.8)      |     
| LuxuryRoom | `- id: String`        | ID phòng                    |                               
|            | `- basePrice: double` | Giá cơ bản                  |                 
|            | `- rented: boolean`   | Trạng thái đã thuê hay chưa |
|            | `- alpha: double`     | Luxury room (hệ số 1.5)     |    
| NormalRoom | `- id: String`        | ID phòng                    |                               
|            | `- basePrice: double` | Giá cơ bản                  |                 
|            | `- rented: boolean`   | Trạng thái đã thuê hay chưa |
|            | `- alpha: double`     | Normal room (hệ số 1.0)     |    

### **Danh sách Phương thức**
| Lớp          | Phương thức          | Mô tả                  |
|:-------------|:---------------------|:-----------------------|
| `PrimeRoom`  | `+ calculatePrice()` | Tính giá phòng         |
|              | `+ isRented()`       | Kiểm tra phòng đã thuê |
|              | `+ rentRoom()`       | Đánh dấu phòng đã thuê |
|              | `+ vacateRoom()`     | Đánh dấu phòng trống   |
| `LuxuryRoom` | `+ calculatePrice()` | Tính giá phòng         |
|              | `+ isRented()`       | Kiểm tra phòng đã thuê |
|              | `+ rentRoom()`       | Đánh dấu phòng đã thuê |
|              | `+ vacateRoom()`     | Đánh dấu phòng trống   |
| `NormalRoom` | `+ calculatePrice()` | Tính giá phòng         |
|              | `+ isRented()`       | Kiểm tra phòng đã thuê |
|              | `+ rentRoom()`       | Đánh dấu phòng đã thuê |
|              | `+ vacateRoom()`     | Đánh dấu phòng trống   |

---
