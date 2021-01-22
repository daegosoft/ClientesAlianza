import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { BaseService } from '../base.service';
import { map, catchError} from 'rxjs/operators';
import { Cliente } from 'src/app/components/clientes/clientes.component';

@Injectable({
  providedIn: 'root'
})
export class ClienteService extends BaseService{

  protected url = 'cliente';

  constructor(http: HttpClient) { super(http);}

  obtenerClientes(){
    return this.getServiceObservable(this.url).pipe(map(data => data))
  }

  buscarCliente(shared: string){
    return this.getServiceObservable(this.url + '/buscar?sharedKey='+shared).pipe(map(data => data));
  }

  crearCliente(cliente: Cliente){
    return this.postServiceObservableP(this.url, cliente).pipe(map(data =>data));
  }
}
