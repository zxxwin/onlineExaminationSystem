package com.newx.pojo;

public class Subcategory {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subcategory.subCategory_id
     *
     * @mbggenerated
     */
    private Integer subcategoryId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subcategory.subCategory_name
     *
     * @mbggenerated
     */
    private String subcategoryName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subcategory.super_category
     *
     * @mbggenerated
     */
    private Integer superCategory;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column subcategory.delete
     *
     * @mbggenerated
     */
    private Integer delete;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subcategory
     *
     * @mbggenerated
     */
    public Subcategory(Integer subcategoryId, String subcategoryName, Integer superCategory, Integer delete) {
        this.subcategoryId = subcategoryId;
        this.subcategoryName = subcategoryName;
        this.superCategory = superCategory;
        this.delete = delete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table subcategory
     *
     * @mbggenerated
     */
    public Subcategory() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subcategory.subCategory_id
     *
     * @return the value of subcategory.subCategory_id
     *
     * @mbggenerated
     */
    public Integer getSubcategoryId() {
        return subcategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subcategory.subCategory_id
     *
     * @param subcategoryId the value for subcategory.subCategory_id
     *
     * @mbggenerated
     */
    public void setSubcategoryId(Integer subcategoryId) {
        this.subcategoryId = subcategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subcategory.subCategory_name
     *
     * @return the value of subcategory.subCategory_name
     *
     * @mbggenerated
     */
    public String getSubcategoryName() {
        return subcategoryName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subcategory.subCategory_name
     *
     * @param subcategoryName the value for subcategory.subCategory_name
     *
     * @mbggenerated
     */
    public void setSubcategoryName(String subcategoryName) {
        this.subcategoryName = subcategoryName == null ? null : subcategoryName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subcategory.super_category
     *
     * @return the value of subcategory.super_category
     *
     * @mbggenerated
     */
    public Integer getSuperCategory() {
        return superCategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subcategory.super_category
     *
     * @param superCategory the value for subcategory.super_category
     *
     * @mbggenerated
     */
    public void setSuperCategory(Integer superCategory) {
        this.superCategory = superCategory;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column subcategory.delete
     *
     * @return the value of subcategory.delete
     *
     * @mbggenerated
     */
    public Integer getDelete() {
        return delete;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column subcategory.delete
     *
     * @param delete the value for subcategory.delete
     *
     * @mbggenerated
     */
    public void setDelete(Integer delete) {
        this.delete = delete;
    }
}