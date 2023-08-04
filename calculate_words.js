const givenString = "Venceslas is one of the lords";
let wordValue = 0;
let charCount = 0;
let wordCount = 0;

function getWordCount(word) {
  const splittedWords = word.split(" ");
  wordCount = splittedWords.length;
}

function getNumericValue(character) {
  // Convert the character to uppercase to handle both lowercase and uppercase letters.
  character = character.toUpperCase();

  // Check if the character is a space.
  if (character === " ") {
    return 0;
  }
  // Get the Unicode value of the character.
  const charCode = character.charCodeAt(0);

  // Subtract 64 from the Unicode value to get the numeric value (A=1, B=2, ..., Z=26).
  return charCode - 64;
}

for (let i = 0; i < givenString.length; i++) {
  charCount++;
  wordValue += getNumericValue(givenString[i]);
}

getWordCount(givenString);

console.log(
  ` The given string has numeric value of ${wordValue}, counts ${charCount} characters and composed of ${wordCount} words`
);
