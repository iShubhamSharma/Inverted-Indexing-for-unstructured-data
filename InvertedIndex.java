package testingPurpose;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.concurrent.TimeUnit;
import java.io.*;

public class Practice3 {
	public static void main( String[] args ) throws IOException
	{
		

		
		
		int length = 0;
		int countWord = 0;
	    int frequency = 0;
		//HashMap<String, String> map = new HashMap<String, String>();
	    int lineCount=0;
	    //String line;
	    HashMap<String, Integer> map = new HashMap<String, Integer>();
	    //HashMap<String, String> fileName = new HashMap<String, String>();
	    String NameofFile = null;
	    Scanner sc = new Scanner(System.in);
	    System.err.println("\n *** This Will Be Hash Approach ***");
	    System.out.println("\n Enter The keyword/phrase you wish to retrieve : ");
	    String input = sc.nextLine().toLowerCase();
	    input.trim();
	    
	    
	    long startTime = System.currentTimeMillis( );
	    // Testing Code Below
	    try {
			File dir = new File("D:\\UPES\\SEM-VI\\Minor 2\\DataSet");
			for (File fn : dir.listFiles()) {
				frequency =0;
				//lineCount = 0;
				NameofFile = fn.getName();
				
				//System.out.println("\n ** Info: Frequenc:LineCnt :"+ frequency +"::"+lineCount+ "  FileName:" + NameofFile+"\n");
				FileInputStream fstream = new FileInputStream(fn);
				DataInputStream in = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				String strLine;
				while ((strLine = br.readLine()) != null) {
					String words[] = strLine.toLowerCase().split("[,.{}`~()!;:1-9\\s]+",0);
					
					//String words[] = strLine.toLowerCase().split("[,.{}`~()!;:1-9\\s]+",0);
					//System.out.println("\nLine # "+strLine+" # words length: " + words.length+"\n");
					for (int j=0; j<words.length; j++ ){
						
						String wd = words[j];
						countWord++;
						//System.out.println("wd :: "+wd );
						wd.trim();
						
								if(input.equalsIgnoreCase(wd)){
								frequency++;
								//System.out.println("Frequency is: "+frequency);
						}
					}
					lineCount++;
					
		            //System.out.println("ignoring line: " + strLine+""+count);
		            	
					// length  = words.length;	
					
				}
				
				//System.out.println("Size of Array is"+length);
				br.close();
				in.close();
				//System.out.println("\n Line Count:"+lineCount +" Word Frequency: "+frequency+" \n");
			
				map.put(NameofFile, frequency);
				
				//return;
			}
			
				
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	    
	    for(Map.Entry m:map.entrySet()){
	    	
	    	   System.err.println(" FileName * "+m.getKey()+" * | Frequency is "+m.getValue());
	    }
	    	    
	    // Code Ends
	    
	    long endTime = System.currentTimeMillis( );
	    long diff = (endTime - startTime)/1000;
	    //long timeSeconds = TimeUnit.MILLISECONDS.toSeconds(diff);
        System.out.println("\n Time Taken To Index is : " + diff+" sec");
        System.out.println("Total Lines Were: "+lineCount);
        System.out.println("Total Words Were: "+countWord);
	}

	
}
