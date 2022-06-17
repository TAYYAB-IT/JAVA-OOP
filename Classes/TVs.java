package Classes;
import Interfaces.Numpad;

public class TVs extends Elctro implements Numpad {
    public TVs(){this.currunt_value=0;}
    @Override
public void On() {
    System.out.print("\n TV");
    super.On();
}
@Override
public void Off() {
    System.out.print("\n TV");
    super.Off();
}
@Override
public void next() {
    if(this.currunt_value<99) //27 MAX TEMP 16 MIN TEMP
    {
        super.next();
       
    }
    else{this.currunt_value=0;}
    System.out.println("Current Channel is "+ this.currunt_value);
}
@Override
public void prev() {
   if (this.currunt_value>0){
        super.prev();
    }
    else{this.currunt_value=99;}
    System.out.println("Current Channel is "+ this.currunt_value);

}
@Override
public void one() {
    
this.currunt_value=1;
System.out.println("Current Channel is "+ this.currunt_value);
}
@Override
public void two() {
    // TODO Auto-generated method stub
    this.currunt_value=2;
System.out.println("Current Channel is "+ this.currunt_value);
}
@Override
public void three() {
    // TODO Auto-generated method stub
    this.currunt_value=3;
System.out.println("Current Channel is "+ this.currunt_value);
}
@Override
public void seek(Integer num) {
    // TODO Auto-generated method stub
    this.currunt_value=num;
System.out.println("Current Channel is "+ this.currunt_value);
}
}
