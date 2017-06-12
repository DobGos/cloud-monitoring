import { Component, OnInit } from '@angular/core';
import { UsersService } from '../services/users.service';
import { User } from '../domain/user';


@Component({
  selector: 'users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css']
})
export class UsersComponent implements OnInit {

  public errorMessage: string;
  public users : User[];

  constructor(private usersService: UsersService) { }

  ngOnInit() {
    this.getUsers();
  }

  getUsers() {
    console.log("getUsers() invoked...");
    this.usersService.getUsers()
      .subscribe(
      data => this.users = data,
      error => { 
        this.errorMessage = 'Failed to retrieve users from backend service.'; }
      );
  }
}
