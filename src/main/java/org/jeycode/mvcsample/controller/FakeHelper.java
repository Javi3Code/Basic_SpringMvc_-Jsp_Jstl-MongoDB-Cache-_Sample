package org.jeycode.mvcsample.controller;

import java.util.Set;

import org.jeycode.mvcsample.model.ProgrammingLanguage;
import org.jeycode.mvcsample.model.Student;
import org.jeycode.mvcsample.model.Teacher;

public interface FakeHelper
{

      default void setTeacherFakeValues(Teacher teacher)
      {
            teacher.setAge(23);
            teacher.setName("Dorothy");
            teacher.setSurname("Martin García");
            teacher.setTeacherDescription("Profesora de programación multiplataforma, especializada en desarrollo mobile."
                                    + "Se caracteriza por su buen hacer. Muy querida entre el alumnado.");
            ProgrammingLanguage javascript = new ProgrammingLanguage("Javascript",2);
            ProgrammingLanguage csharp = new ProgrammingLanguage("C#",4);
            ProgrammingLanguage java = new ProgrammingLanguage("Java",6);
            ProgrammingLanguage python = new ProgrammingLanguage("Python",2);
            Student studen2 = Student.builder()
                                     .name("Pepe")
                                     .age(23)
                                     .grade(8)
                                     .build();
            Student student1 = Student.builder()
                                      .name("Lola")
                                      .age(23)
                                      .grade(8)
                                      .build();
            teacher.setPrLanguages(Set.of(python,java,csharp,javascript));
            teacher.setStudents(Set.of(student1,studen2));
      }
}
