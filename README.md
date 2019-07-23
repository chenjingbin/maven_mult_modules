### Maven多模块构建SSM框架

使用tomcat插件运行,放在admin-web的pom.xml
```
<!-- tomcat插件控制 -->
<plugin>
<groupId>org.apache.tomcat.maven</groupId>
<artifactId>tomcat7-maven-plugin</artifactId>
<version>2.2</version>
<configuration>
<port>8080</port>
<path>/test123</path>
<uriEncoding>UTF-8</uriEncoding>
</configuration>
</plugin>
```

idea界面上的右上角的绿色三角形隔壁，点击 edit configuration ->添加 maven. -> parameters下的working directory 输入框输入war的文件夹。
command line输入：**tomcat7:run**。

