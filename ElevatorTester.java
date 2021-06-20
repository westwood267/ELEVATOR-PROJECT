/**
 *
 * @author Mr.Ndawana
 */
public class ElevatorTester {
    
  
    public static void main(String[] args) {
        
         A A = new A('A', 0, 9,-1);
         B B = new B('B', 0, 10, 0);

        
        A.select(7);
        A.select(4);
        A.select(0);

        B.select(50);
        
        B.select(10);
        B.select(5);
        B.select(9);
        
        System.out.println(A.getPosition());
        System.out.println(B.getPosition());
        
        
    }
    
}
