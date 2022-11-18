package com.kvlt;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import javax.sql.DataSource;

@SpringBootTest
public class DataSourceTests {

    @Autowired
    private DataSource dataSource; //interface

    @Test
    public void testConnection() throws Exception{
        //通过datasource获取连接的一个过程是怎么样的
        System.out.println(dataSource.getConnection());

        //HikariProxyConnection@524566446 wrapping com.mysql.cj.jdbc.ConnectionImpl@73ba6fe6
    }

}
