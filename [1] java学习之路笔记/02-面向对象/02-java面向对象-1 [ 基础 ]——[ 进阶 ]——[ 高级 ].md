# <1>面向对象基础
## 1.1、面向对象思想
- 1.1.1 概述
>面向对象(Object Oriented)是软件开发方法。面向对象的概念和应用已超越了程序设计和软件开发，是一种对现 实世界理解和抽象的方法，是计算机编程技术发展到一定阶段后的产物。 面向对象是相对于面向过程来讲的，指的是把 相关的数据和方法组织为一个整体 来看待，从更高的层次来进行系 统建模，更贴近事物的自然运行模式。
Java是一种面向对象的编程语言。面向对象编程，英文是Object-Oriented Programming，简称OOP。
和面向对象编程不同的，是面向过程编程。面向过程编程，是把模型分解成一步一步的过程。比如，老板告诉你，要编写一个TODO任务，必须按照以下步骤一步一步来：

1. 读取文件；
2. 编写TODO；
3. 保存文件。

而面向对象编程，顾名思义，你得首先有个对象：
有了对象后，就可以和对象进行互动：
```
GirlFriend gf = new GirlFriend();
gf.name = "Alice";
gf.send("flowers");
```
因此，面向对象编程，是一种通过对象的方式，把现实世界映射到计算机模型的一种编程方法。

- 1.1.2三大思想
```
面向对象思想从概念上讲分为以下三种：OOA、OOD、OOP 
	OOA：面向对象分析（Object Oriented Analysis） 
	OOD：面向对象设计（Object Oriented Design） 
	OOP：面向对象程序（Object Oriented Programming
```
- 1.1.3三大特征
```
封装性：所有的内容对外部不可见 
继承性：将其他的功能继承下来继续发展 
多态性：方法的重载本身就是一个多态性的体现
```
- 1.1.4 学习面向对象
```
<1>面向对象的基本概念，包括：
1.类	class
2.实例	instance
3.方法	method

<2>面向对象的实现方式，包括：
1.继承
2.多态

<3>Java语言本身提供的机制，包括：
1.package
2.classpath
3.jar

<4>以及Java标准库提供的核心类，包括：
1.字符串
2.包装类型
3.JavaBean
4.枚举
5.常用工具类
```
## 1.2、类和对象
- 1.2.1、两者关系
```
类表示一个共性的产物，是一个综合的特征，而对象，是一个个性的产物，是一个个体的特征。 （类似生活中的图纸与实物的概念。） 

类必须通过对象才可以使用，对象的所有操作都在类中定义。 
类由属性和方法组成： · 
		属性：就相当于人的一个个的特征 · 
		方法：就相当于人的一个个的行为，例如：说话、吃饭、唱歌、睡觉
```
- 1.2.2、类的定义格式
```
class 类名称{ 
		成员属性 
		成员方法 
}
```
在Java中，创建一个类，例如，给这个类命名为Person，就是定义一个class：
```java
class Person {
    public String name;
    public int age;
}
```
一个class可以包含多个字段 **（field）** ，字段用来描述一个类的特征。上面的Person类，我们定义了两个字段，一个是String类型的字段，命名为name，一个是int类型的字段，命名为age。因此，通过class，把一组数据汇集到一个对象上，实现了 **数据封装**。
**public**是用来修饰字段的，它表示这个字段可以被外部访问。

- 1.2.3、属性与方法
```
属性定义格式： 
	数据类型 属性名; 
属性定义并赋值的格式： 
	数据类型 属性名 = 初始化值; 

方法定义格式： 
	权限修饰符 返回值类型 方法名(形式参数列表){
			 //方法体 
			 return 返回值；
	  }
```
```java
class Person {
    public String name;
    public int age;
    public say(){
		return 0;
	};
}
```
- 1.2.4、对象的创建与使用
```
一个类要想真正的进行操作，则必须依靠对象，对象的定义格式如下: 
	类名称 对象名称 = new 类名称() ; 
如果要想访问类中的属性或方法（方法的定义），则可以依靠以下的语法形式： 
	访问类中的属性： 对象.属性 ; 
	调用类中的方法： 对象.方法(实际参数列表) ;
```
定义了class，只是定义了对象模版，而要根据对象模版创建出真正的对象实例，必须用new操作符。

