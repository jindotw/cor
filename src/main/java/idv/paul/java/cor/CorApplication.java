package idv.paul.java.cor;

import idv.paul.java.cor.catalogue.OddsCatalogue;
import idv.paul.java.cor.context.RawOddsContext;
import org.apache.commons.chain.Context;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class CorApplication implements CommandLineRunner {
    private OddsCatalogue oddsCatalogue;

    @Autowired
    public CorApplication(OddsCatalogue oddsCatalogue) {
        this.oddsCatalogue = oddsCatalogue;
    }

    public static void main(String[] args) {
        SpringApplication.run(CorApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Scanner sc = new Scanner(System.in);


        while (true) {
            System.out.println("Go ahead");
            sc.nextLine();
            RawOddsContext context = new RawOddsContext();
            context.setVendor("a");
            context.setSportId(1);
            oddsCatalogue.getCommand("oddsHandler").execute(context);
        }
    }
}
