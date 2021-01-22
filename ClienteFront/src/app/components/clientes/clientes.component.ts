import { Component, OnInit } from '@angular/core';
import { MessageService } from 'primeng/api';
import { ClienteService } from 'src/app/services/Cliente/cliente.service';

@Component({
  selector: 'app-clientes',
  templateUrl: './clientes.component.html',
  styleUrls: ['./clientes.component.css']
})
export class ClientesComponent implements OnInit {

  clientes: Cliente[] = [];

  constructor(private service: ClienteService, private messageService: MessageService) { }

  ngOnInit(): void {
    this.obtenerClientes();
  }

  obtenerClientes(){
    this.service.obtenerClientes()
    .subscribe( data =>{
      this.clientes = data;
    }, err =>{
      this.messageService.add({severity: 'error', summary: 'Error', detail: err});
    });
  }

}
export interface Cliente{
  sharedKey: string;
  bussinesID: string;
  email: string;
  phone: number;
  dateAdd: Date ;
}