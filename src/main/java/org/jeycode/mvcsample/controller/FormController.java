package org.jeycode.mvcsample.controller;

import java.util.Locale;
import java.util.Set;

import org.jeycode.mvcsample.model.Student;
import org.jeycode.mvcsample.model.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Controller
@RequiredArgsConstructor
public class FormController implements FakeHelper
{

      @GetMapping("/firstSample")
      public String formPage(@ModelAttribute(binding = true, name = "teacher") Teacher teacher,
                             @ModelAttribute(binding = true, name = "student") Student student,Locale locale,BindingResult result)
      {
            setTeacherFakeValues(teacher);
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
