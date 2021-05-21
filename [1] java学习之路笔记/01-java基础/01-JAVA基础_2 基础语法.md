看完学到
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210520085330642.png)


# <2>基础语法
## 【1】二进制
>[百度一下：<u>二进制</u>](https://www.baidu.com/s?ie=UTF-8&wd=%E4%BA%8C%E8%BF%9B%E5%88%B6)

### 1. 计算机世界里的二进制
```
计算机中的数据都以二进制数字保存。 
二进制：逢二进一。即只有 0、1 两个值。 
	如：十进制的 10 在计算机内保存为二进制的 1010 
	
计算机中信息的存储单位 
	位（Bit）：表示一个二	进制数码 0 或 1，是计算机存储处理信息的最基本的单位。 
	字节（Byte）：一个字节由 8 个位组成。它表示作为一个完整处理单位的 8 个二进制数码。
```
### 2. 补码
```
事实上，计算机内的二进制数值是以补码形式表示的。 
补码： 
一个正数的补码和其原码的形式是相同的。 
负数的补码是：将该数的绝对值的二进制形式，按位取反再加 1。 
由此可知，二进制补码数值的最高位(最左位)是符号位：该位为 0，表示数值为正数；该位为 1，表示数值为负数。
```
|10|00000000 00000000 00000000 00001010|
|--:|:--|
|-10 =  |11111111 11111111 11111111 11110110|
>主要原因：使用补码，可以将符号位和其它位统一处理；同时，减法也可按加法来处理。
>另外，两个用补码表示的数相加时，如果最 高位（符号位）有进位，则进位被舍弃
### 3.  二进制和十进制之间的互换
```
按权相加：把二进制数首先写成加权系数展开式，然后按十进制加法规则求和。 
例：原码 1011.01 
				= 1×23＋0×22＋1×21＋1×20＋0×2-1＋1×2-2 
				= 8＋0＋2＋1＋0＋0.25 
				=11.25 
十进制转换成二进制 
	整数部分："除 2 取余，逆序排列"法 
	小数部分："乘 2 取整，顺序排列"法	
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210514220941214.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)


### 4. 十六进制
```
二进制表示法太冗长，所以在程序中一般喜欢用十六进制。 
十六进制：基数为十六，逢十六进一。它用 abcdef 表示从 0-9 之上的值。 
Java 中十六进制数据要以 0x 或 0X 开头。如：0x23D 
十六进制转换成二进制只需将每个十六进制数字替换为相对应的四个二进制位即可
```
![| 二进制 | **十六进制** |
| -----: | :----------- |
|   0000 | 0            |
|   0001 | 1            |
|   0010 | 2            |
|   0011 | 3            |
|   0100 | 4            |
|   0101 | 5            |
|   0110 | 6            |
|   0111 | 7            |
|   1000 | 8            |
|   1001 | 9            |
|   1010 | A            |
|   1011 | B            |
|   1100 | C            |
|   1101 | D            |
|   1110 | E            |
|   1111 | F            |](https://img-blog.csdnimg.cn/20210514221958608.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)


### 5. 八进制
 ```
 八进制：基数为八。 
 Java 中八进制数据要以 0 开头。如：0123 
 八进制转换成二进制：只需将每个八进制数字替换为相对应的三个二进制位即可。 
 现在的计算机系统很少用八进制的了。
 ```
![在这里插入图片描述](https://img-blog.csdnimg.cn/202105142220419.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)

## 【2】java程序基础结构


```xml
/**
 * 可以用来自动创建文档的注释
 */
public class Hello {
    public static void main(String[] args) {
        // 向屏幕输出文本:
        System.out.println("Hello, world!");
        /* 多行注释开始
        注释内容
        注释结束 */
    }
} // class定义结束
```
### 1.结构定义语句

```java
public class Hello { // 类名是Hello
    // ...
} // class定义结束
```
```
1. 因为Java是面向对象的语言，一个程序的基本单位就是   class ， class   是关键字，这里定义的class名字就是Hello：
2. 注意到public是访问修饰符(给它贴标签)，表示该class是公开的。
3. 不写public，也能正确编译，但是这个类将无法从命令行执行。
```
### 2.功能执行语句

```java
System.out.println("Hello, world!");
在class内部，可以定义若干方法（method） 
方法定义了一组执行语句，方法内部的代码将会被依次顺序执行。
```
### 3.命名规则（标识符）
```
Java 对包、类、方法、参数和变量等要素命名时使用的字符序列称为标识符。规则如下: 
	由字母、数字、下划线（_）和美元符号（$）组成。
	不能以数字开头。 区分大小。 长度无限制。 
	不能是 Java 中的保留关键字。


	
命名规范： 软性建议 
	类名规范：首字母大写，后面每个单词首字母大写（大驼峰式）。
	 方法名规范： 首字母小写，后面每个单词首字母大写（小驼峰式）。 
	 变量名规范：全部小写
	 
{
	类名要求：
	类名必须以英文字母开头，后接字母，数字和下划线的组合
	习惯以大写字母开头
	要注意遵守命名习惯，好的类命名：
	Hello
	NoteBook
	VRPlayer
	
	不好的类命名：
	hello
	Good123
	Note_Book
	_World	 
}
{
	方法名也有命名规则，命名和class一样，但是首字母小写：
	好的方法命名：
	main
	goodMorning
	playVR
	
	不好的方法命名：
	Main
	good123
	good_morning
	_playVR

}
```
Java 中有一些赋予特定的含义，有专门用途的字符串称为关键字（keyword）。全部是小写。
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210209104900738.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
保留字：没有定义用途，但保留备用。 goto、const
### 4.注释
在Java程序中，注释是一种给人阅读的文本，不是程序的一部分，所以编译器会自动忽略释。
Java有3种注释，第一种是单行注释，以双斜线开头，直到这一行的结尾结束：
>// 这是注释...

而多行注释以/*星号开头，以*/结束，可以有多行：
>/*
这是注释
blablabla...
这也是注释
*/

还有一种特殊的多行注释，以/**开头，以*/结束，如果有多行，每行通常以星号开头：
```
/**
 * 可以用来自动创建文档的注释
 * 
 * @auther liaoxuefeng
 */
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello, world!");
    }
}
```
这种特殊的多行注释需要写在类和方法的定义处，可以用于自动创建文档。

Java程序对格式没有明确的要求，多几个空格或者回车不影响程序的正确性，但是我们要养成良好的编程习惯，注意遵守Java社区约定的编码格式。

## 【3】变量和数据类型
### 1. 变量
- 定义：变量就是系统为程序分配的一块内存单元，用来存储各种类型的数据。由于该存储单元中的数据可以发生改变，因此得名为"变量"。
- 变量分类：
```
 按所属的数据类型划分： 
		1.基本数据类型变量 
		2.引用数据类型变量 
 按被声明的位置划分：
		1.局部变量：方法或语句块内部定义的变量 
		2.成员变量：方法外部、类的内部定义的变量 
		
