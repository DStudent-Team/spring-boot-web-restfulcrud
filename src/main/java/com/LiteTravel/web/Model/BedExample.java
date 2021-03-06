package com.LiteTravel.web.Model;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class BedExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BedExample() {
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

        public Criteria andBedIdIsNull() {
            addCriterion("bed_id is null");
            return (Criteria) this;
        }

        public Criteria andBedIdIsNotNull() {
            addCriterion("bed_id is not null");
            return (Criteria) this;
        }

        public Criteria andBedIdEqualTo(Integer value) {
            addCriterion("bed_id =", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdNotEqualTo(Integer value) {
            addCriterion("bed_id <>", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdGreaterThan(Integer value) {
            addCriterion("bed_id >", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("bed_id >=", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdLessThan(Integer value) {
            addCriterion("bed_id <", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdLessThanOrEqualTo(Integer value) {
            addCriterion("bed_id <=", value, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdIn(List<Integer> values) {
            addCriterion("bed_id in", values, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdNotIn(List<Integer> values) {
            addCriterion("bed_id not in", values, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdBetween(Integer value1, Integer value2) {
            addCriterion("bed_id between", value1, value2, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("bed_id not between", value1, value2, "bedId");
            return (Criteria) this;
        }

        public Criteria andBedNameIsNull() {
            addCriterion("bed_name is null");
            return (Criteria) this;
        }

        public Criteria andBedNameIsNotNull() {
            addCriterion("bed_name is not null");
            return (Criteria) this;
        }

        public Criteria andBedNameEqualTo(String value) {
            addCriterion("bed_name =", value, "bedName");
            return (Criteria) this;
        }

        public Criteria andBedNameNotEqualTo(String value) {
            addCriterion("bed_name <>", value, "bedName");
            return (Criteria) this;
        }

        public Criteria andBedNameGreaterThan(String value) {
            addCriterion("bed_name >", value, "bedName");
            return (Criteria) this;
        }

        public Criteria andBedNameGreaterThanOrEqualTo(String value) {
            addCriterion("bed_name >=", value, "bedName");
            return (Criteria) this;
        }

        public Criteria andBedNameLessThan(String value) {
            addCriterion("bed_name <", value, "bedName");
            return (Criteria) this;
        }

        public Criteria andBedNameLessThanOrEqualTo(String value) {
            addCriterion("bed_name <=", value, "bedName");
            return (Criteria) this;
        }

        public Criteria andBedNameLike(String value) {
            addCriterion("bed_name like", value, "bedName");
            return (Criteria) this;
        }

        public Criteria andBedNameNotLike(String value) {
            addCriterion("bed_name not like", value, "bedName");
            return (Criteria) this;
        }

        public Criteria andBedNameIn(List<String> values) {
            addCriterion("bed_name in", values, "bedName");
            return (Criteria) this;
        }

        public Criteria andBedNameNotIn(List<String> values) {
            addCriterion("bed_name not in", values, "bedName");
            return (Criteria) this;
        }

        public Criteria andBedNameBetween(String value1, String value2) {
            addCriterion("bed_name between", value1, value2, "bedName");
            return (Criteria) this;
        }

        public Criteria andBedNameNotBetween(String value1, String value2) {
            addCriterion("bed_name not between", value1, value2, "bedName");
            return (Criteria) this;
        }

        public Criteria andBedSizeIsNull() {
            addCriterion("bed_size is null");
            return (Criteria) this;
        }

        public Criteria andBedSizeIsNotNull() {
            addCriterion("bed_size is not null");
            return (Criteria) this;
        }

        public Criteria andBedSizeEqualTo(BigDecimal value) {
            addCriterion("bed_size =", value, "bedSize");
            return (Criteria) this;
        }

        public Criteria andBedSizeNotEqualTo(BigDecimal value) {
            addCriterion("bed_size <>", value, "bedSize");
            return (Criteria) this;
        }

        public Criteria andBedSizeGreaterThan(BigDecimal value) {
            addCriterion("bed_size >", value, "bedSize");
            return (Criteria) this;
        }

        public Criteria andBedSizeGreaterThanOrEqualTo(BigDecimal value) {
            addCriterion("bed_size >=", value, "bedSize");
            return (Criteria) this;
        }

        public Criteria andBedSizeLessThan(BigDecimal value) {
            addCriterion("bed_size <", value, "bedSize");
            return (Criteria) this;
        }

        public Criteria andBedSizeLessThanOrEqualTo(BigDecimal value) {
            addCriterion("bed_size <=", value, "bedSize");
            return (Criteria) this;
        }

        public Criteria andBedSizeIn(List<BigDecimal> values) {
            addCriterion("bed_size in", values, "bedSize");
            return (Criteria) this;
        }

        public Criteria andBedSizeNotIn(List<BigDecimal> values) {
            addCriterion("bed_size not in", values, "bedSize");
            return (Criteria) this;
        }

        public Criteria andBedSizeBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bed_size between", value1, value2, "bedSize");
            return (Criteria) this;
        }

        public Criteria andBedSizeNotBetween(BigDecimal value1, BigDecimal value2) {
            addCriterion("bed_size not between", value1, value2, "bedSize");
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