package domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class AdminDto implements Serializable {
    private static final long serialVersionUID = 8869770735993318871L;
    private final Long adminNo;
    private final String adminId;
    private final String adminPassword;
    private final String adminIpAddress;
    private final LocalDateTime adminLastSignDate;
}