特别注意：类的外面不能有变量的声明
```
- 内存分析

```java
public class Main {
    public static void main(String[] args) {
        int n = 100; // 定义变量n，同时赋值为100
        System.out.println("n = " + n); // 打印n的值

        n = 200; // 变量n赋值为200
        System.out.println("n = " + n); // 打印n的值

        int x = n; // 变量x赋值为n（n的值为200，因此赋值后x的值也是200）
        System.out.println("x = " + x); // 打印x的值

        x = x + 100; // 变量x赋值为x+100（x的值为200，因此赋值后x的值是200+100=300）
        System.out.println("x = " + x); // 打印x的值
        System.out.println("n = " + n); // 再次打印n的值，n应该是200还是300？
   }
}
```

```
我们一行一行地分析代码执行流程：

执行int n = 100;，该语句定义了变量n，同时赋值为100，因此，JVM在内存中为变量n分配一个“存储单元”，填入值100：

      n
      │
      ▼
┌───┬───┬───┬───┬───┬───┬───┐
│   │100│   │   │   │   │   │
└───┴───┴───┴───┴───┴───┴───┘
执行n = 200;时，JVM把200写入变量n的存储单元，因此，原有的值被覆盖，现在n的值为200：

      n
      │
      ▼
┌───┬───┬───┬───┬───┬───┬───┐
│   │200│   │   │   │   │   │
└───┴───┴───┴───┴───┴───┴───┘
执行int x = n;时，定义了一个新的变量x，同时对x赋值，因此，JVM需要新分配一个存储单元给变量x，并写入和变量n一样的值，结果是变量x的值也变为200：

      n           x
      │           │
      ▼           ▼
