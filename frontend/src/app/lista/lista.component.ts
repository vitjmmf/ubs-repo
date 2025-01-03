import { Component } from '@angular/core';
import { Paciente } from '../model/paciente';
import { PacienteService } from '../service/paciente.service';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { identifierName } from '@angular/compiler';

@Component({
  selector: 'app-lista',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './lista.component.html',
  styleUrl: './lista.component.css',
  providers: [PacienteService]
})
export class ListaComponent {
  mensagem: String = "";
  pacientes: Paciente[] = [];
  paciente: Paciente = new Paciente;
  id: number = 0;



constructor(private service: PacienteService){
  this.listarPacientes();
  this.excluir(this.id);
  this.editar(this.paciente);

  }

  listarPacientes(){
    this.service.listarTodos().subscribe({
      next: (data) =>{this.pacientes = data;},
      error: (msg) =>{this.mensagem = "ocorreu erro"}
    });
  }

  excluir(id: number){
    this.service.excluir(id).subscribe({
      next: (data) => {this.listarPacientes(); this.mensagem = "Paciente excluído com sucesso!";},
      error: (msg) => {this.mensagem = "ocorreu um erro ao tentar excluir o paciente!";}
    });
  }

  editar(paciente: Paciente){
    this.service.alterar(paciente).subscribe({
      next: (data) => {this.listarPacientes(); this.mensagem = "Paciente alterado com sucesso!";},
      error: (msg) => {this.mensagem = "ocorreu um erro ao tentar alterar o paciente!";}
    });
  }

  busca(pa)

  novoPaciente(){
    this.mensagem = "";
  }
}

