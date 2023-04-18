package cl.iacc.oop;

import lombok.Getter;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Setter
@Getter
public class Notebook {

    private String id;
    private String serial;
    private String model;
    private String processorType;
    private String brand;
    private String operatingSystem;

    public boolean unsubscribe() {
        log.info("Dando de baja notebook id:{}, serial:{}", this.id, this.serial);
        return true;
    }

}
