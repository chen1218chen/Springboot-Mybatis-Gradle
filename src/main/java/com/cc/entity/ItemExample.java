package com.cc.entity;

import java.util.ArrayList;
import java.util.List;

public class ItemExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ItemExample() {
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

        public Criteria andOwnernameIsNull() {
            addCriterion("ownerName is null");
            return (Criteria) this;
        }

        public Criteria andOwnernameIsNotNull() {
            addCriterion("ownerName is not null");
            return (Criteria) this;
        }

        public Criteria andOwnernameEqualTo(String value) {
            addCriterion("ownerName =", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotEqualTo(String value) {
            addCriterion("ownerName <>", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameGreaterThan(String value) {
            addCriterion("ownerName >", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameGreaterThanOrEqualTo(String value) {
            addCriterion("ownerName >=", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLessThan(String value) {
            addCriterion("ownerName <", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLessThanOrEqualTo(String value) {
            addCriterion("ownerName <=", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameLike(String value) {
            addCriterion("ownerName like", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotLike(String value) {
            addCriterion("ownerName not like", value, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameIn(List<String> values) {
            addCriterion("ownerName in", values, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotIn(List<String> values) {
            addCriterion("ownerName not in", values, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameBetween(String value1, String value2) {
            addCriterion("ownerName between", value1, value2, "ownername");
            return (Criteria) this;
        }

        public Criteria andOwnernameNotBetween(String value1, String value2) {
            addCriterion("ownerName not between", value1, value2, "ownername");
            return (Criteria) this;
        }

        public Criteria andAddressIsNull() {
            addCriterion("address is null");
            return (Criteria) this;
        }

        public Criteria andAddressIsNotNull() {
            addCriterion("address is not null");
            return (Criteria) this;
        }

        public Criteria andAddressEqualTo(String value) {
            addCriterion("address =", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotEqualTo(String value) {
            addCriterion("address <>", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThan(String value) {
            addCriterion("address >", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressGreaterThanOrEqualTo(String value) {
            addCriterion("address >=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThan(String value) {
            addCriterion("address <", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLessThanOrEqualTo(String value) {
            addCriterion("address <=", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressLike(String value) {
            addCriterion("address like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotLike(String value) {
            addCriterion("address not like", value, "address");
            return (Criteria) this;
        }

        public Criteria andAddressIn(List<String> values) {
            addCriterion("address in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotIn(List<String> values) {
            addCriterion("address not in", values, "address");
            return (Criteria) this;
        }

        public Criteria andAddressBetween(String value1, String value2) {
            addCriterion("address between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAddressNotBetween(String value1, String value2) {
            addCriterion("address not between", value1, value2, "address");
            return (Criteria) this;
        }

        public Criteria andAreaIsNull() {
            addCriterion("area is null");
            return (Criteria) this;
        }

        public Criteria andAreaIsNotNull() {
            addCriterion("area is not null");
            return (Criteria) this;
        }

        public Criteria andAreaEqualTo(String value) {
            addCriterion("area =", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotEqualTo(String value) {
            addCriterion("area <>", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThan(String value) {
            addCriterion("area >", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaGreaterThanOrEqualTo(String value) {
            addCriterion("area >=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThan(String value) {
            addCriterion("area <", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLessThanOrEqualTo(String value) {
            addCriterion("area <=", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaLike(String value) {
            addCriterion("area like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotLike(String value) {
            addCriterion("area not like", value, "area");
            return (Criteria) this;
        }

        public Criteria andAreaIn(List<String> values) {
            addCriterion("area in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotIn(List<String> values) {
            addCriterion("area not in", values, "area");
            return (Criteria) this;
        }

        public Criteria andAreaBetween(String value1, String value2) {
            addCriterion("area between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andAreaNotBetween(String value1, String value2) {
            addCriterion("area not between", value1, value2, "area");
            return (Criteria) this;
        }

        public Criteria andDatatimeIsNull() {
            addCriterion("dataTime is null");
            return (Criteria) this;
        }

        public Criteria andDatatimeIsNotNull() {
            addCriterion("dataTime is not null");
            return (Criteria) this;
        }

        public Criteria andDatatimeEqualTo(String value) {
            addCriterion("dataTime =", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotEqualTo(String value) {
            addCriterion("dataTime <>", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeGreaterThan(String value) {
            addCriterion("dataTime >", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeGreaterThanOrEqualTo(String value) {
            addCriterion("dataTime >=", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeLessThan(String value) {
            addCriterion("dataTime <", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeLessThanOrEqualTo(String value) {
            addCriterion("dataTime <=", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeLike(String value) {
            addCriterion("dataTime like", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotLike(String value) {
            addCriterion("dataTime not like", value, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeIn(List<String> values) {
            addCriterion("dataTime in", values, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotIn(List<String> values) {
            addCriterion("dataTime not in", values, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeBetween(String value1, String value2) {
            addCriterion("dataTime between", value1, value2, "datatime");
            return (Criteria) this;
        }

        public Criteria andDatatimeNotBetween(String value1, String value2) {
            addCriterion("dataTime not between", value1, value2, "datatime");
            return (Criteria) this;
        }

        public Criteria andDealnameIsNull() {
            addCriterion("dealName is null");
            return (Criteria) this;
        }

        public Criteria andDealnameIsNotNull() {
            addCriterion("dealName is not null");
            return (Criteria) this;
        }

        public Criteria andDealnameEqualTo(String value) {
            addCriterion("dealName =", value, "dealname");
            return (Criteria) this;
        }

        public Criteria andDealnameNotEqualTo(String value) {
            addCriterion("dealName <>", value, "dealname");
            return (Criteria) this;
        }

        public Criteria andDealnameGreaterThan(String value) {
            addCriterion("dealName >", value, "dealname");
            return (Criteria) this;
        }

        public Criteria andDealnameGreaterThanOrEqualTo(String value) {
            addCriterion("dealName >=", value, "dealname");
            return (Criteria) this;
        }

        public Criteria andDealnameLessThan(String value) {
            addCriterion("dealName <", value, "dealname");
            return (Criteria) this;
        }

        public Criteria andDealnameLessThanOrEqualTo(String value) {
            addCriterion("dealName <=", value, "dealname");
            return (Criteria) this;
        }

        public Criteria andDealnameLike(String value) {
            addCriterion("dealName like", value, "dealname");
            return (Criteria) this;
        }

        public Criteria andDealnameNotLike(String value) {
            addCriterion("dealName not like", value, "dealname");
            return (Criteria) this;
        }

        public Criteria andDealnameIn(List<String> values) {
            addCriterion("dealName in", values, "dealname");
            return (Criteria) this;
        }

        public Criteria andDealnameNotIn(List<String> values) {
            addCriterion("dealName not in", values, "dealname");
            return (Criteria) this;
        }

        public Criteria andDealnameBetween(String value1, String value2) {
            addCriterion("dealName between", value1, value2, "dealname");
            return (Criteria) this;
        }

        public Criteria andDealnameNotBetween(String value1, String value2) {
            addCriterion("dealName not between", value1, value2, "dealname");
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

        public Criteria andFlagIsNull() {
            addCriterion("flag is null");
            return (Criteria) this;
        }

        public Criteria andFlagIsNotNull() {
            addCriterion("flag is not null");
            return (Criteria) this;
        }

        public Criteria andFlagEqualTo(Integer value) {
            addCriterion("flag =", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotEqualTo(Integer value) {
            addCriterion("flag <>", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThan(Integer value) {
            addCriterion("flag >", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagGreaterThanOrEqualTo(Integer value) {
            addCriterion("flag >=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThan(Integer value) {
            addCriterion("flag <", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagLessThanOrEqualTo(Integer value) {
            addCriterion("flag <=", value, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagIn(List<Integer> values) {
            addCriterion("flag in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotIn(List<Integer> values) {
            addCriterion("flag not in", values, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagBetween(Integer value1, Integer value2) {
            addCriterion("flag between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andFlagNotBetween(Integer value1, Integer value2) {
            addCriterion("flag not between", value1, value2, "flag");
            return (Criteria) this;
        }

        public Criteria andLatIsNull() {
            addCriterion("lat is null");
            return (Criteria) this;
        }

        public Criteria andLatIsNotNull() {
            addCriterion("lat is not null");
            return (Criteria) this;
        }

        public Criteria andLatEqualTo(String value) {
            addCriterion("lat =", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotEqualTo(String value) {
            addCriterion("lat <>", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThan(String value) {
            addCriterion("lat >", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatGreaterThanOrEqualTo(String value) {
            addCriterion("lat >=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThan(String value) {
            addCriterion("lat <", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLessThanOrEqualTo(String value) {
            addCriterion("lat <=", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatLike(String value) {
            addCriterion("lat like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotLike(String value) {
            addCriterion("lat not like", value, "lat");
            return (Criteria) this;
        }

        public Criteria andLatIn(List<String> values) {
            addCriterion("lat in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotIn(List<String> values) {
            addCriterion("lat not in", values, "lat");
            return (Criteria) this;
        }

        public Criteria andLatBetween(String value1, String value2) {
            addCriterion("lat between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLatNotBetween(String value1, String value2) {
            addCriterion("lat not between", value1, value2, "lat");
            return (Criteria) this;
        }

        public Criteria andLonIsNull() {
            addCriterion("lon is null");
            return (Criteria) this;
        }

        public Criteria andLonIsNotNull() {
            addCriterion("lon is not null");
            return (Criteria) this;
        }

        public Criteria andLonEqualTo(String value) {
            addCriterion("lon =", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotEqualTo(String value) {
            addCriterion("lon <>", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThan(String value) {
            addCriterion("lon >", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonGreaterThanOrEqualTo(String value) {
            addCriterion("lon >=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThan(String value) {
            addCriterion("lon <", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLessThanOrEqualTo(String value) {
            addCriterion("lon <=", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonLike(String value) {
            addCriterion("lon like", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotLike(String value) {
            addCriterion("lon not like", value, "lon");
            return (Criteria) this;
        }

        public Criteria andLonIn(List<String> values) {
            addCriterion("lon in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotIn(List<String> values) {
            addCriterion("lon not in", values, "lon");
            return (Criteria) this;
        }

        public Criteria andLonBetween(String value1, String value2) {
            addCriterion("lon between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andLonNotBetween(String value1, String value2) {
            addCriterion("lon not between", value1, value2, "lon");
            return (Criteria) this;
        }

        public Criteria andSourceIsNull() {
            addCriterion("source is null");
            return (Criteria) this;
        }

        public Criteria andSourceIsNotNull() {
            addCriterion("source is not null");
            return (Criteria) this;
        }

        public Criteria andSourceEqualTo(String value) {
            addCriterion("source =", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotEqualTo(String value) {
            addCriterion("source <>", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThan(String value) {
            addCriterion("source >", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceGreaterThanOrEqualTo(String value) {
            addCriterion("source >=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThan(String value) {
            addCriterion("source <", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLessThanOrEqualTo(String value) {
            addCriterion("source <=", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceLike(String value) {
            addCriterion("source like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotLike(String value) {
            addCriterion("source not like", value, "source");
            return (Criteria) this;
        }

        public Criteria andSourceIn(List<String> values) {
            addCriterion("source in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotIn(List<String> values) {
            addCriterion("source not in", values, "source");
            return (Criteria) this;
        }

        public Criteria andSourceBetween(String value1, String value2) {
            addCriterion("source between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andSourceNotBetween(String value1, String value2) {
            addCriterion("source not between", value1, value2, "source");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNull() {
            addCriterion("telephone is null");
            return (Criteria) this;
        }

        public Criteria andTelephoneIsNotNull() {
            addCriterion("telephone is not null");
            return (Criteria) this;
        }

        public Criteria andTelephoneEqualTo(String value) {
            addCriterion("telephone =", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotEqualTo(String value) {
            addCriterion("telephone <>", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThan(String value) {
            addCriterion("telephone >", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneGreaterThanOrEqualTo(String value) {
            addCriterion("telephone >=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThan(String value) {
            addCriterion("telephone <", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLessThanOrEqualTo(String value) {
            addCriterion("telephone <=", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneLike(String value) {
            addCriterion("telephone like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotLike(String value) {
            addCriterion("telephone not like", value, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneIn(List<String> values) {
            addCriterion("telephone in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotIn(List<String> values) {
            addCriterion("telephone not in", values, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneBetween(String value1, String value2) {
            addCriterion("telephone between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTelephoneNotBetween(String value1, String value2) {
            addCriterion("telephone not between", value1, value2, "telephone");
            return (Criteria) this;
        }

        public Criteria andTypeIsNull() {
            addCriterion("type is null");
            return (Criteria) this;
        }

        public Criteria andTypeIsNotNull() {
            addCriterion("type is not null");
            return (Criteria) this;
        }

        public Criteria andTypeEqualTo(String value) {
            addCriterion("type =", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotEqualTo(String value) {
            addCriterion("type <>", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThan(String value) {
            addCriterion("type >", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeGreaterThanOrEqualTo(String value) {
            addCriterion("type >=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThan(String value) {
            addCriterion("type <", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLessThanOrEqualTo(String value) {
            addCriterion("type <=", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeLike(String value) {
            addCriterion("type like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotLike(String value) {
            addCriterion("type not like", value, "type");
            return (Criteria) this;
        }

        public Criteria andTypeIn(List<String> values) {
            addCriterion("type in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotIn(List<String> values) {
            addCriterion("type not in", values, "type");
            return (Criteria) this;
        }

        public Criteria andTypeBetween(String value1, String value2) {
            addCriterion("type between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andTypeNotBetween(String value1, String value2) {
            addCriterion("type not between", value1, value2, "type");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIsNull() {
            addCriterion("jurisdiction is null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIsNotNull() {
            addCriterion("jurisdiction is not null");
            return (Criteria) this;
        }

        public Criteria andJurisdictionEqualTo(String value) {
            addCriterion("jurisdiction =", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNotEqualTo(String value) {
            addCriterion("jurisdiction <>", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionGreaterThan(String value) {
            addCriterion("jurisdiction >", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionGreaterThanOrEqualTo(String value) {
            addCriterion("jurisdiction >=", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionLessThan(String value) {
            addCriterion("jurisdiction <", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionLessThanOrEqualTo(String value) {
            addCriterion("jurisdiction <=", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionLike(String value) {
            addCriterion("jurisdiction like", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNotLike(String value) {
            addCriterion("jurisdiction not like", value, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionIn(List<String> values) {
            addCriterion("jurisdiction in", values, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNotIn(List<String> values) {
            addCriterion("jurisdiction not in", values, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionBetween(String value1, String value2) {
            addCriterion("jurisdiction between", value1, value2, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andJurisdictionNotBetween(String value1, String value2) {
            addCriterion("jurisdiction not between", value1, value2, "jurisdiction");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNull() {
            addCriterion("taskId is null");
            return (Criteria) this;
        }

        public Criteria andTaskidIsNotNull() {
            addCriterion("taskId is not null");
            return (Criteria) this;
        }

        public Criteria andTaskidEqualTo(String value) {
            addCriterion("taskId =", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotEqualTo(String value) {
            addCriterion("taskId <>", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThan(String value) {
            addCriterion("taskId >", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidGreaterThanOrEqualTo(String value) {
            addCriterion("taskId >=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThan(String value) {
            addCriterion("taskId <", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLessThanOrEqualTo(String value) {
            addCriterion("taskId <=", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidLike(String value) {
            addCriterion("taskId like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotLike(String value) {
            addCriterion("taskId not like", value, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidIn(List<String> values) {
            addCriterion("taskId in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotIn(List<String> values) {
            addCriterion("taskId not in", values, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidBetween(String value1, String value2) {
            addCriterion("taskId between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andTaskidNotBetween(String value1, String value2) {
            addCriterion("taskId not between", value1, value2, "taskid");
            return (Criteria) this;
        }

        public Criteria andBlacklistIsNull() {
            addCriterion("blackList is null");
            return (Criteria) this;
        }

        public Criteria andBlacklistIsNotNull() {
            addCriterion("blackList is not null");
            return (Criteria) this;
        }

        public Criteria andBlacklistEqualTo(Integer value) {
            addCriterion("blackList =", value, "blacklist");
            return (Criteria) this;
        }

        public Criteria andBlacklistNotEqualTo(Integer value) {
            addCriterion("blackList <>", value, "blacklist");
            return (Criteria) this;
        }

        public Criteria andBlacklistGreaterThan(Integer value) {
            addCriterion("blackList >", value, "blacklist");
            return (Criteria) this;
        }

        public Criteria andBlacklistGreaterThanOrEqualTo(Integer value) {
            addCriterion("blackList >=", value, "blacklist");
            return (Criteria) this;
        }

        public Criteria andBlacklistLessThan(Integer value) {
            addCriterion("blackList <", value, "blacklist");
            return (Criteria) this;
        }

        public Criteria andBlacklistLessThanOrEqualTo(Integer value) {
            addCriterion("blackList <=", value, "blacklist");
            return (Criteria) this;
        }

        public Criteria andBlacklistIn(List<Integer> values) {
            addCriterion("blackList in", values, "blacklist");
            return (Criteria) this;
        }

        public Criteria andBlacklistNotIn(List<Integer> values) {
            addCriterion("blackList not in", values, "blacklist");
            return (Criteria) this;
        }

        public Criteria andBlacklistBetween(Integer value1, Integer value2) {
            addCriterion("blackList between", value1, value2, "blacklist");
            return (Criteria) this;
        }

        public Criteria andBlacklistNotBetween(Integer value1, Integer value2) {
            addCriterion("blackList not between", value1, value2, "blacklist");
            return (Criteria) this;
        }

        public Criteria andBuildnameIsNull() {
            addCriterion("buildName is null");
            return (Criteria) this;
        }

        public Criteria andBuildnameIsNotNull() {
            addCriterion("buildName is not null");
            return (Criteria) this;
        }

        public Criteria andBuildnameEqualTo(String value) {
            addCriterion("buildName =", value, "buildname");
            return (Criteria) this;
        }

        public Criteria andBuildnameNotEqualTo(String value) {
            addCriterion("buildName <>", value, "buildname");
            return (Criteria) this;
        }

        public Criteria andBuildnameGreaterThan(String value) {
            addCriterion("buildName >", value, "buildname");
            return (Criteria) this;
        }

        public Criteria andBuildnameGreaterThanOrEqualTo(String value) {
            addCriterion("buildName >=", value, "buildname");
            return (Criteria) this;
        }

        public Criteria andBuildnameLessThan(String value) {
            addCriterion("buildName <", value, "buildname");
            return (Criteria) this;
        }

        public Criteria andBuildnameLessThanOrEqualTo(String value) {
            addCriterion("buildName <=", value, "buildname");
            return (Criteria) this;
        }

        public Criteria andBuildnameLike(String value) {
            addCriterion("buildName like", value, "buildname");
            return (Criteria) this;
        }

        public Criteria andBuildnameNotLike(String value) {
            addCriterion("buildName not like", value, "buildname");
            return (Criteria) this;
        }

        public Criteria andBuildnameIn(List<String> values) {
            addCriterion("buildName in", values, "buildname");
            return (Criteria) this;
        }

        public Criteria andBuildnameNotIn(List<String> values) {
            addCriterion("buildName not in", values, "buildname");
            return (Criteria) this;
        }

        public Criteria andBuildnameBetween(String value1, String value2) {
            addCriterion("buildName between", value1, value2, "buildname");
            return (Criteria) this;
        }

        public Criteria andBuildnameNotBetween(String value1, String value2) {
            addCriterion("buildName not between", value1, value2, "buildname");
            return (Criteria) this;
        }

        public Criteria andBuildtimeIsNull() {
            addCriterion("buildTime is null");
            return (Criteria) this;
        }

        public Criteria andBuildtimeIsNotNull() {
            addCriterion("buildTime is not null");
            return (Criteria) this;
        }

        public Criteria andBuildtimeEqualTo(String value) {
            addCriterion("buildTime =", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeNotEqualTo(String value) {
            addCriterion("buildTime <>", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeGreaterThan(String value) {
            addCriterion("buildTime >", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeGreaterThanOrEqualTo(String value) {
            addCriterion("buildTime >=", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeLessThan(String value) {
            addCriterion("buildTime <", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeLessThanOrEqualTo(String value) {
            addCriterion("buildTime <=", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeLike(String value) {
            addCriterion("buildTime like", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeNotLike(String value) {
            addCriterion("buildTime not like", value, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeIn(List<String> values) {
            addCriterion("buildTime in", values, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeNotIn(List<String> values) {
            addCriterion("buildTime not in", values, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeBetween(String value1, String value2) {
            addCriterion("buildTime between", value1, value2, "buildtime");
            return (Criteria) this;
        }

        public Criteria andBuildtimeNotBetween(String value1, String value2) {
            addCriterion("buildTime not between", value1, value2, "buildtime");
            return (Criteria) this;
        }

        public Criteria andStructureIsNull() {
            addCriterion("structure is null");
            return (Criteria) this;
        }

        public Criteria andStructureIsNotNull() {
            addCriterion("structure is not null");
            return (Criteria) this;
        }

        public Criteria andStructureEqualTo(String value) {
            addCriterion("structure =", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotEqualTo(String value) {
            addCriterion("structure <>", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureGreaterThan(String value) {
            addCriterion("structure >", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureGreaterThanOrEqualTo(String value) {
            addCriterion("structure >=", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLessThan(String value) {
            addCriterion("structure <", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLessThanOrEqualTo(String value) {
            addCriterion("structure <=", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureLike(String value) {
            addCriterion("structure like", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotLike(String value) {
            addCriterion("structure not like", value, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureIn(List<String> values) {
            addCriterion("structure in", values, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotIn(List<String> values) {
            addCriterion("structure not in", values, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureBetween(String value1, String value2) {
            addCriterion("structure between", value1, value2, "structure");
            return (Criteria) this;
        }

        public Criteria andStructureNotBetween(String value1, String value2) {
            addCriterion("structure not between", value1, value2, "structure");
            return (Criteria) this;
        }

        public Criteria andProcessidIsNull() {
            addCriterion("processId is null");
            return (Criteria) this;
        }

        public Criteria andProcessidIsNotNull() {
            addCriterion("processId is not null");
            return (Criteria) this;
        }

        public Criteria andProcessidEqualTo(Integer value) {
            addCriterion("processId =", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotEqualTo(Integer value) {
            addCriterion("processId <>", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidGreaterThan(Integer value) {
            addCriterion("processId >", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidGreaterThanOrEqualTo(Integer value) {
            addCriterion("processId >=", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidLessThan(Integer value) {
            addCriterion("processId <", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidLessThanOrEqualTo(Integer value) {
            addCriterion("processId <=", value, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidIn(List<Integer> values) {
            addCriterion("processId in", values, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotIn(List<Integer> values) {
            addCriterion("processId not in", values, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidBetween(Integer value1, Integer value2) {
            addCriterion("processId between", value1, value2, "processid");
            return (Criteria) this;
        }

        public Criteria andProcessidNotBetween(Integer value1, Integer value2) {
            addCriterion("processId not between", value1, value2, "processid");
            return (Criteria) this;
        }

        public Criteria andSeverityIsNull() {
            addCriterion("severity is null");
            return (Criteria) this;
        }

        public Criteria andSeverityIsNotNull() {
            addCriterion("severity is not null");
            return (Criteria) this;
        }

        public Criteria andSeverityEqualTo(Integer value) {
            addCriterion("severity =", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityNotEqualTo(Integer value) {
            addCriterion("severity <>", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityGreaterThan(Integer value) {
            addCriterion("severity >", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityGreaterThanOrEqualTo(Integer value) {
            addCriterion("severity >=", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityLessThan(Integer value) {
            addCriterion("severity <", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityLessThanOrEqualTo(Integer value) {
            addCriterion("severity <=", value, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityIn(List<Integer> values) {
            addCriterion("severity in", values, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityNotIn(List<Integer> values) {
            addCriterion("severity not in", values, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityBetween(Integer value1, Integer value2) {
            addCriterion("severity between", value1, value2, "severity");
            return (Criteria) this;
        }

        public Criteria andSeverityNotBetween(Integer value1, Integer value2) {
            addCriterion("severity not between", value1, value2, "severity");
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