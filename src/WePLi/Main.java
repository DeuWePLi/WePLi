package WePLi;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import Controller.UserController;
import Entity.Song;


/**
 *
 * @author Donghyeon <20183188>
 */
public class Main {
    public static void main(String[] args) {
        //UserRepository ur = new UserRepository();
        
        LoginJFrame lj = new LoginJFrame();
        UserController uc = new UserController(lj);
    }
}
