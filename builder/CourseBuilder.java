package builder;

/**
 * This abstract class leaves course-specific contents
 * to specific course builders.
 *
 * It is an abstract builder (in the builder design pattern).
 */

public abstract class CourseBuilder
{
   protected Course course;
   
   public void makeNewCourse() {
	   course = new Course();
   }
   
   public Course getCourse() {
	   return course;
   }
   
   public abstract void buildDesignator();
   
   public abstract void buildObjective();
   
   public abstract void buildGradingPolicy();
}