new操作符可以创建一个实例，然后，我们需要定义一个引用类型的变量来指向这个实例：

```Person ming = new Person();```
上述代码创建了一个Person类型的实例，并通过变量ming指向它。

注意区分Person ming是定义Person类型的变量ming，而new Person()是创建Person实例。

有了指向这个实例的变量，我们就可以通过这个变量来操作实例。访问实例变量可以用变量.字段，例如：
```java
Person ming = new Person();
ming.name = "Xiao Ming"; // 对字段name赋值
ming.age = 12; // 对字段age赋值
System.out.println(ming.name); // 访问字段name

Person hong = new Person();
hong.name = "Xiao Hong";
hong.age = 15;
```
上述两个变量分别指向两个不同的实例，它们在内存中的结构如下：
```
            ┌──────────────────┐
ming ──────>│Person instance   │
            ├──────────────────┤
            │name = "Xiao Ming"│
            │age = 12          │
            └──────────────────┘
            ┌──────────────────┐
hong ──────>│Person instance   │
            ├──────────────────┤
            │name = "Xiao Hong"│
            │age = 15          │
            └──────────────────┘
```
两个instance拥有class定义的name和age字段，且各自都有一份独立的数据，互不干扰。
```
小结
在OOP中，class和instance是“模版”和“实例”的关系；
定义class就是定义了一种数据类型，对应的instance是这种数据类型的实例；
class定义的field，在每个instance都会拥有各自的field，且互不干扰；
通过new操作符创建新的instance，然后用变量指向它，即可通过变量来引用这个instance；
访问实例字段的方法是变量名.字段名；
指向instance的变量都是引用变量。
```
## 1.3、创建对象内存分析
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210209170503589.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)

- 1.3.1、栈
```
Java栈的区域很小 , 大概2m左右 , 特点是存取的速度特别快 
		栈存储的特点是, 先进后出
		速度快的原因: 
		栈内存, 通过 '栈指针' 来创建空间与释放空间 ! 
		指针向下移动, 会创建新的内存, 向上移动, 会释放这些内存 ! 
		这种方式速度特别快 , 仅次于PC寄存器 ! 
		但是这种移动的方式, 必须要明确移动的大小与范围 , 明确大小与范围是为了方便指针的移动 , 这是一个对于数据存储的限制, 存储的数据大小是固定的 , 影响了程序 的灵活性 ~ 
		所以我们把更大部分的数据 存储到了堆内存中 

存储的是: 
	基本数据类型的数据 以及 引用数据类型的引用! 
	例如: 
	int a =10;
	Person p = new Person(); 
	10存储在栈内存中 , 第二句代码创建的对象的引用(p)存在栈内存中
```
-  1.3.2、堆
```
存放的是类的对象 . 
Java是一个纯面向对象语言, 限制了对象的创建方式: 
	所有类的对象都是通过new关键字创建 
new关键字, 是指告诉JVM , 需要明确的去创建一个新的对象 , 去开辟一块新的堆内存空间: 堆内存与栈内存不同, 优点在于我们创建对象时 , 不必关注堆内存中需要开辟多少存储空间 , 也不需要关注内存占用 时长 ! 

堆内存中内存的释放是由GC(垃圾回收器)完成的 垃圾回收器 回收堆内存的规则: 
	当栈内存中不存在此对象的引用时,则视其为垃圾 , 等待垃圾回收器回收 ! 
例如:
	 Person p0 = new Person(); 
	 Person p1 = p0; 
	 Person p2 = new Person();
```
- 1.3.3、方法区
```
存放的是- 类信息 - 静态的变量 - 常量 - 成员方法 方法区中包含了一个特殊的区域 ( 常量池 )(存储的是使用static修饰的成员)
```
## 1.4、构造方法（构造器）
1.4.1、回顾对象创建
```
Person p = new Person(); 
在右侧Person后面出现的小括号, 其实就是在调用构造方法 !
```
1.4.2、比较
创建实例的时候，我们经常需要同时初始化这个实例的字段，例如：
```
Person ming = new Person();
ming.setName("小明");
ming.setAge(12);
```
其实我们可以这样	一次性传入name和age
```java
public class Main {
    public static void main(String[] args) {
        Person p = new Person("Xiao Ming", 15);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
```
重点在这里
```java
class Person {
    ...

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    ...
```
**注意点**：由于构造方法是如此特殊，所以构造方法的名称就是<u>类名</u>。构造方法的参数没有限制，在方法内部，也可以编写任意语句。但是，和普通方法相比，<u>构造方法没有返回值（也没有void）</u>，调用构造方法，<u>必须用new操作符。</u>

