package cl.iacc.oop;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Slf4j
@Setter
@Getter
public class DeviceAssignment {

    private String id;
    private Date date;
    private String location;
    private Employee employee;
    private Notebook notebook;

    private void addEmployee(Employee employee) {
        log.info("Agregando empleado codigo:{}", employee.getCode());
    }

    private void addNotebook(Notebook notebook) {
        log.info("Agregando notebook serial:{}", notebook.getSerial());
    }

    private boolean deleteAssignment() {
        log.info("Eliminando asignación");
        return true;
    }
}
