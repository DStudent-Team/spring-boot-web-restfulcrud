package com.LiteTravel.web.Model;

public class BlogTagMap {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_blog_tags.blog_id
     *
     * @mbg.generated Sat Dec 12 16:28:15 CST 2020
     */
    private Integer blogId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_blog_tags.tag_id
     *
     * @mbg.generated Sat Dec 12 16:28:15 CST 2020
     */
    private Integer tagId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column travel_blog_tags.tag_like
     *
     * @mbg.generated Sat Dec 12 16:28:15 CST 2020
     */
    private Integer tagLike;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_blog_tags.blog_id
     *
     * @return the value of travel_blog_tags.blog_id
     *
     * @mbg.generated Sat Dec 12 16:28:15 CST 2020
     */
    public Integer getBlogId() {
        return blogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_blog_tags.blog_id
     *
     * @param blogId the value for travel_blog_tags.blog_id
     *
     * @mbg.generated Sat Dec 12 16:28:15 CST 2020
     */
    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_blog_tags.tag_id
     *
     * @return the value of travel_blog_tags.tag_id
     *
     * @mbg.generated Sat Dec 12 16:28:15 CST 2020
     */
    public Integer getTagId() {
        return tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_blog_tags.tag_id
     *
     * @param tagId the value for travel_blog_tags.tag_id
     *
     * @mbg.generated Sat Dec 12 16:28:15 CST 2020
     */
    public void setTagId(Integer tagId) {
        this.tagId = tagId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column travel_blog_tags.tag_like
     *
     * @return the value of travel_blog_tags.tag_like
     *
     * @mbg.generated Sat Dec 12 16:28:15 CST 2020
     */
    public Integer getTagLike() {
        return tagLike;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column travel_blog_tags.tag_like
     *
     * @param tagLike the value for travel_blog_tags.tag_like
     *
     * @mbg.generated Sat Dec 12 16:28:15 CST 2020
     */
    public void setTagLike(Integer tagLike) {
        this.tagLike = tagLike;
    }
}