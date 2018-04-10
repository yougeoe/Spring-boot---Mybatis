如何建一个简单的spring boot项目

IDEA 
new --> project--> Maven --> groudId:com.bee.saple  
                             artifactId:ch1helloworld
完成空项目maven构建


pom.xml 
 1.添加 配置表明spring boot项目
     <parent>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-parent</artifactId>
        <version>1.5.10.RELEASE</version>
     </parent>
     
  2.添加依赖配置 web项目
    <dependencies>
        <dependency><!-- web支持-->
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        <dependency><!--&lt;!&ndash; 热部署 &ndash;&gt;-->
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-devtools</artifactId>
            <scope>runtime</scope>
            <optional>true</optional><!-- 阻止用于其他模块的最佳实践 -->
        </dependency>
        <dependency>
            <!-- 支持mysql  -->
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <scope>runtime</scope>
        </dependency>
    </dependencies>
    
src/main/java 
  1.添加顶级包名 如：com.bee.sample
  2.顶级包名下创建项目入口类 Ch1Application.java
    Spring Boot 应用入口 :类注解 @SpringBootApplication  
    main方法添加  SpringApplication.run(Ch1Application.java,args);  
   注意：这里常见报找不到SpringBootApplication（报红） ,也就是找不到对应的包，无法导入
   解决：1.首先确认 pom.xml  是否配置web依赖
        <dependency><!-- web支持-->
            <groupId>org.springframework.boot</groupId>
            <artifactId>spring-boot-starter-web</artifactId>
        </dependency>
        2.如果配置还是报红，则主动improt对应的包名，即import org.springframework.boot.autoconfigure.SpringBootApplication;
        3.如果第二步不成功，则可以判断应该是构建项目的时候没有下载对应jar包
          右键项目 --> Maven -->Download sources and documentation  重新下载资源即可
          
                    
   
启动项目 Run  "Ch1Application"
    运行成功可以看到控制台有 Spring 的图标及版本，还可以看到运行于Tomcat 服务器 以及相关端口号，一般默认8080
    
   注意 有些同学运行可能会报 
   
   Description: Cannot determine embedded database driver class for database type NONE
   Action:If you want an embedded database please put a supported one on the classpath. If you have database settings to be loaded from a particular profile you may need to active it (no profiles are currently active).

   解决：1.检查是否配置相关数据库连接依赖，暂时用不上先注释看看是否还报。
        2.@SpringBootApplication 后加上 （exclude = { DataSourceAutoConfiguration.class } ）
        
        
   
