package Classes;

public class AC extends Electronics{
    public AC(){this.currunt_value=16;}
@Override
public void On() {
    System.out.print("\n AC");
    super.On();
}
@Override
public void Off() {
    System.out.print("\n AC");
    super.Off();
}
@Override
public void next() {
    if(this.currunt_value<27) //27 MAX TEMP 16 MIN TEMP
    {
        super.next();
        System.out.println("Current Temp is "+ this.currunt_value);
    }
    else{
        System.out.println("Current Temp is Already at Peak "+ this.currunt_value);
    }
    
}
@Override
public void prev() {
    if(this.currunt_value>16)
    {
    super.prev();
    System.out.println("Current Temp is "+ this.currunt_value);
    }
    else{
        System.out.println("Current Temp is Already at Lowest  "+ this.currunt_value);
    }

}

}
