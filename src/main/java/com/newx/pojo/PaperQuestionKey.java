package com.newx.pojo;

public class PaperQuestionKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_question.paper_id
     *
     * @mbggenerated
     */
    private Integer paperId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column paper_question.question_id
     *
     * @mbggenerated
     */
    private Integer questionId;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_question
     *
     * @mbggenerated
     */
    public PaperQuestionKey(Integer paperId, Integer questionId) {
        this.paperId = paperId;
        this.questionId = questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table paper_question
     *
     * @mbggenerated
     */
    public PaperQuestionKey() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_question.paper_id
     *
     * @return the value of paper_question.paper_id
     *
     * @mbggenerated
     */
    public Integer getPaperId() {
        return paperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_question.paper_id
     *
     * @param paperId the value for paper_question.paper_id
     *
     * @mbggenerated
     */
    public void setPaperId(Integer paperId) {
        this.paperId = paperId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column paper_question.question_id
     *
     * @return the value of paper_question.question_id
     *
     * @mbggenerated
     */
    public Integer getQuestionId() {
        return questionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column paper_question.question_id
     *
     * @param questionId the value for paper_question.question_id
     *
     * @mbggenerated
     */
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }
}