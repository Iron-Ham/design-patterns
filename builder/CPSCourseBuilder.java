package builder;

/**
 * A concrete builder
 */
 
public class CPSCourseBuilder extends CourseBuilder
{
   public void buildDesignator() {
      course.setDesignator("CPS");
   }
   
   public void buildObjective() {
      course.setObjective("Be able to analyze algorithms");
   }
   
   public void buildGradingPolicy(){
      course.setGradingPolicy("programs 40%, exams 60%");
   }
}
