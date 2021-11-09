//this is used to get data from my backend spring boot api


import { HttpClient } from '@angular/common/http'
import { Injectable } from '@angular/core'
import { MessageModel } from '../model/message'

@Injectable ({
    providedIn: 'root'
})

export class GreetingService {

    constructor(private http: HttpClient){}

    executeGreetingService(){
        return this.http.get<MessageModel>('http://localhost:8080/api/v1/greeting');
    }
}