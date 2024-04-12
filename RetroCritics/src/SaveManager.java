import java.io.*;
import java.nio.file.*;
import java.util.ArrayList;

public class SaveManager {
    private static final boolean debug = true;
    private static final String DATA_PATH = "RetroCritics"; // Define the data directory path
    private static final String persistentDataPath = System.getProperty("user.dir") + "/" + DATA_PATH; // Construct the persistent data path


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

    public static Game loadGame(String gameName){
        SaveData saveData = new SaveData();
        String rawData = readFile(persistentDataPath + "/Data/Games/" + gameName + "/" + gameName + ".game").trim();
        saveData.setData(rawData);
        Game game = new Game();
        game.load(saveData);
        return game;
    }

    public static ArrayList<Game> loadAllGames() {
        checkAllFolders();

        ArrayList<Game> allGames = new ArrayList<>();
        File gamesFolder = new File(persistentDataPath + "/Data/Games/");

        File[] gameFolders = gamesFolder.listFiles();
        if (gameFolders != null) {
            for (File gameFolder : gameFolders) {
                if (gameFolder.isDirectory()) {
                    String gameName = gameFolder.getName();
                    allGames.add(loadGame(gameName));
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


    public static ArrayList<Review> loadAllReviews(String gameName) {
        ArrayList<Review> reviews = new ArrayList<>();

        // Define the directory path based on the game name
        String reviewsFolderPath = persistentDataPath + "/Data/Games/" + gameName + "/Reviews";
        File reviewsFolder = new File(reviewsFolderPath);

        // Check if the Reviews folder exists
        if (reviewsFolder.exists() && reviewsFolder.isDirectory()) {
            File[] reviewFiles = reviewsFolder.listFiles();

            if (reviewFiles != null) {
                for (File reviewFile : reviewFiles) {
                    if (reviewFile.isFile()) {
                        // Read the content of each review file
                        String content = readFile(reviewFile.getAbsolutePath()).trim();

                        System.out.println(content);

                        // saveData object
                        SaveData saveData = new SaveData();
                        saveData.setData(content);

                        System.out.println(saveData.getData());

                        // Create a Review object from the file content
                        Review review = new Review();
                        review.load(saveData);
                        reviews.add(review);
                    }
                }
            }
        }

        return reviews;
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

    public static void initialize(){
        Game.list = loadAllGames();
        for (Game game : Game.list){
            game.reviews = loadAllReviews(game.naam);
        }
    }
}
