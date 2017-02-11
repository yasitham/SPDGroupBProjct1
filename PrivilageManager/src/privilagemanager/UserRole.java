/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privilagemanager;

/**
 *
 * @author yasitham
 */
public class UserRole {
        public enum RoleDef{READ, WRITE}
        private
                RoleDef roledef;
        
        public
               UserRole (RoleDef roleDef){
                   this.roledef = roleDef;
               }
               
               RoleDef getRoleDef(){
                   return roledef;
               }
}
