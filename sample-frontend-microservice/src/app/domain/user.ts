export class User {
    id: string;
    firstname: string;
    surname: string;
    userStatus: string;
    created: string;

    constructor(id: string, firstname: string, surname: string, userStatus: string, created: string){
        this.id = id;
        this.firstname = firstname;
        this.surname = surname;
        this.userStatus = userStatus;
        this.created = created;
    }
}
