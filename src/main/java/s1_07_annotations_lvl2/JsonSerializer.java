package s1_07_annotations_lvl2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonSerializer {
    public static void serialize(Object obj) throws IOException {
        Class<?> clazz = obj.getClass();

        if (!clazz.isAnnotationPresent(JsonSerializable.class)) {
            throw new IllegalArgumentException("La classe no està anotada amb @JsonSerializable");
        }

        JsonSerializable annotation = clazz.getAnnotation(JsonSerializable.class);
        String path = annotation.path();

        // Crear el directorio si no existe
        File directory = new File(path).getParentFile();
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // Serializar el objeto a JSON
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(path), obj);

        System.out.println("Objecte serialitzat a " + path);
    }
}
