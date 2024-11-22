package map;

import java.util.Collections;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Stack;

public class Player implements Comparable <Player>{

	private int playerNo;
	private String playerName;
	private int score;
	
	public Player(int playerNo, String playerName, int score) {
		super();
		this.playerNo = playerNo;
		this.playerName = playerName;
		this.score = score;
	}
	
	public int getPlayerNo() {
		return playerNo;
	}

	public void setPlayerNo(int playerNo) {
		this.playerNo = playerNo;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	@Override
	public String toString() {
		return "Player [playerNo=" + playerNo + ", playerName=" + playerName + ", score=" + score + "]";
	}	
	
	public int compareTo(Player p1) {
		// TODO Auto-generated method stub
		if(p1.getScore()>this.getScore())
		{
			return 1;
		}
		return -1;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Stack<Player> stack=new Stack();
         Scanner sc=new Scanner(System.in);
         System.out.println("How many player do you want to add");
         int nop=sc.nextInt();
         for(int i=0; i<nop; i++)
         {
        	 System.out.println("Enter player number");
        	 int no=sc.nextInt();
        	 System.out.println("Enter player Name");
        	 String name=sc.next();
        	 System.out.println("Enter player score");
        	 int score=sc.nextInt();
        	 Player player=new Player(no, name, score);
        	 stack.add(player);
         }
            Collections.sort(stack);
            Enumeration<Player> en= stack.elements();
            while(en.hasMoreElements())
            {
            	Player p=en.nextElement();
            	System.out.println(p);
            }         
	}
}














