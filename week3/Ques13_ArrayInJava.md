### Java数组的特点

Java数组是一个固定大小的数据结构，具有以下特点：

1. **固定大小**：数组在创建时需要指定大小，一旦定义后，大小不能改变。
2. **同一类型**：数组中的所有元素必须是相同类型的，可以是基本数据类型（如 `int`, `char`, `double` 等）或对象类型。
3. **索引访问**：数组使用索引进行访问，索引从0开始。
4. **内存连续性**：数组的元素在内存中是连续存储的，这使得基于索引的访问非常高效。
5. **自动初始化**：数组中的基本数据类型元素会自动初始化为默认值，例如，整数类型为 `0`，布尔类型为 `false`，引用类型为 `null`。

### 创建和使用对象数组

在Java中，您可以创建一个对象数组来存储对象。以下是创建和使用对象数组的步骤和示例。

#### 1. 创建对象数组

数据类型[] 数组名 = new 数据类型[N];

```Java
int[] array1 = new int[5];       // 创建一个可以容纳5个int类型元素的数组
 
double[] array2 = new double[5];  // 创建一个可以容纳5个double类型元素的数组
 
String[] array3 = new double[5];  // 创建一个可以容纳5个字符串元素的数组
```

#### 2. 初始化对象数组

在创建对象数组后，您需要逐个实例化数组中的每个对象。

```Java
int[] array=new int[10];//动态

int[] array=new int[]{1,2,3,4,5};// 静态
```

#### 3. 使用对象数组

您可以通过循环遍历数组并调用对象的方法来使用这些对象。

```Java
int[]array = new int[]{10, 20, 30, 40, 50};
 for(int i = 0; i < array.length; i++){
    System.out.println(array[i]);
 }
```