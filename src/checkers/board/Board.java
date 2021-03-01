package checkers.board;

public class Board {

  public String boardFEN = "";
  public Piece boardArr[][];

  public Board() {
    this.boardFEN = "pppppppp/pppppppp/8/8/8/8/PPPPPPPP/PPPPPPPP";
    this.boardArr = new Piece[8][8];
  }


  public String arrayToFen(Piece[][] arr) {

    return "";
  }


  public Piece[][] fenToArray() {

    return new Piece[8][8];
  }


  public void checkWinner() {
    if (!arrayToFen(boardArr).contains("p")) {
      blackWins();
    }

    if (!arrayToFen(boardArr).contains("P")) {
      whiteWins();
    }

  }


  private void whiteWins() {

  }


  private void blackWins() {

  }


}
