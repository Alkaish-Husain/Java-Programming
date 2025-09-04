package Multithreading;
import java.util.Scanner;

import java.util.Scanner; 

class DownloadTask implements Runnable { 
 private String fileName; 
 
 public DownloadTask(String fileName) { 
     this.fileName = fileName; 
 } 
 

 public void run() { 
     System.out.println("Download started: " + fileName + " "
     		+ "(Thread:- " + Thread.currentThread().getName() + ")"); 
     try { 
         for (int i = 1; i <= 10; i++) { 
             Thread.sleep(500);  
             System.out.println(fileName + " Progress:- " + 
              (i * 10) + "%"); 
         } 
     } catch (InterruptedException e) { 
         System.out.println("Download interrupted:- " + 
          fileName); 
     } 
     System.out.println("Download complete:-  " + fileName); 
 } 
} 
public class FileDownloadManager {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in); 
		  
		     System.out.println("Enter name of 3 files to" +
		      " download:- "); 
		     String[] files = new String[3]; 
		     for (int i = 0; i < 3; i++) { 
		         System.out.print("File " + (i + 1) + ":-  "); 
		         files[i] = sc.nextLine(); 
		     } 
		 
		     Thread t1 = new Thread(new DownloadTask(files[0]), 
		"File-1-Thread"); 
		     Thread t2 = new Thread(new DownloadTask(files[1]), 
		"File-2-Thread"); 
		     Thread t3 = new Thread(new DownloadTask(files[2]), 
		"File-3-Thread"); 
		 
		     t1.start(); 
		     t2.start(); 
		     t3.start(); 
		 
		     try { 
		         t1.join(); 
		         t2.join(); 
		         t3.join(); 
		     } catch (InterruptedException e) { 
		         System.out.println("Main thread interrupted"); 
		     } 
		 
		     System.out.println("\nAll downloads completed" +
		" successfully!"); 
		     sc.close(); 
		 } 
		

	}


