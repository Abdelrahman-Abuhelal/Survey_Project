/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SurveyModel;

import java.util.Scanner;

/**
 *
 * @author HilalA
 */
public class QuestionModel {


    private String type;
    private String Ques;
    private String Answer;
    Scanner in = new Scanner(System.in);

    public QuestionModel(String type, String Ques) {
        this.type = type;
        this.Ques = Ques;
    }

    public QuestionModel(String Ques) {
        this.Ques = Ques;
    }

    public QuestionModel() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getQues() {
        return Ques;
    }

    public void setQues(String Ques) {
        this.Ques = Ques;
    }

    public String getAnswer() {
        return Answer;
    }

    public void setAnswer(String Answer) {
        this.Answer = Answer;
    }

    public String validateYON(String Answer) {
        while (!((Answer.equalsIgnoreCase("yes") || Answer.equalsIgnoreCase("no")))) {
            System.out.println("please enter yes or no :");
            Answer = in.next();
        }
        return Answer;
    }

    public int validateRate(int z) {
        while (!((z <= 10 && z > 0))) {
            System.out.println("Please choose between 1 and 10");
            z = in.nextInt();
        }
        return z;
    }



//

}
