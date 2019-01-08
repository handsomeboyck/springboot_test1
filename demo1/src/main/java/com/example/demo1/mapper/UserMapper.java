package com.example.demo1.mapper;
import com.example.demo1.domain.User;
import java.util.List;
/*
 * 功能描述： 访问数据库
 */

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.type.JdbcType;
public interface UserMapper {
	 @Insert("INSERT INTO user(name,number,dgh,max_gh,weight) VALUES(#{name}, #{number}, #{dgh},#{max_gh},#{weight})")
	 @Options(useGeneratedKeys=true, keyProperty="id", keyColumn="id")   //keyProperty java对象的属性；keyColumn表示数据库的字段
	 int insert(User user);
	 
	 
	 
	
//
   @Select("SELECT * FROM user")
   @Results({
       @Result(column = "name",property = "name")  //javaType = java.util.Date.class        
   })
   List<User> getAll();
// 
//   
//
   @Select("SELECT * FROM user WHERE id = #{id}")
   @Results({
   	 @Result(column = "name",property = "name")
   })
   User findById(Long id);
   
//通过单板名称进行查询
//   @Select("select * from user")
//   @Results(id="nameMap",value={
//		@Result(column = "name",property = "name") 	
//   })
//   List<User> selectAll();
//   @Select({"select * from where name = #{name}"})
//   @ResultMap(value="nameMap")
//   User findByName( String name);
   
   @Select("SELECT * FROM user WHERE name = #{name}")
   @Results({
   	 @Result(column = "name",property = "name")
   })
   User findByName(String name); 
   
//通过单板数量进行查询
   @Select("SELECT * FROM user WHERE number = #{number}")
   @Results({
   	 @Result(column = "name",property = "name")
   })
   User findByNumber(int number);
   

//  
//
   @Update("UPDATE user SET number=#{number} WHERE id =#{id}")
   void update(User user);
//
   @Delete("DELETE FROM user WHERE id =#{userId}")
   void delete(Long userId);

	
}
