package Classes;

import Interfaces.Electronics_features;

public class Elctro implements Electronics_features {

    protected Boolean status = false;
    protected Integer currunt_value = 0;

    public Boolean isOn() {
        return this.status;
    }

    public void On() {
        System.out.print((this.status) ? " is Already ON\n" : " is ON\n");
        this.status = true;
    }

    public void Off() {
        System.out.print((!this.status) ? " is Already OFF\n" : " is OFF\n");
        this.status = false;
    }

    public void next() {
        this.currunt_value++;
    }

    public void prev() {
        this.currunt_value--;
    }

}
