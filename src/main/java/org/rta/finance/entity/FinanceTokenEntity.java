package org.rta.finance.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table
public class FinanceTokenEntity extends BaseEntity{
	
	    @Id
	    @Column(name = "id")
	    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "finance_token_seq")
	    @SequenceGenerator(name = "finance_token_seq", sequenceName = "finance_token_seq", allocationSize = 1)
	    private Long financeTokenId;

	    @Column(name = "vehicle_rc_id")
	    private Long vehicleRcId;

	    @Column(name = "dealer_id")
	    private Long dealerId;
	    
	    @Column(name = "token_id")
	    private String tokenId;

	    @Column(name = "date_of_generation")
	    private Long dateOfTokenGen;

		public Long getFinanceTokenId() {
			return financeTokenId;
		}

		public void setFinanceTokenId(Long financeTokenId) {
			this.financeTokenId = financeTokenId;
		}

		public Long getVehicleRcId() {
			return vehicleRcId;
		}

		public void setVehicleRcId(Long vehicleRcId) {
			this.vehicleRcId = vehicleRcId;
		}

		public Long getDealerId() {
			return dealerId;
		}

		public void setDealerId(Long dealerId) {
			this.dealerId = dealerId;
		}

		public String getTokenId() {
			return tokenId;
		}

		public void setTokenId(String tokenId) {
			this.tokenId = tokenId;
		}

		public Long getDateOfTokenGen() {
			return dateOfTokenGen;
		}

		public void setDateOfTokenGen(Long dateOfTokenGen) {
			this.dateOfTokenGen = dateOfTokenGen;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((dateOfTokenGen == null) ? 0 : dateOfTokenGen.hashCode());
			result = prime * result + ((dealerId == null) ? 0 : dealerId.hashCode());
			result = prime * result + ((financeTokenId == null) ? 0 : financeTokenId.hashCode());
			result = prime * result + ((tokenId == null) ? 0 : tokenId.hashCode());
			result = prime * result + ((vehicleRcId == null) ? 0 : vehicleRcId.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			FinanceTokenEntity other = (FinanceTokenEntity) obj;
			if (dateOfTokenGen == null) {
				if (other.dateOfTokenGen != null)
					return false;
			} else if (!dateOfTokenGen.equals(other.dateOfTokenGen))
				return false;
			if (dealerId == null) {
				if (other.dealerId != null)
					return false;
			} else if (!dealerId.equals(other.dealerId))
				return false;
			if (financeTokenId == null) {
				if (other.financeTokenId != null)
					return false;
			} else if (!financeTokenId.equals(other.financeTokenId))
				return false;
			if (tokenId == null) {
				if (other.tokenId != null)
					return false;
			} else if (!tokenId.equals(other.tokenId))
				return false;
			if (vehicleRcId == null) {
				if (other.vehicleRcId != null)
					return false;
			} else if (!vehicleRcId.equals(other.vehicleRcId))
				return false;
			return true;
		}
	    
	    
	    


}
