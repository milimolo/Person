/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package person;

/**
 *
 * @author bonde
 */
public class Person
{
    protected int id;
    protected String name;
    protected String email;
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        TestClass tester = new TestClass();
        tester.printPerson();
    }
    
    
    public Person(int id, String name)
    {
        this.id = id;
        this.name = name;
    }
            
    public int getId()
    {
        return id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public String getEmail()
    {
        return email;
    }
    
    public void setName()
    {
        name = "";
    }
    
    public void setEmail(String email)
    {
        this.email = email;
    }
    
    @Override
    public String toString()
    {
        return id +"      " + email + "       " + name;
    }
    
}
