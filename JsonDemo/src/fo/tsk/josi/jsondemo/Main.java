package fo.tsk.josi.jsondemo;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import fo.tsk.josi.jsondemo.model.Item;
import fo.tsk.josi.jsondemo.model.ItemType;
import fo.tsk.josi.jsondemo.model.Note;

import java.io.File;
import java.io.IOException;

public class Main {

    public static void main(String[] args) {
        // create note and serialize to json
        Note n = new Note();
        n.addItem(Item.Item("Margherita", ItemType.PIZZA));
        n.addItem(Item.Item("Margherita", ItemType.PIZZA));
        n.addItem(Item.Item("Margherita", ItemType.PIZZA));
        n.addItem(Item.Item("Margherita", ItemType.PIZZA));

        ObjectMapper objectMapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);;
        try {
            objectMapper.writeValue(new File("target/note.json"), n);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
