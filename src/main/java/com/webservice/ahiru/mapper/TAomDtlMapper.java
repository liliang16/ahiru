package com.webservice.ahiru.mapper;

import com.webservice.ahiru.entity.VAomDtl;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
//添加接口
@Mapper
//数据库访问接口类
public interface TAomDtlMapper {
    public List<VAomDtl> getTAomSingleMonth();
}
