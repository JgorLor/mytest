package cn.itcast.application.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import cn.itcast.application.domain.Notice;

@Mapper
public interface NoticeMapper {

	Long count();

	List<Notice> findByPage(@Param("page")Integer page,@Param("rows") Integer rows);

}
