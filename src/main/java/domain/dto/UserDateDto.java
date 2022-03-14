package domain.dto;

import lombok.Data;

import java.io.Serializable;
import java.time.LocalDateTime;

@Data
public class UserDateDto implements Serializable {
    private static final long serialVersionUID = 3681807523338937171L;
    private final LocalDateTime userRegistrationDate;
    private final LocalDateTime userModifiedDate;
    private final LocalDateTime userWithdrawalDate;
    private final LocalDateTime userLastSignDate;
}
