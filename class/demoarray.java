                          import java.util.*;
                          class student
                            {
                                private int id;
                          
                                student()
                                    {
                                    this.id=1465;
                                    }     
                        
                                student (int id)
                                    {
                                    this.id = id;
                                    }
                                    
                                public int getid()
                                    {
                                    return id;
                                    }
                                    
                                public void setid(int id)
                                    {
                                    this.id = id;
                                    }
                                    
                                public boolean equals(Object o)
                                    {
                                    student s = (student) o;
                                    
                                    if(id == s.getid()) 
                                        {
                                        return true;
                                        }
                                    else
                                        {
                                        return false;
                                        }
                                    }
                            }
                            
                          public class demoarray
                          {
                                public static void main(String[] args) 
                                    {
                        
                                    List <student> l = new ArrayList<>();
                                    
                                    //<student> means generic for making type safe
                                    
                                    // List l = new ArrayList(); this is not type safe
                                
                                for(int i = 1;i<=10;i++)
                                  
                                    {
                                    l.add(new student(i * 10));
                                    }
                                l.add(new student (20));
                                l.remove(6);
                                
                                System.out.println(l.remove(new student(20)));
                                    
                                   
                                System.out.println("contains :"+ l.contains(new student(60)));    
                            
                                for(student s : l)
                                  
                                    {
                                    System.out.print(s.getid() + " ");
                                    }
                                    
                                     Iterator t = l.iterator();
                                     System.out.println("using iterator");
                                while (t.hasNext())
                                    {  
                                        System.out.print(((student)t.next()).getid()+ " ");
                                    }
                                    }
                            }
                          