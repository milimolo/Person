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
public class GradeInfo
{
    private String subject;
    private int grade;
    
    public GradeInfo(String subject, int grade)
    {
        this.subject = subject;
        this.grade = grade;
    }
    
    public String getSubject()
    {
        return subject;
    }
    
    public int getGrade()
    {
        return grade;
    }
    
    public String toString()
    {
        return subject + "    " + grade;
    }
}
