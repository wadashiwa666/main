package com.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.TransferMapper;
import com.service.ITransferService;

@Service
public class TransferServiceImpl implements ITransferService {

	@Autowired
	private TransferMapper transferMapper;
	
	@Override
	public int trans(int amount, String name) {
		transferMapper.addtransfer("a", 2);
		int s = 1/0;
		transferMapper.addtransfer("b", 2);
		return 0;
	}

}
