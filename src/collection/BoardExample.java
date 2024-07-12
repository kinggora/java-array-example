package collection;

import collection.boardEx.Board;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class BoardExample {

  private static int bno = 0;
  private static final List<Board> boardList = new ArrayList<>();
  private Scanner sc = new Scanner(System.in);
  private static boolean exit = false;


  public static void main(String[] args) {
    BoardExample boardEx = new BoardExample();
    while (!exit) {
      boardEx.list();
    }
  }

  private void list() {
    System.out.println("[게시글 목록]");
    System.out.println("-----------------------------------------------------------");
    System.out.printf("%-4s %-10s %-15s %-30s\n", "no", "writer", "date", "title");
    System.out.println("-----------------------------------------------------------");
    for(Board board: boardList) {
      System.out.printf("%-4d %-10s %-15s %-30s\n", board.getBno(), board.getBwriter(), formatDate(board.getBdate()), board.getBtitle());
    }
    System.out.println("-----------------------------------------------------------");
    mainMenu();
  }

  private void mainMenu() {
    System.out.println("메인 메뉴: 1.Create | 2.Read | 3.Clear | 4.Exit");
    System.out.print("메뉴 선택: ");
    String menu = sc.nextLine();
    switch (menu) {
      case "1" -> create();
      case "2" -> read();
      case "3" -> clear();
      case "4" -> exit();
      default -> System.out.println("1~4 중에 입력해주세요.");
    }
  }

  private void create() {
    System.out.println("[새 게시물 입력");
    System.out.print("제목: ");
    String title = sc.nextLine();
    System.out.print("내용: ");
    String content = sc.nextLine();
    System.out.print("작성자: ");
    String writer = sc.nextLine();
    System.out.println("-----------------------------------------------------------");
    System.out.println("보조 메뉴: 1.OK | 2.Cancel");
    System.out.print("메뉴 선택: ");
    String menu = sc.nextLine();
    switch (menu) {
      case "1" -> {
        Board board = new Board(++bno, title, content, writer, new Date());
        boardList.add(board);
      }
      case "2" -> list();
      default -> System.out.println("1,2 중에 입력해주세요.");
    }
  }

  private void read() {
    System.out.println("[게시물 읽기]");
    int findBno;
    while(true) {
      System.out.print("bno: ");
      try{
        findBno = Integer.parseInt(sc.nextLine());
        break;
      } catch (NumberFormatException e) {
        System.out.println("숫자를 입력해주세요.");
      }
    }
    Board b = findBoard(findBno);
    if(b == null) {
      System.out.println("게시물이 존재하지 않습니다.");
      list();
    } else {
      printBoardDetail(b);
      System.out.println("보조 메뉴: 1.Update | 2.Delete | 3.List");
      System.out.print("메뉴 선택: ");
      String subMenu = sc.nextLine();
      switch (subMenu) {
        case "1" -> update(b);
        case "2" -> delete(b);
        case "3" -> list();
        default -> System.out.println("1~3 중에 입력해주세요.");
      }
    }
  }

  private void update(Board b) {
    System.out.println("[수정 내용 입력]");
    System.out.print("제목: ");
    String title = sc.nextLine();
    System.out.print("내용: ");
    String content = sc.nextLine();
    System.out.print("작성자: ");
    String writer = sc.nextLine();
    System.out.println("보조 메뉴: 1.OK | 2.Cancel");
    System.out.print("메뉴 선택: ");
    String menu = sc.nextLine();
    switch (menu) {
      case "1" -> {
        b.updateBoard(title, content, writer);
        list();
      }
      case "2" -> list();
      default -> System.out.println("1,2 중에 입력해주세요.");
    }

  }

  private void delete(Board b) {
    boardList.remove(b);
  }

  private void exit() {
    System.out.println("*** 프로그램 종료 ***");
    exit = true;
  }


  private void clear() {
    System.out.println("[게시물 전체 삭제]");
    System.out.println("-----------------------------------------------------------");
    System.out.println("보조 메뉴: 1.Ok | 2. Cancel");
    System.out.print("메뉴 선택: ");
    String menu = sc.nextLine();
    switch (menu) {
      case "1" -> {
        boardList.clear();
        list();
      }
      case "2" -> {
        list();
      }
      default -> System.out.println("1,2 중에 입력해주세요.");
    }
  }

  private Board findBoard(int bno) {
    for (Board board : boardList) {
      if(board.getBno() == bno) {
        return board;
      }
    }
    return null;
  }

  private void printBoardDetail(Board board) {
    System.out.println("############");
    System.out.print("번호: ");
    System.out.println(board.getBno());
    System.out.print("제목: ");
    System.out.println(board.getBtitle());
    System.out.print("내용: ");
    System.out.println(board.getBtitle());
    System.out.print("작성자: ");
    System.out.println(board.getBwriter());
    System.out.print("날짜: ");
    System.out.println(formatDate(board.getBdate()));

    System.out.println("############");
  }

  private String formatDate(Date date) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy.MM.dd");
    return dateFormat.format(date);

  }


}
