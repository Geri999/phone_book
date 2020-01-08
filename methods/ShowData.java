package pl.bci.g73.itcamp.phonebook.methods;

import pl.bci.g73.itcamp.phonebook.classes.Record;

public class ShowData {
    public static void showData(Record[] record) {
        int counter = 0;

        for (Record r : record) {

            if (r != null) {
                System.out.println(r);
                counter++;
            }

        }
        if (counter == 0) System.out.println("Brak danych");
    }
}