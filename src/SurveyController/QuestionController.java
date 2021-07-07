/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SurveyController;

import SurveyModel.QuestionModel;

import java.util.Scanner;

/**
 * @author HilalA
 */
public class QuestionController {

    Scanner in = new Scanner(System.in);

    QuestionModel Q_model = new QuestionModel();

    public QuestionController() {
    }

    public QuestionController(QuestionModel Q_model) {
        this.Q_model = Q_model;
    }

    public void setSurveyQues(String Ques) {
        Q_model.setQues(Ques);
    }

    public String getSurveyQues() {
        return Q_model.getQues();
    }

    public void setSurveyAnswer(String Answer) {
        Q_model.setAnswer(Answer);
    }


    public String getSurveyAnswer() {
        return Q_model.getAnswer();
    }

    public String validateString(String n) {
        return Q_model.validateYON(n);
    }

    public int validateInt(int num) {
        return Q_model.validateRate(num);
    }




}
