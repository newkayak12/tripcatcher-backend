package domain.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class ChatbotDto implements Serializable {
    private static final long serialVersionUID = 7180192482473634747L;
    private final Long chatbotNo;
    private final ChatbotDto chatbotRequestNo;
    private final Integer chatbotDepth;
    private final String chatbotAnswerKR;
    private final String chatbotAnswerJP;
    private final String chatbotAnswerEN;
}
