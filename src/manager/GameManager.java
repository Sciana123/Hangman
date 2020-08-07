package manager;

import javabean.GameDictionary;

public class GameManager
{
	// This class is initialized and ready to accept guesses
	private static boolean isInitialized = false;

	// Array of character indices that have been guessed (so can be disabled in button bars A-Z -> 0-25)
	private static boolean guessed[] = new boolean[26];
	
	// Number of guesses that weren't in word
	private static int incorrectGuesses;

	// Word from GameDictionary
	private static String wordToGuess;
	
	// Word guessed so far
	//   E.g., if wordToGuess is "APPLICATION" and user has guessed: A, P, and I,
	// wordGuessedSoFar would be "APP I A I  "
	private static String wordGuessedSoFar;
	
	// Return array of guessed letters to JSP
	public static boolean[] getGuessed()
	{
		return guessed;
	}

	// Return number of incorrect guesses to JSP
	public static int getIncorrectGuesses()
	{
		return incorrectGuesses;
	}
	
	// Return getWordGuessedSoFar to JSP (for displaying in word table
	public static String getWordGuessedSoFar()
	{
		return wordGuessedSoFar;
	}
	
	public static void guessLetter(char c)
	{
		// Calculate index of guessed char (A -> 0, B -> 1, ... Z -> 25)

		// Set "guessed" boolean array for that character
		
		// Make temp string to add in correctly guessed letters
		
		// Now find letter in word (if present)

		// It wasn't there; increment incorrect guess and return; nothing more to do

		// Find every occurrence (start with one already found)

		// loop while character is found
		// 		Make temp string from string before character, the character, and the substring after the character
		// 		Reassign temp to wordGuessesSoFar
		// 		Find next occurrence of character
	}
	
	public static void initializeNewGame(boolean force)
	{
		// If from loading JSP (on every JSP load/redirect) and already initialized, do nothing

		// Clear variables associated with guesses

		// Get new word from dictionary
		
		// Initialized wordGuessedSoFar to be all "spaces"

		// set isInitialized to true
	}

	
	public static boolean isSolved()
	{
		// One line to determine if solved
		return true;
	}
}
