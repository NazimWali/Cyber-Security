import java.util.*;
import java.io.*;
import java.lang.*;

class Decryption
{

	public static void main(String[] args)throws IOException, InterruptedException{
		
		Scanner in=new Scanner(new File("wordlist.txt"));
		
		File tempFile = new File("/home/seed/Downloads/decrypted-file123.jpg");

		Runtime run = Runtime.getRuntime();
		ArrayList<String> passphrases = new ArrayList<String>();
		
		while(in.hasNextLine()){
		
			String line=in.nextLine();
			String[] words=line.split("\n");
			
			passphrases.add(words[0]);
			
		}
		in.close();
		
		String correct = "";
		
		if(!tempFile.exists()){
			for(int i=0; i<passphrases.size(); i++){
					Process pr = run.exec("gpg --output decrypted-file123.jpg --decrypt --batch --passphrase " +passphrases.get(i)+ " walin1.pdf.gpg");
						pr.waitFor();
					if(tempFile.exists()){
						correct = passphrases.get(i);
						break;
					}
			}
				
		}
		
		String String1 = "Decryption Complete";
		System.out.println(String1);
		System.out.println("The passphrase is " + correct);
		
	}

}
