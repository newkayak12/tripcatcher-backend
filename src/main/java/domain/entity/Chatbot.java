package domain.entity;

import lombok.*;

import javax.persistence.*;
import java.io.Serializable;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Builder
@Entity
public class Chatbot implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long chatbotNo;

    @OneToOne
    @JoinColumn(name = "chatbot_request_no")
    private Chatbot chatbotRequestNo;

    @Column(columnDefinition = "integer default 0")
    private Integer chatbotDepth;

    @Column(name = "chatbot_answer_kr", columnDefinition = "text")
    private String chatbotAnswerKR;
    @Column(name = "chatbot_answer_jp", columnDefinition = "text")
    private String chatbotAnswerJP;
    @Column(name = "chatbot_answer_en", columnDefinition = "text")
    private String chatbotAnswerEN;
}
