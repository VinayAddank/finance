package org.rta.finance.dao.financeApproval.impl;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.rta.finance.dao.base.BaseDAO;
import org.rta.finance.dao.financeApproval.FinanceTokenDAO;
import org.rta.finance.entity.FinanceTokenEntity;
import org.rta.finance.service.financeApproval.FinanceApprovalService;
import org.springframework.stereotype.Repository;

@Repository
public class FinanceTokenDAOImpl extends BaseDAO<FinanceTokenEntity> implements FinanceTokenDAO {

	public FinanceTokenDAOImpl() {
		super(FinanceTokenEntity.class);
		// TODO Auto-generated constructor stub
	}
	
	public FinanceTokenDAOImpl(Class<FinanceTokenEntity> persistentClass) {
		super(persistentClass);
		// TODO Auto-generated constructor stub
	}

	public FinanceTokenEntity getTokenId(Long vehicleRc) {
		Criteria criteria = getSession().createCriteria(getPersistentClass())
				.add(Restrictions.eq("vehicleRcId", vehicleRc));
		FinanceTokenEntity financeEntity = (FinanceTokenEntity) criteria.uniqueResult();
		return financeEntity;

	}

	@Override
	public FinanceTokenEntity getVehicleRcIdFromToken(String tokenId) {
		Criteria criteria = getSession().createCriteria(getPersistentClass())
				.add(Restrictions.eq("tokenId", tokenId));
		FinanceTokenEntity financeEntity = (FinanceTokenEntity) criteria.uniqueResult();
		return financeEntity;
	}

}
