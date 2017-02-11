/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privilagemanager;

import privilagemanager.*;
/**
 *
 * @author yasitham
 */
public class Action {
    private
        String actionName;
        UserRole minReqRole;
    
    public
        Action(String sActionName, UserRole role) {
             this.actionName = actionName;
             this.minReqRole = role; //To change body of generated methods, choose Tools | Templates.
        }
        
        UserRole getMinRole(){
            return minReqRole;
        }
}
