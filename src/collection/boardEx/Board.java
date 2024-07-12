package collection.boardEx;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Board {

  private int bno;
  private String btitle;
  private String bcontent;
  private String bwriter;
  private Date bdate;

  public void updateBoard(String title, String content, String writer) {
    this.btitle = title;
    this.bcontent = content;
    this.bwriter = writer;
  }
}
