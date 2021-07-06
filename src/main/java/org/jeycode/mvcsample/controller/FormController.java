package org.jeycode.mvcsample.controller;

import java.util.Locale;
import java.util.Set;

import org.jeycode.mvcsample.model.Student;
import org.jeycode.mvcsample.model.Teacher;
import org.jeycode.mvcsample.mongorepos.StudentRepository;
import org.jeycode.mvcsample.mongorepos.TeacherRepository;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class FormController
{

      private final TeacherRepository teacherRepo;
      private final StudentRepository studentRepo;

      @GetMapping("/firstSample")
      public String formPage(@ModelAttribute(binding = true, name = "teacher") Teacher teacher,
                             @ModelAttribute(binding = true, name = "student") Student student,Locale locale)
      {
            teacher = teacherRepo.findAll()
                                 .get(0);
            studentRepo.findAllById(teacher.getStudents())
                       .forEach(std-> log.info("\nstud-> " + std));
            log.info(studentRepo.findAll()
                                .get(0)
                                .toString());
            log.info("student-->" + studentRepo.findById("60e4964eae4818db1be72b6a"));
            log.info("obtenemos data de mongodb: " + teacher.toString());
            return "formPage";
      }

      @GetMapping("/dataTable")
      public String formDataTable(Set<Student> students)
      {
            return "formDataTable";
      }

      @PostMapping("/suscribe")
      public String suscribe(@ModelAttribute(binding = true, name = "student") Student student,Locale locale)
      {
            log.info(student.toString());
            return "studentSuscribedPage";
      }
}
