public class User {
    //properties
    private int userHP;
    private int userAttack;
    private int score;
    private int questionsAnswered;

    //TODO add userLevel, Exp, MonsterExp, methods
    //getters

    public int getUserHP() {
        return userHP;
    }

    public int getUserAttack() {
        return userAttack;
    }

    public int getScore(){
        return score;
    }

    public int getQuestionsAnswered() {
        return questionsAnswered;
    }

    //setters


    public void setUserHP(int userHP) {
        this.userHP = userHP;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setUserAttack(int userAttack) {
        this.userAttack = userAttack;
    }

    //constructor
    public User(int score, int questionsAnswered, int userHP, int userAttack){
        this.score = 0;
        this.questionsAnswered = 0;
        this.userHP = 100;
        this.userAttack = userAttack;
    }

    public void addScore(){
        score++;
    }

    public void answerQuestion() {
        questionsAnswered++;
    }

    public void damagedUser(int attack){
        userHP = userHP - attack;

    }

    public void changeUserAttack(String questionID){
        if(questionID.substring(13,15).equals("H1")){
            setUserAttack(10);
        } else if (questionID.substring(13,15).equals("K1")) {
            setUserAttack(15);
        }else if (questionID.substring(13,15).equals("Kn")) {
            setUserAttack(20);
        }

    }
}