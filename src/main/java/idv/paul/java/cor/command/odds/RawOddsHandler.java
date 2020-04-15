package idv.paul.java.cor.command.odds;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.springframework.stereotype.Component;

@Component
public class RawOddsHandler implements Command {

    @Override
    public boolean execute(Context context) throws Exception {
        System.out.println("vendor=" + context.get("vendor"));
        System.out.println("sid=" + context.get("sportId"));
        context.put("market", "ah");

        return false;
    }
}
