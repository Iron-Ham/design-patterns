package builder;

/**
 * This application uses the builder design pattern to
 * construct a course. It selects a specific builder
 * through the "director", and then constructs a course
 * via the director.
 */

import java.util.Scanner;

public class CurriculumDevelopmentApplication
{
   public static void main(String[] args)
   {
       Scanner s = new Scanner(System.in);
       System.out.print("Which department (CPS or CHM)? ");
       String dept = s.nextLine();
       
       CurriculumDirector director = new CurriculumDirector();
       
       if (dept.equals("CPS"))
           director.setBuilder(new CPSCourseBuilder());
       else
           director.setBuilder(new CHMCourseBuilder());
       
       director.constructCourse();
       Course course = director.getCourse();
      
       System.out.println(course);
   }
}
