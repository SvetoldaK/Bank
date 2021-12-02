import org.apache.commons.lang3.RandomStringUtils;

import java.util.*;

public class Application {
    public static void main(String[] args){
        Bank bank = new Bank();
        UUID key = bank.createCell();
        Cell cell = bank.getCell(key);

        List<BankNote> bankNotes = new ArrayList<>();
        for (int i = 0; i < 1000; i++){
            bankNotes.add(new BankNote(100));
        }

        Set<Stamp> stamps = new HashSet<>();
        for (int i = 0; i < 100; i++){
            stamps.add(new Stamp(RandomStringUtils.randomAlphabetic(2)));
        }

        cell.setBankNotes(bankNotes);
        cell.setStamps(stamps);
        System.out.print(cell);
    }
}
