import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Paciente } from '../model/paciente';

@Injectable({
  providedIn: 'root',
})


export class PacienteService {

  constructor(private http: HttpClient) { }

  public salvar(obj: Paciente): Observable<Paciente> {
    return this.http.post<Paciente>('http://localhost:8087/paciente', obj);
  }
  public alterar(obj: Paciente): Observable<Paciente> {
    return this.http.put<Paciente>('http://localhost:8087/paciente/', obj);
  }
  public excluir(id: number): Observable<Paciente> {
    return this.http.delete<Paciente>('http://localhost:8087/paciente/' + id);
  }
  public listarTodos(): Observable<Paciente[]> {
    return this.http.get<Paciente[]>('http://localhost:8087/paciente');
  }


}
