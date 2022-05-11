package cl.bancochile.proyecto.utils;

import com.fasterxml.jackson.annotation.JsonAutoDetect.Visibility;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.PropertyAccessor;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.NonNull;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class JacksonUtils {

    private JacksonUtils() {
        throw new IllegalStateException("JacksonUtils class");
    }

    private static final ObjectMapper OBJECT_MAPPER;
    private static final ObjectMapper OBJECT_MAPPER_2;

    static {
        OBJECT_MAPPER = new ObjectMapper();
        OBJECT_MAPPER.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        OBJECT_MAPPER.setVisibility(PropertyAccessor.FIELD, Visibility.ANY);
        OBJECT_MAPPER_2 = new ObjectMapper();
        OBJECT_MAPPER_2.setSerializationInclusion(JsonInclude.Include.NON_NULL);
    }

    public static String sampleObjectToJSONString(Object input) throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String jsonString;
        jsonString = mapper.writeValueAsString(input);
        return jsonString;
    }

    public static List<JSONObject> getJSONObjectListFromObjectList(@NonNull List<Object> objects) {
        List<JSONObject> jsonObjects = new ArrayList<>();
        objects.forEach(o -> {
            Map<String, Object> map = OBJECT_MAPPER_2.convertValue(o, Map.class);
            jsonObjects.add(new JSONObject(map));
        });
        return jsonObjects;
    }
}
