/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.consumertask;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import org.w3c.dom.css.CSSPrimitiveValue;


//sual 5


/**
 *
 * @author anara
 */
public class Main {

    public static void main(String[] args) {
        
        
        UserService userService = new UserService();
        userService.create.accept(new User("1","Anar",Gender.MALE));
        userService.create.accept(new User("2","Balay",Gender.MALE));
        System.out.println(userService.getById.apply(1));
        System.out.println(userService.getAllUser.get());
        
        
        
        
        
        
        
        
        
        List<Integer> number  = new ArrayList<>();
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(4);
        
        int[] arr = {1,4,6};
        cs.accept(arr);
        
    
}
    static Consumer<int []> cs = numbers ->{
            for (int i = 0; i < numbers.length;i++) {
                System.out.println(numbers[i]*3); 
            }
            
    };
}
