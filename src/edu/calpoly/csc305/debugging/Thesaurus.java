package edu.calpoly.csc305.debugging;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Thesaurus {
  private Map<String, List<String>> synonyms;

  public Thesaurus() {
    synonyms = new HashMap<>();
  }

  /** adds alternative synonyms for word in Thesaurus.
   *  creates new key value if word is not present in Thesaurus
   *
   * @param word the root word
   * @param alternatives Array of strings that are alternative words to word.
   */
  public void addAlternatives(String word, String ... alternatives) {

    if (synonyms.containsKey(word)) {
      synonyms.get(word).addAll(Arrays.asList(alternatives));
    } else {
      synonyms.put(word, Arrays.asList(alternatives));
    }
  }

  public List<String> alternatives(String word) {
    return synonyms.get(word);
  }
}
