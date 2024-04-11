import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class SaveManager {
    private static final boolean debug = true;
    private static final String persistentDataPath = System.getProperty("java.class.path");

    private static void writeToFile(String data, String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(data);
        } catch (IOException e) {
            System.err.println("Error writing to the file: " + e.getMessage());
        }
    }

    private static String readFile(String filePath) {
        StringBuilder data = new StringBuilder();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                data.append(line);
                data.append("\n");
            }
        } catch (IOException e) {
            System.err.println("Error reading the file: " + e.getMessage());
        }

        return data.toString();
    }

    private static void checkFolder(String path) {
        Path folderPath = Paths.get(path);
        if (!Files.exists(folderPath)) {
            try {
                Files.createDirectories(folderPath);
                if (debug){
                    System.out.println("Created Folder: " + folderPath);
                }
            } catch (IOException e) {
                System.err.println("Error creating folder: " + e.getMessage());
            }
        }
        else{
            if (debug){
                System.out.println("Folder Already Exists At: " + folderPath);
            }
        }
    }

    private static void checkAllFolders(){
        checkFolder(persistentDataPath + "/Data"); // data folder
        checkFolder(persistentDataPath + "/Data/Games"); // games folder
        checkFolder(persistentDataPath + "/Data/Enquetes"); // enquetes folder
    }

    public static void saveGame(SaveData saveData, String gameName){
        checkAllFolders();
        checkFolder(persistentDataPath + "/Data/Games/" + gameName);
        writeToFile(saveData.getData(), persistentDataPath + "/Data/Games/" + gameName + "/" + gameName + ".game");
    }

    public static SaveData loadGame(String gameName){
        SaveData saveData = new SaveData();
        String rawData = readFile(persistentDataPath + "/Data/Games/" + gameName + "/" + gameName + ".game").trim();
        saveData.setData(rawData);
        return  saveData;
    }

    public static ArrayList<SaveData> loadAllGames() {
        checkAllFolders();

        ArrayList<SaveData> allGames = new ArrayList<>();
        File gamesFolder = new File(persistentDataPath + "/Data/Games/");

        File[] gameFolders = gamesFolder.listFiles();
        if (gameFolders != null) {
            for (File gameFolder : gameFolders) {
                if (gameFolder.isDirectory()) {
                    String gameName = gameFolder.getName();
                    SaveData saveData = loadGame(gameName);
                    allGames.add(saveData);
                }
            }
        }

        return allGames;
    }

    public static void saveReview(SaveData saveData, String gameName, String reviewTitel){
        checkAllFolders();
        checkFolder(persistentDataPath + "/Data/Games/" + gameName + "/Reviews");
        writeToFile(saveData.getData(), persistentDataPath + "/Data/Games/" + gameName + "/Reviews/" + reviewTitel + ".review");
    }

    public static void saveEnquete(SaveData saveData){
        checkAllFolders();
        checkFolder(persistentDataPath + "/Data/Enquetes");

        File folder = new File(persistentDataPath + "/Data/Enquetes");
        int fileCount = 0;
        File[] files = folder.listFiles();

        if (files != null) {
            for (File file : files) {
                if (file.isFile()) {
                    fileCount++;
                }
            }
        }

        writeToFile(saveData.getData(), persistentDataPath + "/Data/Enquetes/" + "Enquete_Nr_" + fileCount + ".enqt");
    }
}
