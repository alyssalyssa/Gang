/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author uvenu
 */
public abstract class Person {
   
    String name;

    //constructors
    public Person() {
        name ="";
    }
    
    public Person(String name) {
        this.name = name;
    }

    //getter and setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //Overridden toString method
    @Override
    public String toString() {
        return "Person{" + "name=" + name + '}';
    }

    
   
}
