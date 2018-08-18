/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conn;

/**
 *
 * @author Sandy
 */
public class Quiz_Tao {
    
    private String type,question,ans1,ans2,ans3,ans4,c_ans,alt;

    public Quiz_Tao() {
    }

    public Quiz_Tao(String type, String question, String ans1, String ans2, String ans3, String ans4, String c_ans, String alt) {
        this.type = type;
        this.question = question;
        this.ans1 = ans1;
        this.ans2 = ans2;
        this.ans3 = ans3;
        this.ans4 = ans4;
        this.c_ans = c_ans;
        this.alt = alt;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public String getAns1() {
        return ans1;
    }

    public void setAns1(String ans1) {
        this.ans1 = ans1;
    }

    public String getAns2() {
        return ans2;
    }

    public void setAns2(String ans2) {
        this.ans2 = ans2;
    }

    public String getAns3() {
        return ans3;
    }

    public void setAns3(String ans3) {
        this.ans3 = ans3;
    }

    public String getAns4() {
        return ans4;
    }

    public void setAns4(String ans4) {
        this.ans4 = ans4;
    }

    public String getC_ans() {
        return c_ans;
    }

    public void setC_ans(String c_ans) {
        this.c_ans = c_ans;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }
    
    
}
