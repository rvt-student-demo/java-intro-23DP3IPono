package lv.rvt;

// import java.io.BufferedReader;
// import java.io.BufferedWriter;
// import java.io.FileNotFoundException;
// import java.io.IOException;
// import java.net.URL;
// import java.nio.file.Files;
// import java.nio.file.Path;
// import java.nio.file.Paths;
// import java.nio.file.StandardOpenOption;

// public class Utils {
//     private static Path getFilePath(String filename) {
//         try {
//             URL resourceUrl = App.class.getClassLoader().getResource(filename);
//             if (resourceUrl == null) {
//                 throw new FileNotFoundException("File not found: " + filename);
//             }
//             return Paths.get(resourceUrl.toURI());
//         } catch (Exception e) {
//             e.printStackTrace();
//         }
//         return null;
//     }
//     public static BufferedReader getReader(String filename) throws IOException {
//        return Files.newBufferedReader(getFilePath(filename));
//     }

//     public static BufferedWriter getWriter(String filename) throws IOException {
//        return Files.newBufferedWriter(getFilePath(filename), StandardOpenOption.APPEND);
//     }
// }
