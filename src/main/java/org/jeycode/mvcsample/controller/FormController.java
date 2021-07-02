package org.jeycode.mvcsample.controller;

import java.util.Set;

import org.jeycode.mvcsample.model.Student;
import org.jeycode.mvcsample.model.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class FormController
{

      @GetMapping("/firstSample")
      public String formPage(@ModelAttribute(binding = true, name = "teacher") Teacher teacher)
      {

            return "formPage";
      }

      @GetMapping("/dataTable")
      public String formDataTable(Set<Student> students)
      {
            return "formDataTable";
      }
}
