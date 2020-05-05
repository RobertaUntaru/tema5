package applications;

import java.util.ArrayList;
import interfaces.IShape;
import java.util.*;
import circlePlugin.Circle;
import squarePlugin.Square;
import trianglePlugin.Triangle;
import trapezePlugin.Trapeze;
import rectanglePlugin.Rectangle;

public class Main{
	public static void main(String[] args)
 	{
    	 System.out.println("->>>>Draw shapes<<<<-");
    	 Menu mainMenu = initalizeMenu();
    	 mainMenu.execute();
 	}
		private static Menu initalizeMenu() {
		
		 Circle circle = new Circle();			//circle
		 Triangle triangle = new Triangle();	//triangle
		 Square square =  new Square();		    //square
		 Rectangle rectangle = new Rectangle(); //rectangle
		 Trapeze trapeze = new Trapeze();		//trapeze
		 
		 ArrayList<IMenuItem> mainMenuItems = new ArrayList<IMenuItem>();
		 ArrayList<IMenuItem> addMenuItems = new ArrayList<IMenuItem>();
		 ArrayList<IShape> shapesList = new ArrayList<IShape>();
		 ArrayList<IMenuItem> drawMenuItems = new ArrayList<IMenuItem>();
	     addMenuItems.add(new MenuItem("Circle",1,(parameters)->
	     {shapesList.add(circle);
	      circle.draw();
	     }));
	     addMenuItems.add(new MenuItem("Square",2,(parameters)->
	     {shapesList.add(square);
	      square.draw();
	     }));
	     addMenuItems.add(new MenuItem("Triangle",3,(parameters)->
	     {shapesList.add(triangle);
	      triangle.draw();
	     }));
	     addMenuItems.add(new MenuItem("Rectangle",4,(parameters)->
	     {shapesList.add(rectangle);
	      rectangle.draw();
	     }));
	     addMenuItems.add(new MenuItem("Trapeze",5,(parameters)->
	     {shapesList.add(trapeze);
	      trapeze.draw();
	     }));
	     drawMenuItems.add(new MenuItem("Circle",1,(parameters)->{circle.draw();}));
	     drawMenuItems.add(new MenuItem("Square",2,(parameters)->{square.draw();}));
	     drawMenuItems.add(new MenuItem("Triangle",3,(parameters)->{triangle.draw();}));
	     drawMenuItems.add(new MenuItem("Rectangle",4,(parameters)->{rectangle.draw();}));
	     drawMenuItems.add(new MenuItem("Trapeze",5,(parameters)->{trapeze.draw();}));
	     mainMenuItems.add(new Menu("Add",1,addMenuItems));
	     mainMenuItems.add(new MenuItem("Modify",2,null));
	     mainMenuItems.add(new MenuItem("Delete",3,null));
	     mainMenuItems.add(new Menu("View board",4,drawMenuItems));
	     
	     return new Menu("Main Menu",0,mainMenuItems);
	     }
	     
	
}
