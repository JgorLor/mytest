package cn.itcast.application.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.itcast.application.domain.Notice;
import cn.itcast.application.mapper.NoticeMapper;
import cn.itcast.application.service.NoticeService;

@Service
@Transactional
public class NoticeServiceImpl implements NoticeService {

	@Autowired
	private NoticeMapper noticeMapper;
	
	@Override
	public Map<String, Object> findByPage(Integer page, Integer rows) {
		Long total = noticeMapper.count();
		List<Notice> list = noticeMapper.findByPage(page,rows);
		Map<String, Object> dataList = new HashMap<>();
		dataList.put("total", total);
		dataList.put("rows", list);
		return dataList;
	}

}
