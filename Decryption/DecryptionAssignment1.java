//Nazim Wali
//Passphrase: nursing

import java.util.*;
import java.io.*;
import java.lang.*;

class DecryptionAssignment1{

	public static void main(String[] args)throws IOException, InterruptedException{
		
		Scanner in=new Scanner(new File("wordlist.txt"));							//Used to Scan input for the wordlist file containing the passphrase
		File tempFile = new File("/home/seed/Downloads/decrypted-file123.jpg");		//File and directory of decrypted file that is created only once correct passphrase
																						//Is used in cmd to decrypt the encrypted file

		Runtime run = Runtime.getRuntime();											//Runtime class used to communicate to command prompt
		ArrayList<String> passphrases = new ArrayList<String>();					//ArrayList to store all 500 words
		
		while(in.hasNextLine()){													//While wordlist.txt input file has another line to read, iterate this loop
			String line=in.nextLine();												//Save next line into variable String 'line'
			String[] words=line.split("\n");										//Split each word at each new line and store in array (at index 0)
			passphrases.add(words[0]);												//Add each word into the ArrayList
			
		}
		in.close();																	//Close the input file being read
		
		String correct = "";														//Initialize String 'correct' which will later contain correct passphrase
		
																					//After storing each word into an ArrayList
		if(!tempFile.exists()){														//If the decrypted file output does not exist, iterate this if statement
			for(int i=0; i<passphrases.size(); i++){								//Go through the ArrayList and execute the decryption command with each word
					Process pr = run.exec("gpg --output decrypted-file123.jpg --decrypt --batch --passphrase " +passphrases.get(i)+ " walin1.pdf.gpg");
																					//Command to run each decryption command with each word in file
						pr.waitFor();												//Wait for each command to finish
					if(tempFile.exists()){											//After each command per word is done, check to see if the decrypted file was created
						correct = passphrases.get(i);								//If the file was created, save that word as the correct passphrase
						break;														//After saving the correct passphrase, break from the for loop
					}
			}
				
		}
		
		String String1 = "Decryption Complete";										//Print Statements for user
		System.out.println(String1);
		System.out.println("The passphrase is " + correct);
		
	}

}
