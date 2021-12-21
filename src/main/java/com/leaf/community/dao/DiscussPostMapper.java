package com.leaf.community.dao;

import com.leaf.community.entity.DiscussPost;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@Mapper
public interface DiscussPostMapper {
	//offset  每一页起始行行号  limit页面行数限制
	List<DiscussPost> selectDiscussPosts(int userId, int offset, int limit);

	//@Param取别名 如果只有一个参数 并在<if>使用 必须加别名
	int selectDiscussPostRows(@Param("userId") int userId);
}