1.4.3、格式定义

```java
定义的格式: 与普通方法基本相同, 区别在于: 方法名称必须与类名相同, 没有返回值类型的声明 ! 
案例：
public class Demo3{ 
	public static void main(String[] args){ 
		Person p = new Person(); 
		p = new Person(); 
		p = new Person(); 
		p = new Person(); } 
		}
	class Person{ 
		public Person(){ 
			System.out.println("对象创建时,此方法调用"); 
			} 
		}
```

1.4.4、构造方法设计

```
- 建议自己定义无参数构造方法，不要对编译器形成依赖，避免错误发生。
- 当类中有非常量成员变量时，建议提供两个版本的构造方法，一个是无参构造方法，一个是全属性做参数的构造方法。
- 当类中所有成员变量都是常量或者没有成员变量时，建议不提供任何版本的构造。

```


## 1.5、方法的重载
```java
方法名称相同, 参数类型或参数长度不同, 可以完成方法的重载 ! 方法的重载与返回值无关! 
方法的重载 ,可以让我们在不同的需求下, 通过传递不同的参数调用方法来完成具体的功能。
```

## 1.6、构造方法的重载

```java
一个类, 可以存在多个构造方法 : 
参数列表的长度或类型不同即可完成构造方法的重载 ~

构造方法的重载 ,可以让我们在不同的创建对象的需求下, 调用不同的方法来完成对象的初始化!
```

## 1.7、匿名对象 

```java
没有对象名称的对象 就是匿名对象。

匿名对象只能使用一次，因为没有任何的对象引用，所以将称为垃圾，等待被G·C回收。
只使用一次的对象可以通过匿名对象的方式完成，这一点在以后的开发中将经常使用到
```




# <2>面向对象进阶
##  2.1、封装private
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210507192450121.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)

```java
public class D1 {
    public static void main(String args[]){
        Person per = new Person();
        per.setName("张三") ;
        per.setAge(-30) ;
        per.tell() ;
    }
}
class Person{
    // 封装 private
    private String name ; // 表示姓名
    private int age ; // 表示年龄

    public void setName(String str){ name = str ; }
    public String getName(){ return name ; }

    public void setAge(int a){ if(a>0&&a<150) age = a ; }
    public int getAge(){ return age ; }

    void tell(){
        System.out.println("姓名：" + getName() + "；年龄：" + getAge()) ;
    }

}
```

## 2.2、this

```java
在Java基础中，this关键字是一个最重要的概念。使用this关键字可以完成以下的操作： 
	· 调用类中的属性 
	· 调用类中的方法或构造方法 
	· 表示当前对象
```

## 2.3、static

```java
static表示“静态”的意思，可以用来修饰成员变量和成员方法(后续还会学习 静态代码块 和 静态内部类)。
static的主要作用在于创建独立于具体对象的域变量或者方法
简单理解：
	被static关键字修饰的方法或者变量不需要依赖于对象来进行访问，只要类被加载了，就可以通过类名去进行访问。
	并且不会因为对象的多次创建 而在内存中建立多份数据
```
- 重点
```java
1. 静态成员 在类加载时加载并初始化。 
2. 无论一个类存在多少个对象 , 静态的属性, 永远在内存中只有一份( 可以理解为所有对象公用 ) 
3. 在访问时： 静态不能访问非静态 , 非静态可以访问静态 !
```

## 2.4、代码块

