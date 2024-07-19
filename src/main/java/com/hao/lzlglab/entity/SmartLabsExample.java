package com.hao.lzlglab.entity;

import java.util.ArrayList;
import java.util.List;

public class SmartLabsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SmartLabsExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("id like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("id not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andLabsNameIsNull() {
            addCriterion("labs_name is null");
            return (Criteria) this;
        }

        public Criteria andLabsNameIsNotNull() {
            addCriterion("labs_name is not null");
            return (Criteria) this;
        }

        public Criteria andLabsNameEqualTo(String value) {
            addCriterion("labs_name =", value, "labsName");
            return (Criteria) this;
        }

        public Criteria andLabsNameNotEqualTo(String value) {
            addCriterion("labs_name <>", value, "labsName");
            return (Criteria) this;
        }

        public Criteria andLabsNameGreaterThan(String value) {
            addCriterion("labs_name >", value, "labsName");
            return (Criteria) this;
        }

        public Criteria andLabsNameGreaterThanOrEqualTo(String value) {
            addCriterion("labs_name >=", value, "labsName");
            return (Criteria) this;
        }

        public Criteria andLabsNameLessThan(String value) {
            addCriterion("labs_name <", value, "labsName");
            return (Criteria) this;
        }

        public Criteria andLabsNameLessThanOrEqualTo(String value) {
            addCriterion("labs_name <=", value, "labsName");
            return (Criteria) this;
        }

        public Criteria andLabsNameLike(String value) {
            addCriterion("labs_name like", value, "labsName");
            return (Criteria) this;
        }

        public Criteria andLabsNameNotLike(String value) {
            addCriterion("labs_name not like", value, "labsName");
            return (Criteria) this;
        }

        public Criteria andLabsNameIn(List<String> values) {
            addCriterion("labs_name in", values, "labsName");
            return (Criteria) this;
        }

        public Criteria andLabsNameNotIn(List<String> values) {
            addCriterion("labs_name not in", values, "labsName");
            return (Criteria) this;
        }

        public Criteria andLabsNameBetween(String value1, String value2) {
            addCriterion("labs_name between", value1, value2, "labsName");
            return (Criteria) this;
        }

        public Criteria andLabsNameNotBetween(String value1, String value2) {
            addCriterion("labs_name not between", value1, value2, "labsName");
            return (Criteria) this;
        }

        public Criteria andInfosIsNull() {
            addCriterion("infos is null");
            return (Criteria) this;
        }

        public Criteria andInfosIsNotNull() {
            addCriterion("infos is not null");
            return (Criteria) this;
        }

        public Criteria andInfosEqualTo(String value) {
            addCriterion("infos =", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosNotEqualTo(String value) {
            addCriterion("infos <>", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosGreaterThan(String value) {
            addCriterion("infos >", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosGreaterThanOrEqualTo(String value) {
            addCriterion("infos >=", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosLessThan(String value) {
            addCriterion("infos <", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosLessThanOrEqualTo(String value) {
            addCriterion("infos <=", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosLike(String value) {
            addCriterion("infos like", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosNotLike(String value) {
            addCriterion("infos not like", value, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosIn(List<String> values) {
            addCriterion("infos in", values, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosNotIn(List<String> values) {
            addCriterion("infos not in", values, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosBetween(String value1, String value2) {
            addCriterion("infos between", value1, value2, "infos");
            return (Criteria) this;
        }

        public Criteria andInfosNotBetween(String value1, String value2) {
            addCriterion("infos not between", value1, value2, "infos");
            return (Criteria) this;
        }

        public Criteria andNetAdresIsNull() {
            addCriterion("net_adres is null");
            return (Criteria) this;
        }

        public Criteria andNetAdresIsNotNull() {
            addCriterion("net_adres is not null");
            return (Criteria) this;
        }

        public Criteria andNetAdresEqualTo(String value) {
            addCriterion("net_adres =", value, "netAdres");
            return (Criteria) this;
        }

        public Criteria andNetAdresNotEqualTo(String value) {
            addCriterion("net_adres <>", value, "netAdres");
            return (Criteria) this;
        }

        public Criteria andNetAdresGreaterThan(String value) {
            addCriterion("net_adres >", value, "netAdres");
            return (Criteria) this;
        }

        public Criteria andNetAdresGreaterThanOrEqualTo(String value) {
            addCriterion("net_adres >=", value, "netAdres");
            return (Criteria) this;
        }

        public Criteria andNetAdresLessThan(String value) {
            addCriterion("net_adres <", value, "netAdres");
            return (Criteria) this;
        }

        public Criteria andNetAdresLessThanOrEqualTo(String value) {
            addCriterion("net_adres <=", value, "netAdres");
            return (Criteria) this;
        }

        public Criteria andNetAdresLike(String value) {
            addCriterion("net_adres like", value, "netAdres");
            return (Criteria) this;
        }

        public Criteria andNetAdresNotLike(String value) {
            addCriterion("net_adres not like", value, "netAdres");
            return (Criteria) this;
        }

        public Criteria andNetAdresIn(List<String> values) {
            addCriterion("net_adres in", values, "netAdres");
            return (Criteria) this;
        }

        public Criteria andNetAdresNotIn(List<String> values) {
            addCriterion("net_adres not in", values, "netAdres");
            return (Criteria) this;
        }

        public Criteria andNetAdresBetween(String value1, String value2) {
            addCriterion("net_adres between", value1, value2, "netAdres");
            return (Criteria) this;
        }

        public Criteria andNetAdresNotBetween(String value1, String value2) {
            addCriterion("net_adres not between", value1, value2, "netAdres");
            return (Criteria) this;
        }

        public Criteria andPortIsNull() {
            addCriterion("port is null");
            return (Criteria) this;
        }

        public Criteria andPortIsNotNull() {
            addCriterion("port is not null");
            return (Criteria) this;
        }

        public Criteria andPortEqualTo(Integer value) {
            addCriterion("port =", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotEqualTo(Integer value) {
            addCriterion("port <>", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThan(Integer value) {
            addCriterion("port >", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortGreaterThanOrEqualTo(Integer value) {
            addCriterion("port >=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThan(Integer value) {
            addCriterion("port <", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortLessThanOrEqualTo(Integer value) {
            addCriterion("port <=", value, "port");
            return (Criteria) this;
        }

        public Criteria andPortIn(List<Integer> values) {
            addCriterion("port in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotIn(List<Integer> values) {
            addCriterion("port not in", values, "port");
            return (Criteria) this;
        }

        public Criteria andPortBetween(Integer value1, Integer value2) {
            addCriterion("port between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andPortNotBetween(Integer value1, Integer value2) {
            addCriterion("port not between", value1, value2, "port");
            return (Criteria) this;
        }

        public Criteria andLabsNumIsNull() {
            addCriterion("labs_num is null");
            return (Criteria) this;
        }

        public Criteria andLabsNumIsNotNull() {
            addCriterion("labs_num is not null");
            return (Criteria) this;
        }

        public Criteria andLabsNumEqualTo(String value) {
            addCriterion("labs_num =", value, "labsNum");
            return (Criteria) this;
        }

        public Criteria andLabsNumNotEqualTo(String value) {
            addCriterion("labs_num <>", value, "labsNum");
            return (Criteria) this;
        }

        public Criteria andLabsNumGreaterThan(String value) {
            addCriterion("labs_num >", value, "labsNum");
            return (Criteria) this;
        }

        public Criteria andLabsNumGreaterThanOrEqualTo(String value) {
            addCriterion("labs_num >=", value, "labsNum");
            return (Criteria) this;
        }

        public Criteria andLabsNumLessThan(String value) {
            addCriterion("labs_num <", value, "labsNum");
            return (Criteria) this;
        }

        public Criteria andLabsNumLessThanOrEqualTo(String value) {
            addCriterion("labs_num <=", value, "labsNum");
            return (Criteria) this;
        }

        public Criteria andLabsNumLike(String value) {
            addCriterion("labs_num like", value, "labsNum");
            return (Criteria) this;
        }

        public Criteria andLabsNumNotLike(String value) {
            addCriterion("labs_num not like", value, "labsNum");
            return (Criteria) this;
        }

        public Criteria andLabsNumIn(List<String> values) {
            addCriterion("labs_num in", values, "labsNum");
            return (Criteria) this;
        }

        public Criteria andLabsNumNotIn(List<String> values) {
            addCriterion("labs_num not in", values, "labsNum");
            return (Criteria) this;
        }

        public Criteria andLabsNumBetween(String value1, String value2) {
            addCriterion("labs_num between", value1, value2, "labsNum");
            return (Criteria) this;
        }

        public Criteria andLabsNumNotBetween(String value1, String value2) {
            addCriterion("labs_num not between", value1, value2, "labsNum");
            return (Criteria) this;
        }
    }

    /**
     */
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