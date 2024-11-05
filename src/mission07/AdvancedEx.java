package mission07;

import java.util.ArrayList;
import java.util.Scanner;

public class AdvancedEx {
    public static void main(String[] args) {

        ArrayList<Book> bookList = new ArrayList<>();
        Scanner input = new Scanner(System.in);

        System.out.println("간단한 도서 관리 시스템입니다.");

        while(true) {
            System.out.println("1.도서 등록 2.도서 조회 3.도서 삭제 4.종료");
            System.out.print("번호를 입력하세요: ");
            int UserInputNumber = input.nextInt();
            input.nextLine();

            if (UserInputNumber == 1) {
                System.out.println("책 제목과 저자를 입력하세요.");
                System.out.print("제목: ");
                String title = input.nextLine();
                System.out.print("저자: ");
                String auther = input.nextLine();
                bookList.add(new Book(title, auther));

            } else if (UserInputNumber == 2) {
                if (bookList.isEmpty()) {
                    System.out.println("등록된 도서가 없습니다.");
                } else {
                    for (Book book : bookList) {
                        System.out.println(book.getTitle()+","+book.getAuthor());
                    }
                }

            } else if(UserInputNumber == 3){
                System.out.print("삭제할 도서의 제목을 입력하세요: ");
                String deleteBookTitle = input.nextLine();

                int bookIndex = findBookIndexToDelete(bookList, deleteBookTitle);

                if(bookIndex!=-1){
                    bookList.remove(bookIndex);
                    System.out.println("삭제되었습니다.");
                }else{
                    System.out.println("입력한 제목이 없습니다.");                }

            } else if(UserInputNumber == 4){
                System.out.println("종료됩니다.");
                break;

            } else{
                System.out.println("번호를 잘못 입력하셨습니다.");
            }
        }
    }

    private static int findBookIndexToDelete(ArrayList<Book> bookList, String deleteBookTitle) {
        for(int i = 0; i< bookList.size(); i++){
            if(bookList.get(i).getTitle().equals(deleteBookTitle)) {
                return i;
            }
        }
        return -1;
    }
}

   class Book {
    private String title;
    private String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }


    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

}