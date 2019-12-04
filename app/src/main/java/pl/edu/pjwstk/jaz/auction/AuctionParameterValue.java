package pl.edu.pjwstk.jaz.auction;

import javax.persistence.*;

@Entity
@Table(name = "auction_parameter")
public class AuctionParameterValue {
    @EmbeddedId
    private AuctionParameterId auctionParameterId;

    @OneToOne
    @MapsId("auctionId")
    @JoinColumn(name = "auction")
    private Auction auction;

    @ManyToOne
    @MapsId("parameterId")
    @JoinColumn(name = "parameter")
    private Parameter parameter;

    @Column(name = "value")
    private String value;
}
