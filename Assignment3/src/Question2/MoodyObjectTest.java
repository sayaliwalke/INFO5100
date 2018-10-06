package Question2;
public class MoodyObjectTest 
{
        public static void main(String[] arg)
        {
           SadObject sadObject= new SadObject();
           HappyObject happyObject= new HappyObject();
           Psychiatrist psychiatrist= new Psychiatrist();
           
           
           psychiatrist.examine(happyObject);
           psychiatrist.observe(happyObject);
           psychiatrist.examine(sadObject);
           psychiatrist.observe(sadObject);
           System.out.println(" Press any key to continue.....");
        }   
        
}
    
