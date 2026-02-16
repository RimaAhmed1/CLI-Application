import java.util.ArrayList;
import java.util.Scanner;

public class ApplicationMenu {
    public static void main (String[]args) throws InterruptedException{
        Scanner inputBuffObj=new Scanner(System.in);
        ArrayList <String> customerFeedback=new ArrayList<>();
        int currentFeedbackCount=0;
        boolean mainMenuRunning=true;

        while (mainMenuRunning){
            System.out.println("please selset [1] Feedback & Dashboard & [3] Shutdown: ");
            int userChoice=Integer.parseInt(inputBuffObj.nextLine());
            if(userChoice==1){
                System.out.print("Please enter your comment: ");
                customerFeedback.set(currentFeedbackCount, inputBuffObj.nextLine());
                currentFeedbackCount++;
            } else if(userChoice==2){
                System.out.println("I have selected 2");
                System.out.println("please enter you PIN");
                int adminPin=Integer.parseInt(inputBuffObj.nextLine());

                if(adminPin==2468){
                    System.out.println("Admin PIN is Correct!");
                    for (int currentFeedbackIndex =0;currentFeedbackIndex< customerFeedback.toArray().length;currentFeedbackIndex++){
                        System.out.printf("The value of box %d is: %s",currentFeedbackIndex, customerFeedback.get(currentFeedbackIndex));

                    }
                    {
                        System.out.println("Admin PIN is incorrect!");
                    }

                }
            }
        }
    }
}
