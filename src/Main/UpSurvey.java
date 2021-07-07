/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Reader.QuesionReader;
import Reader.UserReader;
import SurveyController.PersonController;
import SurveyController.QuestionController;
import SurveyModel.PersonModel;
import SurveyModel.QuestionModel;
import java.util.ArrayList;
import java.util.Scanner;


/**
 *
 * @author HilalA
 */
public class UpSurvey {

    /**
     * @param args the command line arguments
     */
    Scanner in = new Scanner(System.in);


    public static void main(String[] args){
        UpSurvey survey = new UpSurvey();
        System.out.println("Survey For Trainers");
        System.out.println("___________________");
        System.out.println();
        ArrayList<QuestionModel> QuestionList = new ArrayList<>();
        ArrayList <PersonModel> PersonInfo = new ArrayList<>();

        UserReader UR=new UserReader();
        QuesionReader QR=new QuesionReader();

        QuestionController QC=new QuestionController();
        PersonController PC=new PersonController();


        UR.Reading_P_Qusetion(PersonInfo);
        QR.ReadingQuestion(QuestionList);
//        System.out.println(PersonInfo.size());

        for (int i = 0; i < PersonInfo.size(); i++) {
            System.out.println(PersonInfo.get(i).getQuestion());
            String line = survey.in.nextLine();
            if(i==0){
            PersonInfo.get(i).setName(line);
        }
            else if (i==1){
                PersonInfo.get(i).setId(line);
            }
        }

        for (int i = 0; i < QuestionList.size(); i++) {

            System.out.println(QuestionList.get(i).getQues());
            if (QuestionList.get(i).getType().equalsIgnoreCase("YON")) {
                String input = survey.in.next();
                String answer=QC.validateString(input);
                QuestionList.get(i).setAnswer(String.valueOf(answer));

            } else if (QuestionList.get(i).getType().equalsIgnoreCase("OOT")) {
                int num = survey.in.nextInt();
                int mark = QC.validateInt(num);
                QuestionList.get(i).setAnswer(String.valueOf(mark));
            }
        }
//
        for (int i = 0; i < PersonInfo.size(); i++) {
            System.out.println();
            System.out.println("-------------------");
            System.out.println("++++++++++" + PersonInfo.get(i).getQuestion());
            if (i == 0) {
                System.out.println("++++++++++" + PersonInfo.get(i).getName());
            }
            if(i==1){
                System.out.println("++++++++++" + PersonInfo.get(i).getId());
            }
        }

        System.out.println();
        System.out.println();
        for (int i = 0; i < QuestionList.size(); i++) {
            System.out.println("-------------------");
            System.out.println("++++++++++" + " " + QuestionList.get(i).getQues());
            System.out.println("Your answer was :" + QuestionList.get(i).getAnswer());
        }

    }

//            for (int i = 0; i <= QuestionList.size(); i++) {
//                System.out.println("++++++++++" + " " + QuestionList.get(i).getQues());
//                System.out.println("Your answer was :" + QuestionList.get(i).getAnswer());
//            }
    //                String[] ar = line.split(",");
//                    if(section=="YON" || section=="OOT"){
//                    String name=section;
}

//           for (int i = 0; i < QuestionList.size(); i++) {
//            System.out.println("-------------------");
//            System.out.println("++++++++++" + " " + QuestionList.get(i).getQues());
//            System.out.println("Your answer was :" + QuestionList.get(i).getAnswer());
//
//        }
//        FileWriter fw=new FileWriter(file);
//        fw.write("add questions here..");
//        fw.close();
//     ArrayList <QuestionModel> QuestionList = new ArrayList<>();
//
//     QuestionModel u1 = new QuestionModel("Could you please enter your Name?");
//     QuestionList.add(u1);
//
//
//
//          QuestionModel u=new QuestionModel(Type.YON,"What is your favourite book?");
//          QuestionList.add(u);
//          for (int i=0; i<Type.values().length;i++){
//              Type [] arrayOfValues = Type.values();
//              System.out.println(arrayOfValues[i]);
//          }

