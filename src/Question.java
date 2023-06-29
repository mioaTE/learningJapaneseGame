import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Question {

    //properties
    private String questionID;
    private String question;
    private String choice;
    private String answer;

    //getter

    public String getQuestionID(){
        return questionID;
    }
    public String getQuestion(){
        return question;
    }
    public String getChoice(){
        return choice;
    }
    public String getAnswer(){
        return answer;
    }
    //setter


    //constructions
    public Question(String questionID, String question, String choice, String answer){
        this.questionID = questionID;
        this.question = question;
        this.choice = choice;
        this.answer = answer;
    }

    //methods
    public static List<Question> makeList(String destination){
        File file = new File(destination);
        List<Question> questionList = new ArrayList<>();
        try(Scanner scanner = new Scanner(file)){
            while(scanner.hasNextLine()){
                String inputLine = scanner.nextLine();
                String[] word = inputLine.split("\\|");
                Question question = new Question(word[0], word[1],word[2], word[3]);
                questionList.add(question);
            }

        }catch(FileNotFoundException e){
            System.out.println(file.getName() + " could not be found");
        }

        return questionList;
    }

    @Override
    public String toString() {
        return "Question ID: " + questionID + "\n"
                + "Question: " + question + "\n"
                + "Choice: " + choice + "\n";
//                + "Answer: " + answer;
    }





}
