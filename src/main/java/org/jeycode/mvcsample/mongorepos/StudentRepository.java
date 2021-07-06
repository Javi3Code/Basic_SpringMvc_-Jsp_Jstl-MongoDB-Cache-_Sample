package org.jeycode.mvcsample.mongorepos;

import java.util.List;
import java.util.Set;

import org.jeycode.mvcsample.model.Student;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends MongoRepository<Student,String>
{

      List<Student> findAllById(Set<String> id);

}
