package idv.paul.java.cor.chain;

import idv.paul.java.cor.command.odds.MarketHandler;
import idv.paul.java.cor.command.odds.RawOddsHandler;
import org.apache.commons.chain.impl.ChainBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OddsChain extends ChainBase {

    @Autowired
    public OddsChain(RawOddsHandler rawOddsHandler,
                     MarketHandler marketHandler) {
        super();
        addCommand(rawOddsHandler);
        addCommand(marketHandler);
    }
}
