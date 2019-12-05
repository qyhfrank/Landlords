package testCases;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import entities.Card;
import entities.CardCase;
import entities.CardRoom;
import entities.Hand;
import entities.RobotPlayer;
import enums.Rank;
import enums.Suit;
import helpers.Helper;
import junit.framework.TestCase;

public class testRobot extends TestCase{
	private Card[] c = new Card[20];

	@BeforeEach
	// initial 17 cards
	public void setUp() {
		for (int i = 3; i < 18; i++)
			c[i] = new Card(Rank.getRankByValue(i), Suit.BLANK);
			RobotPlayer testStubPlayer=new RobotPlayer();
			testStubPlayer.askForNickname();
			RobotPlayer testStubPlayer2=new RobotPlayer("Bro");
	}
	
	@Test
	public void test1() {
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		handHistory.add(Hand.cards2hand(new ArrayList<Card>(Arrays.asList(c[3], c[3]))));
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		robotplayer1.setCards(new ArrayList<Card>(Arrays.asList(c[5],c[5],c[3])));
		System.out.println(robotplayer1.getPlayChoice());
	}
	@Test
	public void test2() {
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		robotplayer1.setCards(new ArrayList<Card>(Arrays.asList(c[5],c[5],c[3])));
		System.out.println(robotplayer1.getPlayChoice());
	}
	
	@Test
	public void test3() {
		CardCase cardCase = new CardCase();
		Helper.shuffleCards(cardCase);
		List<List<Card>> cardLists = Helper.cutCards(cardCase);
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		robotplayer1.setCards(cardLists.get(0));
		System.out.println(cardLists.get(0));
		System.out.println(robotplayer1.decideRunForLandlord());
		System.out.println(robotplayer1.getPlayChoice());
	}
	
	@Test
	public void test4() {
		CardCase cardCase = new CardCase();
		Helper.shuffleCards(cardCase);
		List<List<Card>> cardLists = Helper.cutCards(cardCase);
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		robotplayer1.setCards(cardLists.get(0));
		System.out.println(cardLists.get(0));
		System.out.println(robotplayer1.decideRunForLandlord());
		System.out.println(robotplayer1.getPlayChoice());
	}
	
	@Test
	public void test5() {
		CardCase cardCase = new CardCase();
		Helper.shuffleCards(cardCase);
		List<List<Card>> cardLists = Helper.cutCards(cardCase);
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		robotplayer1.setCards(cardLists.get(0));
		System.out.println(cardLists.get(0));
		System.out.println(robotplayer1.decideRunForLandlord());
		System.out.println(robotplayer1.getPlayChoice());
	}
	
	@Test
	public void test6() {
		CardCase cardCase = new CardCase();
		Helper.shuffleCards(cardCase);
		List<List<Card>> cardLists = Helper.cutCards(cardCase);
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		robotplayer1.setCards(cardLists.get(0));
		System.out.println(cardLists.get(0));
		System.out.println(robotplayer1.decideRunForLandlord());
		System.out.println(robotplayer1.getPlayChoice());
	}
	
	@Test
	public void test7() {
		CardCase cardCase = new CardCase();
		Helper.shuffleCards(cardCase);
		List<List<Card>> cardLists = Helper.cutCards(cardCase);
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		robotplayer1.setCards(cardLists.get(0));
		System.out.println(cardLists.get(0));
		System.out.println(robotplayer1.decideRunForLandlord());
		System.out.println(robotplayer1.getPlayChoice());
	}
	
	@Test
	public void test8() {
		CardCase cardCase = new CardCase();
		Helper.shuffleCards(cardCase);
		List<List<Card>> cardLists = Helper.cutCards(cardCase);
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		robotplayer1.setCards(cardLists.get(0));
		System.out.println(cardLists.get(0));
		System.out.println(robotplayer1.decideRunForLandlord());
		System.out.println(robotplayer1.getPlayChoice());
	}
	
