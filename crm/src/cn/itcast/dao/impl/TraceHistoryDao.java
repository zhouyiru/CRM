package cn.itcast.dao.impl;

import org.springframework.stereotype.Repository;

import cn.itcast.dao.ITraceHistoryDao;
import cn.itcast.pojo.TraceHistory;

/**
 * 客户跟进历史dao实现
 * @author AdminTH
 *
 */
@Repository
public class TraceHistoryDao extends BaseDao<TraceHistory> implements ITraceHistoryDao {
	
}
