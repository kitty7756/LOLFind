package kayci.lolfind.RiotAPI;

import java.util.Scanner;

/**
 * Created by lenovo on 2017/8/14.
 */

public class Main {
    public static void main(String[] args) {
        //Retrieve ID
        Scanner scanner = new Scanner( System.in );
        System.out.print( "Type in your summoner name: " );
        Summoner.getInstance().setSummonerName(scanner.nextLine());
        System.out.println(Summoner.getInstance().getSummonerID());
        System.out.println(Summoner.getInstance().getSummonerName());
        System.out.println(Summoner.getInstance().getSummonerLevel());
        GetTopChampion.getChamps();
    }
}
