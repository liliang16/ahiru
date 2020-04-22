package com.webservice.ahiru.mapper;

import com.webservice.ahiru.entity.MEmployeePm;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author songxipeng
 * @since 2019-12-16
 */
//用于标注数据访问组件，即DAO组件。
@Repository
//添加接口
@Mapper
//数据库访问接口类
public interface MEmployeePmMapper {

    // 查询数据
    List<MEmployeePm> getInfos();

}
