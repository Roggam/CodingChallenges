import java.util.Arrays;
import java.util.Comparator;

//Comparators are used to compare two objects. In this challenge, you'll create a comparator and
// use it to sort an array.
//
//        The Player class is provided for you in your editor. It has 2 fields: a name String and a score integer.
//
//        Given an array of n Player objects, write a comparator that sorts them in order of decreasing score;
//        if 2 or more players have the same score, sort those players alphabetically by name.
//        To do this, you must create a Checker class that implements the Comparator interface,
//        then write an int compare(Player a, Player b) method implementing the Comparator.compare(T o1, T o2) method.
//
//        Input Format
//
//        Input from stdin is handled by the locked stub code in the Solution class.
//
//        The first line contains an integer, n, denoting the number of players.
//        Each of the n subsequent lines contains a player's name  and score, respectively.
//
//        Constraints
//
//        players can have the same name.
//        Player names consist of lowercase English letters.
//        Output Format
//
//        You are not responsible for printing any output to stdout.
//        The locked stub code in Solution will create a Checker object,
//        use it to sort the Player array, and print each sorted element.

class Checker implements Comparator<Player> {

    public int compare(Player p3, Player p4) {
        if (p3.score == p4.score)  {
            return p3.name.compareTo(p4.name);

        } else {
            return p4.score - p3.score;
        }

    }

}
class Player{
    String name;
    int score;

    Player(String name, int score){
        this.name = name;
        this.score = score;
    }
}

class Solution {

    public static void main(String[] args) {
        Player p1 = new Player("amy", 100);
        Player p2 = new Player("david", 100);
        Player p3 = new Player("heraldo", 50);
        Player p4 = new Player("aleska", 150);
        Player p5 = new Player("aakansha", 75);



        Player[] player = {p1, p2, p3,p4, p5};
        Checker checker = new Checker();


        Arrays.sort(player, checker);
        for(int i = 0; i < player.length; i++){
            System.out.printf("%s %s\n", player[i].name, player[i].score);
        }
    }
}
