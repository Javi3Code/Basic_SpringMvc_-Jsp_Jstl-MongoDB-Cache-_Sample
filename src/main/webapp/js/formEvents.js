const letterRegex = /^[a-zA-z\s]/;
function acceptOnlyLetters(ev) {
    var letter = String.fromCharCode(ev.keyCode)
    if (letterRegex.test(letter)) {
        return true;
    }
    ev.preventDefault();
    return false;
}

function limitSize(element, ev) {
    console.log(element.value);
    if (Number.parseInt(element.value) > 99) {
        element.value = element.value.substring(0, element.value.length - 1);
        return false;
    }
    return true;
}