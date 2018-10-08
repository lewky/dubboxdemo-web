# dubboxdemo-web

A simple service consumer demo for learning dubbox.Dubbox框架服务消费方的一个简单demo，对应的服务提供方demo是dubboxdemo-service项目: https://github.com/lewky/dubboxdemo-service

# How to use

1. 请修改spring配置文件applicationContext-service.xml里的ZooKeeper地址和端口，如果只是在本地启动ZooKeeper则无需修改配置文件中的地址和端口。
```
<dubbo:registry address="zookeeper://localhost:2181" timeout="100000" />
```
2. 本项目和另一个项目dubboxdemo-web是配套的，需要一起使用，同样需要修改其配置文件的ZooKeeper地址和端口。
3. 启动项目前需要先启动ZooKeeper服务，ZooKeeper依赖于Java平台，如果用云服务器部署ZooKeeper需要先安装jdk并关闭防火墙、放行端口号。启动dubbox-demo相关的两个项目时使用的命令是`mvn tomcat7:run`，如果是在Eclipse中启动则使用命令`tomcat7:run`。
4. 启动服务后访问`localhost:8082/user/name.do`，会得到一个显示`lewky`字符串的页面，说明本demo项目测试成功了。
5. 本项目极其简单，仅提供demo以初识dubbox框架。后边附上阿里云部署dubbox服务的学习笔记，有问题可以留言O(∩_∩)O

# Learning Note

本项目是我在学习品优购项目时一起做的dubbox框架demo，对此记录了一些相关的实践和踩坑记录，欢迎前往阅览：

* [CSDN地址](https://blog.csdn.net/lewky_liu/article/details/82962571)

# Download

我把项目相关的源码、ZooKeeper压缩包、dubbo-admin的war包、dubbox的jar包和dtd离线约束文件等统一打包上传到了CSDN，欢迎下载。

* [项目相关文件的下载地址](https://download.csdn.net/download/lewky_liu/10707347)
