import java.util.*;
public class SaveData {
    private Map<String, String> data = new HashMap<>();


    public void addAttribute(String key, String value) {
        data.put(key, value);
    }
    public String readAttribute(String key){
        return data.get(key);
    }
    public String getData (){
        Set<String> keys = data.keySet();
        String s = "";
        for(String key : keys) {
            s += key;
            s += "=";
            s += data.get(key);
            s += ":";
        }
        return s;

    }
    public void setData(String data) {
        String[] splitData = data.split(":");
        for (String s : splitData) {
            String[] finaleData = s.split("=");
            this.data.put(finaleData[0], finaleData[1]);
        }

    }
}
