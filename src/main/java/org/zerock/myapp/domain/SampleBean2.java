package org.zerock.myapp.domain;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.io.Serial;
import java.io.Serializable;

@Data
@Slf4j
public class SampleBean2 implements Serializable {
    @Serial private static final long serialVersionUID = 1L;

    private String name;
    private Integer age;

    void xxx() {
        log.trace("xxx() invoked.");
    } // xxx

    void yyy() {
        log.trace("yyy() invoked.");
    } // yyy
} // end class