┌───┬───┬───┬───┬───┬───┬───┐
│   │200│   │   │200│   │   │
└───┴───┴───┴───┴───┴───┴───┘
执行x = x + 100;时，JVM首先计算等式右边的值x + 100，结果为300（因为此刻x的值为200），然后，将结果300写入x的存储单元，因此，变量x最终的值变为300：


      n           x
      │           │
      ▼           ▼
┌───┬───┬───┬───┬───┬───┬───┐
│   │200│   │   │300│   │   │
└───┴───┴───┴───┴───┴───┴───┘
可见，变量可以反复赋值。注意，等号=是赋值语句，不是数学意义上的相等，否则无法解释x = x + 100。
```
- 变量作用域
在Java中，多行语句用{ }括起来。很多控制语句，例如条件判断和循环，都以{ }作为它们自身的范围，例如：
```
if (...) { // if开始
    ...
    while (...) { while 开始
        ...
        if (...) { // if开始
            ...
        } // if结束
        ...
    } // while结束
    ...
} // if结束
```
只要正确地嵌套这些{ }，编译器就能识别出语句块的开始和结束。而在语句块中定义的变量，它有一个作用域，就是从定义处开始，到语句块结束。超出了作用域引用这些变量，编译器会报错。举个栗子：
```
{
    ...
    int i = 0; // 变量i从这里开始定义
    ...
    {
        ...
        int x = 1; // 变量x从这里开始定义
        ...
        {
            ...
            String s = "hello"; // 变量s从这里开始定义
            ...
        } // 变量s作用域到此结束
        ...
        // 注意，这是一个新的变量s，它和上面的变量同名，
        // 但是因为作用域不同，它们是两个不同的变量:
        String s = "hi";
        ...
    } // 变量x和s作用域到此结束
    ...
} // 变量i作用域到此结束
```
- 变量和数据类型的关系
```
变量：杯子
数据类型：标签
int X = 1 ； //"杯子X是int类型的，大小为1"
```
- 提一下----var关键字
有些时候，类型的名字太长，写起来比较麻烦。例如：
```StringBuilder sb = new StringBuilder();```
这个时候，如果想省略变量类型，可以使用**var**关键字：
```var sb = new StringBuilder();```
编译器会根据赋值语句自动推断出变量sb的类型是StringBuilder。对编译器来说，语句：
```var sb = new StringBuilder();```
实际上会自动变成：
```StringBuilder sb = new StringBuilder();```
因此，使用var定义变量，仅仅是少写了变量类型而已。

### 2. 数据类型![在这里插入图片描述](https://img-blog.csdnimg.cn/20210209110048229.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)


- 定义：基本数据类型是CPU可以直接进行运算的类型。Java定义了以下几种基本数据类型：
```
		整数类型：byte，short，int，long
		
		浮点数类型：float，double
		
		字符类型：char
		
		布尔类型：boolean
```
- 内存分析
```
字节（byte）是计算机信息技术用于计量存储容量的一种计量单位，作为一个单位来处理的一个二进制数字串，是构成 信息的一个小单位。是计算机内存的最小存储单元,一个字节就是一个8位二进制数，即8个bit。它的二进制表示范围从00000000~11111111，换算成十进制是0~255，换算成十六进制是00~ff。

