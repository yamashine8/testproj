package shine.testproj.mapper;

import org.apache.ibatis.annotations.*;
import shine.testproj.model.User;

import java.util.List;

@Mapper
public interface UserMapper {
    @Select("select * from users")
    List<User> findAll();

    @Insert("INSERT INTO users(name, salary, email) VALUES (#{name}, #{salary}, #{email})")
    void insert(User user);

    @Delete("delete from users where email=#{email}")
    void deleteByEmail(String email);

    @Select("select * from users where email=#{email}")
    User findByEmail(String email);


}