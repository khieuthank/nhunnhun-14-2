/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author trant
 */
public class Questions {
    private int id;
    private String QuestionText;

    public Questions() {
    }

    public Questions(int id, String QuestionText) {
        this.id = id;
        this.QuestionText = QuestionText;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getQuestionText() {
        return QuestionText;
    }

    public void setQuestionText(String QuestionText) {
        this.QuestionText = QuestionText;
    }

    @Override
    public String toString() {
        return "Questions{" + "id=" + id + ", QuestionText=" + QuestionText + '}';
    }
    
}
