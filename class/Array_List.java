class Arraylist 
    {
        private int x[];
        
        private int index;
        private int size;
        
        Arraylist (int size)
        {
                 
                x = new int[size];
                
                index=0;

                this.size = size ;
        }
      
        
        public void add(int data)
        {
        
        if(index == this.size-1)
        {
            int temp[] = x;
            this.size = this.size * 2 ;
            
            x = new int[this.size] ;
            
            for( int i =1;i<=index ;i++)
                {
                    x[i] = temp[i];
                
                }
            index++;
            x[index]= data;
               
        }
        else
        {
        index++;
        
        x[index] = data;
        
        }
    }
 
    public void traverse()
    
        {
            if(index== -1)
            {
            System.out.println("List is empty");
            }
            else
            {
                
            for(int i=1;i<=index;i++)
                {
                    System.out.println(x[i]);         
                }
            }
        
        }
}
    
public class Array_List
    {
        public static void main (String args [])
        
            {
                Arraylist l = new Arraylist(5);
            
                for(int i =1;i<=5;i++)
                {
                    l.add(i*10);
                }
             
                l.traverse();
                l.add(5);
                l.traverse();
            }
    }