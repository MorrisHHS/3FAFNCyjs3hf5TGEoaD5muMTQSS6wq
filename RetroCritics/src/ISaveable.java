public interface ISaveable {
    JSON_Object save();

    void load(JSON_Object json_object);
}
