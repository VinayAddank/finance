package org.rta.finance.dao.financeApproval;

import org.rta.finance.dao.base.GenericDAO;
import org.rta.finance.entity.FinanceTokenEntity;

public interface FinanceTokenDAO extends GenericDAO<FinanceTokenEntity>{
	public FinanceTokenEntity getTokenId(Long vehicleRc);
	public FinanceTokenEntity getVehicleRcIdFromToken(String tokenId);
}
