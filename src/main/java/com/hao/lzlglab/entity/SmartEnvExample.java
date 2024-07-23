package com.hao.lzlglab.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmartEnvExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SmartEnvExample() {
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

    public void setLimit(Integer limit) {
        this.limit = limit;
    }

    public Integer getLimit() {
        return limit;
    }

    public void setOffset(Long offset) {
        this.offset = offset;
    }

    public Long getOffset() {
        return offset;
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

        public Criteria andDeviceAdresIsNull() {
            addCriterion("device_adres is null");
            return (Criteria) this;
        }

        public Criteria andDeviceAdresIsNotNull() {
            addCriterion("device_adres is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceAdresEqualTo(String value) {
            addCriterion("device_adres =", value, "deviceAdres");
            return (Criteria) this;
        }

        public Criteria andDeviceAdresNotEqualTo(String value) {
            addCriterion("device_adres <>", value, "deviceAdres");
            return (Criteria) this;
        }

        public Criteria andDeviceAdresGreaterThan(String value) {
            addCriterion("device_adres >", value, "deviceAdres");
            return (Criteria) this;
        }

        public Criteria andDeviceAdresGreaterThanOrEqualTo(String value) {
            addCriterion("device_adres >=", value, "deviceAdres");
            return (Criteria) this;
        }

        public Criteria andDeviceAdresLessThan(String value) {
            addCriterion("device_adres <", value, "deviceAdres");
            return (Criteria) this;
        }

        public Criteria andDeviceAdresLessThanOrEqualTo(String value) {
            addCriterion("device_adres <=", value, "deviceAdres");
            return (Criteria) this;
        }

        public Criteria andDeviceAdresLike(String value) {
            addCriterion("device_adres like", value, "deviceAdres");
            return (Criteria) this;
        }

        public Criteria andDeviceAdresNotLike(String value) {
            addCriterion("device_adres not like", value, "deviceAdres");
            return (Criteria) this;
        }

        public Criteria andDeviceAdresIn(List<String> values) {
            addCriterion("device_adres in", values, "deviceAdres");
            return (Criteria) this;
        }

        public Criteria andDeviceAdresNotIn(List<String> values) {
            addCriterion("device_adres not in", values, "deviceAdres");
            return (Criteria) this;
        }

        public Criteria andDeviceAdresBetween(String value1, String value2) {
            addCriterion("device_adres between", value1, value2, "deviceAdres");
            return (Criteria) this;
        }

        public Criteria andDeviceAdresNotBetween(String value1, String value2) {
            addCriterion("device_adres not between", value1, value2, "deviceAdres");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("`type` is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("`type` is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(Integer value) {
            addCriterion("`type` =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(Integer value) {
            addCriterion("`type` <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(Integer value) {
            addCriterion("`type` >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("`type` >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(Integer value) {
            addCriterion("`type` <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(Integer value) {
            addCriterion("`type` <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<Integer> values) {
            addCriterion("`type` in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<Integer> values) {
            addCriterion("`type` not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(Integer value1, Integer value2) {
            addCriterion("`type` between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("`type` not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andValueIsNull() {
            addCriterion("`value` is null");
            return (Criteria) this;
        }

        public Criteria andValueIsNotNull() {
            addCriterion("`value` is not null");
            return (Criteria) this;
        }

        public Criteria andValueEqualTo(Double value) {
            addCriterion("`value` =", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotEqualTo(Double value) {
            addCriterion("`value` <>", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThan(Double value) {
            addCriterion("`value` >", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueGreaterThanOrEqualTo(Double value) {
            addCriterion("`value` >=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThan(Double value) {
            addCriterion("`value` <", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueLessThanOrEqualTo(Double value) {
            addCriterion("`value` <=", value, "value");
            return (Criteria) this;
        }

        public Criteria andValueIn(List<Double> values) {
            addCriterion("`value` in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotIn(List<Double> values) {
            addCriterion("`value` not in", values, "value");
            return (Criteria) this;
        }

        public Criteria andValueBetween(Double value1, Double value2) {
            addCriterion("`value` between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andValueNotBetween(Double value1, Double value2) {
            addCriterion("`value` not between", value1, value2, "value");
            return (Criteria) this;
        }

        public Criteria andGatherDateIsNull() {
            addCriterion("gather_date is null");
            return (Criteria) this;
        }

        public Criteria andGatherDateIsNotNull() {
            addCriterion("gather_date is not null");
            return (Criteria) this;
        }

        public Criteria andGatherDateEqualTo(Date value) {
            addCriterion("gather_date =", value, "gatherDate");
            return (Criteria) this;
        }

        public Criteria andGatherDateNotEqualTo(Date value) {
            addCriterion("gather_date <>", value, "gatherDate");
            return (Criteria) this;
        }

        public Criteria andGatherDateGreaterThan(Date value) {
            addCriterion("gather_date >", value, "gatherDate");
            return (Criteria) this;
        }

        public Criteria andGatherDateGreaterThanOrEqualTo(Date value) {
            addCriterion("gather_date >=", value, "gatherDate");
            return (Criteria) this;
        }

        public Criteria andGatherDateLessThan(Date value) {
            addCriterion("gather_date <", value, "gatherDate");
            return (Criteria) this;
        }

        public Criteria andGatherDateLessThanOrEqualTo(Date value) {
            addCriterion("gather_date <=", value, "gatherDate");
            return (Criteria) this;
        }

        public Criteria andGatherDateIn(List<Date> values) {
            addCriterion("gather_date in", values, "gatherDate");
            return (Criteria) this;
        }

        public Criteria andGatherDateNotIn(List<Date> values) {
            addCriterion("gather_date not in", values, "gatherDate");
            return (Criteria) this;
        }

        public Criteria andGatherDateBetween(Date value1, Date value2) {
            addCriterion("gather_date between", value1, value2, "gatherDate");
            return (Criteria) this;
        }

        public Criteria andGatherDateNotBetween(Date value1, Date value2) {
            addCriterion("gather_date not between", value1, value2, "gatherDate");
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