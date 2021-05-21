# 早起的鸟儿有虫吃，瞎写的代码有Bug！
# -0- JAVA 来了。。。
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210208095900647.gif#pic_center)

**为什么要学Java？**
>踏上这条路每个人都有自己的答案！

**为什么Java应用最广泛？**
>从互联网到企业平台，Java是应用最广泛的编程语言，原因在于：
>  1. Java是基于JVM虚拟机的跨平台语言，一次编写，到处运行；
> 2. Java程序易于编写，而且有内置垃圾收集(GC)，不必考虑内存管理；
> 3. Java虚拟机拥有工业级的稳定性和高度优化的性能，且经过了长时期的考验；
> 4. Java拥有最广泛的开源社区支持，各种高质量组件随时可用。

**Java语言常年霸占着三大市场：**

>1. 互联网和企业应用，这是Java EE的长期优势和市场地位；
>2. 大数据平台，主要有Hadoop、Spark、Flink等，他们都是Java或Scala（一种运行于JVM的编程语言）开发的；
>3. Android移动平台。

**Java 可以做什么？**
>1. 开发桌面应用程序 
>银行软件、商场结算软件 
>2. 开发面向 Internet 的 web 应用程序 
>门户网站（工商银行）、网上商城、阿里巴巴、电子商务网站 
>3. 提供各行业的解决方案 
>金融、电信、电力... 
>4. 嵌入式开发 
>移动电话、可视电话、数字机顶盒和汽车导航系统

# -1- 历史起源与演变
## 1.1起源
>学JAVA 的都知道一个人，那就是James Gosling（詹姆斯·高斯林）--高司令，人称Java之父
> 😊社会我蛋哥

