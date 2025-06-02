package s1_07_annotations_lvl2;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class JsonSerializer {
    public static void serializeMethod(Object obj) throws IOException {
        Class<?> clazz = obj.getClass();

        if (!clazz.isAnnotationPresent(JsonSerializable.class)) {
            throw new IllegalArgumentException("The class is not annotated with @JsonSerializable");
        }

        JsonSerializable annotation = clazz.getAnnotation(JsonSerializable.class);
        String path = annotation.path();

        // Create directory if doesn't exist
        File directory = new File(path).getParentFile();
        if (!directory.exists()) {
            directory.mkdirs();
        }

        // Serialize Object to JSON
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File(path), obj);

        System.out.println("Object serialized a " + path);
    }
}