内存单元从0开始编号，称为内存地址。每个内存单元可以看作一间房间，内存地址就是门牌号。

  0   1   2   3   4   5   6  ...
┌───┬───┬───┬───┬───┬───┬───┐
│   │   │   │   │   │   │   │...
└───┴───┴───┴───┴───┴───┴───┘
一个字节是1byte，1024字节是1K，1024K是1M，1024M是1G，1024G是1T。一个拥有4T内存的计算机的字节数量就是：

4T = 4 x 1024G
   = 4 x 1024 x 1024M
   = 4 x 1024 x 1024 x 1024K
   = 4 x 1024 x 1024 x 1024 x 1024
   = 4398046511104
不同的数据类型占用的字节数不一样。我们看一下Java基本数据类型占用的字节数：

       ┌───┐
  byte │   │
       └───┘
       ┌───┬───┐
 short │   │   │
       └───┴───┘
       ┌───┬───┬───┬───┐
   int │   │   │   │   │
       └───┴───┴───┴───┘
       ┌───┬───┬───┬───┬───┬───┬───┬───┐
  long │   │   │   │   │   │   │   │   │
       └───┴───┴───┴───┴───┴───┴───┴───┘
       ┌───┬───┬───┬───┐
 float │   │   │   │   │
       └───┴───┴───┴───┘
       ┌───┬───┬───┬───┬───┬───┬───┬───┐
double │   │   │   │   │   │   │   │   │
       └───┴───┴───┴───┴───┴───┴───┴───┘
       ┌───┬───┐
  char │   │   │
       └───┴───┘
byte恰好就是一个字节，而long和double需要8个字节。
```
- Java提供了两种变量类型：基本类型和引用类型
基本类型包括<整型>，<浮点型>，<布尔型>，<字符型>。
- <整型>
对于整型类型，Java只定义了带符号的整型，因此，最高位的bit表示符号位（0表示正数，1表示负数）。各种整型能表示的最大范围如下：
```
byte：-128 ~ 127
short: -32768 ~ 32767
int: -2147483648 ~ 2147483647
long: -9223372036854775808 ~ 9223372036854775807
```
// 定义整型
```
public class Main {
    public static void main(String[] args) {
        int i = 2147483647;
        int i2 = -2147483648;
        int i3 = 2_000_000_000; // 加下划线更容易识别
        int i4 = 0xff0000; // 十六进制表示的16711680
        int i5 = 0b1000000000; // 二进制表示的512
        long l = 9000000000000000000L; // long型的结尾需要加L
    }
}
```
特别注意：同一个数的不同进制的表示是完全相同的，例如15=0xf＝0b1111。

- <浮点型>
浮点类型的数就是小数，因为小数用科学计数法表示的时候，小数点是可以“浮动”的，如1234.5可以表示成12.345x10^2^，也可以表示成1.2345x10^3^，所以称为浮点数。
下面是定义浮点数的例子：
```
float f1 = 3.14f;
float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
double d = 1.79e308;
double d2 = -1.79e308;
double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324
```
对于  float  类型，需要加上  f   后缀。

浮点数可表示的范围非常大，float类型可最大表示3.4x10^38^，而double类型可最大表示1.79x10^308^。

- <布尔类型>
布尔类型boolean只有true和false两个值，布尔类型总是关系运算的计算结果：
```
boolean b1 = true;
boolean b2 = false;
boolean isGreater = 5 > 3; // 计算结果为true
int age = 12;
boolean isAdult = age >= 18; // 计算结果为false
```
Java语言对布尔类型的存储并没有做规定，因为理论上存储布尔类型只需要1 bit，但是通常JVM内部会把boolean表示为4字节整数。

- <字符类型>
字符类型char表示一个字符。Java的char类型除了可表示标准的ASCII外，还可以表示一个Unicode字符：
```
// 字符类型
public class Main {
    public static void main(String[] args) {
        char a = 'A';
        char zh = '中';
        System.out.println(a);
        System.out.println(zh);
    }
}
```
- 常量
定义变量的时候，如果加上final修饰符，这个变量就变成了常量：
```
final double PI = 3.14; // PI是一个常量
double r = 5.0;
double area = PI * r * r;
PI = 300; // compile error!
```
常量在定义时进行初始化后就不可再次赋值，再次赋值会导致编译错误。

常量的作用是用有意义的变量名来避免魔术数字（Magic number），例如，不要在代码中到处写3.14，而是定义一个常量。如果将来需要提高计算精度，我们只需要在常量的定义处修改，例如，改成3.1416，而不必在所有地方替换3.14。
根据习惯，常量名通常全部大写。

>变量可重新赋值，等号是赋值语句，不是数学意义的等号。
>常量在初始化后不可重新赋值，使用常量便于理解程序意图。

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210514224542133.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)

## 【4】运算符
### 算术运算符
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210514223657665.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)

```java
++： 
	如果是变量前缀：先对此变量加 1，再执行其他的操作。 
	如果是变量后缀：先执行当前语句的其他操作，再对此变量加 1 

