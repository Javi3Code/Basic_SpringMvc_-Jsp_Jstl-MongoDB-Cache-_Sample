package org.jeycode.mvcsample;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@Configuration
@EnableMongoRepositories(basePackages = "org.jeycode")
public class MogoConfig
{

}
