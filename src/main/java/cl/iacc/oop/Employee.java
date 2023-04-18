package cl.iacc.oop;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
@Getter
public class Employee {

    private String code;
    private String firstName;
    private String lastName;
    private String position;
    private String email;

    private boolean suspend() {
        log.info("Suspendiendo al empleado id:{}, nombre:{}", code, firstName);
        return true;
    }
}
