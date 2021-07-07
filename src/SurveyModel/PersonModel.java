/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SurveyModel;

/**
 *
 * @author HilalA
 */
public class PersonModel {

    private String Question;

    private String id;

    private String Name;


    public PersonModel() {
    }

    public PersonModel(String question) {
        Question = question;
    }


    public String getQuestion() {
        return Question;
    }

    public void setQuestion(String question) {
        Question = question;
    }

    public PersonModel(String id, String name) {
        this.id = id;
        this.Name=name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return Name;
    }
}
