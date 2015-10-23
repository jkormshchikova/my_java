/**
 * To create a notebook with records.
 */
public class Main {

    public static void main(String[] args) {

        Notebook notebook = new Notebook();
        Record record1 = new Record("Record_1");
        Record record2 = new Record("Record_2");
        Record record3 = new Record("Record_3");
        Record record4 = new Record("Record_4");
        Record record5 = new Record("Record_5");
        notebook.add(record1);
        notebook.add(record2);

        notebook.add(record3);
        notebook.edit(4, "record_5");
        notebook.add(record4);
        notebook.remove(5);
        notebook.viewAll();
        System.out.println();
    }
}
