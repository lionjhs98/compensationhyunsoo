package compensationhyunsoo.domain;

import compensationhyunsoo.domain.*;
import compensationhyunsoo.infra.AbstractEvent;
import java.time.LocalDate;
import java.util.*;
import lombok.*;

//<<< DDD / Domain Event
@Data
@ToString
public class OutOfStock extends AbstractEvent {

    private Long id;
    private Long stock;
    private Long orderid;

    public OutOfStock() {
        super();
    }
}
//>>> DDD / Domain Event