![在这里插入图片描述](https://img-blog.csdnimg.cn/20210208095628999.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)

>20 世纪 90 年代，单片式计算机系统诞生，单片式计算机系统不仅廉价，而且功能强大，使用它可以大幅度提升消费性电子产品的智能化程度。 

>SUN 公司为了抢占市场先机，在 1991 年成立了一个由詹姆斯·高斯林（James Gosling）领导， 名为“Green”项目小组，目的是开发一种针对小型家电设备的嵌入式应用,能够在各种消费性电子产品上运行的程序架构。

>	在1992 年，他们开发了一种名 为“Oak”的面向对象语言。
>通过对 C++进行改造，去除了 C++复杂的指针和内存管理，同时结合嵌入式系统的实时性要求，
>这让组内成员夜以继日赶工，太TM痛苦了，天天熬夜，最终努力最终没有白费，最终促成了面向对象语言Oak诞生。当他们在向硬件生产商进行演示的时候，硬件生产商对此并不感冒，OaK 语言因为缺乏硬件的 支持而无法进入市场，从而被搁置一旁。

>没想到的是1994年，互联网的崛起，让Oak重新焕发了生机！！！
>项目小组看到了浏览器在未来的发展前景，于是决定将 OaK 应用于万维网。1995 年， 他们用 OaK 语言研发了一种能将小程序嵌入到网页中执行的技术——Applet，由于 Applet 不仅能嵌 入网页，还可随同网页在网络上进行传输，这让无数的程序员看到了 OaK 这门语言，与此同时，OaK 正式更名为 Java。从此随着互联网的高速发展，Java逐渐成为最重要的网络编程语言。

ps：***印度尼西亚有一个重要的盛产咖啡的岛屿叫Java，中文译名为爪哇，开发人员为这种新的语言起名为Java，其寓意是为世人端上一杯热咖啡。***

## 1.2  演变 
从1995年发布1.0版本开始，到目前为止，最新的Java版本是Java 15
|1995/5  |Java DevelopmentKit（JDK）1.0a2   |诞生  ||
|--|--|---|---|
|1996/1  |  JDK1.0|JDK(开发工具和运行环境) -运行环境包括核心 API、集成 API、用户界面 API、发布技术、Java 虚拟机(JVM)。代表性技术有：Java 虚拟机、Applet、AWT 等 |JDK1.0 的发布， 标志着 Java 成为一种独立的开发工具 ,有很多程序员学习并运用 Java 来制作 网页，在同年 9 月，约有 8.3 万个网页应用了 Java 技术来制作|
|1997/2  |  JDK 1.1| JDBC、JavaBeans、RMI、JAR 文件格式、Java 语法中的内部类和反射。|4 月 2 日，首届 Java One 大会在美国旧金山召开，参加会议的人超过一万人，创造了当时全球同类 会议规模最高的纪录。9 月，Java Developer Connection 社区成员超过 10 万，同年还有 10 个最主 要的操作系统供应商正式声明将在他们的产品中使用 Java。
|1998/12/8|JDK1.2|JKD1.2 的代表性技术有：Swing、Java IDL、EJB、Java Plug-in 等，在 API 文档中，添加了 strictfp 关键字和 Collections 集合类|第二代 Java 平台的企业版 J2EE 发布,Java 2 平台的发布，是 Java 发展过程中最重要的一个里程碑，标志着 Java 的应用开始普及。
|1999/4/27 |虚拟机JVM||HotSpot 虚拟机发布。HotSpot 是由一家叫“Longview Technologies”的小公司开 发的，后来被 SUN 公司收购。HotSpot 虚拟机发布时是作为 JDK 1.2 的附加程序提供的，后来它成 为了 JDK 1.3 及之后所有版本的 Sun JDK 的默认虚拟机 。
|1996/6/||Sun 公司把 Java 体系分为三个方向： J2ME（Java2 Micro Edition，Java2 平台的微型版），应用于移动、无线及有限资源的环境； J2SE（Java 2 Standard Edition，Java 2 平台的标准版），应用于桌面环境； J2EE（Java 2Enterprise Edition，Java 2 平台的企业版），应用于基于 Java 的应用服务器。 随着供应商的不同，Java 的 API 也分为三大类： Java Core API：Java 核心类库； Java Optional API：对之前 API 的扩充； 特殊 API：由特殊厂商或组织提供的 API。|
|2000/5|JDK1.3、JDK1.4 和 J2SE1.3||J2SE1.3 是对 J2SE1.2 的补充和扩展，从应 用领域的角度分析，JavaSE1.3 已经涵盖了数据库、WEB、网络、图形、多媒体、电话、影像等大 部分的信息技术领域。
|2002-2-26|J2SE1.4||与 J2SE1.3 相比，多了近 62%的类和接口。在这些新特性当中， 还提供了广泛的 XML 支持、安全套接字（Socket）支持（通过 SSL 与 TLS 协议）、全新的 I/OAPI、 正则表达式、日志与断言
|2004-9-30|J2SE1.5 发布，成为 Java 语言发展史上的又一里程碑||为了表示该版本的重要 性，J2SE 1.5 更名为 Java SE 5.0（内部版本号 1.5.0）。Java SE 5.0 包含了从 1996 年发布 1.0 版 本以来的最重大的更新，其中包括泛型支持、基本类型的自动装箱、改进的循环、枚举类型、格式化 I/O 及可变参数
|2005-6|Java SE 6||在 Java One 大会上，Sun 公司发布了 Java SE 6。此时，Java 的各种版本已经更名， 已取消其中的数字 2，如 J2EE 更名为 JavaEE，J2SE 更名为 JavaSE，J2ME 更名为 JavaME
|2011|7|Sun--->Oracle|收购 Sun 公司的 Oracle 发布了 Java SE 7，引入了二进制整数、支持字符串的 switch 语句、棱形语法、多异常捕抓、自动关闭资源的 try 语言等新特性。
|2014-3-18|8||Oracle 公司发布 Java SE8，这次版本升级为 Java 带来了全新的 Lambda 表达 式、流式编程等大量新特性，这些新特性使得 Java 变得更加强大。
|2017-9-22|javaSE9||Oracle 公司发布 Java SE 9，这次版本升级强化了 Java 的模块化系统，让 Java 语言更轻量化，且采用了更高效、更智能的 GI 垃圾回收器，并在核心类库上进行大量更新，可进一 步简化编程
|2018/3/21|javaSE10||Java SE 10 发布，Java 10 版本带来了很多新特性，其中最备受广大开发者 关注的莫过于局部变量类型推断。此外，还包垃圾收集器改善、GC 改进、性能提升、线程管控等新 特性。
|2018/9	|javaSE11||，Java SE 11 发布。这是 Java 大版本周期变化后的第一个长期支持版本（LTS 版本持续支持到 2026 年 9 月）。Java11 带来了 ZGC、Http Client 等重要特性，一共包含 17 个 JEP （JDK Enhancement Proposals，JDK 增强提案）
|2019/3/20	|javaSE12||Java 12 是短期支持版本，可在下一个版本发布之前获得 Oracle 的商业支持
|2019/9/23	|javaSE13||此版本中添加了“文本块”，文本块是一个多行字符串文字， 避免对大多数转义序列的需要，以可预测的方式自动格式化字符串，并在需要时让开发人员控制格式。
|2020/3	|14||
|2020/9	|15||

# -2- Java 体系与特点
## 2.1体系
SUN给Java又分出了三个不同版本：
- Java SE：Standard Edition
- Java EE：Enterprise Edition
- Java ME：Micro Edition
 ### 三者关系
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210208111909573.png)
- Java SE：Java Platform，Standard Edition
标准版：包含标准的JVM和标准库，各应用平台的基础，桌面开发和低端商务应用的解决方案。

