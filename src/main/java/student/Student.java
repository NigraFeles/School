/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package student;

/**
 *
 * @author qa
 */
public class Student {
    private String firstName;
    private  String lastName;
    private int yearOfBirth;
        
        
 public Student () {
    this.firstName = "not defined";
    this.lastName = "not defined";
    this.yearOfBirth = 0;
}

public Student(String firstName, String lastName, int yearOfBirth) {
  this.firstName = firstName;
  this.lastName = lastName;
  this.yearOfBirth = yearOfBirth;
  
} 

public String getFirstName () {
    return firstName;
     
}

public void setFirstName (String firstName) { 
this.firstName = firstName;
}

public String getLastName () {
    return lastName;
   
    
}

public void setLastName (String lastName) { 
this.lastName = lastName;
}
        
public int getYearOfBirth() {
    return yearOfBirth;
}

public void setYearOfBirth (int yearOfBirth) {
this.yearOfBirth = yearOfBirth;
}
}



 /*Napraviti barem 2 konstruktora, jedan ne parametrizovani, jedan parametrizovani.

 

Napraviti javnu metodu info. Ova metoda treba da ispisuje u konzoli vrednosti atributa firstName, lastName i yearOfBirth. Stoga ona nema nikakvih ulaznih parametara niti treba da vraća neku vrednost.

Poruke se ispisuju u formatu:

First name: Petar

Last name: Petrović

Year of birth: 1990

Napraviti commit sa prigodnom porukom (da je napravljena klasa Student).

*/