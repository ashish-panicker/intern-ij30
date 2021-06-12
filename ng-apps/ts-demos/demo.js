var Hobbies;
(function (Hobbies) {
    Hobbies[Hobbies["Reading"] = 1] = "Reading";
    Hobbies[Hobbies["Writing"] = 2] = "Writing";
    Hobbies[Hobbies["Cycling"] = 3] = "Cycling";
})(Hobbies || (Hobbies = {}));
var id = 'EMP001';
var fullName = 'Ashish S';
var age = 30;
var isCertified = true;
var unknown = 'Test';
var hobbies = Hobbies.Cycling;
function foo(text) {
    for (var i = 0; i < 5; i++) {
        console.log(text);
    }
    console.log('the value of i = ' + i);
}
foo('bar');
