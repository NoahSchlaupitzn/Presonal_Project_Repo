import { Component, OnInit } from '@angular/core';
import { Router, ActivatedRoute } from '@angular/router';
import { GreetingService } from '../service/greeting.service';


//defining logic for greeting component
@Component({
  selector: 'app-greeting',
  templateUrl: './greeting.component.html',
  styleUrls: ['./greeting.component.css']
})
export class GreetingComponent implements OnInit {

  greetingMessage = '';

  constructor(
    private route: ActivatedRoute,
    private router: Router, 
    private greetingService: GreetingService
  ) { }

  ngOnInit(): void {
    this.greetingService.executeGreetingService().subscribe((res) => {
      this.greetingMessage = res.content;
    })
  }

}
