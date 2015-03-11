package vnlawyer.analyzer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.tokenattributes.CharTermAttribute;
import org.apache.lucene.analysis.tokenattributes.OffsetAttribute;
import org.apache.lucene.analysis.tokenattributes.PositionIncrementAttribute;
import org.apache.lucene.util.AttributeFactory;

public class VietTokenizer extends Tokenizer {

	String[] taggedWords;
	private int numWord;
	private int index = 0;
	private int offset = 0;
	private final CharTermAttribute termAttr;
	private final PositionIncrementAttribute posAttr;
	private final OffsetAttribute offsetAttr;
	private String lastContent;

	protected VietTokenizer(AttributeFactory factory, Reader input) {
		super(factory, input);

		// TODO Auto-generated constructor stub
		this.termAttr = addAttribute(CharTermAttribute.class);
		this.posAttr = addAttribute(PositionIncrementAttribute.class);
		this.offsetAttr = addAttribute(OffsetAttribute.class);
	}

	private void getTaggedWords(Reader input) {
		BufferedReader bufferedReader = new BufferedReader(input);
		StringBuffer bufferContent = new StringBuffer("");
		String line;
		try {
			while ((line = bufferedReader.readLine()) != null) {
				bufferContent.append(line + "\n");
			}
			lastContent = bufferContent.toString();
			taggedWords = VietTokenizerWrapper.getVietTokenizer()
					.segment(lastContent).split(" ");
			for (int i = 0; i < taggedWords.length; i++) {
				taggedWords[i] = taggedWords[i].replaceAll("_", " ");
			}
		} catch (IOException e) {
			System.err.println("Error Tokenizer Input : " + input);
			taggedWords = new String[0];
		}
		numWord = taggedWords.length;
		offset = 0;
		index = 0;
	}

	@Override
	public boolean incrementToken() throws IOException {
		// TODO Auto-generated method stub
		clearAttributes();
		if (index == numWord)
			return false;
		String wordTag = taggedWords[index];
		String nextWordTag = null;
		try {
			nextWordTag = taggedWords[index + 1];
		} catch (ArrayIndexOutOfBoundsException e) {
		}
		if (wordTag.equalsIgnoreCase("")) {
		} else {
			termAttr.copyBuffer(wordTag.toCharArray(), 0, wordTag.length());
			posAttr.setPositionIncrement(1);
			offsetAttr.setOffset(offset, offset + wordTag.length());
		}
		offset += wordTag.length();
		// Correct offset for two words
		if (index != numWord) {
			if (nextWordTag == null
					|| lastContent.indexOf(nextWordTag, offset) == offset) {
			} else {
				offset++;
			}
		}
		index++;
		return true;
	}

}
