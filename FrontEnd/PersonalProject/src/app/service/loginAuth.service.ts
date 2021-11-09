import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { map } from 'rxjs/operators';

@Injectable({
    providedIn: 'root'
})

export class AuthenicationService{


    USER_NAME_SESSION_ATTRIBUTE_NAME = 'authenticatedUser';

    public username: String;
    public password: String;

    constructor(private http: HttpClient){
        
    }
}