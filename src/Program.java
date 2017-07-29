import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;
import touhou.GameWindow;

/**
 * Created by huynq on 7/4/17.
 */
public class Program {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        GameWindow gameWindow = new GameWindow();
        gameWindow.loop();
    }
}
