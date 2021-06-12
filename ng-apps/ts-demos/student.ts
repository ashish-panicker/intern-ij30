export class Student {

    private _name: string
    private _id: number
    private _email: string

    constructor(name: string, id: number, email: string) {
        this._name = name;
        this._id = id;
        this._email = email;
    }

    set name(value) {
        this._name = value;
    }

    get name() {
        return this._name;
    }

    create() { }
    edit() { }
    remove() { }
    read() { }

}