
public class ConvertText {
	String inputText;
	
	public ConvertText(String text) {
		inputText = text;
		RemoveSpaces(inputText);
	}
	
	public String RemoveSpaces(String text) {
		inputText = text.replaceAll("\\s", "");
		return inputText;
	}
	
	public String getConvertedText() {
		return inputText;
	}

}

