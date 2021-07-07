/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Reader;

import SurveyModel.PersonModel;
import SurveyModel.QuestionModel;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author HilalA
 */
public class UserReader {


    public void Reading_P_Qusetion(ArrayList<PersonModel> PersonInfo) {
        PersonModel PModel;
        try {

            File User_file = new File("src\\Recorces\\UserFile.txt");
            Scanner scan = new Scanner(User_file);
//            FileReader fr = new FileReader(Questions_file);

            while ((scan.hasNextLine())) {
                String line = scan.nextLine();
                PModel = new PersonModel(line);
                PersonInfo.add(PModel);
            }
        } catch (IOException e) {
            System.out.println("File Read Error " + e.getMessage());
        }

    }

}
