![在这里插入图片描述](https://img-blog.csdnimg.cn/20210514233311398.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210514234037814.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
[笔记](https://blog.csdn.net/weixin_46344594/category_10803390.html)
[https://blog.csdn.net/weixin_46344594/category_10803390.html](https://blog.csdn.net/weixin_46344594/category_10803390.html)

[练习](https://blog.csdn.net/weixin_46344594/category_10751029.html)
[https://blog.csdn.net/weixin_46344594/category_10751029.html](https://blog.csdn.net/weixin_46344594/category_10751029.html)





面试题 ：：


1.JVM、JRE 和 JDK 的关系 

2.什么是跨平台性？原理是什么？ 

3.&和&&的区别？ 

4.用最有效率的方法计算 2 乘以 8 

5.在没有使用临时变量的情况如何交换两个整数变量的值？ 

6.short s1 = 1; s1 = s1 + 1;有错吗?short s1 = 1; s1 += 1;有错吗? 

7.float f=3.4;是否正确？ 

8.手动实现一下冒泡排序（快速排序）

9.实现打印指定行数的空心菱形的功能 

10.题目：将一个正整数分解质因数。例如：输入 90,打印出 90=2*3*3*5。

```java
 程序分析：对 n 进行分解质因数，应先 p 找到一个最小的质数 k，然后按下述步骤完成：
  (1)如果这个质数恰等于 n，则说明分解质因数的过程已经结束，打印出即可。 
  (2)如果 n<>k，但 n 能被 k 整除，则应打印出 k 的值，并用 n 除以 k 的商,作为新的正整数 n,重复执行第一步。 
  (3)如果 n 不能被 k 整除，则用 k+1 作为 k 的值,重复执行第一步。
```

