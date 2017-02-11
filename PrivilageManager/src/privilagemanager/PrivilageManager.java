/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privilagemanager;


import java.util.HashMap;
import java.util.Scanner;


public class PrivilageManager {

    /**
     * @param args the command line arguments
     */
    static HashMap<String, Action> actionMap = new HashMap<String,Action>();
    static HashMap<String, User> userMap = new HashMap<String, User>();
            
    public static void main(String[] args) {
        // TODO code application logic here
        
        UserRole readRole = new UserRole(UserRole.RoleDef.READ);
        UserRole writeRole = new UserRole(UserRole.RoleDef.WRITE);        
        
        while(true){
           
            System.out.println("\n1. Add Action");
            System.out.println("2. Add User");
            System.out.println("3. Execute");
            System.out.println("4. Exit\n");
            
            System.out.print("Enter Option: ");       
            Scanner sc = new Scanner(System.in);
            String input = sc.next();
            System.out.print("\n");
            
            if(input.equals("1")){
               // create action
                System.out.print("Enter Action Name: ");
                String actionName = sc.next();
                System.out.print("Enter Min Role: ");
                String role = sc.next();
                if(role.equals("R"))
                {
                   CreateAction(actionName, readRole);
                }
                else if(role.equals("W"))
                {
                   CreateAction(actionName, writeRole);              
                }
            }
            else if(input.equals("2")){
                System.out.print("Enter User Name: ");
                String userName = sc.next();
                System.out.print("Enter User Role: ");
                String role = sc.next();
                if(role.equals("R"))
                {
                   CreateUser(userName, readRole);
                }
                else if(role.equals("W"))
                {
                   CreateUser(userName, writeRole);              
                }
            }
            else if(input.equals("3")){
                System.out.print("Enter User Name: ");
                String userName = sc.next();
                System.out.print("Enter Action Name: ");
                String actionName = sc.next();
                
                Execute(userName, actionName);
            }
            
            else if(input.equals("4")){
                break;
            }
        }
    }
    
    public static void CreateAction(String sActionName, UserRole role){
        Action action = new Action(sActionName, role);
        actionMap.put(sActionName, action);
    } 
    
    public static void CreateUser(String userName, UserRole role){
        User user = new User(userName, role);
        userMap.put(userName, user);
    } 
     
    public static boolean Execute(String userName, String actionName){
        Action action = actionMap.get(actionName);
        User usr = userMap.get(userName);

        if(action == null || usr == null){
            System.out.print("Invalid inputs");
            return false;
        }
         
        if(usr.getUserRole().getRoleDef().ordinal() > action.getMinRole().getRoleDef().ordinal()){
            System.out.print("User privilage is greater than action privilage");
            
            
        } 
        else if(usr.getUserRole().getRoleDef().ordinal() == action.getMinRole().getRoleDef().ordinal()){
            System.out.print("User privilage is equal to action privilage");
        }
        else{
            System.out.print("User privilage is less than action privilage");
        }
        
        return true;
    }
}

