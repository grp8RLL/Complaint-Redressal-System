import { Component, OnInit } from '@angular/core';
import { Managers } from './../../models/managers';
import { ManagersService } from './../../services/managers.service';

@Component({
  selector: 'app-managerregister',
  templateUrl: './managerregister.component.html',
  styleUrls: ['./managerregister.component.css'],
})
export class ManagerregisterComponent implements OnInit {
  manager: Managers = new Managers();
  constructor(private _managersService: ManagersService) {}

  ngOnInit(): void {}
  registerManager(): any {
    console.log('inside registerManager() !');
    this._managersService.registerManager(this.manager).subscribe(() => {
      alert('Successfully Registered !');
    });
  }
}
