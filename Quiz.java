import java.net.ResponseCache;
import java.util.Scanner;

import javax.smartcardio.ResponseAPDU;
public class Quiz {
    public static void main(String args[]) {
      Scanner scan = new Scanner(System.in);
      String question[] = new String[10];
    question[0] = "Which of the following is an outdoor hobby?";
    question[1] = "What sport is best known as the king of sports";
    question[2] = "Who is the number 23 in lakers?";
    question[3] = "What are the old jersey number of kobe?";
    question[4] = "What team are champion in NBA 2022";
    question[5] = "Who is the tallest NBA player?";
    question[6] = "What are the meaning of MVP?";
    question[7] = "What are the meaning of NBA?";
    question[8] = "Who is the MVP of the year in NBA 2022?";
    question[9] = "How many player in nba team?";

   int _score=0;
   int x = 0;
   String choicesA[] = {" Skydiving "," Baseball "," Kobe "," 20 "," Golden State Warriors "," Gheorghe Muresan "," Most Valedictorian Player "," National Basketball Assets "," Stephen Curry "," 20 Players "};
   String choicesB[] = {" Writing "," Basketball "," Lebron "," 24 "," Lakers "," Allen Iverson "," Most Vulnerable Player "," National Basketball Assignment "," Klay  Thompson ","1 5 Players "};
   String choicesC[] = {" Sewing "," Soccer "," Curry "," 8 "," Miami "," Kobe "," Most Valuable Player "," National Basketball Association "," Kevin Durant "," 12 Players "};
   String Answer[] = {"A","B","B","C","A","A","C","C","A","B"};
     
      do{
          System.out.println("Question # " + (x+1));
          System.out.println(question[x]);
          System.out.println("A:" + choicesA[x]);
          System.out.println("B:" + choicesB[x]);
          System.out.println("C:" + choicesC[x]);
          System.out.print("Enter Answer : " );
          String answer = scan.nextLine();

          if (answer.equalsIgnoreCase("A")||answer.equalsIgnoreCase("B")||answer.equalsIgnoreCase("C")) {
            if(answer.equalsIgnoreCase(Answer[x])) {
              ++_score;
              
              System.out.print("Correct!");
              
            } else {
              System.out.println("Wrong! The correct answer is " + Answer[x]);
            }
            }
      
        x++;
      }while(x<10);
      System.out.print("Total Score: " + _score + " out of " + question.length);
    }
    }
