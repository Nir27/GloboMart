import { Component, OnInit } from '@angular/core';
import { UserService } from '../user.service';
import { User } from '../user.model';

@Component({
  selector: 'app-user-add',
  templateUrl: './user-add.component.html',
  styleUrls: ['./user-add.component.css']
})
export class UserAddComponent implements OnInit {
  // Define the newUser object with initial values
  newUser: User = { id: 0, username: '', password: '', email: '' };

  // Constructor for the component
  constructor(private userService: UserService) { }

  // Initialization lifecycle hook
  ngOnInit(): void {
    // Empty for now
  }

  // Method to add a user
  addUser(): void {
    // Call the registerUser method of UserService and subscribe to the Observable
    this.userService.registerUser(this.newUser)
      .subscribe(() => {
        // Placeholder comment for future logic
      });
  }
}
