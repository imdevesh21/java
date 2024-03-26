import java.util.*;
public class weeks {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);

    System.out.println("Enetr the week number (1-7):");
    int weekNumber = sc.nextInt();

    switch (weekNumber) {
            case 1:
                System.out.println("Day of the week: Sunday");
                break;
            case 2:
                System.out.println("Day of the week: Monday");
                break;
            case 3:
                System.out.println("Day of the week: Tuesday");
                break;
            case 4:
                System.out.println("Day of the week: Wednesday");
                break;
            case 5:
                System.out.println("Day of the week: Thursday");
                break;
            case 6:
                System.out.println("Day of the week: Friday");
                break;
            case 7:
                System.out.println("Day of the week: Saturday");
                break;
            default:
                System.out.println("Invalid week number. Please enter a number between 1 and 7.");
        }

        sc.close();

    

    // String dayOfWeek = getDayOfWeek(weekNumber);
    // System.out.println("Day of week:" + dayOfWeek);
    
    

    // sc.close();
  // }

  // public static String getDayOfWeek(int weekNumber) {
  //   String dayOfWeek;

    // switch(weekNumber) {
    //   case 1: dayOfWeek = "Sun"; break;
    //   case 2: dayOfWeek = "Mon"; break;
    //   case 3: dayOfWeek = "Tue"; break;
    //   case 4: dayOfWeek = "Wed"; break;
    //   case 5: dayOfWeek = "Thu"; break;
    //   case 6: dayOfWeek = "Fri"; break;
    //   case 7: dayOfWeek = "Sat"; break;
    //   default:dayOfWeek = "Invalid week number. Please enter a number between 1 and 7.";;
    // }
    // return dayOfWeek;
  }
}
