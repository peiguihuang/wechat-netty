
支持可热拔插的channelHandler ，心跳与空闲检测

1、启动服务端（运行nettyServer的main方法）

 ![图片说明1](https://img-blog.csdnimg.cn/2019012215591097.png)

2、启动客户端（运行nettyclient的main方法），并输入登录用户名登录，如下图：

 ![图片说明1](https://img-blog.csdnimg.cn/20190122161224665.png)
 ![图片说明1](https://img-blog.csdnimg.cn/20190122161234479.png)




3、单聊

发送方：
 ![图片说明1](https://img-blog.csdnimg.cn/20190122161358941.png)



 

接受方：

 ![图片说明1](https://img-blog.csdnimg.cn/20190122161435634.png)


 

4、群聊

（1）、发起群聊，创建群

client：
 ![图片说明1](https://img-blog.csdnimg.cn/20190122161821504.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2h1YW5ncGVpZ3Vp,size_16,color_FFFFFF,t_70)



 

server：

 ![图片说明1](https://img-blog.csdnimg.cn/2019012216190031.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2h1YW5ncGVpZ3Vp,size_16,color_FFFFFF,t_70)


 

（2）、群管理（加入、退出、获取群成员列表）

入群者：

 ![图片说明1](https://img-blog.csdnimg.cn/20190122162019236.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2h1YW5ncGVpZ3Vp,size_16,color_FFFFFF,t_70)


 

（3）、群聊

 ![图片说明1](https://img-blog.csdnimg.cn/20190122162434843.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2h1YW5ncGVpZ3Vp,size_16,color_FFFFFF,t_70)

 ![图片说明1](https://img-blog.csdnimg.cn/20190122162452887.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2h1YW5ncGVpZ3Vp,size_16,color_FFFFFF,t_70)

 ![图片说明1](https://img-blog.csdnimg.cn/20190122162513745.png?x-oss-process=image/watermark,type_ZmFuZ3poZW5naGVpdGk,shadow_10,text_aHR0cHM6Ly9ibG9nLmNzZG4ubmV0L2h1YW5ncGVpZ3Vp,size_16,color_FFFFFF,t_70)



 

 

 


--------------------- 
作者：huangpeigui 
来源：CSDN 
原文：https://blog.csdn.net/huangpeigui/article/details/86596245 
版权声明：本文为博主原创文章，转载请附上博文链接！
