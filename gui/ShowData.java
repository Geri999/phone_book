package phonebook.gui;

import phonebook.model.Record;

import java.util.List;

 class ShowData {
    public static void showData(List<Record> record) {
        int counter = 0;

        if (record != null) {

            for (Record r : record) {
                if (r != null) {
                    System.out.println(r);
                    counter++;
                }

            }
        }
        if (counter == 0) System.out.println(MiniCSS.printERROR("Brak danych"));
    }
}
