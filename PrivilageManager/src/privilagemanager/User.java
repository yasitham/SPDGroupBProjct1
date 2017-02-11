/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package privilagemanager;

public class User {
 
    private
        String userName;
        UserRole role;
        UserRole originalRole;
    public 
        User(String userName, UserRole role)
        {
            this.userName = userName;
            this.role = role;
            this.originalRole = role;
        }

        UserRole getUserRole(){
            return role;
        }

        UserRole getOriUserRole(){
            return originalRole;
        }

        void setUserRole(UserRole newRole){
            role = newRole;
        }
        void resetUserRole(){
            role = originalRole;
        }
        String getUserName(){
            return userName;
        }
    
}
