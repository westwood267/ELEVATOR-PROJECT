/*
 * This is the abstract class which will extend all the elevators 
 */

/**
 *
 * @author Mr.Ndawana
 */
public abstract class Elevator {
    
    /*The name of the elevator*/
    
    protected char name;
    
    /*The current floor the elevator is on, for the sake of simplicity I will default to 0*/
    
    protected int currentPosition;
    
    /*A method to get the currentPosition*/
    
    public int getPosition()
        {
            return currentPosition;
        }
    
    /*Accessible floors*/
    
    protected int maxFloor;
    protected int minFloor;
    
    /*The floor where the elevator should go*/
    
    protected int destination;
    
    /*A method to open the doors*/
    
    public void open()
        {
            System.out.println("Open doors");
        }
    
    /*A method to close the doors*/
    
    public void close()
        {
            System.out.println("Close doors");
        }
    
    /*A method to move the elevator*/
    
    public void move(int destination)
        {
            this.destination = destination;
            
            if(destination > currentPosition)
                {
                    for(int i = currentPosition; i <= destination; i++)
                        {
                            System.out.println(name + " : " + i);
                        }
                    open();
                }
            
            else
                {
                    for(int i = currentPosition; i >= destination; i--)
                        {
                            System.out.println(name + " : " + i);
                        }
                    open();
                }
            
            currentPosition = destination;
        }
    
    /*A method to select a floor when inside the elevator*/
    
    public void select(int input)
        {
           if(input <= maxFloor && input >= minFloor)
            {
                move(input);
                close();
            }
            
              
        }
    
    /*A method that allows elevators to receive external requests*/
    
    public void Call(int origin)
        {
            
        }
            
}
