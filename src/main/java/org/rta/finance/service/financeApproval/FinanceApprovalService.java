package org.rta.finance.service.financeApproval;


public interface FinanceApprovalService  {
	public String getTokenForVehicle(Long vehiceRc);
	public String getVehicleForToken(String tokenId);

}
