package com.playGround.mapper;

import com.playGround.model.Land;
import com.playGround.model.LandExample;
import com.playGround.model.LandKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface LandMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAND
     *
     * @mbg.generated Thu Oct 03 01:28:20 KST 2024
     */
    long countByExample(LandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAND
     *
     * @mbg.generated Thu Oct 03 01:28:20 KST 2024
     */
    int deleteByExample(LandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAND
     *
     * @mbg.generated Thu Oct 03 01:28:20 KST 2024
     */
    int deleteByPrimaryKey(LandKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAND
     *
     * @mbg.generated Thu Oct 03 01:28:20 KST 2024
     */
    int insert(Land record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAND
     *
     * @mbg.generated Thu Oct 03 01:28:20 KST 2024
     */
    int insertSelective(Land record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAND
     *
     * @mbg.generated Thu Oct 03 01:28:20 KST 2024
     */
    List<Land> selectByExample(LandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAND
     *
     * @mbg.generated Thu Oct 03 01:28:20 KST 2024
     */
    Land selectByPrimaryKey(LandKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAND
     *
     * @mbg.generated Thu Oct 03 01:28:20 KST 2024
     */
    int updateByExampleSelective(@Param("record") Land record, @Param("example") LandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAND
     *
     * @mbg.generated Thu Oct 03 01:28:20 KST 2024
     */
    int updateByExample(@Param("record") Land record, @Param("example") LandExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAND
     *
     * @mbg.generated Thu Oct 03 01:28:20 KST 2024
     */
    int updateByPrimaryKeySelective(Land record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table LAND
     *
     * @mbg.generated Thu Oct 03 01:28:20 KST 2024
     */
    int updateByPrimaryKey(Land record);
}