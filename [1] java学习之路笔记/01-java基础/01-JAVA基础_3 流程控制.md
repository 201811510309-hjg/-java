![在这里插入图片描述](https://img-blog.csdnimg.cn/20210514225530766.png)
# 1 执行结构
## 概述
1996 年，计算机科学家 Bohm 和 Jacopini 证明了：任何简单或复杂的算法都可以由顺序结构、分支结构和循环结构这三种基本 结构组合而成。
 它们的共同点是都包含一个入口和一个出口，它们的每个代码都有机会被执行，不会出现死循环。
## 顺序结构
顺序结构是一种基本的控制结构，它按照语句出现的顺序执行操作
## 分支结构
分支结构又被称为选择结构，根据条件成立与否来执行操作，
## 循环结构
循环结构是一种重复结构，如果条件成立，它会重复执行某一循环体，直到出现不满足的条件为止。


# 2 分支结构
## if 条件语句
if 条件结构是根据条件判断之后再做处理 
if(条件语句){…} 
if (条件语句){…}else{…} 
if (条件语句){…}else 
if(条件语句){…} 
if (条件语句){…}else if(条件语句){…}else{…} 
例子：用户输入学生成绩，判断成绩是否及格，判断条件为 优良： > 90、良好：81-90、中：60-80、不及格：<60

```java
import java.util.Scanner; 
public class Demo4{ 
	public static void main(String[] args){ 
		Scanner input = new Scanner(System.in); 
		System.out.println("请输入成绩："); 
		int score s= input.nextInt(); 
		// 91 优 81-90 良 60-80 中 60 差 
		if(score >= 91){ 
			System.out.println("您的成绩是优秀！继续加油哦！"); 
		}else if(score >= 81 & score < 91){ 
			System.out.println("您的成绩是良好！还要努力哦！"); 
		}else if(score >= 60 & score <= 80){ 
			System.out.println("您的成绩是中等！还要加倍努力哦！"); 
		}else{
			System.out.println("您的成绩是差！准备补考费吧！"); 
		} 
	} 
}
```

## switch 语句

```java
switch(表达式){
	case 取值 1: 语句块 1;break; 
	case 取值 n: 语句块 n;break; 
	default: 语句块 n+1;break; 
	}
```

```java
switch 语句有关规则 
表达式的返回值必须是下述几种类型之一：int, byte, char, short,String； 
case 子句中的取值必须是常量，且所有 case 子句中的取值应是不同的； 
default 子句是可选的； 
break 语句用来在执行完一个 case 分支后使程序跳出 switch 语句块；如果 case 后面没有写 break 则直接往下面执行！ 
Case 后面的执行体可写{ }也可以不写{ } 
```

例题：多分支月份输出天数（充分利用语句特性）
```java
import java.util.Scanner;
public class Demo6{ 
	public static void main(String[] args){
			Scanner input = new Scanner(System.in); 
			System.out.println("请输入月份："); 
			int month = input.nextInt(); 
			switch(month){ 
				case 1: 
				case 3: 
				case 5: 
				case 7: 
				case 8: 
				case 10: 
				case 12: 
					System.out.println(month + "月共有 31 天"); 
					break; 
				case 4: 
				case 6: 
				case 9: 
				case 11: 
					System.out.println(month + "月共有 30 天"); 
					break; 
				case 2: 
					System.out.println(month + "月共有 28 天");
					break; 
				default : 
					System.out.println("友情提示，您输入有误！"); 
					break; 
			} 
		} 
	}
```

# 3 循环语句
## 简介

```java
循环语句功能 
	在循环条件满足的情况下，反复执行特定代码 
	
循环语句分类 
	for 循环
	 while 循环 
	 do/while 循环
```

## while 循环
符合条件，循环继续执行；否则，循环退出 
特点：先判断，再执行

语法： `while(条件表达式){ //语句块； }`

实现示例： 录入班级人数和学员成绩，计算班级学员的平均成绩 使用 while 循环的步骤 
1、分析循环条件和循环操作 
2、套用 while 语法写出代码
3、检查循环是否能够退出

```java
int sum = 0; 
int score = 0; 
int avg = 0; 
int studentNum = 20; 
while(i<=studentNum){ 
	System.out.print("请输入第" + i + "位同学的成绩："); 
	score = input.nextInt(); 
	sum = sum + score; i++; 
	}
avg = sum / stuNum ;
```

## do-while 循环
先执行一遍循环操作，符合条件，循环继续执行；否则，循环退出 

特点：先执行，再判断

```java
语法： 

do { 
	循环操作 
}while ( 条件表达式 );
```

```java
while 循环和 do-while 循环的区别？ 
	while:先判断条件，如果条件满足，再执行循环操作 
	do while:先执行一遍循环操作，然后再判读条件，如果条件满足，继续执行循环操作。
```

## for 循环
语法： 
`for(初始化参数;判断条件 ;更新循环变量){ 循环体; }`

应用举例

```java
public class ForLoop { 
	public static void main(String [] args){ 
		int result = 0; 
		for(int i=1; i<=100; i++) { 
			result += i; 
			}
		System.out.println("result=" + result); 
	} 
}
```

