package builder;

/**
 * A "director" responsible for constructing course
 *
 */

public class CurriculumDirector
{
   private CourseBuilder builder;
   
   public void setBuilder(CourseBuilder b) {
	   builder = b;
   }
   
   public Course getCourse() {
	   return builder.getCourse();
   }
   
   public void constructCourse() {
      builder.makeNewCourse();
      builder.buildDesignator();
      builder.buildObjective();
      builder.buildGradingPolicy();
   }
}
