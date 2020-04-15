package idv.paul.java.cor.context;

import lombok.Getter;
import lombok.Setter;
import org.apache.commons.chain.impl.ContextBase;

import java.math.BigDecimal;

@Setter
@Getter
public class RawOddsContext extends ContextBase {
    private String vendor;
    private int sportId;
    private String market;
    private BigDecimal odds;

}
