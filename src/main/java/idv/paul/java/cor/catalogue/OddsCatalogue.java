package idv.paul.java.cor.catalogue;

import idv.paul.java.cor.chain.OddsChain;
import org.apache.commons.chain.impl.CatalogBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class OddsCatalogue extends CatalogBase {

    @Autowired
    public OddsCatalogue(OddsChain oddsChain) {
        super();
        this.addCommand("oddsHandler", oddsChain);
    }
}
