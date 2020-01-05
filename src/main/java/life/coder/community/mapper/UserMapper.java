package life.coder.community.mapper;

import life.coder.community.model.User;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component(value = "UserMapper")
public interface UserMapper {
    @Insert("insert into user (name,account_id,token,gmt_create,gmt_modefied) values (#{name},#{accountId},#{token},#{gmtCreate},#{gmtModefied})")
    void insert(User user);
}