- Java EE：Java Platform，Enterprise Edition 
企业版：以企业为环境而开发应用程序的解决方案 。在Java SE的基础上加上了大量的API和库，以便方便开发Web应用、数据库、消息服务等，Java EE的应用使用的虚拟机和Java SE完全相同。

- Java ME ：Java Platform, Micro Edition 
微型版：致力于消费产品 和嵌入式设备的最佳解决方案。和Java SE不同，它是一个针对嵌入式设备的“瘦身版”，Java SE的标准库无法在Java ME上使用，Java ME的虚拟机也是“瘦身版”。

<u>毫无疑问，Java SE是整个Java平台的核心，而Java EE是进一步学习Web应用所必须的。我们熟悉的Spring等框架都是Java EE开源生态系统的一部分。不幸的是，Java ME从来没有真正流行起来，反而是Android开发成为了移动平台的标准之一，因此，没有特殊需求，不建议学习Java ME。

>推荐的Java学习路线图如下：
首先要学习Java SE，掌握Java语言本身、Java核心开发技术以及Java标准库的使用；
如果继续学习Java EE，那么Spring框架、数据库开发、分布式架构就是需要学习的；
如果要学习大数据开发，那么Hadoop、Spark、Flink这些大数据平台就是需要学习的，他们都基于Java或Scala开发；
如果想要学习移动开发，那么就深入Android平台，掌握Android App开发。

**无论怎么选择，Java SE的核心技术是基础，这个教程的目的就是让你完全精通Java SE！**

