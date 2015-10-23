import java.util.ArrayList;

/**
 * Notebook is used to store records.
 *
 * @author Julia Kormshchikova
 * @version 1.0
 * @see Record
 */
public class Notebook {

    /**
     * List of {@link Record}.
     */
    private ArrayList<Record> records;

    /**
     * To initialize list of records.
     *
     * @see Notebook
     */
    Notebook() {
        records = new ArrayList<Record>();
    }

    /**
     * To add a new records in the notebook.
     *
     * @param newRecord record to be added
     */
    public void add(Record newRecord) {
        records.add(newRecord);
        System.out.println("Record " + newRecord.text + " added");
    }

    /**
     * To remove record by index.
     *
     * @param index the record number to delete (from 1)
     */
    public void remove(int index) {
        if (index <= records.size()) {
            records.remove(index - 1);
            System.out.println(index + "record deleted");
        } else
            System.out.println("Element with number " + index + " does not exist");
    }

    /**
     * To edit record by index.
     *
     * @param index     the record number to add (from 1)
     * @param newString new text of the record
     */
    public void edit(int index, String newString) {
        if (index <= records.size()) {
            records.get(index - 1).text = newString;
            System.out.println(index + " record changed");
        } else
            System.out.println("Element with number " + index + " does not exist");
    }

    /**
     * To print all records in notebook.
     */
    public void viewAll() {
        System.out.println("All records:");
        int i = 1;
        for (Record rec : records) {
            System.out.println(i + " " + rec.text);
        }

    }
}
