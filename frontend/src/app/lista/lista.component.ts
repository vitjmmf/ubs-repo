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
  selecionarPaciente: Paciente | null = null;
  id: number = 0;



constructor(private service: PacienteService){
  this.listarPacientes();

  }

  listarPacientes(){
    this.service.listarTodos().subscribe({
      next: (data) =>{this.pacientes = data;},
      error: (msg) =>{this.mensagem = "ocorreu erro"}
    });
  }

  excluir(id: number){
    this.service.excluir(id).subscribe({
      next: () => {this.listarPacientes(); this.mensagem = "Paciente excluído com sucesso!";},
      error: (err) => {this.mensagem = "ocorreu um erro ao tentar excluir o paciente!";}
    });
  }

  editar(paciente: Paciente){
    this.selecionarPaciente = {...paciente};
  }

  salvar() {
    if (this.selecionarPaciente) {
      this.service.salvar(this.selecionarPaciente).subscribe({
        next: (response) => {
          this.listarPacientes();
          this.mensagem = 'Atualizado com sucesso!';
        },
        error: (err) => {
          this.mensagem = 'Erro ao salvar o paciente.';
        }
      });
    }
  }

  limparSelecao() {
    this.selecionarPaciente = null;
  }

}

