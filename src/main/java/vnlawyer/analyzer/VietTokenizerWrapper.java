package vnlawyer.analyzer;

import vn.hus.nlp.tokenizer.VietTokenizer;

public class VietTokenizerWrapper {
	private static VietTokenizer vietTokenizer = null;

	// ==================================================
	// Constructors
	// ==================================================
	// ==================================================
	// Getter/Setter methods
	// ==================================================
	public static VietTokenizer getVietTokenizer() {
		if (vietTokenizer == null)
			vietTokenizer = new VietTokenizer();
		return vietTokenizer;
	}

}
