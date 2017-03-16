import java.util.List;
import java.util.ArrayList;

public class Game {
  private String mWord;


  public Game(String word) {
    mWord = word;
  }


  public String getWord() {
    return mWord;
  }

  public ArrayList<String> getAnswerLetters() {
    ArrayList<String> stringAnswerLetters = new ArrayList<String>();
    stringAnswerLetters.add(mWord);
    return stringAnswerLetters;
  }

}
