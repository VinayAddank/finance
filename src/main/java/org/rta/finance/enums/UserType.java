package org.rta.finance.enums;

import java.util.EnumSet;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.annotation.JsonValue;

public enum UserType {
	ADMIN(1, " ADMIN"),
    ONLINE_FINANCER(2, "ONLINE FINANCER"), OFFLINE_FINANCER(3, "OFFLINE FINANCER");

    private static final Map<String, UserType> labelToType = new HashMap<String, UserType>();
    private static final Map<Integer, UserType> valueToUserType = new HashMap<Integer, UserType>();
    
    static {
        for (UserType userType : UserType.values()) {
            labelToType.put(userType.getLabel(), userType);
        }
        for (UserType userType : EnumSet.allOf(UserType.class)) {
            valueToUserType.put(userType.getValue(), userType);
        }
    }
    
    private UserType(Integer value, String label) {
        this.value = value;
        this.label = label;
    }

    private Integer value;
    private String label;
            
    @JsonValue
    public String toValue() {
        return this.label;
    }

    public Integer getValue() {
        return value;
    }

    public String getLabel() {
        return label;
    }
    
    public static UserType getUserType(String label) {
        return labelToType.get(label);
    }
    
    public static UserType getUserType(Integer value) {
        return valueToUserType.get(value);
    }
}
