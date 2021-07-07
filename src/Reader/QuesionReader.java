/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
        package Reader;

import SurveyModel.QuestionModel;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HilalA
 */
public class QuesionReader {

    public QuesionReader() {
    }

    public void ReadingQuestion(ArrayList<QuestionModel> QuestionList){

        QuestionModel p;
        try {

            File Questions_file = new File("src\\Recorces\\QuestionsFile.txt");
            Scanner scanner = new Scanner(Questions_file);
//            FileReader fr = new FileReader(Questions_file);
//            BufferedReader br = new BufferedReader(fr);

//
//        while((line =br.readLine()) !=null){
//         for (int i = 0; i < alist; i++) {
//            QuestionModel p=new QuestionModel(line);
//            QuestionList.add(p);
//        }
//        }
            while ((scanner.hasNextLine())) {
                String line = scanner.nextLine();
                String[] ar = line.split(",");
                for (int i = 0; i < ar.length; i+=2) {
                    p = new QuestionModel(ar[i], ar[i + 1]);
                    QuestionList.add(p);
                }
            }



        }


        catch (IOException e) {
            System.out.println("File Read Error " + e.getMessage());
        }

    }

}