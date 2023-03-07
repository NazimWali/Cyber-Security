import java.util.*;
import java.io.*;
import java.lang.*;

class Decryption
{
	public static String[] testwords = new String[500];
	
	public static void main(String[] args)throws IOException{
		
		Scanner in=new Scanner(new File("wordlist.txt"));
		while(in.hasNextLine())
		{
			String line=in.nextLine();
			String[] words=line.split(",");
			
			// for(int i=0;i<2;i++)
			// {
				// Process process = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", "start C:\\Users\\nazim\\Documents\\Fall21\\test.bat", words[i]});
			// }
			
			for(int i = 0; i < words.length; i++){
				testwords[i] = words[i];
				
			}
			
			// for(int i=0;i<words.length;i++)
			// {
				// System.out.print(words[i]+" "+"\n");
			// }
			
		}
		in.close();
		
		String String1 = "yoooooo";
		String String2 = "lmao";
		
		for(int i = 0; i < 5; i++){
			
			Process process = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", "start C:\\Users\\nazim\\Documents\\Fall21\\test.bat", testwords[1]});
			
		}
		
		
		//Process process = Runtime.getRuntime().exec("cmd /c start test.bat", null, new File("C:\\Users\\nazim\\Documents\\Fall21\\"));
		//Process process = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", "start C:\\Users\\nazim\\Documents\\Fall21\\test.bat", words[i]});
		//Process process1 = Runtime.getRuntime().exec(new String[]{"cmd.exe", "/c", "start C:\\Users\\nazim\\Documents\\Fall21\\test.bat", String2});

		
		//System.out.println("Documents");
		
		//printResults(process);
		
		//Runtime.getRuntime().exec("cd Documents");
		
		
	}
	
	public static void printResults(Process process) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
		String line = "";
		while ((line = reader.readLine()) != null) {
			System.out.println(line);
		}
	}
	
	//1
	public static double alsum(ArrayList<Double> al){
		double sum = 0;
		for(int i = 0; i < al.size(); i++){
			sum+=al.get(i);
		}
		return sum;
	}
	
	//2
	public static String evenodds(String s, String s2){
		String first = "";
		String second = "";
		String both = "";
		
		for(int i = 0; i < s.length(); i++){
			if(i%2 == 0){
				 first += s.charAt(i);
			}
		}
		
		for(int i = 0; i < s2.length(); i++){
			if(i%2 != 0){
				 second += s2.charAt(i);
			}
		}
		
		both = first + second;
		
		return both;
	}
	
	//3
	public static void printAL(ArrayList<String> sal){
		for (int i = sal.size()-1; i >= 0; i--){
			System.out.println(sal.get(i));
		}
	}
	
	//4
	public static ArrayList<Character> charAL(char[] a){
		ArrayList<Character> al = new ArrayList<Character> ();
		for (int i = 0; i < a.length; i++){
			al.add(a[i]);
		}
		
		return al;
	}
	
	//5
	public static String maxString(ArrayList<String> strAl, ArrayList<Integer> intAl){
		int max = intAl.get(0);
		int index = 0;
		
		for(int i = 0; i < intAl.size(); i++){
			if (intAl.get(i) > max){
				max = intAl.get(i);
				index = i;
			}
		}
		
		return strAl.get(index);
	}
	
	//6
	public static void prod300(){
		Scanner kb = new Scanner(System.in);
		int prod = 1;
		int x = 0;
		System.out.println("Enter numbers that will multiply up to 300.");
		while(prod < 300){
			x = kb.nextInt();
			
			if(x > 0){
				prod *= x;
			}
		}
		System.out.println(prod);
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
}