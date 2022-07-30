package com.enjoy.common.entity;

import java.util.ArrayList;
import java.util.List;

public class TimeLineExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TimeLineExample() {
        oredCriteria = new ArrayList<Criteria>();
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
            criteria = new ArrayList<Criterion>();
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
            addCriterion("ID is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("ID is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(String value) {
            addCriterion("ID =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(String value) {
            addCriterion("ID <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(String value) {
            addCriterion("ID >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(String value) {
            addCriterion("ID >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(String value) {
            addCriterion("ID <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(String value) {
            addCriterion("ID <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLike(String value) {
            addCriterion("ID like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotLike(String value) {
            addCriterion("ID not like", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<String> values) {
            addCriterion("ID in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<String> values) {
            addCriterion("ID not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(String value1, String value2) {
            addCriterion("ID between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(String value1, String value2) {
            addCriterion("ID not between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andDateIdIsNull() {
            addCriterion("DATE_ID is null");
            return (Criteria) this;
        }

        public Criteria andDateIdIsNotNull() {
            addCriterion("DATE_ID is not null");
            return (Criteria) this;
        }

        public Criteria andDateIdEqualTo(String value) {
            addCriterion("DATE_ID =", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotEqualTo(String value) {
            addCriterion("DATE_ID <>", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdGreaterThan(String value) {
            addCriterion("DATE_ID >", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdGreaterThanOrEqualTo(String value) {
            addCriterion("DATE_ID >=", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLessThan(String value) {
            addCriterion("DATE_ID <", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLessThanOrEqualTo(String value) {
            addCriterion("DATE_ID <=", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdLike(String value) {
            addCriterion("DATE_ID like", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotLike(String value) {
            addCriterion("DATE_ID not like", value, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdIn(List<String> values) {
            addCriterion("DATE_ID in", values, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotIn(List<String> values) {
            addCriterion("DATE_ID not in", values, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdBetween(String value1, String value2) {
            addCriterion("DATE_ID between", value1, value2, "dateId");
            return (Criteria) this;
        }

        public Criteria andDateIdNotBetween(String value1, String value2) {
            addCriterion("DATE_ID not between", value1, value2, "dateId");
            return (Criteria) this;
        }

        public Criteria andEventTitleIsNull() {
            addCriterion("EVENT_TITLE is null");
            return (Criteria) this;
        }

        public Criteria andEventTitleIsNotNull() {
            addCriterion("EVENT_TITLE is not null");
            return (Criteria) this;
        }

        public Criteria andEventTitleEqualTo(String value) {
            addCriterion("EVENT_TITLE =", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleNotEqualTo(String value) {
            addCriterion("EVENT_TITLE <>", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleGreaterThan(String value) {
            addCriterion("EVENT_TITLE >", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_TITLE >=", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleLessThan(String value) {
            addCriterion("EVENT_TITLE <", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleLessThanOrEqualTo(String value) {
            addCriterion("EVENT_TITLE <=", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleLike(String value) {
            addCriterion("EVENT_TITLE like", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleNotLike(String value) {
            addCriterion("EVENT_TITLE not like", value, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleIn(List<String> values) {
            addCriterion("EVENT_TITLE in", values, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleNotIn(List<String> values) {
            addCriterion("EVENT_TITLE not in", values, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleBetween(String value1, String value2) {
            addCriterion("EVENT_TITLE between", value1, value2, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventTitleNotBetween(String value1, String value2) {
            addCriterion("EVENT_TITLE not between", value1, value2, "eventTitle");
            return (Criteria) this;
        }

        public Criteria andEventPictureIsNull() {
            addCriterion("EVENT_PICTURE is null");
            return (Criteria) this;
        }

        public Criteria andEventPictureIsNotNull() {
            addCriterion("EVENT_PICTURE is not null");
            return (Criteria) this;
        }

        public Criteria andEventPictureEqualTo(String value) {
            addCriterion("EVENT_PICTURE =", value, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureNotEqualTo(String value) {
            addCriterion("EVENT_PICTURE <>", value, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureGreaterThan(String value) {
            addCriterion("EVENT_PICTURE >", value, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_PICTURE >=", value, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureLessThan(String value) {
            addCriterion("EVENT_PICTURE <", value, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureLessThanOrEqualTo(String value) {
            addCriterion("EVENT_PICTURE <=", value, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureLike(String value) {
            addCriterion("EVENT_PICTURE like", value, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureNotLike(String value) {
            addCriterion("EVENT_PICTURE not like", value, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureIn(List<String> values) {
            addCriterion("EVENT_PICTURE in", values, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureNotIn(List<String> values) {
            addCriterion("EVENT_PICTURE not in", values, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureBetween(String value1, String value2) {
            addCriterion("EVENT_PICTURE between", value1, value2, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventPictureNotBetween(String value1, String value2) {
            addCriterion("EVENT_PICTURE not between", value1, value2, "eventPicture");
            return (Criteria) this;
        }

        public Criteria andEventDescribleIsNull() {
            addCriterion("EVENT_DESCRIBLE is null");
            return (Criteria) this;
        }

        public Criteria andEventDescribleIsNotNull() {
            addCriterion("EVENT_DESCRIBLE is not null");
            return (Criteria) this;
        }

        public Criteria andEventDescribleEqualTo(String value) {
            addCriterion("EVENT_DESCRIBLE =", value, "eventDescrible");
            return (Criteria) this;
        }

        public Criteria andEventDescribleNotEqualTo(String value) {
            addCriterion("EVENT_DESCRIBLE <>", value, "eventDescrible");
            return (Criteria) this;
        }

        public Criteria andEventDescribleGreaterThan(String value) {
            addCriterion("EVENT_DESCRIBLE >", value, "eventDescrible");
            return (Criteria) this;
        }

        public Criteria andEventDescribleGreaterThanOrEqualTo(String value) {
            addCriterion("EVENT_DESCRIBLE >=", value, "eventDescrible");
            return (Criteria) this;
        }

        public Criteria andEventDescribleLessThan(String value) {
            addCriterion("EVENT_DESCRIBLE <", value, "eventDescrible");
            return (Criteria) this;
        }

        public Criteria andEventDescribleLessThanOrEqualTo(String value) {
            addCriterion("EVENT_DESCRIBLE <=", value, "eventDescrible");
            return (Criteria) this;
        }

        public Criteria andEventDescribleLike(String value) {
            addCriterion("EVENT_DESCRIBLE like", value, "eventDescrible");
            return (Criteria) this;
        }

        public Criteria andEventDescribleNotLike(String value) {
            addCriterion("EVENT_DESCRIBLE not like", value, "eventDescrible");
            return (Criteria) this;
        }

        public Criteria andEventDescribleIn(List<String> values) {
            addCriterion("EVENT_DESCRIBLE in", values, "eventDescrible");
            return (Criteria) this;
        }

        public Criteria andEventDescribleNotIn(List<String> values) {
            addCriterion("EVENT_DESCRIBLE not in", values, "eventDescrible");
            return (Criteria) this;
        }

        public Criteria andEventDescribleBetween(String value1, String value2) {
            addCriterion("EVENT_DESCRIBLE between", value1, value2, "eventDescrible");
            return (Criteria) this;
        }

        public Criteria andEventDescribleNotBetween(String value1, String value2) {
            addCriterion("EVENT_DESCRIBLE not between", value1, value2, "eventDescrible");
            return (Criteria) this;
        }

        public Criteria andEditableIsNull() {
            addCriterion("EDITABLE is null");
            return (Criteria) this;
        }

        public Criteria andEditableIsNotNull() {
            addCriterion("EDITABLE is not null");
            return (Criteria) this;
        }

        public Criteria andEditableEqualTo(String value) {
            addCriterion("EDITABLE =", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableNotEqualTo(String value) {
            addCriterion("EDITABLE <>", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableGreaterThan(String value) {
            addCriterion("EDITABLE >", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableGreaterThanOrEqualTo(String value) {
            addCriterion("EDITABLE >=", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableLessThan(String value) {
            addCriterion("EDITABLE <", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableLessThanOrEqualTo(String value) {
            addCriterion("EDITABLE <=", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableLike(String value) {
            addCriterion("EDITABLE like", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableNotLike(String value) {
            addCriterion("EDITABLE not like", value, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableIn(List<String> values) {
            addCriterion("EDITABLE in", values, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableNotIn(List<String> values) {
            addCriterion("EDITABLE not in", values, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableBetween(String value1, String value2) {
            addCriterion("EDITABLE between", value1, value2, "editable");
            return (Criteria) this;
        }

        public Criteria andEditableNotBetween(String value1, String value2) {
            addCriterion("EDITABLE not between", value1, value2, "editable");
            return (Criteria) this;
        }

        public Criteria andAddnewableIsNull() {
            addCriterion("ADDNEWABLE is null");
            return (Criteria) this;
        }

        public Criteria andAddnewableIsNotNull() {
            addCriterion("ADDNEWABLE is not null");
            return (Criteria) this;
        }

        public Criteria andAddnewableEqualTo(String value) {
            addCriterion("ADDNEWABLE =", value, "addnewable");
            return (Criteria) this;
        }

        public Criteria andAddnewableNotEqualTo(String value) {
            addCriterion("ADDNEWABLE <>", value, "addnewable");
            return (Criteria) this;
        }

        public Criteria andAddnewableGreaterThan(String value) {
            addCriterion("ADDNEWABLE >", value, "addnewable");
            return (Criteria) this;
        }

        public Criteria andAddnewableGreaterThanOrEqualTo(String value) {
            addCriterion("ADDNEWABLE >=", value, "addnewable");
            return (Criteria) this;
        }

        public Criteria andAddnewableLessThan(String value) {
            addCriterion("ADDNEWABLE <", value, "addnewable");
            return (Criteria) this;
        }

        public Criteria andAddnewableLessThanOrEqualTo(String value) {
            addCriterion("ADDNEWABLE <=", value, "addnewable");
            return (Criteria) this;
        }

        public Criteria andAddnewableLike(String value) {
            addCriterion("ADDNEWABLE like", value, "addnewable");
            return (Criteria) this;
        }

        public Criteria andAddnewableNotLike(String value) {
            addCriterion("ADDNEWABLE not like", value, "addnewable");
            return (Criteria) this;
        }

        public Criteria andAddnewableIn(List<String> values) {
            addCriterion("ADDNEWABLE in", values, "addnewable");
            return (Criteria) this;
        }

        public Criteria andAddnewableNotIn(List<String> values) {
            addCriterion("ADDNEWABLE not in", values, "addnewable");
            return (Criteria) this;
        }

        public Criteria andAddnewableBetween(String value1, String value2) {
            addCriterion("ADDNEWABLE between", value1, value2, "addnewable");
            return (Criteria) this;
        }

        public Criteria andAddnewableNotBetween(String value1, String value2) {
            addCriterion("ADDNEWABLE not between", value1, value2, "addnewable");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("CREATETIME is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("CREATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(String value) {
            addCriterion("CREATETIME =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(String value) {
            addCriterion("CREATETIME <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(String value) {
            addCriterion("CREATETIME >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("CREATETIME >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(String value) {
            addCriterion("CREATETIME <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(String value) {
            addCriterion("CREATETIME <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLike(String value) {
            addCriterion("CREATETIME like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotLike(String value) {
            addCriterion("CREATETIME not like", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<String> values) {
            addCriterion("CREATETIME in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<String> values) {
            addCriterion("CREATETIME not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(String value1, String value2) {
            addCriterion("CREATETIME between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(String value1, String value2) {
            addCriterion("CREATETIME not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("UPDATETIME is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("UPDATETIME is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(String value) {
            addCriterion("UPDATETIME =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(String value) {
            addCriterion("UPDATETIME <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(String value) {
            addCriterion("UPDATETIME >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("UPDATETIME >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(String value) {
            addCriterion("UPDATETIME <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(String value) {
            addCriterion("UPDATETIME <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLike(String value) {
            addCriterion("UPDATETIME like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotLike(String value) {
            addCriterion("UPDATETIME not like", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<String> values) {
            addCriterion("UPDATETIME in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<String> values) {
            addCriterion("UPDATETIME not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(String value1, String value2) {
            addCriterion("UPDATETIME between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(String value1, String value2) {
            addCriterion("UPDATETIME not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNull() {
            addCriterion("CREATOR is null");
            return (Criteria) this;
        }

        public Criteria andCreatorIsNotNull() {
            addCriterion("CREATOR is not null");
            return (Criteria) this;
        }

        public Criteria andCreatorEqualTo(String value) {
            addCriterion("CREATOR =", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotEqualTo(String value) {
            addCriterion("CREATOR <>", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThan(String value) {
            addCriterion("CREATOR >", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorGreaterThanOrEqualTo(String value) {
            addCriterion("CREATOR >=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThan(String value) {
            addCriterion("CREATOR <", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLessThanOrEqualTo(String value) {
            addCriterion("CREATOR <=", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorLike(String value) {
            addCriterion("CREATOR like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotLike(String value) {
            addCriterion("CREATOR not like", value, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorIn(List<String> values) {
            addCriterion("CREATOR in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotIn(List<String> values) {
            addCriterion("CREATOR not in", values, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorBetween(String value1, String value2) {
            addCriterion("CREATOR between", value1, value2, "creator");
            return (Criteria) this;
        }

        public Criteria andCreatorNotBetween(String value1, String value2) {
            addCriterion("CREATOR not between", value1, value2, "creator");
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