
//a message model to hold API response data to display on page
export class MessageModel {
    id: number;
    content: string;
    constructor(private _id: number, public message: string){
        this.id = _id;
        this.content = message;
    }
}
