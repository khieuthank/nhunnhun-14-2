/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author trant
 */
public class Responses {
    private int ResponseID;
    private User userID;
    private Questions questionID;
    private String answer;

    public Responses() {
    }

    public Responses(int ResponseID, User userID, Questions questionID, String answer) {
        this.ResponseID = ResponseID;
        this.userID = userID;
        this.questionID = questionID;
        this.answer = answer;
    }

    public int getResponseID() {
        return ResponseID;
    }

    public void setResponseID(int ResponseID) {
        this.ResponseID = ResponseID;
    }

    public User getUserID() {
        return userID;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    public Questions getQuestionID() {
        return questionID;
    }

    public void setQuestionID(Questions questionID) {
        this.questionID = questionID;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    @Override
    public String toString() {
        return "Responses{" + "ResponseID=" + ResponseID + ", userID=" + userID + ", questionID=" + questionID + ", answer=" + answer + '}';
    }
    
    
}
