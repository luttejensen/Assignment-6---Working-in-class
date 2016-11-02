/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6inclas;

/**
 *
 * @author jeppjleemoritzled
 */
public class MainMenu extends Menu
{
    public MainMenu()
    {
        super(
                " ---### Main menu ###--- ", 
                
                new String[]{
                    "Option 1", 
                    "Option 2", 
                    "Option 3"}
             );
    }

    @Override
    protected void doAction(int option)
    {
        if (option==EXIT_OPTION)
            System.exit(0);
        
        if(option==1)
        {
                System.out.println("Option 1 selected");
        }
        else if(option==2)
        {
                System.out.println("Option 2 selected");
        }
        else if(option==3)
        {
                System.out.println("Option 3 selected");
        }
        else
        {
            throw new UnsupportedOperationException("Options doAction not found");
        }
        
        pause();
    }
    
}
