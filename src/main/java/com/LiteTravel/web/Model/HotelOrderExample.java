package com.LiteTravel.web.Model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HotelOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public HotelOrderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Integer value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Integer value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Integer value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Integer value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Integer value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Integer> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Integer> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Integer value1, Integer value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Integer value1, Integer value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNull() {
            addCriterion("user_phone is null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIsNotNull() {
            addCriterion("user_phone is not null");
            return (Criteria) this;
        }

        public Criteria andUserPhoneEqualTo(String value) {
            addCriterion("user_phone =", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotEqualTo(String value) {
            addCriterion("user_phone <>", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThan(String value) {
            addCriterion("user_phone >", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("user_phone >=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThan(String value) {
            addCriterion("user_phone <", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLessThanOrEqualTo(String value) {
            addCriterion("user_phone <=", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneLike(String value) {
            addCriterion("user_phone like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotLike(String value) {
            addCriterion("user_phone not like", value, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneIn(List<String> values) {
            addCriterion("user_phone in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotIn(List<String> values) {
            addCriterion("user_phone not in", values, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneBetween(String value1, String value2) {
            addCriterion("user_phone between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserPhoneNotBetween(String value1, String value2) {
            addCriterion("user_phone not between", value1, value2, "userPhone");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNull() {
            addCriterion("user_name is null");
            return (Criteria) this;
        }

        public Criteria andUserNameIsNotNull() {
            addCriterion("user_name is not null");
            return (Criteria) this;
        }

        public Criteria andUserNameEqualTo(String value) {
            addCriterion("user_name =", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotEqualTo(String value) {
            addCriterion("user_name <>", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThan(String value) {
            addCriterion("user_name >", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameGreaterThanOrEqualTo(String value) {
            addCriterion("user_name >=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThan(String value) {
            addCriterion("user_name <", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLessThanOrEqualTo(String value) {
            addCriterion("user_name <=", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameLike(String value) {
            addCriterion("user_name like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotLike(String value) {
            addCriterion("user_name not like", value, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameIn(List<String> values) {
            addCriterion("user_name in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotIn(List<String> values) {
            addCriterion("user_name not in", values, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameBetween(String value1, String value2) {
            addCriterion("user_name between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andUserNameNotBetween(String value1, String value2) {
            addCriterion("user_name not between", value1, value2, "userName");
            return (Criteria) this;
        }

        public Criteria andWhenArrivedIsNull() {
            addCriterion("when_arrived is null");
            return (Criteria) this;
        }

        public Criteria andWhenArrivedIsNotNull() {
            addCriterion("when_arrived is not null");
            return (Criteria) this;
        }

        public Criteria andWhenArrivedEqualTo(String value) {
            addCriterion("when_arrived =", value, "whenArrived");
            return (Criteria) this;
        }

        public Criteria andWhenArrivedNotEqualTo(String value) {
            addCriterion("when_arrived <>", value, "whenArrived");
            return (Criteria) this;
        }

        public Criteria andWhenArrivedGreaterThan(String value) {
            addCriterion("when_arrived >", value, "whenArrived");
            return (Criteria) this;
        }

        public Criteria andWhenArrivedGreaterThanOrEqualTo(String value) {
            addCriterion("when_arrived >=", value, "whenArrived");
            return (Criteria) this;
        }

        public Criteria andWhenArrivedLessThan(String value) {
            addCriterion("when_arrived <", value, "whenArrived");
            return (Criteria) this;
        }

        public Criteria andWhenArrivedLessThanOrEqualTo(String value) {
            addCriterion("when_arrived <=", value, "whenArrived");
            return (Criteria) this;
        }

        public Criteria andWhenArrivedLike(String value) {
            addCriterion("when_arrived like", value, "whenArrived");
            return (Criteria) this;
        }

        public Criteria andWhenArrivedNotLike(String value) {
            addCriterion("when_arrived not like", value, "whenArrived");
            return (Criteria) this;
        }

        public Criteria andWhenArrivedIn(List<String> values) {
            addCriterion("when_arrived in", values, "whenArrived");
            return (Criteria) this;
        }

        public Criteria andWhenArrivedNotIn(List<String> values) {
            addCriterion("when_arrived not in", values, "whenArrived");
            return (Criteria) this;
        }

        public Criteria andWhenArrivedBetween(String value1, String value2) {
            addCriterion("when_arrived between", value1, value2, "whenArrived");
            return (Criteria) this;
        }

        public Criteria andWhenArrivedNotBetween(String value1, String value2) {
            addCriterion("when_arrived not between", value1, value2, "whenArrived");
            return (Criteria) this;
        }

        public Criteria andDaysIsNull() {
            addCriterion("days is null");
            return (Criteria) this;
        }

        public Criteria andDaysIsNotNull() {
            addCriterion("days is not null");
            return (Criteria) this;
        }

        public Criteria andDaysEqualTo(Integer value) {
            addCriterion("days =", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotEqualTo(Integer value) {
            addCriterion("days <>", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThan(Integer value) {
            addCriterion("days >", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysGreaterThanOrEqualTo(Integer value) {
            addCriterion("days >=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThan(Integer value) {
            addCriterion("days <", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysLessThanOrEqualTo(Integer value) {
            addCriterion("days <=", value, "days");
            return (Criteria) this;
        }

        public Criteria andDaysIn(List<Integer> values) {
            addCriterion("days in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotIn(List<Integer> values) {
            addCriterion("days not in", values, "days");
            return (Criteria) this;
        }

        public Criteria andDaysBetween(Integer value1, Integer value2) {
            addCriterion("days between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andDaysNotBetween(Integer value1, Integer value2) {
            addCriterion("days not between", value1, value2, "days");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(String value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(String value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(String value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(String value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(String value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(String value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLike(String value) {
            addCriterion("status like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotLike(String value) {
            addCriterion("status not like", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<String> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<String> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(String value1, String value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(String value1, String value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andCheckInIsNull() {
            addCriterion("check_in is null");
            return (Criteria) this;
        }

        public Criteria andCheckInIsNotNull() {
            addCriterion("check_in is not null");
            return (Criteria) this;
        }

        public Criteria andCheckInEqualTo(Date value) {
            addCriterion("check_in =", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInNotEqualTo(Date value) {
            addCriterion("check_in <>", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInGreaterThan(Date value) {
            addCriterion("check_in >", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInGreaterThanOrEqualTo(Date value) {
            addCriterion("check_in >=", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInLessThan(Date value) {
            addCriterion("check_in <", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInLessThanOrEqualTo(Date value) {
            addCriterion("check_in <=", value, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInIn(List<Date> values) {
            addCriterion("check_in in", values, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInNotIn(List<Date> values) {
            addCriterion("check_in not in", values, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInBetween(Date value1, Date value2) {
            addCriterion("check_in between", value1, value2, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckInNotBetween(Date value1, Date value2) {
            addCriterion("check_in not between", value1, value2, "checkIn");
            return (Criteria) this;
        }

        public Criteria andCheckOutIsNull() {
            addCriterion("check_out is null");
            return (Criteria) this;
        }

        public Criteria andCheckOutIsNotNull() {
            addCriterion("check_out is not null");
            return (Criteria) this;
        }

        public Criteria andCheckOutEqualTo(Date value) {
            addCriterion("check_out =", value, "checkOut");
            return (Criteria) this;
        }

        public Criteria andCheckOutNotEqualTo(Date value) {
            addCriterion("check_out <>", value, "checkOut");
            return (Criteria) this;
        }

        public Criteria andCheckOutGreaterThan(Date value) {
            addCriterion("check_out >", value, "checkOut");
            return (Criteria) this;
        }

        public Criteria andCheckOutGreaterThanOrEqualTo(Date value) {
            addCriterion("check_out >=", value, "checkOut");
            return (Criteria) this;
        }

        public Criteria andCheckOutLessThan(Date value) {
            addCriterion("check_out <", value, "checkOut");
            return (Criteria) this;
        }

        public Criteria andCheckOutLessThanOrEqualTo(Date value) {
            addCriterion("check_out <=", value, "checkOut");
            return (Criteria) this;
        }

        public Criteria andCheckOutIn(List<Date> values) {
            addCriterion("check_out in", values, "checkOut");
            return (Criteria) this;
        }

        public Criteria andCheckOutNotIn(List<Date> values) {
            addCriterion("check_out not in", values, "checkOut");
            return (Criteria) this;
        }

        public Criteria andCheckOutBetween(Date value1, Date value2) {
            addCriterion("check_out between", value1, value2, "checkOut");
            return (Criteria) this;
        }

        public Criteria andCheckOutNotBetween(Date value1, Date value2) {
            addCriterion("check_out not between", value1, value2, "checkOut");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNull() {
            addCriterion("pay_date is null");
            return (Criteria) this;
        }

        public Criteria andPayDateIsNotNull() {
            addCriterion("pay_date is not null");
            return (Criteria) this;
        }

        public Criteria andPayDateEqualTo(Date value) {
            addCriterion("pay_date =", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotEqualTo(Date value) {
            addCriterion("pay_date <>", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThan(Date value) {
            addCriterion("pay_date >", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateGreaterThanOrEqualTo(Date value) {
            addCriterion("pay_date >=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThan(Date value) {
            addCriterion("pay_date <", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateLessThanOrEqualTo(Date value) {
            addCriterion("pay_date <=", value, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateIn(List<Date> values) {
            addCriterion("pay_date in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotIn(List<Date> values) {
            addCriterion("pay_date not in", values, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateBetween(Date value1, Date value2) {
            addCriterion("pay_date between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andPayDateNotBetween(Date value1, Date value2) {
            addCriterion("pay_date not between", value1, value2, "payDate");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckInIsNull() {
            addCriterion("confirm_check_in is null");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckInIsNotNull() {
            addCriterion("confirm_check_in is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckInEqualTo(Date value) {
            addCriterion("confirm_check_in =", value, "confirmCheckIn");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckInNotEqualTo(Date value) {
            addCriterion("confirm_check_in <>", value, "confirmCheckIn");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckInGreaterThan(Date value) {
            addCriterion("confirm_check_in >", value, "confirmCheckIn");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckInGreaterThanOrEqualTo(Date value) {
            addCriterion("confirm_check_in >=", value, "confirmCheckIn");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckInLessThan(Date value) {
            addCriterion("confirm_check_in <", value, "confirmCheckIn");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckInLessThanOrEqualTo(Date value) {
            addCriterion("confirm_check_in <=", value, "confirmCheckIn");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckInIn(List<Date> values) {
            addCriterion("confirm_check_in in", values, "confirmCheckIn");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckInNotIn(List<Date> values) {
            addCriterion("confirm_check_in not in", values, "confirmCheckIn");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckInBetween(Date value1, Date value2) {
            addCriterion("confirm_check_in between", value1, value2, "confirmCheckIn");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckInNotBetween(Date value1, Date value2) {
            addCriterion("confirm_check_in not between", value1, value2, "confirmCheckIn");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckOutIsNull() {
            addCriterion("confirm_check_out is null");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckOutIsNotNull() {
            addCriterion("confirm_check_out is not null");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckOutEqualTo(Date value) {
            addCriterion("confirm_check_out =", value, "confirmCheckOut");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckOutNotEqualTo(Date value) {
            addCriterion("confirm_check_out <>", value, "confirmCheckOut");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckOutGreaterThan(Date value) {
            addCriterion("confirm_check_out >", value, "confirmCheckOut");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckOutGreaterThanOrEqualTo(Date value) {
            addCriterion("confirm_check_out >=", value, "confirmCheckOut");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckOutLessThan(Date value) {
            addCriterion("confirm_check_out <", value, "confirmCheckOut");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckOutLessThanOrEqualTo(Date value) {
            addCriterion("confirm_check_out <=", value, "confirmCheckOut");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckOutIn(List<Date> values) {
            addCriterion("confirm_check_out in", values, "confirmCheckOut");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckOutNotIn(List<Date> values) {
            addCriterion("confirm_check_out not in", values, "confirmCheckOut");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckOutBetween(Date value1, Date value2) {
            addCriterion("confirm_check_out between", value1, value2, "confirmCheckOut");
            return (Criteria) this;
        }

        public Criteria andConfirmCheckOutNotBetween(Date value1, Date value2) {
            addCriterion("confirm_check_out not between", value1, value2, "confirmCheckOut");
            return (Criteria) this;
        }

        public Criteria andTotalIsNull() {
            addCriterion("total is null");
            return (Criteria) this;
        }

        public Criteria andTotalIsNotNull() {
            addCriterion("total is not null");
            return (Criteria) this;
        }

        public Criteria andTotalEqualTo(Float value) {
            addCriterion("total =", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotEqualTo(Float value) {
            addCriterion("total <>", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThan(Float value) {
            addCriterion("total >", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalGreaterThanOrEqualTo(Float value) {
            addCriterion("total >=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThan(Float value) {
            addCriterion("total <", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalLessThanOrEqualTo(Float value) {
            addCriterion("total <=", value, "total");
            return (Criteria) this;
        }

        public Criteria andTotalIn(List<Float> values) {
            addCriterion("total in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotIn(List<Float> values) {
            addCriterion("total not in", values, "total");
            return (Criteria) this;
        }

        public Criteria andTotalBetween(Float value1, Float value2) {
            addCriterion("total between", value1, value2, "total");
            return (Criteria) this;
        }

        public Criteria andTotalNotBetween(Float value1, Float value2) {
            addCriterion("total not between", value1, value2, "total");
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