springboot建议的目录结果如下
1. Application.java 建议存放根目录下
2. domain目录 主要用于存放实体(Entity)和数据访问层(Repository)
3. service目录 主要是业务类代码
4. controller目录 负责页面访问控制

@ComponentScan 注解

`
com.alibaba.fastjson.JSONObject;  用于构建json对象并返回
`



DAO层：
DAO层主要是做数据持久层的工作，负责与数据库进行联络的一些任务都封装在此，
DAO层的设计首先是设计DAO的接口，然后在Spring的配置文件中定义此接口的实现类，
然后就可在模块中调用此接口来进行数据业务的处理，而不用关心此接口的具体实现类是哪个类，
DAO层的数据源配置，以及有关数据库连接的参数都在Spring的配置文件中进行配置


Service层：
Service层主要负责业务模块的逻辑应用设计。
同样是首先设计接口，再设计其实现的类，接着再Spring的配置文件中配置其实现的关联。
这样我们就可以在应用中调用Service接口来进行业务处理。
Service层的业务实现，具体要调用到已定义的DAO层的接口，
封装Service层的业务逻辑有利于通用的业务逻辑的独立性和重复利用性，程序显得非常简洁。


ontroller层:
Controller层负责具体的业务模块流程的控制，在此层里面要调用Serice层的接口来控制业务流程，
控制的配置也同样是在Spring的配置文件里面进行，针对具体的业务流程，会有不同的控制器，
我们具体的设计过程中可以将流程进行抽象归纳，设计出可以重复利用的子单元流程模块，结构清晰/减少代码量。

View层 此层与控制层结合比较紧密，需要二者结合起来协同工发。View层主要负责前台jsp页面的表示.


JDBC链接MySQL5: `com.mysql.jdbc.Driver`
JDBC链接MySQL8: `com.mysql.cj.jdbc.Driver`


数据访问技术	    实现类
JDBC                DataSourceTransactionManager
JPA	            JpaTransactionManager
Hibernate	    HibernateTransactionManager
JDO	            JdoTransactionManager
分布式事务	    JtaTransactionManager

URL用于标识数据库的位置，通过URL地址告诉JDBC程序连接哪个数据库，URL的写法为：
jdbc:mysql://host:port/database


安装数据库软件----加载JDBC驱动程序 → 建立数据库连接Connection → 创建执行SQL的语句Statement → 处理执行结果ResultSet → 释放资源


