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
    
    public ArrayList<GradeInfo> getGradeReport()
    {
        return gradeReport;
    }
    
    public String getEducation()
    {
        return education;
    }
    
    public double getAverageGrade()
    {
        double average = 0;
        for (GradeInfo gradeInfo : gradeReport)
        {
            gradeInfo.getGrade();
            average = average + gradeInfo.getGrade();
        }
        return average / gradeReport.size();
    }
    
    public int getGrade(String subject)
    {
        for (GradeInfo grade : gradeReport)
        {
            if (grade.getSubject() == subject)
            {
                return grade.getGrade();
            }
        }
        return -1;
    }
    
    public void addGrade(GradeInfo grade)
    {
        gradeReport.add(grade);
    }
    
}
