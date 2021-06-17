import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-followers',
  templateUrl: './followers.component.html',
  styleUrls: ['./followers.component.css']
})
export class FollowersComponent implements OnInit {

  constructor(private route: ActivatedRoute) { }

  name:string = ''
  email:string = ''

  ngOnInit(): void {
    this.route.paramMap.subscribe(
      params => {
        this.name = <string> params.get('name')
        this.email = <string> params.get('email')
      }
    )
  }

}
