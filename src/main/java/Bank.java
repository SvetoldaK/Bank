import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public class Bank {

    private final Map<UUID, Cell> cells = new HashMap();

    public UUID createCell() {
        UUID key = UUID.randomUUID();
        createCell(key);

        return key;
    }

    public Cell getCell (UUID key){
        if (key == null) throw new IllegalArgumentException("Ключ null");

        Cell cell = this.cells.get(key);
        if (cell == null) {
            createCell(key);
        }

        return cells.get(key);
    }

    private void createCell(UUID key){
        this.cells.put(key, new Cell());
    }
}
