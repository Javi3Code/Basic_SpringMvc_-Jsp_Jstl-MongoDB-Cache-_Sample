package org.jeycode.mvcsample.model;

import java.util.Set;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

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
@Document("Teacher")
public final class Teacher extends BasicPersonData
{

      @MongoId
      private String id;
      private String teacherDescription;
      private Set<ProgrammingLanguage> prLanguages;
      private Set<String> students;
}
