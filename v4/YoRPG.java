/**********************************************
 * Four: Kaitlin Ho, Jing Yi Feng, Fang Chen
 * APCS
 * L01: An Adventurer is You!
 * 2021-11-29
 * time spent: 0.2 hr
 *
 * DISCO:
 * 
 * QCC:
 *
 
 OUR DRIVER MODS:
 - Implemented different Monster classes and their appearance.
 - Gave Giant a specialized attack (the other monsters do not have this) that has a 5% chance of triggering. 
 
 **********************************************/

import java.io.*;
import java.util.*;

public class YoRPG {

  // ~~~~~~~~~~~ INSTANCE VARIABLES ~~~~~~~~~~~

  //change this constant to set number of encounters in a game
  public final static int MAX_ENCOUNTERS = 2;

  //each round, a Protagonist and a Monster will be instantiated...
  private Protagonist pat;
  private Monster smaug;

  private int moveCount;
  private boolean gameOver;
  private int difficulty;
  private int classChoice;

  private InputStreamReader isr;
  private BufferedReader in;
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  // ~~~~~~~~~~ DEFAULT CONSTRUCTOR ~~~~~~~~~~~
  public YoRPG() {
    moveCount = 0;
    gameOver = false;
    isr = new InputStreamReader( System.in ); //InputStreamReader reads bytes and decodes them into characters
    in = new BufferedReader( isr ); //BufferedReader reads text from a character-input stream
    newGame();
  }
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~



  // ~~~~~~~~~~~~~~ METHODS ~~~~~~~~~~~~~~~~~~~

  /*=============================================
    void newGame() -- gathers info to begin a new game
    pre:
    post: according to user input, modifies instance var for difficulty
    and instantiates a Protagonist
    =============================================*/
  public void newGame() {
    String s;
    String name = "";
    s = "~~~ Welcome to Ye Olde RPG! ~~~\n";

    s += "\nChoose your difficulty: \n";
    s += "\t1: Easy\n";
    s += "\t2: Not so easy\n";
    s += "\t3: Beowulf hath nothing on me. Bring it on.\n";
    s += "Selection: ";
    System.out.print( s );

    try {
	    difficulty = Integer.parseInt( in.readLine() );
    }
    catch ( IOException e ) { }

	  
    // CHOOSING CLASS
    s = "Choose your class:\n";
  	  s += "1: Mage\n";
  	  s += "2: Tank\n";
      s += "3: Brawler\n";
  	  //add more
  	  System.out.print(s);
    	  
    try {
    	classChoice = Integer.parseInt( in.readLine());
    }
    catch (IOException e) { }
    	  
	  //NAME
    s = "Intrepid protagonist, what doth thy call thyself? (State your name): ";
    System.out.print( s );

    try {
	    name = in.readLine();
    }
    catch ( IOException e ) { }

    //instantiate the player's character
    pat = new Protagonist( name );

    if (classChoice == 1) {
      pat = new Mage(name);
    }
    if (classChoice == 2) {
      pat = new Tank(name);
    }
    if (classChoice == 3) {
      pat = new Brawler(name);
    }
	  
  }//end newGame()
	  
	
 



  /*=============================================
    boolean playTurn -- simulates a round of combat
    pre:  Protagonist pat has been initialized
    post: Returns true if player wins (monster dies).
    Returns false if monster wins (player dies).
    =============================================*/
  public boolean playTurn() {
    int i = 1;
    int d1, d2;
    int monster_choice;
    int randomzier;

    if ( Math.random() >= ( difficulty / 3.0 ) )
	    System.out.println( "\nNothing to see here. Move along!" );
    else {
	    System.out.println( "\nLo, yonder monster approacheth!" );

	    randomzier = (int)(Math.random()*100);
	    monster_choice = (int)(Math.random()*100);
	    
	    if (monster_choice <= 100 && monster_choice > 65){
	    	smaug = new Zombie();
		System.out.print(" It's a Zombie!");
	    }
	    
	    if (monster_choice > 15 && monster_choice <= 65){
	    	smaug = new Goblin();
		System.out.print(" It's a Goblin!");
	    }
	    
	    if (monster_choice <= 15){
	    	smaug = new Giant();
		System.out.print(" It's a Giant!");
	    }
	    
	    //else {smaug = new Monster();}

	    while( smaug.isAlive() && pat.isAlive() ) {

        // Give user the option of using a special attack:
        // If you land a hit, you incur greater damage,
        // ...but if you get hit, you take more damage.
        try {
          System.out.println( "\nDo you feel lucky?" );
          System.out.println( "\t1: Nay.\n\t2: Aye!" );
          i = Integer.parseInt( in.readLine() );
        }
        catch ( IOException e ) { }

	//should give a 1% chance of healing to full HP
	if (i >= 2 && i == randomzier){
	  pat.heal();
	  System.out.println("Lucky! You found a healing potion."); //At first it was just to 
		//check if this worked, but it's a fun message
	}
        else if ( i == 2 ){
          pat.specialize();
	}
        else{
          pat.normalize();
	}

	if (monster_choice <= 15 && randomzier >= 5){
		smaug.specialize();
	}
	else if (monster_choice <= 15 && randomzier >= 5) {smaug.normalize();}
	
        d1 = pat.attack( smaug );
        d2 = smaug.attack( pat );

        System.out.println( "\n" + pat.getName() + " dealt " + d1 +
                            " points of damage.");

        System.out.println( "\n" + "Ye Olde Monster smacked " + pat.getName() +
                            " for " + d2 + " points of damage.");
	    }//end while

	    //option 1: you & the monster perish
	    if ( !smaug.isAlive() && !pat.isAlive() ) {
        System.out.println( "'Twas an epic battle, to be sure... " +
                            "You cut ye olde monster down, but " +
                            "with its dying breath ye olde monster. " +
                            "laid a fatal blow upon thy skull." );
        return false;
	    }
	    //option 2: you slay the beast
	    else if ( !smaug.isAlive() ) {
        System.out.println( "HuzzaaH! Ye olde monster hath been slain!" );
        return true;
	    }
	    //option 3: the beast slays you
	    else if ( !pat.isAlive() ) {
        System.out.println( "Ye olde self hath expired. You got dead." );
        return false;
	    }
    }//end else

    return true;
  }//end playTurn()
  // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~


  public static void main( String[] args ) {
    //As usual, move the begin-comment bar down as you progressively
    //test each new bit of functionality...


    //loading...
    YoRPG game = new YoRPG();

    int encounters = 0;
    while( encounters < MAX_ENCOUNTERS ) {
    if ( !game.playTurn() )
    break;
    encounters++;
    System.out.println();
    }
    System.out.println( "Thy game doth be over." );

  }//end main

}//end class YoRPG
