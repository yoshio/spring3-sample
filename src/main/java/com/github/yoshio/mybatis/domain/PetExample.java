package com.github.yoshio.mybatis.domain;

import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class PetExample {
    /**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table PUBLIC.PET
	 * @mbggenerated  Mon Nov 12 13:46:19 JST 2012
	 */
	protected String orderByClause;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table PUBLIC.PET
	 * @mbggenerated  Mon Nov 12 13:46:19 JST 2012
	 */
	protected boolean distinct;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table PUBLIC.PET
	 * @mbggenerated  Mon Nov 12 13:46:19 JST 2012
	 */
	protected List<Criteria> oredCriteria;

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PET
	 * @mbggenerated  Mon Nov 12 13:46:19 JST 2012
	 */
	public PetExample() {
		oredCriteria = new ArrayList<Criteria>();
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PET
	 * @mbggenerated  Mon Nov 12 13:46:19 JST 2012
	 */
	public void setOrderByClause(String orderByClause) {
		this.orderByClause = orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PET
	 * @mbggenerated  Mon Nov 12 13:46:19 JST 2012
	 */
	public String getOrderByClause() {
		return orderByClause;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PET
	 * @mbggenerated  Mon Nov 12 13:46:19 JST 2012
	 */
	public void setDistinct(boolean distinct) {
		this.distinct = distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PET
	 * @mbggenerated  Mon Nov 12 13:46:19 JST 2012
	 */
	public boolean isDistinct() {
		return distinct;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PET
	 * @mbggenerated  Mon Nov 12 13:46:19 JST 2012
	 */
	public List<Criteria> getOredCriteria() {
		return oredCriteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PET
	 * @mbggenerated  Mon Nov 12 13:46:19 JST 2012
	 */
	public void or(Criteria criteria) {
		oredCriteria.add(criteria);
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PET
	 * @mbggenerated  Mon Nov 12 13:46:19 JST 2012
	 */
	public Criteria or() {
		Criteria criteria = createCriteriaInternal();
		oredCriteria.add(criteria);
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PET
	 * @mbggenerated  Mon Nov 12 13:46:19 JST 2012
	 */
	public Criteria createCriteria() {
		Criteria criteria = createCriteriaInternal();
		if (oredCriteria.size() == 0) {
			oredCriteria.add(criteria);
		}
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PET
	 * @mbggenerated  Mon Nov 12 13:46:19 JST 2012
	 */
	protected Criteria createCriteriaInternal() {
		Criteria criteria = new Criteria();
		return criteria;
	}

	/**
	 * This method was generated by MyBatis Generator. This method corresponds to the database table PUBLIC.PET
	 * @mbggenerated  Mon Nov 12 13:46:19 JST 2012
	 */
	public void clear() {
		oredCriteria.clear();
		orderByClause = null;
		distinct = false;
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table PUBLIC.PET
	 * @mbggenerated  Mon Nov 12 13:46:19 JST 2012
	 */
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

		protected void addCriterion(String condition, Object value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value));
		}

		protected void addCriterion(String condition, Object value1,
				Object value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			criteria.add(new Criterion(condition, value1, value2));
		}

		protected void addCriterionForJDBCDate(String condition, Date value,
				String property) {
			if (value == null) {
				throw new RuntimeException("Value for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value.getTime()),
					property);
		}

		protected void addCriterionForJDBCDate(String condition,
				List<Date> values, String property) {
			if (values == null || values.size() == 0) {
				throw new RuntimeException("Value list for " + property
						+ " cannot be null or empty");
			}
			List<java.sql.Date> dateList = new ArrayList<java.sql.Date>();
			Iterator<Date> iter = values.iterator();
			while (iter.hasNext()) {
				dateList.add(new java.sql.Date(iter.next().getTime()));
			}
			addCriterion(condition, dateList, property);
		}

		protected void addCriterionForJDBCDate(String condition, Date value1,
				Date value2, String property) {
			if (value1 == null || value2 == null) {
				throw new RuntimeException("Between values for " + property
						+ " cannot be null");
			}
			addCriterion(condition, new java.sql.Date(value1.getTime()),
					new java.sql.Date(value2.getTime()), property);
		}

		public Criteria andPetidIsNull() {
			addCriterion("PETID is null");
			return (Criteria) this;
		}

		public Criteria andPetidIsNotNull() {
			addCriterion("PETID is not null");
			return (Criteria) this;
		}

		public Criteria andPetidEqualTo(Integer value) {
			addCriterion("PETID =", value, "petid");
			return (Criteria) this;
		}

		public Criteria andPetidNotEqualTo(Integer value) {
			addCriterion("PETID <>", value, "petid");
			return (Criteria) this;
		}

		public Criteria andPetidGreaterThan(Integer value) {
			addCriterion("PETID >", value, "petid");
			return (Criteria) this;
		}

		public Criteria andPetidGreaterThanOrEqualTo(Integer value) {
			addCriterion("PETID >=", value, "petid");
			return (Criteria) this;
		}

		public Criteria andPetidLessThan(Integer value) {
			addCriterion("PETID <", value, "petid");
			return (Criteria) this;
		}

		public Criteria andPetidLessThanOrEqualTo(Integer value) {
			addCriterion("PETID <=", value, "petid");
			return (Criteria) this;
		}

		public Criteria andPetidIn(List<Integer> values) {
			addCriterion("PETID in", values, "petid");
			return (Criteria) this;
		}

		public Criteria andPetidNotIn(List<Integer> values) {
			addCriterion("PETID not in", values, "petid");
			return (Criteria) this;
		}

		public Criteria andPetidBetween(Integer value1, Integer value2) {
			addCriterion("PETID between", value1, value2, "petid");
			return (Criteria) this;
		}

		public Criteria andPetidNotBetween(Integer value1, Integer value2) {
			addCriterion("PETID not between", value1, value2, "petid");
			return (Criteria) this;
		}

		public Criteria andPetnameIsNull() {
			addCriterion("PETNAME is null");
			return (Criteria) this;
		}

		public Criteria andPetnameIsNotNull() {
			addCriterion("PETNAME is not null");
			return (Criteria) this;
		}

		public Criteria andPetnameEqualTo(String value) {
			addCriterion("PETNAME =", value, "petname");
			return (Criteria) this;
		}

		public Criteria andPetnameNotEqualTo(String value) {
			addCriterion("PETNAME <>", value, "petname");
			return (Criteria) this;
		}

		public Criteria andPetnameGreaterThan(String value) {
			addCriterion("PETNAME >", value, "petname");
			return (Criteria) this;
		}

		public Criteria andPetnameGreaterThanOrEqualTo(String value) {
			addCriterion("PETNAME >=", value, "petname");
			return (Criteria) this;
		}

		public Criteria andPetnameLessThan(String value) {
			addCriterion("PETNAME <", value, "petname");
			return (Criteria) this;
		}

		public Criteria andPetnameLessThanOrEqualTo(String value) {
			addCriterion("PETNAME <=", value, "petname");
			return (Criteria) this;
		}

		public Criteria andPetnameLike(String value) {
			addCriterion("PETNAME like", value, "petname");
			return (Criteria) this;
		}

		public Criteria andPetnameNotLike(String value) {
			addCriterion("PETNAME not like", value, "petname");
			return (Criteria) this;
		}

		public Criteria andPetnameIn(List<String> values) {
			addCriterion("PETNAME in", values, "petname");
			return (Criteria) this;
		}

		public Criteria andPetnameNotIn(List<String> values) {
			addCriterion("PETNAME not in", values, "petname");
			return (Criteria) this;
		}

		public Criteria andPetnameBetween(String value1, String value2) {
			addCriterion("PETNAME between", value1, value2, "petname");
			return (Criteria) this;
		}

		public Criteria andPetnameNotBetween(String value1, String value2) {
			addCriterion("PETNAME not between", value1, value2, "petname");
			return (Criteria) this;
		}

		public Criteria andOwnernameIsNull() {
			addCriterion("OWNERNAME is null");
			return (Criteria) this;
		}

		public Criteria andOwnernameIsNotNull() {
			addCriterion("OWNERNAME is not null");
			return (Criteria) this;
		}

		public Criteria andOwnernameEqualTo(String value) {
			addCriterion("OWNERNAME =", value, "ownername");
			return (Criteria) this;
		}

		public Criteria andOwnernameNotEqualTo(String value) {
			addCriterion("OWNERNAME <>", value, "ownername");
			return (Criteria) this;
		}

		public Criteria andOwnernameGreaterThan(String value) {
			addCriterion("OWNERNAME >", value, "ownername");
			return (Criteria) this;
		}

		public Criteria andOwnernameGreaterThanOrEqualTo(String value) {
			addCriterion("OWNERNAME >=", value, "ownername");
			return (Criteria) this;
		}

		public Criteria andOwnernameLessThan(String value) {
			addCriterion("OWNERNAME <", value, "ownername");
			return (Criteria) this;
		}

		public Criteria andOwnernameLessThanOrEqualTo(String value) {
			addCriterion("OWNERNAME <=", value, "ownername");
			return (Criteria) this;
		}

		public Criteria andOwnernameLike(String value) {
			addCriterion("OWNERNAME like", value, "ownername");
			return (Criteria) this;
		}

		public Criteria andOwnernameNotLike(String value) {
			addCriterion("OWNERNAME not like", value, "ownername");
			return (Criteria) this;
		}

		public Criteria andOwnernameIn(List<String> values) {
			addCriterion("OWNERNAME in", values, "ownername");
			return (Criteria) this;
		}

		public Criteria andOwnernameNotIn(List<String> values) {
			addCriterion("OWNERNAME not in", values, "ownername");
			return (Criteria) this;
		}

		public Criteria andOwnernameBetween(String value1, String value2) {
			addCriterion("OWNERNAME between", value1, value2, "ownername");
			return (Criteria) this;
		}

		public Criteria andOwnernameNotBetween(String value1, String value2) {
			addCriterion("OWNERNAME not between", value1, value2, "ownername");
			return (Criteria) this;
		}

		public Criteria andPriceIsNull() {
			addCriterion("PRICE is null");
			return (Criteria) this;
		}

		public Criteria andPriceIsNotNull() {
			addCriterion("PRICE is not null");
			return (Criteria) this;
		}

		public Criteria andPriceEqualTo(Integer value) {
			addCriterion("PRICE =", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceNotEqualTo(Integer value) {
			addCriterion("PRICE <>", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceGreaterThan(Integer value) {
			addCriterion("PRICE >", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceGreaterThanOrEqualTo(Integer value) {
			addCriterion("PRICE >=", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceLessThan(Integer value) {
			addCriterion("PRICE <", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceLessThanOrEqualTo(Integer value) {
			addCriterion("PRICE <=", value, "price");
			return (Criteria) this;
		}

		public Criteria andPriceIn(List<Integer> values) {
			addCriterion("PRICE in", values, "price");
			return (Criteria) this;
		}

		public Criteria andPriceNotIn(List<Integer> values) {
			addCriterion("PRICE not in", values, "price");
			return (Criteria) this;
		}

		public Criteria andPriceBetween(Integer value1, Integer value2) {
			addCriterion("PRICE between", value1, value2, "price");
			return (Criteria) this;
		}

		public Criteria andPriceNotBetween(Integer value1, Integer value2) {
			addCriterion("PRICE not between", value1, value2, "price");
			return (Criteria) this;
		}

		public Criteria andBirthdateIsNull() {
			addCriterion("BIRTHDATE is null");
			return (Criteria) this;
		}

		public Criteria andBirthdateIsNotNull() {
			addCriterion("BIRTHDATE is not null");
			return (Criteria) this;
		}

		public Criteria andBirthdateEqualTo(Date value) {
			addCriterionForJDBCDate("BIRTHDATE =", value, "birthdate");
			return (Criteria) this;
		}

		public Criteria andBirthdateNotEqualTo(Date value) {
			addCriterionForJDBCDate("BIRTHDATE <>", value, "birthdate");
			return (Criteria) this;
		}

		public Criteria andBirthdateGreaterThan(Date value) {
			addCriterionForJDBCDate("BIRTHDATE >", value, "birthdate");
			return (Criteria) this;
		}

		public Criteria andBirthdateGreaterThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("BIRTHDATE >=", value, "birthdate");
			return (Criteria) this;
		}

		public Criteria andBirthdateLessThan(Date value) {
			addCriterionForJDBCDate("BIRTHDATE <", value, "birthdate");
			return (Criteria) this;
		}

		public Criteria andBirthdateLessThanOrEqualTo(Date value) {
			addCriterionForJDBCDate("BIRTHDATE <=", value, "birthdate");
			return (Criteria) this;
		}

		public Criteria andBirthdateIn(List<Date> values) {
			addCriterionForJDBCDate("BIRTHDATE in", values, "birthdate");
			return (Criteria) this;
		}

		public Criteria andBirthdateNotIn(List<Date> values) {
			addCriterionForJDBCDate("BIRTHDATE not in", values, "birthdate");
			return (Criteria) this;
		}

		public Criteria andBirthdateBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("BIRTHDATE between", value1, value2,
					"birthdate");
			return (Criteria) this;
		}

		public Criteria andBirthdateNotBetween(Date value1, Date value2) {
			addCriterionForJDBCDate("BIRTHDATE not between", value1, value2,
					"birthdate");
			return (Criteria) this;
		}
	}

	/**
	 * This class was generated by MyBatis Generator. This class corresponds to the database table PUBLIC.PET
	 * @mbggenerated  Mon Nov 12 13:46:19 JST 2012
	 */
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

		protected Criterion(String condition, Object value, Object secondValue,
				String typeHandler) {
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

	/**
     * This class was generated by MyBatis Generator.
     * This class corresponds to the database table PUBLIC.PET
     *
     * @mbggenerated do_not_delete_during_merge Mon Nov 12 10:48:35 JST 2012
     */
    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }
}