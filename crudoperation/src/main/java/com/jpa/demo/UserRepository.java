package com.jpa.demo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface UserRepository extends CrudRepository<User, Integer> 
{
     public List<User> findByName(String name);
     //jpa query
    // @Query("select u from User u")
    // public List<User> getAllUser();
     
     @Query("select u from User as u where u.name= :name and u.id= :id")
     public List<User> getUserByName(@Param("name") String name,@Param("id") int id);
     
     @Query("select u from User u where length(u.name)>:let")
     public List<User> getLength(@Param("let") int let);
     
     
     //Sql or Native query
     @Query(value = "select * from User u", nativeQuery=true)
     public List<User> getAllUser();
     
     
     
     
     
}