	@Test
	public void test9() {
		CardCase cardCase = new CardCase();
		Helper.shuffleCards(cardCase);
		List<List<Card>> cardLists = Helper.cutCards(cardCase);
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		robotplayer1.setCards(cardLists.get(0));
		System.out.println(cardLists.get(0));
		System.out.println(robotplayer1.decideRunForLandlord());
		System.out.println(robotplayer1.getPlayChoice());
	}
	@Test
	public void test10() {
		CardCase cardCase = new CardCase();
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		List<Card> cards1 = Arrays.asList(c[3], c[3], c[3], c[3], c[4], c[4], c[4], c[4], c[5], c[5], c[5], c[5], c[15], c[16], c[17]);
		robotplayer1.setCards(cards1);
		System.out.println(cards1);
		System.out.println(robotplayer1.decideRunForLandlord());
		robotplayer1.sparseCards();
		System.out.println(robotplayer1.getHandList());
	}
	@Test
	public void test11() {
		CardCase cardCase = new CardCase();
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		List<Card> cards1 = Arrays.asList(c[3], c[3], c[3], c[4], c[4], c[4], c[5], c[5], c[5], c[7], c[13], c[16]);
		robotplayer1.setCards(cards1);
		System.out.println(cards1);
		robotplayer1.sparseCards();
		System.out.println(robotplayer1.getHandList());
	}
	@Test
	public void test12() {
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		List<Card> cards1 = Arrays.asList(c[3], c[3], c[4], c[5], c[6], c[7], c[17]);
		robotplayer1.setCards(cards1);
		System.out.println(cards1);

		robotplayer1.sparseCards();
		System.out.println(robotplayer1.getHandList());
	}
	@Test
	public void test13() {
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		List<Card> cards1 = Arrays.asList(c[3], c[3], c[5], c[6], c[7], c[8], c[9], c[10], c[10], c[10]);
		robotplayer1.setCards(cards1);
		System.out.println(cards1);
		robotplayer1.sparseCards();
		System.out.println(robotplayer1.getHandList());
	}
	@Test
	public void test14() {
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		List<Card> cards1 = Arrays.asList(c[3], c[4], c[5], c[6], c[7], c[7], c[8], c[9], c[10], c[11], c[12]);
		robotplayer1.setCards(cards1);
		System.out.println(cards1);
		System.out.println(robotplayer1.decideRunForLandlord());
		robotplayer1.sparseCards();
		System.out.println(robotplayer1.getHandList());
	}
	@Test
	public void test15() {
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		List<Card> cards1 = Arrays.asList(c[3], c[3], c[3], c[4], c[5], c[6], c[7], c[8], c[9],  c[10], c[10]);
		robotplayer1.setCards(cards1);
		System.out.println(cards1);
		System.out.println(robotplayer1.decideRunForLandlord());
		robotplayer1.sparseCards();
		System.out.println(robotplayer1.getHandList());
	}
	@Test
	public void test16() {
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		List<Card> cards1 = Arrays.asList(c[3], c[3], c[4], c[4], c[5], c[5], c[6], c[7], c[8], c[9], c[10], c[10], c[10]);
		robotplayer1.setCards(cards1);
		System.out.println(cards1);
		System.out.println(robotplayer1.decideRunForLandlord());
		robotplayer1.sparseCards();
		System.out.println(robotplayer1.getHandList());
	}
	@Test
	public void test17() {
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		List<Card> cards1 = Arrays.asList(c[3], c[4], c[5], c[5], c[6], c[7], c[8], c[9], c[10]);
		robotplayer1.setCards(cards1);
		System.out.println(cards1);
		System.out.println(robotplayer1.decideRunForLandlord());
		robotplayer1.sparseCards();
		System.out.println(robotplayer1.getHandList());
	}
	@Test
	public void test18() {
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		List<Card> cards1 = Arrays.asList(c[3],  c[4],  c[5],  c[6], c[7], c[8], c[9], c[10] ,c[15], c[15], c[16]);
		robotplayer1.setCards(cards1);
		System.out.println(cards1);
		System.out.println(robotplayer1.decideRunForLandlord());
		robotplayer1.sparseCards();
		System.out.println(robotplayer1.getHandList());
	}
	@Test
	public void test19() {
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		List<Card> cards1 = Arrays.asList(c[3], c[3], c[4], c[4], c[5], c[5], c[6], c[7], c[8], c[9], c[10], c[10], c[10]);
		robotplayer1.setCards(cards1);
		System.out.println(cards1);
		System.out.println(robotplayer1.decideRunForLandlord());
		robotplayer1.sparseCards();
		System.out.println(robotplayer1.getHandList());
	}
	@Test
	public void test20() {
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		List<Card> cards1 = Arrays.asList(c[6], c[7], c[8], c[9], c[10], c[10], c[10]);
		robotplayer1.setCards(cards1);
		System.out.println(cards1);
		System.out.println(robotplayer1.decideRunForLandlord());
		robotplayer1.sparseCards();
		System.out.println(robotplayer1.getHandList());
	}
	@Test
	public void test21() {
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		List<Card> cards1 = Arrays.asList(c[6], c[6], c[6], c[7], c[8], c[9], c[10]);
		robotplayer1.setCards(cards1);
		System.out.println(cards1);
		System.out.println(robotplayer1.decideRunForLandlord());
		robotplayer1.sparseCards();
		System.out.println(robotplayer1.getHandList());
	}
	@Test
	public void test22() {
		LinkedList<Hand> handHistory=new LinkedList<Hand>();
		RobotPlayer robotplayer1=new RobotPlayer(null,null,handHistory);
		List<Card> cards1 = Arrays.asList(c[3], c[3], c[4], c[4], c[5], c[5], c[6], c[7], c[7], c[8], c[9], c[10], c[11], c[11] ,c[13], c[17]);
		robotplayer1.setCards(cards1);
		System.out.println(cards1);
		System.out.println(robotplayer1.decideRunForLandlord());
		robotplayer1.sparseCards();
		System.out.println(robotplayer1.getHandList());
	}
}
