/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package assignment6inclas;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jeppjleemoritzled
 */
public class Test
{
    List<Person> persons;
    
    public void startTest()
    {
        persons = new ArrayList<>();
        Person daniel = new Person(0, "Daniel");
        daniel.setEmail("daniel666@hotmail.com");
        Person jeppe = new Person(1337, "Jeppe");
        jeppe.setEmail("jle@easv.dk");
        Person peter = new Person(666, "Peter");
        peter.setEmail("pgn@easv.dk");
        
        persons.add(daniel);
        persons.add(jeppe);
        persons.add(peter);
        
        Teacher bent = new Teacher(1, "Bent", "bht");
        bent.setSalary(34543);
        bent.addSubject("Programming");
        bent.addSubject("Databases");
        
        Teacher stig = new Teacher(2, "Stig", "ssi");
        stig.setSalary(32434);
        stig.addSubject("ITO");
        stig.addSubject("Unity game programming");
        
        persons.add(bent);
        persons.add(stig);
        
        Student mads = new Student(10, "Mads", "CS");
        GradeInfo gi1 = new GradeInfo("SCO", 7);
        GradeInfo gi2 = new GradeInfo("SDE", 2);
        GradeInfo gi3 = new GradeInfo("ITO", 10);
        GradeInfo gi4 = new GradeInfo("Unity", 10);
        mads.addGrade(gi1);
        mads.addGrade(gi2);
        mads.addGrade(gi3);
        mads.addGrade(gi4);
        
        persons.add(mads);
        
        System.out.println("ID\tNAME\tEMAIL\t\tINITIALS\tSALARY\tMAIN");
        for (Person person : persons)
        {
            System.out.println(person.toString());
        }
    }
}
