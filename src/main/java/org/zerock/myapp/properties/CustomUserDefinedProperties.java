package org.zerock.myapp.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@Data
@ConfigurationProperties(prefix = "user-defined")
public class CustomUserDefinedProperties {
    private String name;
    private String age;

} // end class
