
import { Component } from '@angular/core';
import { FormsModule } from '@angular/forms';

@Component({
  selector: 'app-cadastro',
  standalone: true,
  imports: [FormsModule],
  templateUrl: './cadastro.component.html',
  styleUrl: './cadastro.component.css'
})
export class CadastroComponent {
  nomeCompleto = "Nome de Usuario";
  nomeSocial  = "Nome Social Exemplo";
  nomeMae = "Nome da Mãe Exemplo"
  nomePai = "Nome do Pai Exemplo";
  dataNascimento = "2000-01-01";
  sexo = "masculino";  
  nacionalidade = "Brasileiro";
  municipioNascimento = "São Paulo";
  racaCor = "branco";  
  frequentaEscola = "sim";
  escolaridade = "Ensino Médio";
  situacaoFamiliar = "Casado";
  vinculoEstabelecido = "Contrato";
  cadastroEstabelecido = "Cadastro XYZ";
  deficiencia = "Nenhuma";
  tipoDeficiencia = "";
  contatoCelular = "11999999999";
  contatoResidencial = "1133333333";
  contatoComercial = "1122222222";
  contatoEmail = "exemplo@dominio.com";
  origemEndereco = "São Paulo";
  dadosEndereco = "Rua Exemplo, 123";
  cpf = "123.456.789-00";
  identidade = "MG-12.345.678";
}