package applications;
import interfaces.IPluginsAppPlugin;
import interfaces.IShape;
import rectanglePlugin.Rectangle;
import squarePlugin.Square;
import trapezePlugin.Trapeze;
import trianglePlugin.Triangle;

import java.util.ArrayList;

import circlePlugin.Circle;
public class ApplicationMenu{
    
    private PluginManager pluginMan;
    private Menu mainMenu = null;
    public ApplicationMenu(PluginManager pluginMan)
    {
        this.pluginMan = pluginMan;                
    }
    
    public void load()
    {
        pluginMan.loadPlugins("/plugins");
       ArrayList<IMenuItem> menuItems = new ArrayList();
        
        int shortCut = 1;
        ArrayList<IPluginsAppPlugin> plugins = pluginMan.getPlugins();
        
        for (int i = 0 ; i < plugins.size(); i++)
        {      
        	ArrayList<IPluginsAppPlugin> currentPlugin = (ArrayList<IPluginsAppPlugin>) plugins.get(i); 
           MenuItem currentItem = new MenuItem(plugins.get(i).getDisplayText(), shortCut++, (parameters)->{
               IShape shape = ((IPluginsAppPlugin) currentPlugin).getShape();
               shape.read();
           });
           menuItems.add(currentItem);
       
        }
        mainMenu = new Menu("Main Menu", -1, menuItems);
        
        
    }
    
    public void execute()
    {
        mainMenu.execute();
    }

	
    
}
