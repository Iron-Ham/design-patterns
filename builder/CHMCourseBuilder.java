package builder;

/**
 * A concrete builder
 */
 
public class CHMCourseBuilder extends CourseBuilder
{
   public void buildDesignator() {
      course.setDesignator("CHM");
   }
   
   public void buildObjective() {
      course.setObjective("Be able to conduct lab experiments");
   }
   
   public void buildGradingPolicy(){
      course.setGradingPolicy("lab reports 50%, exams 50%");
   }
}
