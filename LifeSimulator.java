/**
 *
 * Beschreibung
 *
 * @version 1.0 vom 10.08.2021
 * @author 
 */
import java.util.Scanner;
public class LifeSimulator {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);   
    
    /**
     *  
     *  Game
     *
     */
    System.out.println("Welcome to CGG's Life-Simulator!");
    System.out.println("");
    System.out.println("start = /start");
    System.out.println("");
    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    String a = input.next();
    if (a.equals("/start")) {
    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");  
    System.out.println("Story teller: This is a game about a life where you have to choose between 2 choices. Choose the right one or you die. You get older the longer you play and if you die a natural death at the end, you win.");                                                                                                                                                                                                            
    System.out.println("");
    System.out.println("continue = /continue");  
    System.out.println("");  
    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
      String b = input.next();
      if (b.equals("/continue")) {
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("You are a 6yo child, do you get on your mother's nervers or not.");        
        System.out.println("");
        System.out.println("yes = /yes");
        System.out.println("not = /not");
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
        String c = input.next();
        if (c.equals("/not")) {
          System.out.println("correct answer!");
          System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
          System.out.println("You are a 10yo child, do you decide to go to school or stay home?");   
          System.out.println("");
          System.out.println("go to school = /school");
          System.out.println("stay home = /home");
          System.out.println("");
          System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
          String d = input.next();
          if (d.equals("/school")) {
            System.out.println("correct answer!");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("You are now 12yo, do you decide to drink Energy Drinks or not?");
            System.out.println("");
            System.out.println("drink Energy Drinks = /Energy Drinks");
            System.out.println("not = /not");                  
            System.out.println("");
            System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            String e = input.next();
            if (e.equals("/not")) {
              System.out.println("correct answer!");
              System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
              System.out.println("You are 13yo now and you have a test in school tomorrow, do you decide to learn ot not?");
              System.out.println("");
              System.out.println("learn = /learn");
              System.out.println("not = /not");
              System.out.println("");
              System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
              String f = input.next();
              if (f.equals("/learn")) {
                System.out.println("correct answer!");
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                System.out.println("You are now 14yo and someone on the internet sent you a porn link, do you open the link or not?");
                System.out.println("");
                System.out.println("open link = /open");
                System.out.println("not = /not");
                System.out.println("");
                System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                String g = input.next();
                if (g.equals("/not")) {
                  System.out.println("correct answer!");
                  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                  System.out.println("You are now 15yo and someone offers you a cigarette, do you take it or not?");
                  System.out.println("");
                  System.out.println("take it = /take");
                  System.out.println("not = /not");
                  System.out.println("");
                  System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                  String h = input.next();
                  if (h.equals("/not")) {
                    System.out.println("correct answer!");
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    System.out.println("You are now 16yo and someone offers you alcohol, do you take it or not?");
                    System.out.println("");
                    System.out.println("drink alcohol = /alcohol");
                    System.out.println("not = /not");
                    System.out.println("");
                    System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                    String i = input.next();
                    if (i.equals("/not")) {
                      System.out.println("correct answer!");
                      System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                      System.out.println("You are now 17yo and got a girlfriend :0. Do you rush to sex?");
                      System.out.println("");
                      System.out.println("rush to sex = /sex");
                      System.out.println("not = /not");
                      System.out.println("");
                      System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                      String j = input.next();
                      if (j.equals("/not")) {
                      System.out.println("correct answer!");
                      System.out.println("------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                      
                        
                      } else {
                        
                      } // end of if-else
                    } else {
                      System.out.println("YOU LOST!");
                      return;
                      
                    } // end of if-else
                  } else {
                    System.out.println("YOU LOST!");
                    return;
                    
                  } // end of if-else
                  
                  
                  
                } else {
                  System.out.println("YOU LOST!");
                  return;
                  
                } // end of if-else
              } else {
                System.out.println("YOU LOST!");
                return;
              } // end of if-else
            } else {
              System.out.println("YOU LOST!");
              return;
            } // end of if-else
          } else {
            System.out.println("YOU LOST!");
            return;
          } // end of if-else
        } else { System.out.println("YOU LOST!");  
        return;
        
          
          
          
              } // end of if-else
        
          
        } // end of if  
        } // end of if
        
      

    
    
    
    
    
    
    
    
    
    
    
  } // end of main

} // end of class LifeSimulator

