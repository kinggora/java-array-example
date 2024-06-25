package cls.prob01;

public class Movie {

  private String title;
  private String genre;

  // 영화 정보 출력
  public void play() {
    System.out.printf("%s(%s) 상영중입니다.\n", title, genre);
  }

  // 영화명 지정
  public void setTitle(String title) {
    this.title = title;
  }

  // 장르 지정
  public void setGenre(String genre) {
    this.genre = genre;
  }
}
