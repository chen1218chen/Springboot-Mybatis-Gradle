package com.cc.entity;

import java.util.ArrayList;
import java.util.List;

public class ImageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ImageExample() {
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

        public Criteria andAeraIsNull() {
            addCriterion("aera is null");
            return (Criteria) this;
        }

        public Criteria andAeraIsNotNull() {
            addCriterion("aera is not null");
            return (Criteria) this;
        }

        public Criteria andAeraEqualTo(String value) {
            addCriterion("aera =", value, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraNotEqualTo(String value) {
            addCriterion("aera <>", value, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraGreaterThan(String value) {
            addCriterion("aera >", value, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraGreaterThanOrEqualTo(String value) {
            addCriterion("aera >=", value, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraLessThan(String value) {
            addCriterion("aera <", value, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraLessThanOrEqualTo(String value) {
            addCriterion("aera <=", value, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraLike(String value) {
            addCriterion("aera like", value, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraNotLike(String value) {
            addCriterion("aera not like", value, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraIn(List<String> values) {
            addCriterion("aera in", values, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraNotIn(List<String> values) {
            addCriterion("aera not in", values, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraBetween(String value1, String value2) {
            addCriterion("aera between", value1, value2, "aera");
            return (Criteria) this;
        }

        public Criteria andAeraNotBetween(String value1, String value2) {
            addCriterion("aera not between", value1, value2, "aera");
            return (Criteria) this;
        }

        public Criteria andCoordinateIsNull() {
            addCriterion("coordinate is null");
            return (Criteria) this;
        }

        public Criteria andCoordinateIsNotNull() {
            addCriterion("coordinate is not null");
            return (Criteria) this;
        }

        public Criteria andCoordinateEqualTo(String value) {
            addCriterion("coordinate =", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotEqualTo(String value) {
            addCriterion("coordinate <>", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateGreaterThan(String value) {
            addCriterion("coordinate >", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateGreaterThanOrEqualTo(String value) {
            addCriterion("coordinate >=", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLessThan(String value) {
            addCriterion("coordinate <", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLessThanOrEqualTo(String value) {
            addCriterion("coordinate <=", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateLike(String value) {
            addCriterion("coordinate like", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotLike(String value) {
            addCriterion("coordinate not like", value, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateIn(List<String> values) {
            addCriterion("coordinate in", values, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotIn(List<String> values) {
            addCriterion("coordinate not in", values, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateBetween(String value1, String value2) {
            addCriterion("coordinate between", value1, value2, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCoordinateNotBetween(String value1, String value2) {
            addCriterion("coordinate not between", value1, value2, "coordinate");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNull() {
            addCriterion("createUser is null");
            return (Criteria) this;
        }

        public Criteria andCreateuserIsNotNull() {
            addCriterion("createUser is not null");
            return (Criteria) this;
        }

        public Criteria andCreateuserEqualTo(String value) {
            addCriterion("createUser =", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotEqualTo(String value) {
            addCriterion("createUser <>", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThan(String value) {
            addCriterion("createUser >", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserGreaterThanOrEqualTo(String value) {
            addCriterion("createUser >=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThan(String value) {
            addCriterion("createUser <", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLessThanOrEqualTo(String value) {
            addCriterion("createUser <=", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserLike(String value) {
            addCriterion("createUser like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotLike(String value) {
            addCriterion("createUser not like", value, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserIn(List<String> values) {
            addCriterion("createUser in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotIn(List<String> values) {
            addCriterion("createUser not in", values, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserBetween(String value1, String value2) {
            addCriterion("createUser between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andCreateuserNotBetween(String value1, String value2) {
            addCriterion("createUser not between", value1, value2, "createuser");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNull() {
            addCriterion("dateTime is null");
            return (Criteria) this;
        }

        public Criteria andDatetimeIsNotNull() {
            addCriterion("dateTime is not null");
            return (Criteria) this;
        }

        public Criteria andDatetimeEqualTo(String value) {
            addCriterion("dateTime =", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotEqualTo(String value) {
            addCriterion("dateTime <>", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThan(String value) {
            addCriterion("dateTime >", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeGreaterThanOrEqualTo(String value) {
            addCriterion("dateTime >=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThan(String value) {
            addCriterion("dateTime <", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLessThanOrEqualTo(String value) {
            addCriterion("dateTime <=", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeLike(String value) {
            addCriterion("dateTime like", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotLike(String value) {
            addCriterion("dateTime not like", value, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeIn(List<String> values) {
            addCriterion("dateTime in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotIn(List<String> values) {
            addCriterion("dateTime not in", values, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeBetween(String value1, String value2) {
            addCriterion("dateTime between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDatetimeNotBetween(String value1, String value2) {
            addCriterion("dateTime not between", value1, value2, "datetime");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andImagenameIsNull() {
            addCriterion("imageName is null");
            return (Criteria) this;
        }

        public Criteria andImagenameIsNotNull() {
            addCriterion("imageName is not null");
            return (Criteria) this;
        }

        public Criteria andImagenameEqualTo(String value) {
            addCriterion("imageName =", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameNotEqualTo(String value) {
            addCriterion("imageName <>", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameGreaterThan(String value) {
            addCriterion("imageName >", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameGreaterThanOrEqualTo(String value) {
            addCriterion("imageName >=", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameLessThan(String value) {
            addCriterion("imageName <", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameLessThanOrEqualTo(String value) {
            addCriterion("imageName <=", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameLike(String value) {
            addCriterion("imageName like", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameNotLike(String value) {
            addCriterion("imageName not like", value, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameIn(List<String> values) {
            addCriterion("imageName in", values, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameNotIn(List<String> values) {
            addCriterion("imageName not in", values, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameBetween(String value1, String value2) {
            addCriterion("imageName between", value1, value2, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagenameNotBetween(String value1, String value2) {
            addCriterion("imageName not between", value1, value2, "imagename");
            return (Criteria) this;
        }

        public Criteria andImagepathIsNull() {
            addCriterion("imagePath is null");
            return (Criteria) this;
        }

        public Criteria andImagepathIsNotNull() {
            addCriterion("imagePath is not null");
            return (Criteria) this;
        }

        public Criteria andImagepathEqualTo(String value) {
            addCriterion("imagePath =", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathNotEqualTo(String value) {
            addCriterion("imagePath <>", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathGreaterThan(String value) {
            addCriterion("imagePath >", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathGreaterThanOrEqualTo(String value) {
            addCriterion("imagePath >=", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathLessThan(String value) {
            addCriterion("imagePath <", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathLessThanOrEqualTo(String value) {
            addCriterion("imagePath <=", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathLike(String value) {
            addCriterion("imagePath like", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathNotLike(String value) {
            addCriterion("imagePath not like", value, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathIn(List<String> values) {
            addCriterion("imagePath in", values, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathNotIn(List<String> values) {
            addCriterion("imagePath not in", values, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathBetween(String value1, String value2) {
            addCriterion("imagePath between", value1, value2, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagepathNotBetween(String value1, String value2) {
            addCriterion("imagePath not between", value1, value2, "imagepath");
            return (Criteria) this;
        }

        public Criteria andImagesizeIsNull() {
            addCriterion("imageSize is null");
            return (Criteria) this;
        }

        public Criteria andImagesizeIsNotNull() {
            addCriterion("imageSize is not null");
            return (Criteria) this;
        }

        public Criteria andImagesizeEqualTo(Double value) {
            addCriterion("imageSize =", value, "imagesize");
            return (Criteria) this;
        }

        public Criteria andImagesizeNotEqualTo(Double value) {
            addCriterion("imageSize <>", value, "imagesize");
            return (Criteria) this;
        }

        public Criteria andImagesizeGreaterThan(Double value) {
            addCriterion("imageSize >", value, "imagesize");
            return (Criteria) this;
        }

        public Criteria andImagesizeGreaterThanOrEqualTo(Double value) {
            addCriterion("imageSize >=", value, "imagesize");
            return (Criteria) this;
        }

        public Criteria andImagesizeLessThan(Double value) {
            addCriterion("imageSize <", value, "imagesize");
            return (Criteria) this;
        }

        public Criteria andImagesizeLessThanOrEqualTo(Double value) {
            addCriterion("imageSize <=", value, "imagesize");
            return (Criteria) this;
        }

        public Criteria andImagesizeIn(List<Double> values) {
            addCriterion("imageSize in", values, "imagesize");
            return (Criteria) this;
        }

        public Criteria andImagesizeNotIn(List<Double> values) {
            addCriterion("imageSize not in", values, "imagesize");
            return (Criteria) this;
        }

        public Criteria andImagesizeBetween(Double value1, Double value2) {
            addCriterion("imageSize between", value1, value2, "imagesize");
            return (Criteria) this;
        }

        public Criteria andImagesizeNotBetween(Double value1, Double value2) {
            addCriterion("imageSize not between", value1, value2, "imagesize");
            return (Criteria) this;
        }

        public Criteria andImagetypeIsNull() {
            addCriterion("imageType is null");
            return (Criteria) this;
        }

        public Criteria andImagetypeIsNotNull() {
            addCriterion("imageType is not null");
            return (Criteria) this;
        }

        public Criteria andImagetypeEqualTo(String value) {
            addCriterion("imageType =", value, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeNotEqualTo(String value) {
            addCriterion("imageType <>", value, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeGreaterThan(String value) {
            addCriterion("imageType >", value, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeGreaterThanOrEqualTo(String value) {
            addCriterion("imageType >=", value, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeLessThan(String value) {
            addCriterion("imageType <", value, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeLessThanOrEqualTo(String value) {
            addCriterion("imageType <=", value, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeLike(String value) {
            addCriterion("imageType like", value, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeNotLike(String value) {
            addCriterion("imageType not like", value, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeIn(List<String> values) {
            addCriterion("imageType in", values, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeNotIn(List<String> values) {
            addCriterion("imageType not in", values, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeBetween(String value1, String value2) {
            addCriterion("imageType between", value1, value2, "imagetype");
            return (Criteria) this;
        }

        public Criteria andImagetypeNotBetween(String value1, String value2) {
            addCriterion("imageType not between", value1, value2, "imagetype");
            return (Criteria) this;
        }

        public Criteria andAttachnameIsNull() {
            addCriterion("attachName is null");
            return (Criteria) this;
        }

        public Criteria andAttachnameIsNotNull() {
            addCriterion("attachName is not null");
            return (Criteria) this;
        }

        public Criteria andAttachnameEqualTo(String value) {
            addCriterion("attachName =", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameNotEqualTo(String value) {
            addCriterion("attachName <>", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameGreaterThan(String value) {
            addCriterion("attachName >", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameGreaterThanOrEqualTo(String value) {
            addCriterion("attachName >=", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameLessThan(String value) {
            addCriterion("attachName <", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameLessThanOrEqualTo(String value) {
            addCriterion("attachName <=", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameLike(String value) {
            addCriterion("attachName like", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameNotLike(String value) {
            addCriterion("attachName not like", value, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameIn(List<String> values) {
            addCriterion("attachName in", values, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameNotIn(List<String> values) {
            addCriterion("attachName not in", values, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameBetween(String value1, String value2) {
            addCriterion("attachName between", value1, value2, "attachname");
            return (Criteria) this;
        }

        public Criteria andAttachnameNotBetween(String value1, String value2) {
            addCriterion("attachName not between", value1, value2, "attachname");
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