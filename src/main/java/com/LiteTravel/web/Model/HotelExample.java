package com.LiteTravel.web.Model;

import java.util.ArrayList;
import java.util.List;

public class HotelExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelExample() {
        oredCriteria = new ArrayList<>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andHotelIdIsNull() {
            addCriterion("hotel_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelIdIsNotNull() {
            addCriterion("hotel_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelIdEqualTo(Integer value) {
            addCriterion("hotel_id =", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotEqualTo(Integer value) {
            addCriterion("hotel_id <>", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThan(Integer value) {
            addCriterion("hotel_id >", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_id >=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThan(Integer value) {
            addCriterion("hotel_id <", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_id <=", value, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdIn(List<Integer> values) {
            addCriterion("hotel_id in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotIn(List<Integer> values) {
            addCriterion("hotel_id not in", values, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdBetween(Integer value1, Integer value2) {
            addCriterion("hotel_id between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_id not between", value1, value2, "hotelId");
            return (Criteria) this;
        }

        public Criteria andHotelNameIsNull() {
            addCriterion("hotel_name is null");
            return (Criteria) this;
        }

        public Criteria andHotelNameIsNotNull() {
            addCriterion("hotel_name is not null");
            return (Criteria) this;
        }

        public Criteria andHotelNameEqualTo(String value) {
            addCriterion("hotel_name =", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotEqualTo(String value) {
            addCriterion("hotel_name <>", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameGreaterThan(String value) {
            addCriterion("hotel_name >", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_name >=", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLessThan(String value) {
            addCriterion("hotel_name <", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLessThanOrEqualTo(String value) {
            addCriterion("hotel_name <=", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameLike(String value) {
            addCriterion("hotel_name like", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotLike(String value) {
            addCriterion("hotel_name not like", value, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameIn(List<String> values) {
            addCriterion("hotel_name in", values, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotIn(List<String> values) {
            addCriterion("hotel_name not in", values, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameBetween(String value1, String value2) {
            addCriterion("hotel_name between", value1, value2, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelNameNotBetween(String value1, String value2) {
            addCriterion("hotel_name not between", value1, value2, "hotelName");
            return (Criteria) this;
        }

        public Criteria andHotelMinPriceIsNull() {
            addCriterion("hotel_min_price is null");
            return (Criteria) this;
        }

        public Criteria andHotelMinPriceIsNotNull() {
            addCriterion("hotel_min_price is not null");
            return (Criteria) this;
        }

        public Criteria andHotelMinPriceEqualTo(Integer value) {
            addCriterion("hotel_min_price =", value, "hotelMinPrice");
            return (Criteria) this;
        }

        public Criteria andHotelMinPriceNotEqualTo(Integer value) {
            addCriterion("hotel_min_price <>", value, "hotelMinPrice");
            return (Criteria) this;
        }

        public Criteria andHotelMinPriceGreaterThan(Integer value) {
            addCriterion("hotel_min_price >", value, "hotelMinPrice");
            return (Criteria) this;
        }

        public Criteria andHotelMinPriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_min_price >=", value, "hotelMinPrice");
            return (Criteria) this;
        }

        public Criteria andHotelMinPriceLessThan(Integer value) {
            addCriterion("hotel_min_price <", value, "hotelMinPrice");
            return (Criteria) this;
        }

        public Criteria andHotelMinPriceLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_min_price <=", value, "hotelMinPrice");
            return (Criteria) this;
        }

        public Criteria andHotelMinPriceIn(List<Integer> values) {
            addCriterion("hotel_min_price in", values, "hotelMinPrice");
            return (Criteria) this;
        }

        public Criteria andHotelMinPriceNotIn(List<Integer> values) {
            addCriterion("hotel_min_price not in", values, "hotelMinPrice");
            return (Criteria) this;
        }

        public Criteria andHotelMinPriceBetween(Integer value1, Integer value2) {
            addCriterion("hotel_min_price between", value1, value2, "hotelMinPrice");
            return (Criteria) this;
        }

        public Criteria andHotelMinPriceNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_min_price not between", value1, value2, "hotelMinPrice");
            return (Criteria) this;
        }

        public Criteria andHotelManagerIdIsNull() {
            addCriterion("hotel_manager_id is null");
            return (Criteria) this;
        }

        public Criteria andHotelManagerIdIsNotNull() {
            addCriterion("hotel_manager_id is not null");
            return (Criteria) this;
        }

        public Criteria andHotelManagerIdEqualTo(Integer value) {
            addCriterion("hotel_manager_id =", value, "hotelManagerId");
            return (Criteria) this;
        }

        public Criteria andHotelManagerIdNotEqualTo(Integer value) {
            addCriterion("hotel_manager_id <>", value, "hotelManagerId");
            return (Criteria) this;
        }

        public Criteria andHotelManagerIdGreaterThan(Integer value) {
            addCriterion("hotel_manager_id >", value, "hotelManagerId");
            return (Criteria) this;
        }

        public Criteria andHotelManagerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_manager_id >=", value, "hotelManagerId");
            return (Criteria) this;
        }

        public Criteria andHotelManagerIdLessThan(Integer value) {
            addCriterion("hotel_manager_id <", value, "hotelManagerId");
            return (Criteria) this;
        }

        public Criteria andHotelManagerIdLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_manager_id <=", value, "hotelManagerId");
            return (Criteria) this;
        }

        public Criteria andHotelManagerIdIn(List<Integer> values) {
            addCriterion("hotel_manager_id in", values, "hotelManagerId");
            return (Criteria) this;
        }

        public Criteria andHotelManagerIdNotIn(List<Integer> values) {
            addCriterion("hotel_manager_id not in", values, "hotelManagerId");
            return (Criteria) this;
        }

        public Criteria andHotelManagerIdBetween(Integer value1, Integer value2) {
            addCriterion("hotel_manager_id between", value1, value2, "hotelManagerId");
            return (Criteria) this;
        }

        public Criteria andHotelManagerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_manager_id not between", value1, value2, "hotelManagerId");
            return (Criteria) this;
        }

        public Criteria andHotelPhoneIsNull() {
            addCriterion("hotel_phone is null");
            return (Criteria) this;
        }

        public Criteria andHotelPhoneIsNotNull() {
            addCriterion("hotel_phone is not null");
            return (Criteria) this;
        }

        public Criteria andHotelPhoneEqualTo(String value) {
            addCriterion("hotel_phone =", value, "hotelPhone");
            return (Criteria) this;
        }

        public Criteria andHotelPhoneNotEqualTo(String value) {
            addCriterion("hotel_phone <>", value, "hotelPhone");
            return (Criteria) this;
        }

        public Criteria andHotelPhoneGreaterThan(String value) {
            addCriterion("hotel_phone >", value, "hotelPhone");
            return (Criteria) this;
        }

        public Criteria andHotelPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_phone >=", value, "hotelPhone");
            return (Criteria) this;
        }

        public Criteria andHotelPhoneLessThan(String value) {
            addCriterion("hotel_phone <", value, "hotelPhone");
            return (Criteria) this;
        }

        public Criteria andHotelPhoneLessThanOrEqualTo(String value) {
            addCriterion("hotel_phone <=", value, "hotelPhone");
            return (Criteria) this;
        }

        public Criteria andHotelPhoneLike(String value) {
            addCriterion("hotel_phone like", value, "hotelPhone");
            return (Criteria) this;
        }

        public Criteria andHotelPhoneNotLike(String value) {
            addCriterion("hotel_phone not like", value, "hotelPhone");
            return (Criteria) this;
        }

        public Criteria andHotelPhoneIn(List<String> values) {
            addCriterion("hotel_phone in", values, "hotelPhone");
            return (Criteria) this;
        }

        public Criteria andHotelPhoneNotIn(List<String> values) {
            addCriterion("hotel_phone not in", values, "hotelPhone");
            return (Criteria) this;
        }

        public Criteria andHotelPhoneBetween(String value1, String value2) {
            addCriterion("hotel_phone between", value1, value2, "hotelPhone");
            return (Criteria) this;
        }

        public Criteria andHotelPhoneNotBetween(String value1, String value2) {
            addCriterion("hotel_phone not between", value1, value2, "hotelPhone");
            return (Criteria) this;
        }

        public Criteria andHotelReplyLevelIsNull() {
            addCriterion("hotel_reply_level is null");
            return (Criteria) this;
        }

        public Criteria andHotelReplyLevelIsNotNull() {
            addCriterion("hotel_reply_level is not null");
            return (Criteria) this;
        }

        public Criteria andHotelReplyLevelEqualTo(Integer value) {
            addCriterion("hotel_reply_level =", value, "hotelReplyLevel");
            return (Criteria) this;
        }

        public Criteria andHotelReplyLevelNotEqualTo(Integer value) {
            addCriterion("hotel_reply_level <>", value, "hotelReplyLevel");
            return (Criteria) this;
        }

        public Criteria andHotelReplyLevelGreaterThan(Integer value) {
            addCriterion("hotel_reply_level >", value, "hotelReplyLevel");
            return (Criteria) this;
        }

        public Criteria andHotelReplyLevelGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_reply_level >=", value, "hotelReplyLevel");
            return (Criteria) this;
        }

        public Criteria andHotelReplyLevelLessThan(Integer value) {
            addCriterion("hotel_reply_level <", value, "hotelReplyLevel");
            return (Criteria) this;
        }

        public Criteria andHotelReplyLevelLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_reply_level <=", value, "hotelReplyLevel");
            return (Criteria) this;
        }

        public Criteria andHotelReplyLevelIn(List<Integer> values) {
            addCriterion("hotel_reply_level in", values, "hotelReplyLevel");
            return (Criteria) this;
        }

        public Criteria andHotelReplyLevelNotIn(List<Integer> values) {
            addCriterion("hotel_reply_level not in", values, "hotelReplyLevel");
            return (Criteria) this;
        }

        public Criteria andHotelReplyLevelBetween(Integer value1, Integer value2) {
            addCriterion("hotel_reply_level between", value1, value2, "hotelReplyLevel");
            return (Criteria) this;
        }

        public Criteria andHotelReplyLevelNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_reply_level not between", value1, value2, "hotelReplyLevel");
            return (Criteria) this;
        }

        public Criteria andHotelDescriptionIsNull() {
            addCriterion("hotel_description is null");
            return (Criteria) this;
        }

        public Criteria andHotelDescriptionIsNotNull() {
            addCriterion("hotel_description is not null");
            return (Criteria) this;
        }

        public Criteria andHotelDescriptionEqualTo(String value) {
            addCriterion("hotel_description =", value, "hotelDescription");
            return (Criteria) this;
        }

        public Criteria andHotelDescriptionNotEqualTo(String value) {
            addCriterion("hotel_description <>", value, "hotelDescription");
            return (Criteria) this;
        }

        public Criteria andHotelDescriptionGreaterThan(String value) {
            addCriterion("hotel_description >", value, "hotelDescription");
            return (Criteria) this;
        }

        public Criteria andHotelDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_description >=", value, "hotelDescription");
            return (Criteria) this;
        }

        public Criteria andHotelDescriptionLessThan(String value) {
            addCriterion("hotel_description <", value, "hotelDescription");
            return (Criteria) this;
        }

        public Criteria andHotelDescriptionLessThanOrEqualTo(String value) {
            addCriterion("hotel_description <=", value, "hotelDescription");
            return (Criteria) this;
        }

        public Criteria andHotelDescriptionLike(String value) {
            addCriterion("hotel_description like", value, "hotelDescription");
            return (Criteria) this;
        }

        public Criteria andHotelDescriptionNotLike(String value) {
            addCriterion("hotel_description not like", value, "hotelDescription");
            return (Criteria) this;
        }

        public Criteria andHotelDescriptionIn(List<String> values) {
            addCriterion("hotel_description in", values, "hotelDescription");
            return (Criteria) this;
        }

        public Criteria andHotelDescriptionNotIn(List<String> values) {
            addCriterion("hotel_description not in", values, "hotelDescription");
            return (Criteria) this;
        }

        public Criteria andHotelDescriptionBetween(String value1, String value2) {
            addCriterion("hotel_description between", value1, value2, "hotelDescription");
            return (Criteria) this;
        }

        public Criteria andHotelDescriptionNotBetween(String value1, String value2) {
            addCriterion("hotel_description not between", value1, value2, "hotelDescription");
            return (Criteria) this;
        }

        public Criteria andHotelAddressIsNull() {
            addCriterion("hotel_address is null");
            return (Criteria) this;
        }

        public Criteria andHotelAddressIsNotNull() {
            addCriterion("hotel_address is not null");
            return (Criteria) this;
        }

        public Criteria andHotelAddressEqualTo(Integer value) {
            addCriterion("hotel_address =", value, "hotelAddress");
            return (Criteria) this;
        }

        public Criteria andHotelAddressNotEqualTo(Integer value) {
            addCriterion("hotel_address <>", value, "hotelAddress");
            return (Criteria) this;
        }

        public Criteria andHotelAddressGreaterThan(Integer value) {
            addCriterion("hotel_address >", value, "hotelAddress");
            return (Criteria) this;
        }

        public Criteria andHotelAddressGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_address >=", value, "hotelAddress");
            return (Criteria) this;
        }

        public Criteria andHotelAddressLessThan(Integer value) {
            addCriterion("hotel_address <", value, "hotelAddress");
            return (Criteria) this;
        }

        public Criteria andHotelAddressLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_address <=", value, "hotelAddress");
            return (Criteria) this;
        }

        public Criteria andHotelAddressIn(List<Integer> values) {
            addCriterion("hotel_address in", values, "hotelAddress");
            return (Criteria) this;
        }

        public Criteria andHotelAddressNotIn(List<Integer> values) {
            addCriterion("hotel_address not in", values, "hotelAddress");
            return (Criteria) this;
        }

        public Criteria andHotelAddressBetween(Integer value1, Integer value2) {
            addCriterion("hotel_address between", value1, value2, "hotelAddress");
            return (Criteria) this;
        }

        public Criteria andHotelAddressNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_address not between", value1, value2, "hotelAddress");
            return (Criteria) this;
        }

        public Criteria andHotelAddressSpecificIsNull() {
            addCriterion("hotel_address_specific is null");
            return (Criteria) this;
        }

        public Criteria andHotelAddressSpecificIsNotNull() {
            addCriterion("hotel_address_specific is not null");
            return (Criteria) this;
        }

        public Criteria andHotelAddressSpecificEqualTo(String value) {
            addCriterion("hotel_address_specific =", value, "hotelAddressSpecific");
            return (Criteria) this;
        }

        public Criteria andHotelAddressSpecificNotEqualTo(String value) {
            addCriterion("hotel_address_specific <>", value, "hotelAddressSpecific");
            return (Criteria) this;
        }

        public Criteria andHotelAddressSpecificGreaterThan(String value) {
            addCriterion("hotel_address_specific >", value, "hotelAddressSpecific");
            return (Criteria) this;
        }

        public Criteria andHotelAddressSpecificGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_address_specific >=", value, "hotelAddressSpecific");
            return (Criteria) this;
        }

        public Criteria andHotelAddressSpecificLessThan(String value) {
            addCriterion("hotel_address_specific <", value, "hotelAddressSpecific");
            return (Criteria) this;
        }

        public Criteria andHotelAddressSpecificLessThanOrEqualTo(String value) {
            addCriterion("hotel_address_specific <=", value, "hotelAddressSpecific");
            return (Criteria) this;
        }

        public Criteria andHotelAddressSpecificLike(String value) {
            addCriterion("hotel_address_specific like", value, "hotelAddressSpecific");
            return (Criteria) this;
        }

        public Criteria andHotelAddressSpecificNotLike(String value) {
            addCriterion("hotel_address_specific not like", value, "hotelAddressSpecific");
            return (Criteria) this;
        }

        public Criteria andHotelAddressSpecificIn(List<String> values) {
            addCriterion("hotel_address_specific in", values, "hotelAddressSpecific");
            return (Criteria) this;
        }

        public Criteria andHotelAddressSpecificNotIn(List<String> values) {
            addCriterion("hotel_address_specific not in", values, "hotelAddressSpecific");
            return (Criteria) this;
        }

        public Criteria andHotelAddressSpecificBetween(String value1, String value2) {
            addCriterion("hotel_address_specific between", value1, value2, "hotelAddressSpecific");
            return (Criteria) this;
        }

        public Criteria andHotelAddressSpecificNotBetween(String value1, String value2) {
            addCriterion("hotel_address_specific not between", value1, value2, "hotelAddressSpecific");
            return (Criteria) this;
        }

        public Criteria andHotelImgUriIsNull() {
            addCriterion("hotel_img_uri is null");
            return (Criteria) this;
        }

        public Criteria andHotelImgUriIsNotNull() {
            addCriterion("hotel_img_uri is not null");
            return (Criteria) this;
        }

        public Criteria andHotelImgUriEqualTo(String value) {
            addCriterion("hotel_img_uri =", value, "hotelImgUri");
            return (Criteria) this;
        }

        public Criteria andHotelImgUriNotEqualTo(String value) {
            addCriterion("hotel_img_uri <>", value, "hotelImgUri");
            return (Criteria) this;
        }

        public Criteria andHotelImgUriGreaterThan(String value) {
            addCriterion("hotel_img_uri >", value, "hotelImgUri");
            return (Criteria) this;
        }

        public Criteria andHotelImgUriGreaterThanOrEqualTo(String value) {
            addCriterion("hotel_img_uri >=", value, "hotelImgUri");
            return (Criteria) this;
        }

        public Criteria andHotelImgUriLessThan(String value) {
            addCriterion("hotel_img_uri <", value, "hotelImgUri");
            return (Criteria) this;
        }

        public Criteria andHotelImgUriLessThanOrEqualTo(String value) {
            addCriterion("hotel_img_uri <=", value, "hotelImgUri");
            return (Criteria) this;
        }

        public Criteria andHotelImgUriLike(String value) {
            addCriterion("hotel_img_uri like", value, "hotelImgUri");
            return (Criteria) this;
        }

        public Criteria andHotelImgUriNotLike(String value) {
            addCriterion("hotel_img_uri not like", value, "hotelImgUri");
            return (Criteria) this;
        }

        public Criteria andHotelImgUriIn(List<String> values) {
            addCriterion("hotel_img_uri in", values, "hotelImgUri");
            return (Criteria) this;
        }

        public Criteria andHotelImgUriNotIn(List<String> values) {
            addCriterion("hotel_img_uri not in", values, "hotelImgUri");
            return (Criteria) this;
        }

        public Criteria andHotelImgUriBetween(String value1, String value2) {
            addCriterion("hotel_img_uri between", value1, value2, "hotelImgUri");
            return (Criteria) this;
        }

        public Criteria andHotelImgUriNotBetween(String value1, String value2) {
            addCriterion("hotel_img_uri not between", value1, value2, "hotelImgUri");
            return (Criteria) this;
        }

        public Criteria andHotelReplyCountIsNull() {
            addCriterion("hotel_reply_count is null");
            return (Criteria) this;
        }

        public Criteria andHotelReplyCountIsNotNull() {
            addCriterion("hotel_reply_count is not null");
            return (Criteria) this;
        }

        public Criteria andHotelReplyCountEqualTo(Integer value) {
            addCriterion("hotel_reply_count =", value, "hotelReplyCount");
            return (Criteria) this;
        }

        public Criteria andHotelReplyCountNotEqualTo(Integer value) {
            addCriterion("hotel_reply_count <>", value, "hotelReplyCount");
            return (Criteria) this;
        }

        public Criteria andHotelReplyCountGreaterThan(Integer value) {
            addCriterion("hotel_reply_count >", value, "hotelReplyCount");
            return (Criteria) this;
        }

        public Criteria andHotelReplyCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("hotel_reply_count >=", value, "hotelReplyCount");
            return (Criteria) this;
        }

        public Criteria andHotelReplyCountLessThan(Integer value) {
            addCriterion("hotel_reply_count <", value, "hotelReplyCount");
            return (Criteria) this;
        }

        public Criteria andHotelReplyCountLessThanOrEqualTo(Integer value) {
            addCriterion("hotel_reply_count <=", value, "hotelReplyCount");
            return (Criteria) this;
        }

        public Criteria andHotelReplyCountIn(List<Integer> values) {
            addCriterion("hotel_reply_count in", values, "hotelReplyCount");
            return (Criteria) this;
        }

        public Criteria andHotelReplyCountNotIn(List<Integer> values) {
            addCriterion("hotel_reply_count not in", values, "hotelReplyCount");
            return (Criteria) this;
        }

        public Criteria andHotelReplyCountBetween(Integer value1, Integer value2) {
            addCriterion("hotel_reply_count between", value1, value2, "hotelReplyCount");
            return (Criteria) this;
        }

        public Criteria andHotelReplyCountNotBetween(Integer value1, Integer value2) {
            addCriterion("hotel_reply_count not between", value1, value2, "hotelReplyCount");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {
        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}