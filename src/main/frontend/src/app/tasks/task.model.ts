export class Task {
    public id: number;
    public name: string;
    public completed: boolean;
    public dueDate: string;

    constructor(name: string, completed: boolean, dueDate: string) {
        // this.id = id; no longer needed since we autogenerate this in Spring Boot app
        this.name = name;
        this.completed = completed;
        this.dueDate = dueDate;
    };
}
