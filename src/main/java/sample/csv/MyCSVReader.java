package sample.csv;


import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;
import javafx.stage.FileChooser;
import sample.Main;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;

import static sample.Main.filename;

public class MyCSVReader {
    public String[] read() {
        CSVReader reader = null;
        try {
            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Open Resource File");
            fileChooser.getExtensionFilters()
                    .add(new FileChooser.ExtensionFilter("CSV", "*.csv"));
            File file = fileChooser.showOpenDialog(Main.STAGE);
            if (file == null) {
                return null;
            }
            reader = new CSVReader(Files.newBufferedReader(file.toPath()), ':');
            String[] line = reader.readNext();
            return line;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }


}
