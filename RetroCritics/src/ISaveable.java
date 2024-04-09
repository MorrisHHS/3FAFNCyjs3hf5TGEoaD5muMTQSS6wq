public interface ISaveable {
    SaveData save();

    void load(SaveData saveData);
}
