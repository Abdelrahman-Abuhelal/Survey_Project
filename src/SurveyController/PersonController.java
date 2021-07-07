/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SurveyController;

import SurveyModel.PersonModel;

/**
 *
 * @author HilalA
 */
public class PersonController {

    PersonModel P_model = new PersonModel();

    public PersonController() {
    }



    public PersonController(PersonModel P_model) {
        this.P_model = P_model;
    }

    public void setPersonId(String id) {
        P_model.setId(id);
    }

    public String getPersonId() {
        return P_model.getId();
    }
    public void setPersonName(String Name) {
        P_model.setName(Name);
    }

    public String getPersonName() {
        return P_model.getName();
    }

    public void setPersonQuestion(String Ques){
        P_model.setQuestion(Ques);
    }

    public String getPersonQuestion(){
        return P_model.getQuestion();
    }

}
