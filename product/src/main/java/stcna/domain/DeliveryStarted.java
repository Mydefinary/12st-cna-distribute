package stcna.domain;

import java.util.*;
import lombok.*;
import stcna.domain.*;
import stcna.infra.AbstractEvent;

@Data
@ToString
public class DeliveryStarted extends AbstractEvent {

    private Long id;
}
