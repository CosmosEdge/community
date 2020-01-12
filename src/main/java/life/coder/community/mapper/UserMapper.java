package life.coder.community.mapper;

import life.coder.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "UserMapper")
public interface UserMapper {
    //类会自动放入，不是类则需要@Param引入
    @Insert("insert into user (name,account_id,token,gmt_create,gmt_modefied,avatar_url) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModefied},#{avatarUrl})")
    void insert(User user);
    @Select("select * from user where token=#{token}")
    User findByToken(@Param("token") String token);
}
