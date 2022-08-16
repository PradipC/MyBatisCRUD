package com.capita.demo.dao.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;

import com.capita.demo.model.User;

@Mapper
public interface UserMapper {

	@Select("select * from users")
	List<User> findAll();

	@Insert("Insert into users(name,salary)  values(#{name},#{salary})")
	@SelectKey(statement = "SELECT LAST_INSERT_ID()", keyProperty = "uid", before = false, resultType = Integer.class)
	void createUser(User user);

	@Update("update users set name=#{name}, salary=#{salary} where uid=#{uid}")
	void updateUser(User user);

	@Delete("delete from users where uid=#{uid}")
	void deleteUser(Integer uid);

}
