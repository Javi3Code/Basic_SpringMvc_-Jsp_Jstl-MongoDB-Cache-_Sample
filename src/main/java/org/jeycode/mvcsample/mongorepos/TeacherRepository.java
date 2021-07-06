package org.jeycode.mvcsample.mongorepos;

import org.jeycode.mvcsample.model.Teacher;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TeacherRepository extends MongoRepository<Teacher,String>
{

}
