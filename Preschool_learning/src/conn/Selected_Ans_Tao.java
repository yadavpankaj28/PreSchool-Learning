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
public class Selected_Ans_Tao {

    private String ques;
    private String selected_ans;
    private String correct_ans;

    public Selected_Ans_Tao() {
    }

    public Selected_Ans_Tao(String ques, String selected_ans, String correct_ans) {
        this.ques = ques;
        this.selected_ans = selected_ans;
        this.correct_ans = correct_ans;
    }

    public String getQues() {
        return ques;
    }

    public void setQues(String ques) {
        this.ques = ques;
    }

    public String getSelected_ans() {
        return selected_ans;
    }

    public void setSelected_ans(String selected_ans) {
        this.selected_ans = selected_ans;
    }

    public String getCorrect_ans() {
        return correct_ans;
    }

    public void setCorrect_ans(String correct_ans) {
        this.correct_ans = correct_ans;
    }
    
    
}