## 2.2特点
>1. 纯面向对象：
>一种纯面向对象的编程语言。基于对象的编程更符合人的思维模式，使人们更容易解决复杂问题。
>2. 跨平台
>---------一种与平台无关（跨平台）的语言。(它提供了在不同平台下运行的解释环境) Java 语言的出现是源于对独立于平台语言的需要，希望用这种语言能编写出嵌入各种家用电器等设备的芯片上、且易于维护的程序。但是，人们发现当时的编译语言（比如 C、C++）都有一个共同的缺点，那就是只能对特定的 CPU 芯片进行编译。这样，一旦电器设备更换了，芯片就不能保证程序正确运行，就可能需要修改程序并针对新的芯片重新进行编译。Java 语言和其它语言相比，最大的优势就是编写的软件能在执行码兼容、能在所有的计算机上运行。Java 之所以能做到这一点，是因为 Java 可以在计算机的操作系统之上再提供一个 Java 运行环境，该运行环境由 Java 虚拟机（Java VirtualMachine）、类库以及一些核心文件组成，也就是说，只要平台提供了 Java 运行环境，用Java编写的软件就能在其上运行。
>3. 健壮（鲁棒）
>一种健壮的语言，吸收了 C/C++语言的优点。 有较高的安全性。
>4. 安全（GC 强制类型检查  没指针）
>(自动回收垃圾，强制类型检查，取消指针)
>5. 多线程
>Java 的特点之一就是内置了对多线程的支持，多线程允许计算机同时完成多个任务。实际上，多线程使人产生多个任务在
同时执行的错觉，因为目前的计算机的处理器在同一时刻只能执行一个线程，但处理器可以在不同的线程之间快速地切换
，原来是这么回事，由于处理器速度非常快，远远超过了人接受信息的速度，所以给人的感觉好像是多个任务在同时执行。C++ 没有内置的多线程机制，因为必须调用操作系统的多线程功能来进行多线程程序的设计。
>6.动态
>Java 程序的基础组成单元就是类，有些类是用户自己编写的，有些类是从类库中引入的，而类又是在运行时动态装载的，这就使得 Java 可以在分布环境中动态地维护程序及类库。C/C++ 编译时将函数库或类库中被使用地函数、类同时生成机器码，那么当其类库升级之后，如果要使 C/C++ 程序具有新类库提供的功能，程序就必须重新修改、编译，真是伤脑筋。


# -3- Java 跨平台原理【JVM ...】	
跨平台原理   java 虚拟机------JVM 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210208150047134.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
## 3.1 Java 技术的两种核心机制
1. Java 虚拟机(Java Virtual Machine) JVM
2. 垃圾回收器(Garbage Collection) GC
3![在这里插入图片描述](https://img-blog.csdnimg.cn/20210208150828260.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
## 3.2、Java 虚拟机(JVM)
JVM 是一个可以运行java字节码的虚拟计算机系统
>   - JVM有一个解释器组件，可以实现java字节码与计算机OS之间的通信
>    - 对于不同的运行平台，有不同的JVM
  > - JVM屏蔽了底层运行平台的差别，实现了"一次编译，随处运行"。
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210208150934264.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
## 3.3、垃圾回收器(GC)
垃圾回收器 --GC
- JVM提供的一个系统线程
>- 不再使用的内存空间应当进行回收-垃圾回收。 
>- 在 C/C++等语言中，由程序员负责回收无用内存。 
>- Java 语言消除了程序员回收无用内存空间的责任： 
>- JVM 提供了一种系统线程跟踪存储空间的分配情况。并在 JVM 的空闲时，检查并释放那些可以被释放的存储空间。 
>- 垃圾回收器在 Java 程序运行过程中自动启用，程序员无法精确控制和干预。

## 3.4、Java SE 的组成概念图
- JDK：Java Development Kit
- JRE：Java Runtime Environment![在这里插入图片描述](https://img-blog.csdnimg.cn/20210208151635589.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
## 3.5 JDK
>JDK【【JRE】【java API】】
>JRE  
>1. 加载代码(由类加载器（class loader）)完成
>2. 校验代码(由字节码校验器（bytecode  verifier ）)完成
>3. 执行代码(由运行时解释器（runtime interpreter）)完成

# -4-Java 程序的类型
>1. 命今行程序 
>2. GUI 程序 
>3. Applet 程序 
>4. J2EE web 应用程序

# -5-Java 程序开发的三个步骤![在这里插入图片描述](https://img-blog.csdnimg.cn/20210208152043283.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
# -6-语法
>1. 注释 ：java 程序有三种注释方式 
>单行注释：//注释 
>多行注释：/*注释*/ 
>文档注释：/**注释*/ 
>2. java 代码的位置 
>class 必须编写在.java 文件中 （具体详情参考 helloWorld 工程） 
>3. 语法规则：
> java 是严格区分大小写的
>  java 是一种自由格式的语言 
>  代码分为结构定义语句和功能执行语句 
>  功能执行语句的最后必须用分号结束

