package cn.itcast.application.service;

import java.util.Map;

public interface NoticeService {

	Map<String, Object> findByPage(Integer page, Integer rows);

}
