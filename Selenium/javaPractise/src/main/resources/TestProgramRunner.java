import java.text.SimpleDateFormat;
import java.util.Date;

import org.testng.annotations.*;

@Test
public class TestProgramRunner {

	public TestProgramRunner() {
		SimpleDateFormat sdate = new SimpleDateFormat("dd");
		Date currentDate = new Date();
		System.out.println(currentDate);

	}

	/*public static void main(String[] args) {

		TestProgramRunner();

	}
*/
}
