import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    //Static Game Variables
    static ArrayList<Integer> p1Pos=new ArrayList<>();
    static ArrayList<Integer> p2Pos=new ArrayList<>();

    public static boolean playerTurn=true;
    //Create Game Board
    public static TicTacToe board=new TicTacToe();

    //Driver Function
    public static void main(String[] args) {
        if(!board.isVisible()){
            board.setVisible(true);
        }
    }

    public static String checkWin() {
        //Winning Conditions
        List tRow= Arrays.asList(1,2,3);    List mRow= Arrays.asList(4,5,6);
        List bRow= Arrays.asList(7,8,9);    List lCol= Arrays.asList(1,4,7);
        List mCol= Arrays.asList(2,5,8);    List rCol= Arrays.asList(3,6,9);
        List Diag_1= Arrays.asList(1,5,9);  List Diag_2= Arrays.asList(7,5,3);

        List<List> winCondition=new ArrayList<>();
        winCondition.add(tRow);     winCondition.add(mRow);
        winCondition.add(bRow);     winCondition.add(lCol);
        winCondition.add(mCol);     winCondition.add(rCol);
        winCondition.add(Diag_1);   winCondition.add(Diag_2);

        //Check for Winner
        for(List lst:winCondition) {
            if (p1Pos.containsAll(lst)){
                return "Player 1";
            }else if (p2Pos.containsAll(lst)){
                return "Player 2";
            }else if(p1Pos.size()+p2Pos.size()==9){
                return "Draw";
            }
        }
        return "";
    }

    public static void boardReset(){
        board.winLabel.setVisible(false);

        //Reset Board
        board.button1.setText("");
        board.button2.setText("");
        board.button3.setText("");
        board.button4.setText("");
        board.button5.setText("");
        board.button6.setText("");
        board.button7.setText("");
        board.button8.setText("");
        board.button9.setText("");

        //Reset Player Variables
        p1Pos.clear();
        p2Pos.clear();
        playerTurn=true;
        board.panelbuttons.setVisible(true);
    }
}
