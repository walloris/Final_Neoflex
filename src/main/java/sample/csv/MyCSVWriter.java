package sample.csv;

import com.opencsv.CSVWriter;
import javafx.fxml.FXMLLoader;
import javafx.stage.FileChooser;
import sample.Main;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import java.io.File;
import java.io.FileWriter;

import static sample.Main.filename;

public class MyCSVWriter {
    public void write(String[] entries) {
        try {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open Resource File");
            fileChooser.getExtensionFilters()
                    .add(new FileChooser.ExtensionFilter("CSV", "*.csv"));
            File file = fileChooser.showSaveDialog(Main.STAGE);
            if (file == null) {
                return;
            }
//            File f = new File("resources/" + filename);
//            if (f.createNewFile()) System.out.println("Создан файл");
//            else System.out.println("Файл существует");
            CSVWriter writer = new CSVWriter(new FileWriter(file), ':', CSVWriter.NO_QUOTE_CHARACTER);
            writer.writeNext(entries);
            writer.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
