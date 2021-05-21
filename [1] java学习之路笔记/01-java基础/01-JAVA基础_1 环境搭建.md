看完学到
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210520085116455.png)

# <1>环境搭建
>早起的鸟儿有虫吃，瞎写的代码有Bug！
## 1.java起源与演变
1. 起源 单片式计算机   SUN公司   1991年  JamesGosling “Oak”-->Applet技术  更名JAVA
2. 演变 1996 JDK1.0
   ​		1997 旧金山大会   JDK1.1 
   ​		1998 JDK1.2--J2EE
   ​		1999.6 java
   |   J2ME   | J2SE     | J2EE         |
   | :------: | -------- | ------------ |
   | 移动无线 | 桌面环境 | 企业  服务器 |
   ​		...
   ​		2004.09.30   J2SE1.5 里程碑
   ​     2005.06        JavaEE   javaSE   javaME
		2011.07.28    sun被Oracle收购 发布JavaSE7 
   ​	    2014.03.18   JavaSE 8   上一个长期支持版本
        2018.9.26   javaSE 11(LTS)  长期支持版本
## 2.java体系和特点
java EE SE ME
## 3.java特性
纯面向对象
跨平台
健壮（鲁棒）
安全（GC 强制类型检查  没指针）

## 4.JVM GC
跨平台原理   java 虚拟机------JVM 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210120152422673.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
JVM 是一个可以运行java字节码的虚拟计算机系统
   - JVM有一个解释器组件，可以实现java字节码与计算机OS之间的通信
   - 对于不同的运行平台，有不同的JVM
   - JVM屏蔽了底层运行平台的差别，实现了"一次编译，随处运行"。

垃圾回收器 --GC
- JVM提供的一个系统线程

## 5.JDK与JRE
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210120155202319.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
JDK【【JRE】【java API】】
JRE  
1. 加载代码(由类加载器（class loader）)完成
2. 校验代码(由字节码校验器（bytecode  verifier ）)完成
3. 执行代码(由运行时解释器（runtime interpreter）)完成

## JDK11 安装
## 环境变量详述
## JAVA_HOME环境变量
## 安装eclipse
## 第一个java程序
- ### 代码语句分类
  - 1.结构定义语句
  - 2.功能执行语句 
- ### 关机&&取消关机 
- ```java
  package com.kkb.demo;
  
  import java.io.IOException;
  
  public class Demo1 {
  	//代码分为结构定义语句&&功能执行语句 分号结尾
  	public static void main(String[] args) throws IOException {
  		// TODO Auto-generated method stub
  		
  		
  		//关机
  //		Runtime.getRuntime().exec("shutdown -s -t 100000000");
  		
  		//取消关机
  		Runtime.getRuntime().exec("shutdown -a");
  
  	}
  
  }
  ```
***总结***：
><u>*Java 发展史、Java 体系特点、Java 特性、JVM 与 GC、JDK 与 JRE、环 境变量、eclipse 安装、自动关机程序、代码分类* 



后面还有--



># [01-JAVA基础——简介](https://blog.csdn.net/weixin_46344594/article/details/113751927)
>`https://blog.csdn.net/weixin_46344594/article/details/113751927`

># [《环境搭建——安装JDK》](https://blog.csdn.net/weixin_46344594/article/details/113758162)
>`https://blog.csdn.net/weixin_46344594/article/details/113758162`

># [01-JAVA基础_2 基础语法](https://blog.csdn.net/weixin_46344594/article/details/113766534)
>`https://blog.csdn.net/weixin_46344594/article/details/113766534`

># [01-JAVA基础_3 流程控制](https://blog.csdn.net/weixin_46344594/article/details/116809474)
>`https://blog.csdn.net/weixin_46344594/article/details/116809474`

># [01-JAVA基础_4 数组](https://blog.csdn.net/weixin_46344594/article/details/116809997)
>`https://blog.csdn.net/weixin_46344594/article/details/116809997`

未完待续。。。。。
