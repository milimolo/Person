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
public class Student extends Person
{
    ArrayList<GradeInfo> gradeReport = new ArrayList<GradeInfo>();
    private String education;
    
    
    public Student(int id, String name, String education)
    {
        super(id, name);
        this.education = education;
    }
    
}