```java
普通代码块 
	在执行的流程中 出现的 代码块， 我们称其为普通代码块。

构造代码块 
	在类中的成员代码块， 我们称其为构造代码块， 在每次对象创建时执行， 执行在构造方法之前。

静态代码块 
	在类中使用static修饰的成员代码块， 我们称其为静态代码块， 在类加载时执行。 每次程序启动到关闭 ，只会 执行一次的代码块。

同步代码块 
	在后续多线程技术中学习。

面试题：
	构造方法 与 构造代码块 以及 静态代码块的执行顺序： 
		静态代码块 --> 构造代码块 --> 构造方法
```

## 2.5、包
### 2.5.1 包介绍

```java
1、把功能相似或相关的类或接口组织在同一个包中，方便类的查找和使用。 
2、包如同文件夹一样，不同的包中的类的名字是可以相同的，当同时调用两个不同包中相同类名的类时，应该加上包名 加以区别。因此，包可以避免名字冲突。 
3、包也限定了访问权限，拥有包访问权限的类才能访问某个包中的类。
```

### 2.5.2 包的使用规则

```java
- 包中java文件的定义： 
	在.java文件的首部， 必须编写类所属哪个包， 
	格式： package 包名; 
- 包的定义： 
		通常由多个单词组成， 所有单词的字母小写， 单词与单词之间使用.隔开 ，一般命名为“com.公司名.项目 名.模块名....”。 

规范由来： 
	由于Java面向对象的特性，每名Java开发人员都可以编写属于自己的Java Package，为了保障每个Java Package命名的唯一性，在最新的Java编程规范中，要求开发人员在自己定义的包名前加上唯一的前缀。由于互联网上 的域名称是不会重复的，所以多数开发人员采用自己公司在互联网上的域名称作为自己程序包的唯一前缀。例如： com.java.xxx
```

### 2.5.3  import 关键字
`import 包名.类名;`
## 2.6、权限修饰符
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210507192530770.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)

## 2.7、main方法详解

```java
public static void main(String args[]) 
以上的各个参数的含义如下： 
	· public：表示公共的内容，可以被所有操作所调用 
	· static：表示方法是静态的，可以由类名称直接调用。java StaticDemo09 
	· void：表示没有任何的返回值操作 
	· main：系统规定好的方法名称。如果main写错了或没有，会报错：NoSuchMethodError: main 
	· String[] args：字符串数组，接收参数的

public class StaticDemo10{ 
	public static void main(String args[]){ 
		for(int i=0;i<args.length;i++){ 
			System.out.println(args[i]) ; 
			} 
		} 
	};
所有的参数在执行类的时候以空格进行分割。 java StaticDemo10 1 2 3 4 5 6 7
但是，如果现在我要输入的是以下几种参数“hello world”、“hello vince”、“hello mjw”。
因为以空格分割，所以以上的三组参数会当做六组参数输入，那么此时如果要想完成有空格的内容输入，则参数需 要使用“"”括起来。 
java StaticDemo10 "hello world" "hello vince" "hello mjw"
```

## 2.8、单例设计模式
设计模式大有文章

```java
单例设计模式是我们学习的第一个设计模式，也是比较重要的一个设计模式，单例设计模式会伴随这你的开发生涯，不 管你是初级程序员，还是以后晋级到高级程序员，你都会接触到单例设计模式，今天，我们就学习单例设计模式的两种 实现方式。 
单例设计模式：保证程序在内存中只有一个对象存在（被程序所共享）

单例设计模式的两种实现方式： 
一、懒汉式：随着类的加载在内存中对象为null，当调用 getInstance 方法时才创建对象（延迟加载） 
二、饿汉式：随着类的加载直接创建对象（推荐开发中使用） 
单例设计模式的实现步骤： 
1．保证一个类只有一个实例，实现方式：构造方法私有化 
2．必须要自己创建这个实例，实现方式：在本类中维护一个本类对象（私有，静态） 
3．必须向整个程序提供这个实例，实现方式：对外提供公共的访问方式（getInstance方法，静态）
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210507192956346.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)


# <3>面向对象高级
## 3.1、抽象类
### 概念

```java
抽象类必须使用 abstract class 声明
一个抽象类中可以没有抽象方法，抽象方法必须写在抽象类 或者 接口中。

