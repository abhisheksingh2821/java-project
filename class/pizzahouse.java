 import java.util.*;
abstract class pizza
        {
                String name;
                
                public void prepare()
                    
                    {
                        System.out.println("adding topping");
                    }
                    
                public void bake()
                    
                    {
                        System.out.println("baking pizza");
                    }
                    
                     
                public void pack()
                    
                    {
                        System.out.println("packing pizza");
                    }
                
                
                public abstract void deliver();
     
                
        }
 

class cheesepizza extends pizza
    {
        cheesepizza (String name)
        {
            this.name = name;
        }
public void deliver()
        {
            prepare();
            
            bake();
            
            pack();
            
              System.out.println(this.name + "pizza is ready");
                       
        }
        }
    
    
class vegpizza extends pizza
    {
        vegpizza (String name)
        {
            this.name = name;
        }
    
      public  void deliver()
        {
            prepare();
            
            bake();
            
            pack();
            
              System.out.println(this.name + "pizza is ready");
                       
        }
        
     }
     
class paneerpizza extends pizza
    {
        paneerpizza (String name)
        {
            this.name = name;
        }
    
     public void deliver()
        {
            prepare();
            
            bake();
            
            pack();
            
              System.out.println(this.name + "pizza is ready");
                       
        }
        
    }
    
    
class pizzafactory
    {
        static pizza p;
        
        public static pizza getpizza(String name)
        {
            if(name.equals("cheese"))
                {
                p = new cheesepizza(name);
                }
                
            if(name.equals("veg"))
                {
                p = new vegpizza(name);
                }
                
            if(name.equals("paneer"))
                {
                p = new paneerpizza(name);
                }
                
                return p;
        }
        
    }
    
    
    public class pizzahouse 
        {
            public static void main(String [] args)
                {
                    pizza p;
                    
                    String name;
                    
                    Scanner sc = new Scanner(System.in);
                    
                    System.out.println("which type of pizza u want");
                    
                    name = sc.next();
                    
                    p = pizzafactory.getpizza(name);
                    
                    p.deliver();
                    
                    System.out.println(p);
                
                }
        }
    
    
    
    
    
    
    