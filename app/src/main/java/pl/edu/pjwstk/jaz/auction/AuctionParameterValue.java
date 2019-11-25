package pl.edu.pjwstk.jaz.auction;

import javax.persistence.*;

@Entity
@Table(name = "auction_parameter")
public class AuctionParameterValue {
    @EmbeddedId
    private AuctionParameterId auctionParameterId;

   /* @OneToOne
    @JoinColumn(name = "auction")
    private Auction auction;

    @ManyToOne
    @JoinColumn(name = "parameter")
    private Parameter parameter;*/

    private String value;
}
