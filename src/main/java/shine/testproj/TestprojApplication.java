package shine.testproj;

import org.apache.catalina.User;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@MappedTypes(User.class)
@MapperScan("shine.testproj.mapper")
@SpringBootApplication
@EnableCaching
public class TestprojApplication {

    public static void main(String[] args) {
        SpringApplication.run(TestprojApplication.class, args);
    }

}
