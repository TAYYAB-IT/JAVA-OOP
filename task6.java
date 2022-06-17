import Classes.*;
public class task6 {
    public static void main(String[] args) {
         
          Electronics device=new Electronics();
          
          if(!device.isOn()){
           device.On();    // tv is on
          }
          //device.next();  // Current channel is 1
          device.prev();  // current channel is 99
          
          
          device.Off();  // tv is off
          
          Electronics device2 = new AC();
        
         if(!device2.isOn()){
           device2.On();    // ac is on
          }
          device2.next();  // Current temp is 18
          device2.prev();  // current temp is 17
          
          device2.Off();  // Ac is off
          
        
    }
}
