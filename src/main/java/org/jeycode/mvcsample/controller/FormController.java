package org.jeycode.mvcsample.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FormController
{

      @GetMapping("/firstSample")
      public String formPage()
      {
            return "formPage";
      }
}
