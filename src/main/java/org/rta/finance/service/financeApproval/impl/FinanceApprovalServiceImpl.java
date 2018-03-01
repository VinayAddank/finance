package org.rta.finance.service.financeApproval.impl;

import javax.transaction.Transactional;

import org.rta.finance.dao.financeApproval.FinanceTokenDAO;
import org.rta.finance.entity.FinanceTokenEntity;
import org.rta.finance.service.financeApproval.FinanceApprovalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FinanceApprovalServiceImpl implements FinanceApprovalService{
	
	@Autowired
	private FinanceTokenDAO financeDAO;
	
	@Override
	@Transactional
	public String getTokenForVehicle(Long vehiceRc) {
		FinanceTokenEntity financeTokenEntity=financeDAO.getTokenId(vehiceRc);
		return financeTokenEntity.getTokenId();
	    }
	
	
	public String getVehicleForToken(String tokenId) {
		FinanceTokenEntity financeTokenEntity=financeDAO.getVehicleRcIdFromToken(tokenId);
		return financeTokenEntity.getTokenId();
	    }


}
