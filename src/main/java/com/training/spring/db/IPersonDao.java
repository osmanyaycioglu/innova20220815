package com.training.spring.db;

import com.training.spring.common.Person;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface IPersonDao extends CrudRepository<Person,Long> {

    List<Person> findByName(String name);
    List<Person> findByNameAndSurname(String name,String surname);
    List<Person> findByNameAndSurnameOrderBySurname(String name,String surname);
    List<Person> findByNameIn(List<String> name);

    @Query("select p from Person p where p.name=?1")
    List<Person> searchName(String name);

    @Query("select p from Person p where p.name=:is")
    List<Person> searchName2(@Param("is") String name);

    @Query(value = "select * from kisi p where p.name=?1",nativeQuery = true)
    List<Person> searchNativeName(String name);

}
