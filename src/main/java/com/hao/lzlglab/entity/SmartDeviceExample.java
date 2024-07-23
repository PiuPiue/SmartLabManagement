package com.hao.lzlglab.entity;

import java.util.ArrayList;
import java.util.List;

public class SmartDeviceExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SmartDeviceExample() {
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

        public Criteria andDeviceNameIsNull() {
            addCriterion("device_name is null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIsNotNull() {
            addCriterion("device_name is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceNameEqualTo(String value) {
            addCriterion("device_name =", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotEqualTo(String value) {
            addCriterion("device_name <>", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThan(String value) {
            addCriterion("device_name >", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameGreaterThanOrEqualTo(String value) {
            addCriterion("device_name >=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThan(String value) {
            addCriterion("device_name <", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLessThanOrEqualTo(String value) {
            addCriterion("device_name <=", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameLike(String value) {
            addCriterion("device_name like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotLike(String value) {
            addCriterion("device_name not like", value, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameIn(List<String> values) {
            addCriterion("device_name in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotIn(List<String> values) {
            addCriterion("device_name not in", values, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameBetween(String value1, String value2) {
            addCriterion("device_name between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceNameNotBetween(String value1, String value2) {
            addCriterion("device_name not between", value1, value2, "deviceName");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrIsNull() {
            addCriterion("device_addr is null");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrIsNotNull() {
            addCriterion("device_addr is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrEqualTo(String value) {
            addCriterion("device_addr =", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrNotEqualTo(String value) {
            addCriterion("device_addr <>", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrGreaterThan(String value) {
            addCriterion("device_addr >", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrGreaterThanOrEqualTo(String value) {
            addCriterion("device_addr >=", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrLessThan(String value) {
            addCriterion("device_addr <", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrLessThanOrEqualTo(String value) {
            addCriterion("device_addr <=", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrLike(String value) {
            addCriterion("device_addr like", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrNotLike(String value) {
            addCriterion("device_addr not like", value, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrIn(List<String> values) {
            addCriterion("device_addr in", values, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrNotIn(List<String> values) {
            addCriterion("device_addr not in", values, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrBetween(String value1, String value2) {
            addCriterion("device_addr between", value1, value2, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceAddrNotBetween(String value1, String value2) {
            addCriterion("device_addr not between", value1, value2, "deviceAddr");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNull() {
            addCriterion("device_type is null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIsNotNull() {
            addCriterion("device_type is not null");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeEqualTo(String value) {
            addCriterion("device_type =", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotEqualTo(String value) {
            addCriterion("device_type <>", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThan(String value) {
            addCriterion("device_type >", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeGreaterThanOrEqualTo(String value) {
            addCriterion("device_type >=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThan(String value) {
            addCriterion("device_type <", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLessThanOrEqualTo(String value) {
            addCriterion("device_type <=", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeLike(String value) {
            addCriterion("device_type like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotLike(String value) {
            addCriterion("device_type not like", value, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeIn(List<String> values) {
            addCriterion("device_type in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotIn(List<String> values) {
            addCriterion("device_type not in", values, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeBetween(String value1, String value2) {
            addCriterion("device_type between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andDeviceTypeNotBetween(String value1, String value2) {
            addCriterion("device_type not between", value1, value2, "deviceType");
            return (Criteria) this;
        }

        public Criteria andLabsIdIsNull() {
            addCriterion("labs_id is null");
            return (Criteria) this;
        }

        public Criteria andLabsIdIsNotNull() {
            addCriterion("labs_id is not null");
            return (Criteria) this;
        }

        public Criteria andLabsIdEqualTo(String value) {
            addCriterion("labs_id =", value, "labsId");
            return (Criteria) this;
        }

        public Criteria andLabsIdNotEqualTo(String value) {
            addCriterion("labs_id <>", value, "labsId");
            return (Criteria) this;
        }

        public Criteria andLabsIdGreaterThan(String value) {
            addCriterion("labs_id >", value, "labsId");
            return (Criteria) this;
        }

        public Criteria andLabsIdGreaterThanOrEqualTo(String value) {
            addCriterion("labs_id >=", value, "labsId");
            return (Criteria) this;
        }

        public Criteria andLabsIdLessThan(String value) {
            addCriterion("labs_id <", value, "labsId");
            return (Criteria) this;
        }

        public Criteria andLabsIdLessThanOrEqualTo(String value) {
            addCriterion("labs_id <=", value, "labsId");
            return (Criteria) this;
        }

        public Criteria andLabsIdLike(String value) {
            addCriterion("labs_id like", value, "labsId");
            return (Criteria) this;
        }

        public Criteria andLabsIdNotLike(String value) {
            addCriterion("labs_id not like", value, "labsId");
            return (Criteria) this;
        }

        public Criteria andLabsIdIn(List<String> values) {
            addCriterion("labs_id in", values, "labsId");
            return (Criteria) this;
        }

        public Criteria andLabsIdNotIn(List<String> values) {
            addCriterion("labs_id not in", values, "labsId");
            return (Criteria) this;
        }

        public Criteria andLabsIdBetween(String value1, String value2) {
            addCriterion("labs_id between", value1, value2, "labsId");
            return (Criteria) this;
        }

        public Criteria andLabsIdNotBetween(String value1, String value2) {
            addCriterion("labs_id not between", value1, value2, "labsId");
            return (Criteria) this;
        }

        public Criteria andOpenIsNull() {
            addCriterion("`open` is null");
            return (Criteria) this;
        }

        public Criteria andOpenIsNotNull() {
            addCriterion("`open` is not null");
            return (Criteria) this;
        }

        public Criteria andOpenEqualTo(String value) {
            addCriterion("`open` =", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotEqualTo(String value) {
            addCriterion("`open` <>", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThan(String value) {
            addCriterion("`open` >", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenGreaterThanOrEqualTo(String value) {
            addCriterion("`open` >=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThan(String value) {
            addCriterion("`open` <", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLessThanOrEqualTo(String value) {
            addCriterion("`open` <=", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenLike(String value) {
            addCriterion("`open` like", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotLike(String value) {
            addCriterion("`open` not like", value, "open");
            return (Criteria) this;
        }

        public Criteria andOpenIn(List<String> values) {
            addCriterion("`open` in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotIn(List<String> values) {
            addCriterion("`open` not in", values, "open");
            return (Criteria) this;
        }

        public Criteria andOpenBetween(String value1, String value2) {
            addCriterion("`open` between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andOpenNotBetween(String value1, String value2) {
            addCriterion("`open` not between", value1, value2, "open");
            return (Criteria) this;
        }

        public Criteria andCloseIsNull() {
            addCriterion("`close` is null");
            return (Criteria) this;
        }

        public Criteria andCloseIsNotNull() {
            addCriterion("`close` is not null");
            return (Criteria) this;
        }

        public Criteria andCloseEqualTo(String value) {
            addCriterion("`close` =", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotEqualTo(String value) {
            addCriterion("`close` <>", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseGreaterThan(String value) {
            addCriterion("`close` >", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseGreaterThanOrEqualTo(String value) {
            addCriterion("`close` >=", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseLessThan(String value) {
            addCriterion("`close` <", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseLessThanOrEqualTo(String value) {
            addCriterion("`close` <=", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseLike(String value) {
            addCriterion("`close` like", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotLike(String value) {
            addCriterion("`close` not like", value, "close");
            return (Criteria) this;
        }

        public Criteria andCloseIn(List<String> values) {
            addCriterion("`close` in", values, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotIn(List<String> values) {
            addCriterion("`close` not in", values, "close");
            return (Criteria) this;
        }

        public Criteria andCloseBetween(String value1, String value2) {
            addCriterion("`close` between", value1, value2, "close");
            return (Criteria) this;
        }

        public Criteria andCloseNotBetween(String value1, String value2) {
            addCriterion("`close` not between", value1, value2, "close");
            return (Criteria) this;
        }

        public Criteria andMaxThresholdIsNull() {
            addCriterion("max_threshold is null");
            return (Criteria) this;
        }

        public Criteria andMaxThresholdIsNotNull() {
            addCriterion("max_threshold is not null");
            return (Criteria) this;
        }

        public Criteria andMaxThresholdEqualTo(Integer value) {
            addCriterion("max_threshold =", value, "maxThreshold");
            return (Criteria) this;
        }

        public Criteria andMaxThresholdNotEqualTo(Integer value) {
            addCriterion("max_threshold <>", value, "maxThreshold");
            return (Criteria) this;
        }

        public Criteria andMaxThresholdGreaterThan(Integer value) {
            addCriterion("max_threshold >", value, "maxThreshold");
            return (Criteria) this;
        }

        public Criteria andMaxThresholdGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_threshold >=", value, "maxThreshold");
            return (Criteria) this;
        }

        public Criteria andMaxThresholdLessThan(Integer value) {
            addCriterion("max_threshold <", value, "maxThreshold");
            return (Criteria) this;
        }

        public Criteria andMaxThresholdLessThanOrEqualTo(Integer value) {
            addCriterion("max_threshold <=", value, "maxThreshold");
            return (Criteria) this;
        }

        public Criteria andMaxThresholdIn(List<Integer> values) {
            addCriterion("max_threshold in", values, "maxThreshold");
            return (Criteria) this;
        }

        public Criteria andMaxThresholdNotIn(List<Integer> values) {
            addCriterion("max_threshold not in", values, "maxThreshold");
            return (Criteria) this;
        }

        public Criteria andMaxThresholdBetween(Integer value1, Integer value2) {
            addCriterion("max_threshold between", value1, value2, "maxThreshold");
            return (Criteria) this;
        }

        public Criteria andMaxThresholdNotBetween(Integer value1, Integer value2) {
            addCriterion("max_threshold not between", value1, value2, "maxThreshold");
            return (Criteria) this;
        }

        public Criteria andMinThresholdIsNull() {
            addCriterion("min_threshold is null");
            return (Criteria) this;
        }

        public Criteria andMinThresholdIsNotNull() {
            addCriterion("min_threshold is not null");
            return (Criteria) this;
        }

        public Criteria andMinThresholdEqualTo(Integer value) {
            addCriterion("min_threshold =", value, "minThreshold");
            return (Criteria) this;
        }

        public Criteria andMinThresholdNotEqualTo(Integer value) {
            addCriterion("min_threshold <>", value, "minThreshold");
            return (Criteria) this;
        }

        public Criteria andMinThresholdGreaterThan(Integer value) {
            addCriterion("min_threshold >", value, "minThreshold");
            return (Criteria) this;
        }

        public Criteria andMinThresholdGreaterThanOrEqualTo(Integer value) {
            addCriterion("min_threshold >=", value, "minThreshold");
            return (Criteria) this;
        }

        public Criteria andMinThresholdLessThan(Integer value) {
            addCriterion("min_threshold <", value, "minThreshold");
            return (Criteria) this;
        }

        public Criteria andMinThresholdLessThanOrEqualTo(Integer value) {
            addCriterion("min_threshold <=", value, "minThreshold");
            return (Criteria) this;
        }

        public Criteria andMinThresholdIn(List<Integer> values) {
            addCriterion("min_threshold in", values, "minThreshold");
            return (Criteria) this;
        }

        public Criteria andMinThresholdNotIn(List<Integer> values) {
            addCriterion("min_threshold not in", values, "minThreshold");
            return (Criteria) this;
        }

        public Criteria andMinThresholdBetween(Integer value1, Integer value2) {
            addCriterion("min_threshold between", value1, value2, "minThreshold");
            return (Criteria) this;
        }

        public Criteria andMinThresholdNotBetween(Integer value1, Integer value2) {
            addCriterion("min_threshold not between", value1, value2, "minThreshold");
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