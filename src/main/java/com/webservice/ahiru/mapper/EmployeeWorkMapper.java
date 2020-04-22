package com.webservice.ahiru.mapper;

import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.webservice.ahiru.entity.EmployeeWork;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author wangenji
 * @since 2019-11-18
 */

//用于标注数据访问组件，即DAO组件。
@Repository
//添加接口
@Mapper
//数据库访问接口类
public interface EmployeeWorkMapper {

    // 查询数据
    List<EmployeeWork> getEmployeeWorkInfo(EmployeeWork employeeWork);

    // 删除数据
    //int delEmployeeWorkInfo(List employeeWorkList);

    // 更新数据
    int uptEmployeeWorkInfo(List employeeWorkList);

    //插入数据
    //int insEmployeeWorkInfo(List employeeWorkList);

    List<EmployeeWork> getEmployeeWorkInfoAll(String startDt, String endDt);

    List<EmployeeWork> getEmployeeWorkInfoAllList(EmployeeWork employeeWorList);
}



