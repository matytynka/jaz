package pl.edu.pjwstk.jaz.auction;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.io.Serializable;

@Embeddable
public class AuctionParameterId implements Serializable {

    @Column(name = "auction")
    Integer auctionId;

    @Column(name = "parameter")
    Integer parameterId;
}
