### 基本数据类型分类情况：

1. **整型**（Integer Types）:
   - `byte`: 1 字节，范围：-128 到 127
   - `short`: 2 字节，范围：-32,768 到 32,767
   - `int`: 4 字节，范围：$-2^{31}$ 到 $2^{31}-1$
   - `long`: 8 字节，范围：$-2^{63}$ 到 $2^{63}-1$
2. **字符型**:
   - `char`: 2 字节，用于表示单个字符，范围：0 到 65,535（Unicode编码）
3. **浮点型**（Floating-Point Types）:
   - `float`: 4 字节，单精度浮点数
   - `double`: 8 字节，双精度浮点数
4. **布尔型**:
   - `boolean`: 1 位，只有两个取值：`true` 和 `false`

### 示例程序

下面是一个简单的 Java 程序，声明一个变量对应每种基本数据类型，并初始化和输出它们的值：

```java
public class BasicDataTypes {
    public static void main(String[] args) {
        // 整型
        byte byteVar = 100;
        short shortVar = 30000;
        int intVar = 2000000000;
        long longVar = 9000000000L;

        // 字符型
        char charVar = 'A';

        // 浮点型
        float floatVar = 5.75f;
        double doubleVar = 19.99;

        // 布尔型
        boolean booleanVar = true;

        System.out.println("Byte: " + byteVar);
        System.out.println("Short: " + shortVar);
        System.out.println("Int: " + intVar);
        System.out.println("Long: " + longVar);
        System.out.println("Char: " + charVar);
        System.out.println("Float: " + floatVar);
        System.out.println("Double: " + doubleVar);
        System.out.println("Boolean: " + booleanVar);
    }
}
```

输出为：

```java
Byte: 100
Short: 30000
Int: 2000000000
Long: 9000000000
Char: A
Float: 5.75
Double: 19.99
Boolean: true
```

