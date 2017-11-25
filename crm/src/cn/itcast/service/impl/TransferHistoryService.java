package cn.itcast.service.impl;

import java.io.Serializable;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.itcast.dao.ITransferHistoryDao;
import cn.itcast.pojo.TransferHistory;
import cn.itcast.service.ITransferHistoryService;

/**
 * 客户移交
 * @author AdminTH
 *
 */
@Service
public class TransferHistoryService implements ITransferHistoryService {
	
	@Resource 
	private ITransferHistoryDao transferHistoryDao;
	

	
	public void delete(Serializable id) {
		transferHistoryDao.delete(id);
	}

	
	public TransferHistory findById(Serializable id) {
		return transferHistoryDao.findById(id);
	}

	
	public List<TransferHistory> getAll() {
		List<TransferHistory> list = transferHistoryDao.getAll();
		return list;
	}

	
	public void save(TransferHistory t) {
		transferHistoryDao.save(t);
	}

	
	public void update(TransferHistory t) {
		transferHistoryDao.update(t);
	}
	

}







