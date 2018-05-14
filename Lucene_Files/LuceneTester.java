package Lucene;

import java.io.IOException;
import java.util.Scanner;

import org.apache.lucene.document.Document;
import org.apache.lucene.queryParser.ParseException;
import org.apache.lucene.search.ScoreDoc;
import org.apache.lucene.search.TopDocs;

public class LuceneTester {
	
   String indexDir = "D:\\UPES\\SEM-VI\\Minor 2\\DataSet\\Index";
   String dataDir = "D:\\UPES\\SEM-VI\\Minor 2\\DataSet";
   Indexer indexer;
   Searcher searcher;

   public static void main(String[] args) {
	   System.err.println("Apache Lucene Approach \n");
	   System.out.println("Enter The keyword/phrase you wish to retrieve : ");
       Scanner sc = new Scanner(System.in);
       String input = sc.nextLine();
       
       long startTime = System.currentTimeMillis();	
       
	   LuceneTester tester;
      try {
         tester = new LuceneTester();
         tester.createIndex();
         tester.search(input);
      } catch (IOException e) {
         e.printStackTrace();
      } catch (ParseException e) {
         e.printStackTrace();
      }
      long endTime = System.currentTimeMillis();
      System.out.println("Time Taken is: "+(endTime-startTime)/1000+" sec");
   }

   private void createIndex() throws IOException {
      indexer = new Indexer(indexDir);
      int numIndexed;
      
      numIndexed = indexer.createIndex(dataDir, new TextFileFilter());
      indexer.close();
      System.out.println(numIndexed+" File(s) indexed");		
   }

   private void search(String searchQuery) throws IOException, ParseException {
      searcher = new Searcher(indexDir);
      TopDocs hits = searcher.search(searchQuery);
     
      System.out.println("Keyword found in "+hits.totalHits+" document");
      for(ScoreDoc scoreDoc : hits.scoreDocs) {
         Document doc = searcher.getDocument(scoreDoc);
            System.out.println("File: "
            + doc.get(LuceneConstants.FILE_PATH));
      }
      searcher.close();
   }
}

