package pl.edu.pjwstk.jaz.auction;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class AuctionParameterId implements Serializable {
    int auction, parameter;
}
