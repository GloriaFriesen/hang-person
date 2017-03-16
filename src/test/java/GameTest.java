import org.junit.*;
import static org.junit.Assert.*;

public class GameTest {

  @Test
  public void newGame_instantiatesCorrectly() {
    Game testGame = new Game("cat");
    assertEquals(true, testGame instanceof Game);
  }
}
