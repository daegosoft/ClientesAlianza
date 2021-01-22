import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html',
  styleUrls: ['./clientes.component.css']
})
export class ClientesComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

}
export interface Cliente{
  sharedKey: string;
  bussinesID: string;
  email: string;
  phone: number;
  dateAdd: Date ;
}