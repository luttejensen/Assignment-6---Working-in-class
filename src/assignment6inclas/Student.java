/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6inclas;

import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class Student
{
    
    private List<GradeInfo> gradeReport;
    private String education;

    /**
     * Get the value of education
     *
     * @return the value of education
     */
    public String getEducation()
    {
        return education;
    }

    
    /**
     * Get the value of gradeReport
     *
     * @return the value of gradeReport
     */
    public List<GradeInfo> getGradeReport()
    {
        return gradeReport;
    }

}
