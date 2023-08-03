const alphaData = "Venceslas";
let aphaResult = 0;

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

for (let i = 0; i < alphaData.length; i++) {
  aphaResult += getNumericValue(alphaData[i]);
}

console.log(` ${alphaData} has numeric value of ${aphaResult}`);
