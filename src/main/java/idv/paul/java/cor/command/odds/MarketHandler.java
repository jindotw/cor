package idv.paul.java.cor.command.odds;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.springframework.stereotype.Component;

@Component
public class MarketHandler implements Command {

    @Override
    public boolean execute(Context context) throws Exception {
        System.out.println("market=" + context.get("market"));
        return true;
    }
}
