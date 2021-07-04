package org.jeycode.mvcsample.controller;

import java.util.Locale;
import java.util.Set;

import org.jeycode.mvcsample.model.Student;
import org.jeycode.mvcsample.model.Teacher;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

//@Slf4j
@Controller
//@RequiredArgsConstructor
public class FormController implements FakeHelper
{

//      private final MessageSource messsageSource;

      @GetMapping("/firstSample")
      public String formPage(@ModelAttribute(binding = true, name = "teacher") Teacher teacher,
                             @ModelAttribute(binding = true, name = "student") Student student,Locale locale)
      {
            setTeacherFakeValues(teacher);
//            log.info(messsageSource.getMessage("i18n.form.student.name",null,"Mensaje por defecto",locale));
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
            return "suscribeMessageDialog";
      }
}