格式 ：
	abstract class 类名{ // 抽象类
	}
```
### 抽象方法

```java
只声明而未实现的方法称为抽象方法（未实现指的是，没有“{}” 方法体），抽象方法必须使用 abstract 关键字声明。
格式：
	abstract class 类名{ // 抽象类
		public abstract void 方法名（）； // 抽象方法，只声明而未实现
}
```
### 不能被实例化

```java
在抽象类的使用中有几个原则：
	- 抽象类本身是不能直接进行实例化操作的，即：不能直接使用关键字new完成。
	- 一个抽象类必须被子类所继承，被继承的子类（如果不是抽象类）则必须覆写(重写)抽象类中的全部抽象方法。
```
### 常见问题&解答

```java
1、 抽象类能否使用final声明？
	不能，因为final属修饰的类是不能有子类的 ， 而抽象类必须有子类才有意义，所以不能。

2、 抽象类能否有构造方法？
	能有构造方法，而且子类对象实例化的时候的流程与普通类的继承是一样的，都是要先调用父类中的 构造方法（默认是无参的），之后再调用子类自己的构造方法
```
### 抽象类和普通类的区别

```java
1、抽象类必须用public或procted 修饰(如果为private修饰，那么子类则无法继承，也就无法实现其 抽象方法）。默认缺省为 public

2、抽象类不可以使用new关键字创建对象， 但是在子类创建对象时， 抽象父类也会被JVM实例化。

3、如果一个子类继承抽象类，那么必须实现其所有的抽象方法。如果有未实现的抽象方法，那么子类也必 须定义为 abstract类
```

## 3.2、接口
### 概念

```java
如果一个类中的全部方法都是抽象方法，全部属性都是全局常量，那么此时就可以将这个类定义成一个接 口。
定义格式： 
	interface 接口名称{ 
		全局常量 ; 
		抽象方法 ; 
		}
```
### 面向接口编程思想

```java
这种思想是接口是定义（规范，约束）与实现（名实分离的原则）的分离。 
优点：
	1、 降低程序的耦合性 
	2、 易于程序的扩展 
	3、 有利于程序的维护
```
### 全局常量和抽象方法的简写

```java
因为接口本身都是由全局常量和抽象方法组成 ， 所以接口中的成员定义可以简写：
	1、全局常量编写时， 可以省略public static final 关键字，例如：
		public static final String INFO = "内容" ; 
		简写后： String INFO = "内容" ;
	
	2、抽象方法编写时， 可以省略 public abstract 关键字， 例如：
		public abstract void print() ; 
		简写后： void print() ;
```
### 接口的实现 implements

```java
接口可以多实现： 
格式：
	class 子类 implements 父接口1,父接口2...{ 
	} 

以上的代码称为接口的实现。那么如果一个类即要实现接口，又要继承抽象类的话，则按照以下的格式编写 即可：
	class 子类 extends 父类 implements 父接口1,父接口2...{ 
	}
```
### 接口的继承

```java
接口因为都是抽象部分， 不存在具体的实现， 所以允许多继承,例如： 
	interface C extends A,B{ }
```
### 注意
`如果一个接口要想使用，必须依靠子类。 子类（如果不是抽象类的话）要实现接口中的所有抽象方法。

`### 接口和抽象类的区别

```java
1、抽象类要被子类继承，接口要被类实现。 
2、接口只能声明抽象方法，抽象类中可以声明抽象方法，也可以写非抽象方法。 
3、接口里定义的变量只能是公共的静态的常量，抽象类中的变量是普通变量。 
4、抽象类使用继承来使用， 无法多继承。 接口使用实现来使用， 可以多实现 
5、抽象类中可以包含static方法 ，但是接口中不允许（静态方法不能被子类重写，因此接口中不能声明 静态方法） 
6、接口不能有构造方法，但是抽象类可以有
```

## 3.3、多态
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210507220027279.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)

## 3.4、instanceof

```java
作用：
	判断某个对象是否是指定类的实例，则可以使用instanceof关键字 

格式：
	实例化对象 instanceof 类 //此操作返回boolean类型的数据
```

## 3.5、Object类
### 概念

```java
Object类是所有类的父类（基类），如果一个类没有明确的继承某一个具体的类，则将默认继承Object 类。
例如我们定义一个类： 
public class Person{ }

其实它被使用时 是这样的： 
public class Person extends Object{ }
```
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210507220146389.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)

## 3.6、内部类
### 概念

```java
在Java中，可以将一个类定义在另一个类里面或者一个方法里面，这样的类称为内部类。 
广泛意义上的内部类一般来说包括这四种： 
	1、成员内部类 
	2、局部内部类 
	3、匿名内部类 
	4、静态内部类
```

### 成员内部类

```java
成员内部类是最普通的内部类，它的定义为位于另一个类的内部，形如下面的形式： class Outer { 
	private double x = 0; 
	public Outer(double x) { 
		this.x = x; 
		}
	class Inner { //内部类 
		public void say() { 
			System.out.println("x="+x); 
			} 
		} 
	}
特点： 成员内部类可以无条件访问外部类的所有成员属性和成员方法（包括private成员和静态成员）。 

不过要注意的是，当成员内部类拥有和外部类同名的成员变量或者方法时，会发生隐藏现象，即默认情况下访问的是成员内部类的成员。如果要访问外部类的同名成员，需要以下面的形式进行访问：
	外部类.this.成员变量 
	外部类.this.成员方法 

外部使用成员内部类 
	Outter outter = new Outter(); 
	Outter.Inner inner = outter.new Inner();
```

### 局部内部类
![在这里插入图片描述](https://img-blog.csdnimg.cn/2021050722041153.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)

### 匿名内部类

```java
匿名内部类由于没有名字，所以它的创建方式有点儿奇怪。创建格式如下： 
	new 父类构造器（参数列表）|实现接口（） {
		//匿名内部类的类体部分 
		} 

	在这里我们看到使用匿名内部类我们必须要继承一个父类或者实现一个接口，当然也仅能只继承一个父类 或者实现一个接口。同时它也是没有 class 关键字，这是因为匿名内部类是直接使用new来生成一个对象的 引用。当然这个引用是隐式的
```
注意：

```java
在使用匿名内部类的过程中，我们需要注意如下几点： 
	1、使用匿名内部类时，我们必须是继承一个类或者实现一个接口，但是两者不可兼得，同时也只能 继承一个类或者实现一个接口。 
	2、匿名内部类中是不能定义构造函数的。 
	3、匿名内部类中不能存在任何的静态成员变量和静态方法。 
	4、匿名内部类为局部内部类，所以局部内部类的所有限制同样对匿名内部类生效。 
	5、匿名内部类不能是抽象的，它必须要实现继承的类或者实现的接口的所有抽象方法。 
	6、只能访问final型的局部变量
```

### 静态内部类
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210507220324628.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)

## 3.7、包装类
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210507220757776.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210507220813928.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210507220825701.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
### 字符串转换

```java
使用包装类还有一个很优秀的地方在于：可以将一个字符串变为指定的基本数据类型，此点一般在接收输入 数据上使用较多。 
在Integer类中提供了以下的操作方法： 
	public static int parseInt(String s) ：将String变为int型数据 在Float类中提供了以下的操作方法： 
	
	public static float parseFloat(String s) ：将String变为Float 在Boolean 类中提供了以下操作方法： 
	
	public static boolean parseBoolean(String s) ：将String变为boolean .... ....
```

## 3.8、可变参数

```java
一个方法中定义完了参数，则在调用的时候必须传入与其一一对应的参数，但是在JDK 1.5之后提供了新的 功能，可以根据需要自动传入任意个数的参数。 
语法：
	返回值类型 方法名称(数据类型…参数名称){ 
		//参数在方法内部 ， 以数组的形式来接收 
	} 

注意：可变参数只能出现在参数列表的最后。
```

## 3.9、递归

```java
递归，在数学与计算机科学中，是指在方法的定义中使用方法自身。也就是说，递归算法是一种直接或者间 接调用自身方法的算法。 
```
递归流程图如下：![在这里插入图片描述](https://img-blog.csdnimg.cn/20210507215906113.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)


# <4>java异常处理
未完待续。。。。。。。。。。。。。。

