package com.acastor.tictactoe;

import android.app.Activity;

public class GlobalVariable extends Activity {

	// **************************** Global variables ********************************************
    int count = 0;				// to count the number of moves made.
    int arr[][] = 
    {{0,0,0},{0,0,0},{0,0,0}};	// array which stores the movements made.
    int player = 1;				// sets the player no. to 1 by default.
	int game_mode = 1;			// default 0 : h Vs h ; 1 : h Vs Comp
    int analysis_arr[][] = 
		{{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0},{0,0}};	// analysis_arr
	
	int map_arr[][] = 
		{{1,1,1},{1,1,1},{1,1,1}};	// friend and enemy map initialization.
	
	int user_symbol = 0;			// default 0: 0 to user, X to computer.
	boolean sound_enabled = true;	// default  : sound ON.
	
	int skin = 4;		// def:0; gal:1; ninja:2; red:3; system:4;
	int skin_cross = R.drawable.default_cross;	// default values.
	int skin_dot = R.drawable.default_dot;		// default values.
	int skin_layout = R.layout.main;			// default values.
	int game_bg = 2;
	
	// player names initialized with default values.
	CharSequence player_name_1 = "Player 1";
	CharSequence player_name_2 = "Player 2";
	
	// score initialized to 0.
	int score_player_1 = 0;
	int score_player_2 = 0;
	
	// menu item numbers.
	int MENU_NEW_GAME = 0;
    int MENU_OPTIONS = 1;
    int MENU_QUIT = 2;
    
    // dialog IDs
    final int NAME_DIALOG_ID = 1;
    final int HELP_DIALOG_ID = 2;
	
	//************************ End of Global Variable Declaration ********************************** 
	
	public GlobalVariable() {
		super();
	}

}