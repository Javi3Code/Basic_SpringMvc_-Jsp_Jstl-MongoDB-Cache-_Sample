package org.jeycode.mvcsample.model;

import java.util.Set;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.SuperBuilder;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(callSuper = true)
@SuperBuilder
@ToString(callSuper = true)
public final class Teacher extends BasicPersonData
{

      private String teacherDescription;
      private Set<ProgrammingLanguage> prLanguages;
      private Set<Student> students;
}
