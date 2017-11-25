package cn.itcast.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itcast.dao.ITraceHistoryDao;
import cn.itcast.pojo.TraceHistory;
import cn.itcast.service.ITraceHistoryService;

/**
 * 客户跟进
 * @author AdminTH
 *
 */
@Service
public class TraceHistoryService implements ITraceHistoryService {
	
	@Resource 
	private ITraceHistoryDao traceHistoryDao;

	
	public void delete(Serializable id) {
		traceHistoryDao.delete(id);
	}

	
	public TraceHistory findById(Serializable id) {
		return traceHistoryDao.findById(id);
	}

	
	public List<TraceHistory> getAll() {
		List<TraceHistory> list = traceHistoryDao.getAll();
		return list;
	}

	
	public void save(TraceHistory t) {
		traceHistoryDao.save(t);
	}

	
	public void update(TraceHistory t) {
		traceHistoryDao.update(t);
	}
	

}







