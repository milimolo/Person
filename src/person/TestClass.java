/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;
    
import java.util.ArrayList;

/**
 *
 * @author bonde
 */
public class TestClass
{
    ArrayList<Person> people = new ArrayList<Person>();
    Person mads = new Person(1, "  Mads Jørgensen");
    Person jørgen = new Person(2, "Jørgen Jespersen");
    Person jesper = new Person (3, "Jesper Madsen");
    
    Teacher teacherJohn = new Teacher(101, "John Bentson", "JB");
    Teacher teacherJack = new Teacher(102, "Jack Sparrow","Captain Jack Sparrow");
    
    
    //Lav personerne her
    
    public void printPerson()
    {
        for (int i = 0; i < people.size(); i++)
        {
            System.out.println(people.get(i));
        }
    }
    
    
    public TestClass()
    {
        mads.setEmail("Mads@email.dk");
        jørgen.setEmail("jørgen@email.dk");
        jesper.setEmail("jesper@email.dk");
        people.add(mads);
        people.add(jørgen);
        people.add(jesper);
        
        teacherJohn.setEmail("JB@email.dk");
        teacherJohn.addSubject("Programming");
        people.add(teacherJohn);
        teacherJack.setEmail("JS@email.dk");
        teacherJack.addSubject("Pirate class");
        people.add(teacherJack);
        
        //indsæt personer i array her.
        //Når du kommer til teachers så brug getEmail etc.
    }

    
        
        
}
