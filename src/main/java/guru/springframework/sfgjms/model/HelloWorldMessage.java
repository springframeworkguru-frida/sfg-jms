package guru.springframework.sfgjms.model;

import java.io.Serializable;
import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class HelloWorldMessage implements Serializable {


    //Jms object need serializable,text message not have to
    static final long serialVersionUID = -4476264134444267550L;

    private UUID id;
    private String message;
}
