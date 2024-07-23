package com.hao.lzlglab.entity;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SmartEnvDetailExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    private Integer limit;

    private Long offset;

    public SmartEnvDetailExample() {
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

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
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

        public Criteria andPm25IsNull() {
            addCriterion("pm25 is null");
            return (Criteria) this;
        }

        public Criteria andPm25IsNotNull() {
            addCriterion("pm25 is not null");
            return (Criteria) this;
        }

        public Criteria andPm25EqualTo(Double value) {
            addCriterion("pm25 =", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotEqualTo(Double value) {
            addCriterion("pm25 <>", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25GreaterThan(Double value) {
            addCriterion("pm25 >", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25GreaterThanOrEqualTo(Double value) {
            addCriterion("pm25 >=", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25LessThan(Double value) {
            addCriterion("pm25 <", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25LessThanOrEqualTo(Double value) {
            addCriterion("pm25 <=", value, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25In(List<Double> values) {
            addCriterion("pm25 in", values, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotIn(List<Double> values) {
            addCriterion("pm25 not in", values, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25Between(Double value1, Double value2) {
            addCriterion("pm25 between", value1, value2, "pm25");
            return (Criteria) this;
        }

        public Criteria andPm25NotBetween(Double value1, Double value2) {
            addCriterion("pm25 not between", value1, value2, "pm25");
            return (Criteria) this;
        }

        public Criteria andCo2IsNull() {
            addCriterion("co2 is null");
            return (Criteria) this;
        }

        public Criteria andCo2IsNotNull() {
            addCriterion("co2 is not null");
            return (Criteria) this;
        }

        public Criteria andCo2EqualTo(Double value) {
            addCriterion("co2 =", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2NotEqualTo(Double value) {
            addCriterion("co2 <>", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2GreaterThan(Double value) {
            addCriterion("co2 >", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2GreaterThanOrEqualTo(Double value) {
            addCriterion("co2 >=", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2LessThan(Double value) {
            addCriterion("co2 <", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2LessThanOrEqualTo(Double value) {
            addCriterion("co2 <=", value, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2In(List<Double> values) {
            addCriterion("co2 in", values, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2NotIn(List<Double> values) {
            addCriterion("co2 not in", values, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2Between(Double value1, Double value2) {
            addCriterion("co2 between", value1, value2, "co2");
            return (Criteria) this;
        }

        public Criteria andCo2NotBetween(Double value1, Double value2) {
            addCriterion("co2 not between", value1, value2, "co2");
            return (Criteria) this;
        }

        public Criteria andCh2oIsNull() {
            addCriterion("ch2o is null");
            return (Criteria) this;
        }

        public Criteria andCh2oIsNotNull() {
            addCriterion("ch2o is not null");
            return (Criteria) this;
        }

        public Criteria andCh2oEqualTo(Double value) {
            addCriterion("ch2o =", value, "ch2o");
            return (Criteria) this;
        }

        public Criteria andCh2oNotEqualTo(Double value) {
            addCriterion("ch2o <>", value, "ch2o");
            return (Criteria) this;
        }

        public Criteria andCh2oGreaterThan(Double value) {
            addCriterion("ch2o >", value, "ch2o");
            return (Criteria) this;
        }

        public Criteria andCh2oGreaterThanOrEqualTo(Double value) {
            addCriterion("ch2o >=", value, "ch2o");
            return (Criteria) this;
        }

        public Criteria andCh2oLessThan(Double value) {
            addCriterion("ch2o <", value, "ch2o");
            return (Criteria) this;
        }

        public Criteria andCh2oLessThanOrEqualTo(Double value) {
            addCriterion("ch2o <=", value, "ch2o");
            return (Criteria) this;
        }

        public Criteria andCh2oIn(List<Double> values) {
            addCriterion("ch2o in", values, "ch2o");
            return (Criteria) this;
        }

        public Criteria andCh2oNotIn(List<Double> values) {
            addCriterion("ch2o not in", values, "ch2o");
            return (Criteria) this;
        }

        public Criteria andCh2oBetween(Double value1, Double value2) {
            addCriterion("ch2o between", value1, value2, "ch2o");
            return (Criteria) this;
        }

        public Criteria andCh2oNotBetween(Double value1, Double value2) {
            addCriterion("ch2o not between", value1, value2, "ch2o");
            return (Criteria) this;
        }

        public Criteria andTvocIsNull() {
            addCriterion("tvoc is null");
            return (Criteria) this;
        }

        public Criteria andTvocIsNotNull() {
            addCriterion("tvoc is not null");
            return (Criteria) this;
        }

        public Criteria andTvocEqualTo(Double value) {
            addCriterion("tvoc =", value, "tvoc");
            return (Criteria) this;
        }

        public Criteria andTvocNotEqualTo(Double value) {
            addCriterion("tvoc <>", value, "tvoc");
            return (Criteria) this;
        }

        public Criteria andTvocGreaterThan(Double value) {
            addCriterion("tvoc >", value, "tvoc");
            return (Criteria) this;
        }

        public Criteria andTvocGreaterThanOrEqualTo(Double value) {
            addCriterion("tvoc >=", value, "tvoc");
            return (Criteria) this;
        }

        public Criteria andTvocLessThan(Double value) {
            addCriterion("tvoc <", value, "tvoc");
            return (Criteria) this;
        }

        public Criteria andTvocLessThanOrEqualTo(Double value) {
            addCriterion("tvoc <=", value, "tvoc");
            return (Criteria) this;
        }

        public Criteria andTvocIn(List<Double> values) {
            addCriterion("tvoc in", values, "tvoc");
            return (Criteria) this;
        }

        public Criteria andTvocNotIn(List<Double> values) {
            addCriterion("tvoc not in", values, "tvoc");
            return (Criteria) this;
        }

        public Criteria andTvocBetween(Double value1, Double value2) {
            addCriterion("tvoc between", value1, value2, "tvoc");
            return (Criteria) this;
        }

        public Criteria andTvocNotBetween(Double value1, Double value2) {
            addCriterion("tvoc not between", value1, value2, "tvoc");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNull() {
            addCriterion("temperature is null");
            return (Criteria) this;
        }

        public Criteria andTemperatureIsNotNull() {
            addCriterion("temperature is not null");
            return (Criteria) this;
        }

        public Criteria andTemperatureEqualTo(Double value) {
            addCriterion("temperature =", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotEqualTo(Double value) {
            addCriterion("temperature <>", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThan(Double value) {
            addCriterion("temperature >", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureGreaterThanOrEqualTo(Double value) {
            addCriterion("temperature >=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThan(Double value) {
            addCriterion("temperature <", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureLessThanOrEqualTo(Double value) {
            addCriterion("temperature <=", value, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureIn(List<Double> values) {
            addCriterion("temperature in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotIn(List<Double> values) {
            addCriterion("temperature not in", values, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureBetween(Double value1, Double value2) {
            addCriterion("temperature between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andTemperatureNotBetween(Double value1, Double value2) {
            addCriterion("temperature not between", value1, value2, "temperature");
            return (Criteria) this;
        }

        public Criteria andHumidityIsNull() {
            addCriterion("humidity is null");
            return (Criteria) this;
        }

        public Criteria andHumidityIsNotNull() {
            addCriterion("humidity is not null");
            return (Criteria) this;
        }

        public Criteria andHumidityEqualTo(Double value) {
            addCriterion("humidity =", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotEqualTo(Double value) {
            addCriterion("humidity <>", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityGreaterThan(Double value) {
            addCriterion("humidity >", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityGreaterThanOrEqualTo(Double value) {
            addCriterion("humidity >=", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityLessThan(Double value) {
            addCriterion("humidity <", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityLessThanOrEqualTo(Double value) {
            addCriterion("humidity <=", value, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityIn(List<Double> values) {
            addCriterion("humidity in", values, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotIn(List<Double> values) {
            addCriterion("humidity not in", values, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityBetween(Double value1, Double value2) {
            addCriterion("humidity between", value1, value2, "humidity");
            return (Criteria) this;
        }

        public Criteria andHumidityNotBetween(Double value1, Double value2) {
            addCriterion("humidity not between", value1, value2, "humidity");
            return (Criteria) this;
        }

        public Criteria andAirIsNull() {
            addCriterion("air is null");
            return (Criteria) this;
        }

        public Criteria andAirIsNotNull() {
            addCriterion("air is not null");
            return (Criteria) this;
        }

        public Criteria andAirEqualTo(Double value) {
            addCriterion("air =", value, "air");
            return (Criteria) this;
        }

        public Criteria andAirNotEqualTo(Double value) {
            addCriterion("air <>", value, "air");
            return (Criteria) this;
        }

        public Criteria andAirGreaterThan(Double value) {
            addCriterion("air >", value, "air");
            return (Criteria) this;
        }

        public Criteria andAirGreaterThanOrEqualTo(Double value) {
            addCriterion("air >=", value, "air");
            return (Criteria) this;
        }

        public Criteria andAirLessThan(Double value) {
            addCriterion("air <", value, "air");
            return (Criteria) this;
        }

        public Criteria andAirLessThanOrEqualTo(Double value) {
            addCriterion("air <=", value, "air");
            return (Criteria) this;
        }

        public Criteria andAirIn(List<Double> values) {
            addCriterion("air in", values, "air");
            return (Criteria) this;
        }

        public Criteria andAirNotIn(List<Double> values) {
            addCriterion("air not in", values, "air");
            return (Criteria) this;
        }

        public Criteria andAirBetween(Double value1, Double value2) {
            addCriterion("air between", value1, value2, "air");
            return (Criteria) this;
        }

        public Criteria andAirNotBetween(Double value1, Double value2) {
            addCriterion("air not between", value1, value2, "air");
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