
enum Hobbies { Reading = 1, Writing = 2, Cycling = 3 }

let id: string = 'EMP001';
let fullName: string = 'Ashish S';
let age: number = 30;
let isCertified: boolean = true;
let unknown: any = 'Test';
let hobbies: Hobbies = Hobbies.Cycling;

function foo(text: string) {
    for (var i = 0; i < 5; i++) {
        console.log(text)
    }
    console.log('the value of i = ' + i)
}
foo('bar');
