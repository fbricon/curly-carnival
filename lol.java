///usr/bin/env jbang "$0" "$@" ; exit $?
//JAVA 17
//DEPS com.github.jamesnetherton:lolcat4j:0.4.0, com.github.lalyos:jfiglet:0.0.9

import java.io.IOException;
import com.github.jamesnetherton.lolcat4j.Lol;
import com.github.lalyos.jfiglet.FigletFont;



public class lol {
  public static void main(String[] args) throws IOException {
    String name = args != null && args.length > 0 ? args[0] : "World!";
    var text = FigletFont.convertOneLine("Hello "+name);
    var lol = Lol.builder()
        .seed(1)
        .frequency(3.0)
        .spread(3.0)
        .text(text)
        .build();
    lol.cat();
  }
}
