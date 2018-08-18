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
public class Question {
    private String question;
    private int question_id;
    private Answer[] answers=new Answer[4];
    private int numAnswers=0;
    
   /* public Question(String question, int questionID) throws SQLException{
     this.question=question;
     this.questionID=questionID;
     String SQL="SELECT Answer,correct from Answers Where questionFK"+this.questionID;
    ResultSet result=Manager.getobj().query(SQL);
    
    while(result.next()){
    String answer=result.getString("Answer");
    boolean correct=result.getBoolean("Correct");
    answers[numAnswers]=new Answer(answer,correct);
    numAnswers++;
     }
   }*/

       public Question(String question, int questionID) throws SQLException{
     this.question=question;
     this.question_id=questionID;
     String SQL="SELECT answer,  correct from answers where questionFK="+this.question_id;
    ResultSet result=Manager.getc().query(SQL);
    
    while(result.next()){
    String answer=result.getString("answer");
    boolean correct=result.getBoolean("correct");
    answers[numAnswers]=new Answer(answer,correct);
    numAnswers++;
     }
   }

   // Question(String question, int questionID) {
     //   throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //}
    
 public String toString(){
  String display="";
  String letters="ABCD";
  
  for(int i=0; i<numAnswers;i++){
  display+=answers[i].toString(letters.charAt(i))+"\n";
  }
    return question+"\n\n"+display;
}   
 
 
 
  
 public boolean isCorrect(char letter){
      String letters="ABCD";
      int pos=letters.indexOf(letter+"");
      return answers[pos].isCorrect();
 
 
 }
    
    
}
