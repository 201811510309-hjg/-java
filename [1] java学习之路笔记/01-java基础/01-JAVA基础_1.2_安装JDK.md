># 《环境搭建——安装JDK》
# 1、认识环境变量
比喻：鱼在水里游，给鱼配置水，给运行的程序配置运行环境
这边演示一下环境变量的用法
- 我的Typora安装在E盘（非C盘）
>![在这里插入图片描述](https://img-blog.csdnimg.cn/20210208162032579.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
- WIN+R再键入cmd
>![在这里插入图片描述](https://img-blog.csdnimg.cn/20210208162334495.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
- 直接Typora会
~~'Typora' 不是内部或外部命令，也不是可运行的程序
或批处理文件。~~
>![在这里插入图片描述](https://img-blog.csdnimg.cn/20210208162222497.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)

- 然后  此电脑 + 属性
（找不到此电脑你可以点击这里[https://blog.csdn.net/weixin_46344594/article/details/113759057
](https://blog.csdn.net/weixin_46344594/article/details/113759057
) ）
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210208162713957.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
- 高级系统设置 + 环境变量(N) + PATH 
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210208162825277.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
- 新建  E:\Typora
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210208162900557.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
- 一路确认
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210208163009419.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
- 注意：新打开一个cmd
![在这里插入图片描述](https://img-blog.csdnimg.cn/20210208164330472.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
- 总结：鱼有水了
# 2、JDK安装
因为官网注册需要访问国外服务器，国内无法注册 ，所以下面的下载步骤可以不执行，已经给大家提供了安装包
[提供JDK11+Eclipse安装包链接：https://pan.baidu.com/s/1X8g0BulkFQErkNUsfq3noQ 
提取码：6666 
](https://pan.baidu.com/s/1X8g0BulkFQErkNUsfq3noQ 
)
Java 11为最新的 LTS（长期支持）版本
- 下载
>下载步骤一： 访问官网：[https://www.oracle.com ](https://www.oracle.com )
下载步骤二： 注册，并登录。 （国内无法正常注册） 
下载步骤三： 跳转到官网下载页面： [https://www.oracle.com/java/technologies/javase-jdk11-downloads.html](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html)
下载步骤四：![在这里插入图片描述](https://img-blog.csdnimg.cn/20210208165533741.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
- 安装
>安装步骤 1： 双击下发的安装包![在这里插入图片描述](https://img-blog.csdnimg.cn/20210208165656669.png)

>安装步骤 2： **看图安装软件（记住自己装在了那个文件夹中，文件夹地址后续有用）**![在这里插入图片描述](https://img-blog.csdnimg.cn/20210208165730231.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)下一步![在这里插入图片描述](https://img-blog.csdnimg.cn/2021020816574555.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)
下一步![在这里插入图片描述](https://img-blog.csdnimg.cn/20210208165808499.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)

>安装步骤 3：配置环境变量![在这里插入图片描述](https://img-blog.csdnimg.cn/20210208165857880.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L3dlaXhpbl80NjM0NDU5NA==,size_16,color_FFFFFF,t_70)安装完毕

# 3 代码语句分类
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

