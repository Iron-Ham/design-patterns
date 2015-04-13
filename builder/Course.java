package builder;

/**
 * A course has 
 *
 */

public class Course
{
   private String designator;
   private String objective;
   private String gradingPolicy;
   
   public void setDesignator(String d) { designator = d; }
   
   public void setObjective(String obj) { objective = obj; }
   
   public void setGradingPolicy(String g) { gradingPolicy = g; }
   
   public String toString() {
       return String.format("%s\n%s\n%s\n",
    		   designator, objective, gradingPolicy);
   }
}
