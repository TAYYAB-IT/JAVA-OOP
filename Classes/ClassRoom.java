package Classes;

import java.util.LinkedList;

public class ClassRoom {
    class Floor{
        Boolean heat_resistance;
        Boolean durable;
        public void setter(Boolean heat_resistance,Boolean durable){
            this.heat_resistance=heat_resistance;
            this.durable=durable;
        }
        public void getter(){
            System.out.println("Heat resistance::"+this.heat_resistance);
            System.out.println("Durable::"+this.durable);
        }
    }
    class Wall{
        String color;
        public void setter(String color){
            this.color=color;
        }
        public void getter(){
            System.out.println("Color::"+this.color);
        }

    }
    class Fan{
        Double rotations;
        String color;
        public void setter(Double rotations,String color){
            this.rotations=rotations;
            this.color=color;
        }
        public void getter(){
            System.out.println("Rotations::"+this.rotations);
            System.out.println("Color::"+this.color);
        }
    }
    Double length;
    Double width;
    Wall wall=new Wall();
    Floor flr=new Floor();
    LinkedList<Fan> fans=new LinkedList<Fan>();
    public void setter(Double length,Double width){
        this.length=length;
        this.width=width;
    }
    public void getter(){
        System.out.println("------------ClassRoom-----------------");
        System.out.println("Length::"+this.length+"m  Width::"+this.width+"m");
        System.out.println("---------------WALL------------------");
        this.wall.getter();
        System.out.println("---------------Floor------------------");
        this.flr.getter();
        System.out.println("---------------Fans------------------");
        System.out.println("Total Fans::"+this.fans.size());
        for(Fan fn:fans){
            fn.getter();
        }
    }
    public void set_wall(String color){
       this.wall.setter(color);
    }
    public void set_floor(Boolean heat_resistance,Boolean durable){
        this.flr.setter(heat_resistance, durable);
    }
    public void Add_Fan(Double rotations,String color){
         Fan f=new Fan();
         f.setter(rotations, color);
         this.fans.add(f);
    }
}
