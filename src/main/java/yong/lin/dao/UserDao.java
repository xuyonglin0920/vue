package yong.lin.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import yong.lin.domain.User;

import java.util.List;

@Mapper
public interface UserDao {
    @Select("select * from user")
    List<User> findAll() throws Exception;

    @Select("select * from user where id = #{id}")
    User findById(Integer id) throws Exception;
    @Update("update user set username = #{username}, password = #{password}, email = #{email}, age = #{age}, sex = #{sex} where  id = #{id}")
    void updateUser(User user) throws Exception;
}
