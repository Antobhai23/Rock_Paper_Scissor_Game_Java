import java.util.Random;
import java.util.Scanner;

public class Rock_Paper_Scissor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter No Of Matches To Play: ");
        byte no_match = sc.nextByte();
        byte player_score = 0, computer_score =0;

        while (no_match!=0){

            System.out.println("Select Anyone:");
            System.out.println("0 -> Rock");
            System.out.println("1 -> Paper");
            System.out.println("2 -> Scissor");

            byte val = sc.nextByte();

            Random rnd = new Random();
            int computer_value = rnd.nextInt(3);

            switch (val){

                case 0:
                    if (computer_value == 0){
                        System.out.println("Both Rock, Tie!!!");
                    }
                    else if(computer_value == 1){
                        System.out.println("Paper Beats Rock");
                        computer_score +=1;
                    }
                    else{
                        System.out.println("Rock Beats Scissor");
                        player_score +=1;
                    }
                    break;

                case 1:
                    if (computer_value == 0){
                        System.out.println("Paper Beats Rock");
                        player_score+=1;
                    }
                    else if(computer_value == 1){
                        System.out.println("Both Paper, Tie");
                    }
                    else{
                        System.out.println("Scissor Beats Paper");
                        computer_score+=1;
                    }
                    break;

                case 2:
                    if (computer_value == 0){
                        System.out.println("Rock Beats Scissor");
                        computer_score+=1;
                    }
                    else if(computer_value == 1){
                        System.out.println("Scissor Beats Paper");
                        player_score+=1;
                    }
                    else{
                        System.out.println("Both Scissors, Tie !!!");
                    }
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
            no_match --;
        }
        if(player_score == computer_score){
            System.out.println("Tie Match");
        }
        else if(player_score > computer_score){
            System.out.println("Congratulations, You Win!!!");
        }
        else{
            System.out.println("Computer Wins!!!");
        }
    }
}
