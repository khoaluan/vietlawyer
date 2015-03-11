package vnlawyer.analyzer;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.Tokenizer;
import org.apache.lucene.analysis.core.LowerCaseFilter;
import org.apache.lucene.analysis.core.LowerCaseFilterFactory;
import org.apache.lucene.analysis.core.StopFilter;
import org.apache.lucene.analysis.core.WhitespaceTokenizer;
import org.apache.lucene.analysis.en.PorterStemFilter;
import org.apache.lucene.analysis.miscellaneous.WordDelimiterFilter;
import org.apache.lucene.analysis.standard.StandardFilter;
import org.apache.lucene.analysis.standard.StandardTokenizer;
import org.apache.lucene.analysis.util.CharArraySet;
import org.apache.lucene.analysis.util.StopwordAnalyzerBase;
import org.apache.lucene.util.AttributeFactory;
import org.apache.lucene.util.Version;

public class VietAnalyzer extends StopwordAnalyzerBase {
	private final static Version version = Version.LUCENE_4_10_3;

	@SuppressWarnings("deprecation")
	public VietAnalyzer(Version version, CharArraySet stopword)
			throws IOException {
		super(loadStopwordSet(new File("resources/data/vnstopword.txt")));
		// TODO Auto-generated constructor stub
	}

	@Override
	protected TokenStreamComponents createComponents(String fieldname, Reader reader) {
		// TODO Auto-generated method stub
		final Tokenizer src = new VietTokenizer(AttributeFactory.DEFAULT_ATTRIBUTE_FACTORY, reader);
		TokenStream tok = new StandardFilter(src);
		tok = new LowerCaseFilter(tok);
		tok = new StopFilter(tok, stopwords);
		return new TokenStreamComponents(src, tok);
	}

}
