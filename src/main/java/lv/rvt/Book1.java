package lv.rvt;

// import java.util.ArrayList;
// import java.util.Scanner;


// public class Book1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         ArrayList<Book> books = new ArrayList<>();

//         while (true) {
//             System.out.print("Title: ");
//             String title = scanner.nextLine();
//             if (title.isEmpty()) {
//                 break;
//             }
//             System.out.print("Pages: ");
//             int pages = Integer.parseInt(scanner.nextLine());
//             System.out.print("Publication year: ");
//             int publicationYear = Integer.parseInt(scanner.nextLine());

//             books.add(new Book(title, pages, publicationYear));
//         }

//         System.out.print("What information will be printed? ");
//         String choice = scanner.nextLine();

//         if (choice.equals("everything")) {
//             for (Book book : books) {
//                 System.out.println(book.getDetails());
//             }
//         } else if (choice.equals("name")) {
//             for (Book book : books) {
//                 System.out.println(book.getTitle());
//             }
//         }

//         scanner.close();
//     }
// }