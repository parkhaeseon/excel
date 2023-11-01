package com.excel.exceldown.mapper;

import com.excel.exceldown.domain.PersonData;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    void excelDownloadSelectId();

}
