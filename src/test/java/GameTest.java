import org.junit.*;
import static org.junit.Assert.*;
import java.util.List;
import java.util.ArrayList;


public class GameTest {

  @Test
  public void newGame_instantiatesCorrectly() {
    Game testGame = new Game("cat");
    assertEquals(true, testGame instanceof Game);
  }

  @Test
  public void newGame_getWord_cat() {
    Game testGame = new Game("cat");
    assertEquals("cat", testGame.getWord());
  }

  // @Test
  // public void getAnswerLetters_getArrayListAnswerWord_ArrayList() {
  //   Game testGame = new Game("cat");
  //   ArrayList<String> expectedOutput = new ArrayList<String>();
  //   expectedOutput.add("cat");
  //   assertEquals(expectedOutput, testGame.getAnswerLetters());
  // }

  @Test
  public void splitWord_splitWordintoLetterArray_Array() {
    Game testGame = new Game("cat");
    String[] expectedOutputArray = {"c", "a", "t"};
    assertEquals(expectedOutputArray, testGame.splitWord());
  }
}
