
Java SPI机制简介 http://www.cnblogs.com/zhongkaiuu/articles/5040971.html
java的spi运行流程是运用java.util.ServiceLoader这个类的load方法去在src/META-INF/services/寻找对应的全路径接口名称的文件，然后在文件中找到对应的实现方法并注入实现，然后你可以运用了