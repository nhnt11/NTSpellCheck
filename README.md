# NTSpellCheck
Spell checker and suggestor for use with JTextPanes.

Something I wrote when I was ~13. Hosted here as a memory.

## Modern description

This is a phonetic spell checker and suggestor that works as follows:

### Phonetic transform
The spell checker uses a phonetic transform function. The function takes a word as input, and as output, returns a phonetically reduced form of the word. Rather than describing the exact transformation, here are example input/outputs that were the "goals" for the algorithm:

- queen -> cwen
- beautiful -> byutyful
- bite -> byt
- bear -> bar
- bare -> bar
- bar -> bar
- juggle -> gugl

The idea was to try and generate a representation of the word that reduces vowels and only uses ambiguous characters - for example, the letter "j" has one sound (in English) and the same sound is also sometimes represented by "g". Since "g" is the more ambiguous one, use "g". Similarly, k/s->c, etc.

The implementation provided here is not complete (I got distracted and abandoned this at some point). If I were to attempt this again I'd probably do some research into English phonetics and make choices based on research data.

### Algorithm

1. A dictionary file - a file containing correctly spelled words, one on each line - is required. This is considered the source of truth.
2. The phonetic transform of every word is obtained, and a map of (phonetic output) -> (list of all dictionary words with that phonetic output) is constructed.
3. To find suggestions, simply generate the phonetic transform of a misspelled word, and look it up in the map to find a list of dictionary words with the same phonetics. This is the list of suggestions.
