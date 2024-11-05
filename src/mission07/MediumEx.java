package mission07;

import java.util.ArrayList;
import java.util.Scanner;

public class MediumEx {

    private  ArrayList<String> questionList = new ArrayList<>();
    private  ArrayList<Integer> answerList = new ArrayList<>();
    private Scanner input = new Scanner(System.in);
    private int correctCount = 0;
    private int score = 0;

    public static void main(String[] args) {

        MediumEx quiz = new MediumEx();

        quiz.initializeQuize();

        quiz.addQustion("Q1. 대한민국의 수도는 어디 일까요? \n " +
                "1.서울 2.전주 2.부산 3.뉴욕 4.베이징 5.인천\n\n" +
                "번호를 입력해주세요.",1);

        quiz.addQustion("Q2. 캐나다의 수도는 어디 일까요? \n " +
                "1.뉴욕 2.오타와 3.도쿄 4.벤쿠버 5.워싱턴D.C\n\n" +
                "번호를 입력해주세요.",2);

        quiz.addQustion("Q3. 미국의 수도는 어디 일까요? \n " +
                "1.뉴욕 2.오타와 3.LA 4.토론토 5.워싱턴D.C\n\n" +
                "번호를 입력해주세요.",5);

        quiz.addQustion("Q4. 프랑스의 수도는 어디 일까요? \n " +
                "1.베를린 2.파리 3.로마 4.마드리드 5.런던\n\n" +
                "번호를 입력해주세요.",2);

        quiz.addQustion("Q5. 이탈리아의 수도는 어디 일까요? \n " +
                "1.로마 2.피렌체 3.베를린 4.마드리드 5.런던\n\n" +
                "번호를 입력해주세요.",1);

        quiz.displayQuiz(quiz);
        quiz.displayResult();
    }

    private  void initializeQuize() {
        System.out.println("**********************************");
        System.out.println("각 나라의 수도를 맞춰보세요!!🇰🇷🇳🇪🇱🇸🇲🇶🇲🇾");
        System.out.println("**********************************");
    }

    public void addQustion(String questionText, int correctAnswer){
        questionList.add(questionText);
        answerList.add(correctAnswer);
    }

    private void displayQuiz(MediumEx quiz) {
        for (int i = 0; i < questionList.size(); i++) {
            System.out.println(questionList.get(i));
            int userAnswer = input.nextInt();
            quiz.checkAnswer(userAnswer, i);
        }
    }

    private  void checkAnswer(int userAnswer, int index) {
        if (userAnswer == answerList.get(index)) {
            System.out.println("⭕️정답입니다!");
            correctCount++;
            score += 100 / questionList.size();
        } else {
            System.out.println("❌정답이 아닙니다. 정답은 " + answerList.get(index) + "번 입니다.");
        }
    }

    private void displayResult() {
        System.out.println("모든 문제가 끝났습니다.");
        System.out.println(questionList.size() + "개의 문제 중 총 맞은 개수는 " + correctCount + "개이고, 점수는 " + score + "점입니다.");
    }
}




/*
  public class MediumEx {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        ArrayList<String> question = new ArrayList<>();
        ArrayList<Integer> answer = new ArrayList<>();

        int correctCount=0;
        int score=0;

        System.out.println("**********************************");
        System.out.println("각 나라의 수도를 맞춰보세요!!🇰🇷🇳🇪🇱🇸🇲🇶🇲🇾");
        System.out.println("**********************************");


        String q1="Q1. 대한민국의 수도는 어디 일까요? \n " +
                "1.서울 2.전주 2.부산 3.뉴욕 4.베이징 5.인천\n\n"+
                "번호를 입력해주세요.";
        int a1=1;
        question.add(q1);
        answer.add(a1);

        String q2="Q2. 캐나다의 수도는 어디 일까요? \n " +
                "1.뉴욕 2.오타와 3.도쿄 4.벤쿠버 5.워싱턴D.C\n\n"+
                "번호를 입력해주세요.";
        int a2=2;
        question.add(q2);
        answer.add(a2);

        String q3="Q3. 미국의 수도는 어디 일까요? \n " +
                "1.뉴욕 2.오타와 3.LA 4.토론토 5.워싱턴D.C\n\n"+
                "번호를 입력해주세요.";
        int a3=5;
        question.add(q3);
        answer.add(a3);

        int size =0;
        while(size<question.size()){
            for (int i = 0; i < question.size(); i++) {
                System.out.println(question.get(i));
                int userAnswer = input.nextInt();
                if (userAnswer == answer.get(i)) {
                    System.out.println("⭕️정답입니다!");
                    correctCount++;
                    score+=100/question.size();
                } else {
                    System.out.println("❌정답이 아닙니다. 정답은 " + answer.get(i) + "번 입니다.");
                }
                size++;
            }
            System.out.println("모든 문제가 끝났습니다.");
            System.out.println(question.size()+"개의 문제 중 총 맞은 개수는 "+correctCount+"개이고, 점수는 "+score+"점입니다.");
        }

    }


*/