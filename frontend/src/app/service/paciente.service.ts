import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Paciente } from '../model/paciente';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class PacienteService {

  constructor(private http : HttpClient) { }
  gravar(obj: Paciente): Observable<Paciente>{
    return this.http.post<Paciente>("http://localhost:8083/api/paciente", obj);
    }
    alterar(obj: Paciente): Observable<Paciente>{
      return this.http.put<Paciente>("http://localhost:8083/api/paciente", obj);
    }
    remove(codigo: number): Observable<Paciente>{
      return this.http.delete<Paciente>("http://localhost:8083/api/paciente/" + codigo);
    }
    ler(codigo: number): Observable<Paciente>{
      return this.http.get<Paciente>("http://localhost:8083/api/paciente/" + codigo);
    }
    listar(): Observable<Paciente>{
      return this.http.get<Paciente>("http://localhost:8083/api/paciente");
    }
}