--： 
	如果是变量前缀：先对此变量减 1，再执行其他的操作。 
	如果是变量后缀：先执行当前语句的其他操作，再对此变量减 1
```

### 赋值运算符
赋值运算符作用是将一个值赋给一个变量，运算顺序从右到左
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210514223805439.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)

### 关系运算符
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210514223832205.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)

### 逻辑运算符
逻辑运算符用于对 boolean 型结果的表达式进行运算，运算结果总是 boolean 型，后面结合条件结构讲解。
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210514223910195.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)

### 字符串 连接运算符

```java
String s="He" + "llo"; 结果"Hello" 
"+"除了可用于字符串相连接，也能将字符串与其它的数据类型相连成一个新的字符串。 
如：String s="x" + 123; 结果"x123"
```

### 三目运算符

```java
X ? Y : Z 
X 为 boolean 类型表达式，先计算 x 的值，若为 true，整个三目运算的结果为表达式 y 的值，否则整个运算结果为表达式 z 的值。 
例：
int score = 75; 
String type = score >=60 ? "及格" : "不及格";
```

### 操作符优先级（了解）
运算符的优先次序 表达式的运算按照运算符的优先顺序从高到低进行,同级运算符从左到右进行：

```java
优先次序 运算符 
	1 	. [] () 
	2 	++ -- ! ~ instanceof 
	3 	new (type) 
	4 	* / % 
	5 	+ - 
	6 	>> >>> << 
	7 	> < >= <= 
	8 	= = != 
	9 	& 
	10 	^ 
	11 	|
	12 	&& 
	13	 || 
	14 	?: 
	15 	= += -= *= /= %= ^= 
	16 	&= |= <<= >>= >>>=
```
## 【5】方法
### 概述：
方法用于封装一段特定的逻辑功能。方法的主要要素有：权限修饰符 方法名、参数列表和返回值
### 格式：

```java
权限修饰符 返回值类型声明 方法名称(参数列表){ 
	方法中封装的逻辑功能; 
	return 返回值; 
	}
```

### 权限修饰符详解
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210514224859149.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)

### 返回值详解

```java
方法调用结束后可以返回一个数据，称之为返回值。 
方法在声明时必须指定返回值的类型。 
通过 return 语句返回，return 语句的作用在于结束方法且将数据返回。 
如果方法没有返回值（即方法不需要返回数据），需将返回值类型声明为 void。
```

### 参数列表详解

```java
方法的参数列表：在调用时传递给方法，需要被方法处理的数据。 
在方法定义时，需要声明该方法所需要的参数变量。 
在方法调用时，会将实际参数值传递给方法的参数变量。必须保证传递参数的类型和个数符合方法的声明。
```

### 方法示例

```java
public void say(int a,int b){ 
	System.out.println(“方法 say 正在执行”); 	
	}
```

## 【6】转义字符

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210514225119890.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)


