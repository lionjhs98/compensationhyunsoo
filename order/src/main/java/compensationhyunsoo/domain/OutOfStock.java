package compensationhyunsoo.domain;

import compensationhyunsoo.domain.*;
import compensationhyunsoo.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class OutOfStock extends AbstractEvent {

    private Long id;
    private Long stock;
    private Long orderid;
}
