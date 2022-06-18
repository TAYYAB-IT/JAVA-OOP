package Enums;
public enum Pizza {
    Tikka(1),
    Vegitable(2),
    Cheeze(3);
    Integer value=0;
    Pizza(Integer val){
        this.value=val;
    }
    public Integer getValue(){
        return this.value;
    }
}
