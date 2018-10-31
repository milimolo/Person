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
public class Teacher extends Person
{
    ArrayList<String> subjects = new ArrayList<String>();
    
    private String initials;
    private double salary;
    
    public Teacher (int id, String name, String initials)
    {
        super(id, name);
        this.initials = initials;
    }
    
    public ArrayList<String> getSubjects()
    {
        return subjects;
    }
    
    public String getInitials()
    {
        return initials;
    }
    
    public double getSalary()
    {
        return salary;
    }
    
    public void addSubject(String subject)
    {
        subjects.add(subject);
    }
    
    public void setSalary(double salary)
    {
        this.salary = salary;
    }
    
    public String toString()
    {
        return super.toString() + "       " + initials + "       " + subjects.get(0);
    }
}
