import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Calculator {

	public int add(String value) {
		int result = 0;
		String[] numbers;
		if (value != null && value.length() > 0) {
			Pattern pattern = Pattern.compile("//(.)¥n(.*)");
			Matcher matcher = pattern.matcher(value);
			if (matcher.find()) {
				String separator = matcher.group(1);
				numbers = matcher.group(2).split(separator);
			} else {
				numbers = value.split(",|:");
			}
			for (String number : numbers) {
				int num = Integer.parseInt(number);
				if (num >= 0) { 
					result += num;
				} else {
					throw new RuntimeException();
				}
			}
		}
		
		return result;
	}
}
