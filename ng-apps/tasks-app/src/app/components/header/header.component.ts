import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-header',
  templateUrl: './header.component.html',
  styleUrls: ['./header.component.css']
})
export class HeaderComponent implements OnInit {

  headingText: string = "The heading component of the application.";

  constructor() { }

  ngOnInit(): void {
  }

  onButtonClick(){
    console.log('click event handled from the header component...')
  }

}
