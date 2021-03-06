package com.github.yoshio.mybatis.mapper;

import com.github.yoshio.mybatis.domain.Shop;
import com.github.yoshio.mybatis.domain.ShopExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ShopMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SHOP
     *
     * @mbggenerated Mon Nov 12 13:46:19 JST 2012
     */
    int countByExample(ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SHOP
     *
     * @mbggenerated Mon Nov 12 13:46:19 JST 2012
     */
    int deleteByExample(ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SHOP
     *
     * @mbggenerated Mon Nov 12 13:46:19 JST 2012
     */
    int deleteByPrimaryKey(String shopId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SHOP
     *
     * @mbggenerated Mon Nov 12 13:46:19 JST 2012
     */
    int insert(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SHOP
     *
     * @mbggenerated Mon Nov 12 13:46:19 JST 2012
     */
    int insertSelective(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SHOP
     *
     * @mbggenerated Mon Nov 12 13:46:19 JST 2012
     */
    List<Shop> selectByExample(ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SHOP
     *
     * @mbggenerated Mon Nov 12 13:46:19 JST 2012
     */
    Shop selectByPrimaryKey(String shopId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SHOP
     *
     * @mbggenerated Mon Nov 12 13:46:19 JST 2012
     */
    int updateByExampleSelective(@Param("record") Shop record, @Param("example") ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SHOP
     *
     * @mbggenerated Mon Nov 12 13:46:19 JST 2012
     */
    int updateByExample(@Param("record") Shop record, @Param("example") ShopExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SHOP
     *
     * @mbggenerated Mon Nov 12 13:46:19 JST 2012
     */
    int updateByPrimaryKeySelective(Shop record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table PUBLIC.SHOP
     *
     * @mbggenerated Mon Nov 12 13:46:19 JST 2012
     */
    int updateByPrimaryKey(Shop record);
}