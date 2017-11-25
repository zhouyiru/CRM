package cn.itcast.dao.impl;

import org.springframework.stereotype.Repository;

import cn.itcast.dao.ITransferHistoryDao;
import cn.itcast.pojo.TransferHistory;

// 客户移交
@Repository
public class TransferHistoryDao extends BaseDao<TransferHistory> implements ITransferHistoryDao {
	
}
