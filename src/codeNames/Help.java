package codeNames;

//Joe
public class Help {
	//private static String getHelp = "Players split up into two teams of similar size and skill. You need at least four players (two teams of two) for a standard game, although there are 2 and 3 player variants. Each team chooses one player to be their spymaster. Both spymasters sit on the same side of the table. The other players sit across from their spymasters.They are field operatives. 25 codenames are chosen and placed on the table in a 5-by-5 grid. Each game has one key that reveals the secret identities of the cards on the table. The spymasters choose a key card randomly and don't let the field operatives see it. Spymasters know the secret identities of 25 agents.Their teammates know the agents only by their codenames. Spymasters take turns giving one-word clues. A clue may relate to multiple words on the table. The field operatives try to guess which words their spymaster meant. When a field operative touches a word, the spymaster reveals its secret identity. If the field operatives guess correctly, they may continue guessing, until they run out of ideas for the given clue or until they hit a wrong person. Then it is the other team's turn to give a clue and guess. The first team to contact all their agents wins the game. "
	 //String path = new File("src\\help.txt").getAbsolutePath();

	private static String pathToHelp= "help.txt";
		// command from ui calls this class
		// eg scanner receives 'help' or click help button in gui

		// method: instantiate reader class
		// read help.txt
		// read into 1d arraylist
		// return help arraylist/print out to gui?

	private static String HelpAL = "";

	public Help() {
		Reader r1 = new Reader(); // calling leo's reader
		HelpAL = r1.readString(pathToHelp /*text file path*/);
		//HelpAL = getHelp();
	}

	/*public static ArrayList<String> getHelp() {
		ArrayList<String> H = new ArrayList<String>();
		//String word = HelpAL.get(0);
		H.set(0, word);
		//1250 character limit on help file?
		System.out.printf("%1250s" , "Help:" + H);
		return H;
	}*/

	public static String getHelpAL() {
		return HelpAL;
	}

	public void setHelpAL(String helpAL) {
		HelpAL = helpAL;
	}

}
