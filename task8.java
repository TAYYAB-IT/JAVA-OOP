import Classes.ClassRoom;

public class task8 {
    public static void main(String[] args) {
        ClassRoom cr=new ClassRoom();
        cr.setter(50.0, 60.0);
        cr.set_floor(true, false);
        cr.set_wall("White");
        cr.Add_Fan(12.0, "Green");
        cr.getter();
    }
}
