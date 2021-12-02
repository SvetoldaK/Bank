import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.List;
import java.util.Set;

@Data
@AllArgsConstructor
public class Cell {

    private List<BankNote> bankNotes;
    private Set<Stamp> stamps;

    public Cell() {
    }
}
