/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package extraptslabjoecorrales;

/**
 *
 * @author Corra
 */
public class AccountExistsAlready extends Exception{
    
    public AccountExistsAlready(int num){
        super("La cuenta '"+num+"' ya tiene dueño!");
    }
}