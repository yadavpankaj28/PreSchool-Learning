/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Sandy
 */
public class Manager {
   private static conn c;

   /* static Object getobj() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }*/

   
   private Question[]questions=new Question[500];
   private int numQuestions;
   private int level;
   private int lives;
   private Question currentQuestion;
   
   public static  int getRandom(int iMin,int iMax ){
   int iRand=0;
   iRand=(int)Math.round(Math.random()*(iMax-iMin))+iMin;
   return iRand;
   }
   
   public Manager(String fileName) throws ClassNotFoundException, SQLException{
   c=new conn(fileName);
   level=1;
   lives=3;
   System.out.println("Now to populate questions");
   
   populateQuestions();
      System.out.println("questions populated");

   
   }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

 
   
   
   public static conn getc(){
   return c;
   }
   public void addQuestion(String question,int questionID) throws SQLException{
   questions[numQuestions]=new Question(question,questionID);
   numQuestions++;
   }
   
   
   
   
   public void populateQuestions() throws SQLException{
   numQuestions=0;
   String SQL="Select  question_id,question from questions Where level= "+level;
   ResultSet result=c.query(SQL);
   while(result.next()){
   int questionID=result.getInt("question_id");
   String question=result.getString("question");
   addQuestion(question,questionID);
   }
}


   public void increaseLevel() throws SQLException{
   level++;
   populateQuestions();
   }
   
   
  public String getQuestion(){
  
  currentQuestion=questions[getRandom(0,numQuestions-1)];
  return currentQuestion.toString();
  }  
    
  
public boolean answer(char answer) throws SQLException{
    if(currentQuestion.isCorrect(answer)){
      
        level++;
      populateQuestions();
       return true;
    }
    else{
    lives--;
    return false;
    }

}  
    
    
}
