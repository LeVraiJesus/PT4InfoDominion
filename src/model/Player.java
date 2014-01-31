package model;

public class Player {

	private final int num;
	private HeapDeck myDeck=null;
	private HeapHand myHand=null;
	private HeapTrash myTrash=null;
	private Points myPoints=null;
	
	/**
	 * Constructor Player
	 */
	public Player(int num) {
		this.num = num;
		System.out.println("Constructor Init Player");
	}
	
	public void initPlayer(){
		myDeck = new HeapDeck();
		myDeck.initDeck();
		myHand = new HeapHand();
		myTrash = new HeapTrash();
	}
	
	/**
	 * @return the myDeck
	 */
	public HeapDeck getMyDeck() {
		return myDeck;
	}
	/**
	 * @param myDeck the myDeck to set
	 */
	public void setMyDeck(HeapDeck myDeck) {
		this.myDeck = myDeck;
	}
	/**
	 * @return the myHand
	 */
	public HeapHand getMyHand() {
		return myHand;
	}
	/**
	 * @param myHand the myHand to set
	 */
	public void setMyHand(HeapHand myHand) {
		this.myHand = myHand;
	}
	/**
	 * @return the myTrash
	 */
	public HeapTrash getMyTrash() {
		return myTrash;
	}
	/**
	 * @param myTrash the myTrash to set
	 */
	public void setMyTrash(HeapTrash myTrash) {
		this.myTrash = myTrash;
	}
	/**
	 * @return the myPoints
	 */
	public Points getMyPoints() {
		return myPoints;
	}
	/**
	 * @param myPoints the myPoints to set
	 */
	public void setMyPoints(Points myPoints) {
		this.myPoints = myPoints;
	}
	/**
	 * @return the num
	 */
	public int getNum() {
		return num;
	}
}