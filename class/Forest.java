 public class Forest
                
                {
            
                public  static class Lion
                {
                private String name ="Sheru";
                private static Lion l ;
                private Lion()
                {
                    
                }
                
                public static Lion getLion()
                {
                    if(l==null)
                    {
                    l = new Lion();
                    return l;
                    }
                    else
                    {
                    return l;
                    }
                }
 
                public String getName()
                {
                 return name;   
                }
                
                public String setName(String name)
                {
                this.name=name;
                return name;
                }
                }
                public static void main (String [] args)
                {
                    Lion l1 = Lion.getLion();
                    System.out.println(l1.getName());
                    
                    Lion l2 = Lion.getLion();
                    System.out.println(l2.getName());
                    
                    if(l1==l2)
                    {
                    
                     System.out.println("true");

                    }
                }
 
    }
 