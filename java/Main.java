import java.io.IOException;

public class Main {

	public static void main(String[] args) throws IOException {
		Bot bot = new Bot("#yourchannel", "yournick", "oauth:abcd");
		bot.connect();
	}
}
