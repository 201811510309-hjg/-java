# <4>java异常处理
写在前面：合格的程序员是补救解决异常，而不是简单的捕获打印输出！

## [1]. 明确什么是异常 （重点） 
我们调用某个函数的时候出错，调用方如何获知调用失败的信息？

方法一：约定返回错误码。
例如，处理一个文件，如果返回0，表示成功，返回其他整数，表示约定的错误码：
```java
int code = processFile("C:\\test.txt");
if (code == 0) {
    // ok:
} else {
    // error:
    switch (code) {
    case 1:
        // file not found:
    case 2:
        // no read permission:
    default:
        // unknown error:
    }
}
```
因为使用int类型的错误码，想要处理就非常麻烦。这种方式常见于底层C函数。

方法二：在语言层面上提供一个异常处理机制。
Java内置了一套异常处理机制，总是使用异常来表示错误。
异常是一种class，因此它本身带有类型信息。异常可以在任何地方抛出，但只需要在上层捕获，这样就和方法调用分离了：
```java
try {
    String s = processFile(“C:\\test.txt”);
    // ok:
} catch (FileNotFoundException e) {
    // file not found:
} catch (SecurityException e) {
    // no read permission:
} catch (IOException e) {
    // io error:
} catch (Exception e) {
    // other error:
}
```
因为Java的异常是class，它的继承关系如下：
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210210164226288.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
从继承关系可知：Throwable是异常体系的根，它继承自Object。Throwable有两个体系：Error和Exception，Error表示严重的错误，程序对此一般无能为力，例如：
>- OutOfMemoryError：内存耗尽
>- NoClassDefFoundError：无法加载某个Class
>- StackOverflowError：栈溢出

而Exception则是运行时的错误，它可以被捕获并处理。
某些异常是应用程序逻辑处理的一部分，应该捕获并处理。例如：
>- NumberFormatException：数值类型的格式错误
>- FileNotFoundException：未找到文件
>- SocketException：读取网络失败

还有一些异常是程序逻辑编写不对造成的，应该修复程序本身。例如：
>- NullPointerException：对某个null的对象调用方法或字段
>- IndexOutOfBoundsException：数组索引越界

Exception又分为两大类：
>1. RuntimeException以及它的子类；
>2. 非RuntimeException（包括IOException、ReflectiveOperationException等等）

Java规定：
- 必须捕获的异常，包括Exception及其子类，但不包括RuntimeException及其子类，这种类型的异常称为Checked Exception。
- 不需要捕获的异常，包括Error及其子类，RuntimeException及其子类。
- 注意：编译器对RuntimeException及其子类不做强制捕获要求，不是指应用程序本身不应该捕获并处理RuntimeException。是否需要捕获，具体问题具体分析。

## [2]. 捕获处理异常
```
如果要想对异常进行处理，则必须采用标准的处理格式，处理格式语法如下： 
try{
	// 有可能发生异常的代码段 
	}catch(异常类型1 对象名1){ 
		// 异常的处理操作
	 }catch(异常类型2 对象名2){
	 	// 异常的处理操作
	 	 } ... 
	 finally{ // 异常的统一出口
	  }
```
try+catch的处理流程
>1、 一旦产生异常，则系统会自动产生一个异常类的实例化对象。 
>2、 那么，此时如果异常发生在try语句，则会自动找到匹配的catch语句执行，如果没有在try语句中，则会将异 常抛出. 
>3、 所有的catch根据方法的参数匹配异常类的实例化对象，如果匹配成功，则表示由此catch进行处理。
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210210165225697.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)

finally
```
在进行异常的处理之后，
	在异常的处理格式中还有一个finally语句，
		那么此语句将作为异常的统一出口，
			不管是否产生 了异常，最终都要执行此段代码。
```
## [3].throws 和 throw 关键字

```java
在程序中异常的基本处理已经掌握了，但是随异常一起的还有一个称为throws关键字，此关键字主要在方法的声明上使 用，表示方法中不处理异常，而交给调用处处理。 
格式：
	返回值 方法名称()throws Exception{ }
```

```java
throw关键字表示在程序中人为的抛出一个异常，因为从异常处理机制来看，所有的异常一旦产生之后，实际上抛出 的就是一个异常类的实例化对象，那么此对象也可以由throw直接抛出。 

代码： throw new Exception("抛着玩的。") ;
```
## [4] RuntimeExcepion与Exception的区别

```java
注意观察如下方法的源码： 
 Integer类： public static int parseInt(String text)throws NumberFormatException 
 
 
此方法抛出了异常， 但是使用时却不需要进行try。。。catch捕获处理，原因： 

因为NumberFormatException并不是Exception的直接子类，而是RuntimeException的子类，只要是 
RuntimeException的子类，则表示程序在操作的时候可以不必使用try…catch进行处理，如果有异常发生，
则由JVM进 行处理。当然，也可以通过try catch处理。
```

## [5] 自定义异常类 了解

```java
编写一个类， 继承Exception，并重写一参构造方法 即可完成自定义受检异常类型。 
编写一个类， 继承RuntimeExcepion，并重写一参构造方法 即可完成自定义运行时异常类型。 
例如：
class MyException extends Exception{ 
	// 继承Exception，表示一个自定义异常类 
	public MyException(String msg){ 
		super(msg) ; 
		// 调用Exception中有一个参数的构造 
	} 
}; 

自定义异常可以做很多事情， 
例如： 
class MyException extends Exception{ 
	public MyException(String msg){ 
		super(msg) ; 
		//在这里给维护人员发短信或邮件， 告知程序出现了BUG。
	 }
};
```

## [6] 异常处理常见面试题

```java
1. try-catch-finally 中哪个部分可以省略？ 
答：catch和finally可以省略其中一个 ， catch和finally不能同时省略 
注意:格式上允许省略catch块, 但是发生异常时就不会捕获异常了,我们在开发中也不会这样去写代码.

2. try-catch-finally 中，如果 catch 中 return 了，finally 还会执行吗？ 
答：finally中的代码会执行 

详解：执行流程： 
 1. 先计算返回值， 并将返回值存储起来， 等待返回 
 2. 执行finally代码块 
 3. 将之前存储的返回值， 返回出去； 需注意：
  	1. 返回值是在finally运算之前就确定了，并且缓存了，不管finally对该值做任何的改变，返回的值都不会改变 
  	2. finally代码中不建议包含return，因为程序会在上述的流程中提前退出，也就是说返回的值不是try或 catch中的值
  	3. 如果在try或catch中停止了JVM,则finally不会执行.例如停电- -, 或通过如下代码退出 JVM:System.exit(0);
```

