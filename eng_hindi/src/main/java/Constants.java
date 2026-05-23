import java.util.LinkedHashMap;
import java.util.Map;

public interface Constants {

    static Map<Character,String> charMap(){

        Map<Character, String> hindiMap = new LinkedHashMap<>();

        // English to Hindi Unicode Character Mapping (A-Z)
        hindiMap.put('a', "\u0906"); // आ
        hindiMap.put('b', "\u092C"); // ब
        hindiMap.put('c', "\u091A"); // च
        hindiMap.put('d', "\u0924"); // द
        hindiMap.put('e', "\u090F"); // ए
        hindiMap.put('f', "\u0925"); // थ
        hindiMap.put('g', "\u0917"); // ग
        hindiMap.put('h', "\u0939"); // ह
        hindiMap.put('i', "\u0907"); // इ
        hindiMap.put('j', "\u091C"); // ज
        hindiMap.put('k', "\u0915"); // क
        hindiMap.put('l', "\u0932"); // ल
        hindiMap.put('m', "\u092E"); // म
        hindiMap.put('n', "\u0928"); // न
        hindiMap.put('o', "\u0913"); // ओ
        hindiMap.put('p', "\u092A"); // प
        hindiMap.put('q', "\u0915"); // क
        hindiMap.put('r', "\u0930"); // र
        hindiMap.put('s', "\u0938"); // स
        hindiMap.put('t', "\u0924"); // त
        hindiMap.put('u', "\u0909"); // उ
        hindiMap.put('v', "\u0935"); // व
        hindiMap.put('w', "\u0935"); // व
        hindiMap.put('x', "\u0915\u094D\u0937"); // क्ष (क + ् + ष)
        hindiMap.put('y', "\u092F"); // य
        hindiMap.put('z', "\u091C\u093C");

        return hindiMap;

        /*
        * Map<String, String> englishToHindiMap = new LinkedHashMap<>();

// --- LOWERCASE ENGLISH TO HINDI ---

// Vowels (Swar)
englishToHindiMap.put("a", "अ");
englishToHindiMap.put("aa", "आ");
englishToHindiMap.put("i", "इ");
englishToHindiMap.put("ee", "ई");
englishToHindiMap.put("u", "उ");
englishToHindiMap.put("oo", "ऊ");
englishToHindiMap.put("ri", "ऋ");
englishToHindiMap.put("e", "ए");
englishToHindiMap.put("ai", "ऐ");
englishToHindiMap.put("o", "ओ");
englishToHindiMap.put("au", "औ");
englishToHindiMap.put("an", "अं");
englishToHindiMap.put("ah", "अः");

// Consonants (Vyanjan)
englishToHindiMap.put("k", "क");
englishToHindiMap.put("kh", "ख");
englishToHindiMap.put("g", "ग");
englishToHindiMap.put("gh", "घ");
englishToHindiMap.put("ng", "ङ");
englishToHindiMap.put("ch", "च");
englishToHindiMap.put("chh", "छ");
englishToHindiMap.put("j", "ज");
englishToHindiMap.put("jh", "झ");
englishToHindiMap.put("nya", "ञ");
englishToHindiMap.put("t", "त"); // Maps to dental 'त' / retroflex 'ट'
englishToHindiMap.put("th", "थ"); // Maps to dental 'थ' / retroflex 'ठ'
englishToHindiMap.put("d", "द"); // Maps to dental 'द' / retroflex 'ड'
englishToHindiMap.put("dh", "ध"); // Maps to dental 'ध' / retroflex 'ढ'
englishToHindiMap.put("n", "न"); // Maps to dental 'न' / retroflex 'ण'
englishToHindiMap.put("p", "प");
englishToHindiMap.put("ph", "फ");
englishToHindiMap.put("b", "ब");
englishToHindiMap.put("bh", "भ");
englishToHindiMap.put("m", "म");
englishToHindiMap.put("y", "य");
englishToHindiMap.put("r", "र");
englishToHindiMap.put("l", "ल");
englishToHindiMap.put("v", "व");
englishToHindiMap.put("sh", "श");
englishToHindiMap.put("s", "स");
englishToHindiMap.put("h", "ह");

// Joint & Additional Sounds
englishToHindiMap.put("ksh", "क्ष");
englishToHindiMap.put("tr", "त्र");
englishToHindiMap.put("gy", "ज्ञ");
englishToHindiMap.put("shr", "श्र");
englishToHindiMap.put("rd", "ड़");
englishToHindiMap.put("rdh", "ढ़");


// --- UPPERCASE ENGLISH TO HINDI ---

// Vowels (Swar)
englishToHindiMap.put("A", "अ");
englishToHindiMap.put("AA", "आ");
englishToHindiMap.put("I", "इ");
englishToHindiMap.put("EE", "ई");
englishToHindiMap.put("U", "उ");
englishToHindiMap.put("OO", "ऊ");
englishToHindiMap.put("RI", "ऋ");
englishToHindiMap.put("E", "ए");
englishToHindiMap.put("AI", "ऐ");
englishToHindiMap.put("O", "ओ");
englishToHindiMap.put("AU", "औ");
englishToHindiMap.put("AN", "अं");
englishToHindiMap.put("AH", "अः");

// Consonants (Vyanjan)
englishToHindiMap.put("K", "क");
englishToHindiMap.put("KH", "ख");
englishToHindiMap.put("G", "ग");
englishToHindiMap.put("GH", "घ");
englishToHindiMap.put("NG", "ङ");
englishToHindiMap.put("CH", "च");
englishToHindiMap.put("CHH", "छ");
englishToHindiMap.put("J", "ज");
englishToHindiMap.put("JH", "झ");
englishToHindiMap.put("NYA", "ञ");
englishToHindiMap.put("T", "त");
englishToHindiMap.put("TH", "थ");
englishToHindiMap.put("D", "द");
englishToHindiMap.put("DH", "ध");
englishToHindiMap.put("N", "न");
englishToHindiMap.put("P", "प");
englishToHindiMap.put("PH", "फ");
englishToHindiMap.put("B", "ब");
englishToHindiMap.put("BH", "भ");
englishToHindiMap.put("M", "म");
englishToHindiMap.put("Y", "य");
englishToHindiMap.put("R", "र");
englishToHindiMap.put("L", "ल");
englishToHindiMap.put("V", "व");
englishToHindiMap.put("SH", "श");
englishToHindiMap.put("S", "स");
englishToHindiMap.put("H", "ह");

// Joint & Additional Sounds
englishToHindiMap.put("KSH", "क्ष");
englishToHindiMap.put("TR", "त्र");
englishToHindiMap.put("GY", "ज्ञ");
englishToHindiMap.put("SHR", "श्र");
englishToHindiMap.put("RD", "ड़");
englishToHindiMap.put("RDH", "ढ़");
*
* // Independent Vowels (Used if at start of word)
        INDEPENDENT_VOWELS.put("a", "\u0905");  // अ
        INDEPENDENT_VOWELS.put("aa", "\u0906"); // आ
        INDEPENDENT_VOWELS.put("i", "\u0907");  // इ
        INDEPENDENT_VOWELS.put("ee", "\u0908"); // ई
        INDEPENDENT_VOWELS.put("u", "\u0909");  // उ
        INDEPENDENT_VOWELS.put("e", "\u090F");  // ए
        INDEPENDENT_VOWELS.put("o", "\u0913");  // ओ

        // Dependent Matras (Used after a consonant)
        MATRAS.put("a", "");        // Implicit sound
        MATRAS.put("aa", "\u093E"); // ा
        MATRAS.put("i", "\u093F");  // ि
        MATRAS.put("ee", "\u0940"); // ी
        MATRAS.put("u", "\u0941");  // ु
        MATRAS.put("e", "\u0947");  // े
        MATRAS.put("o", "\u094B");  // ो
* */
    }
}
