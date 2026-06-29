package com.ets2manager;

import java.util.ArrayList;
import java.util.Scanner;

public class CadastroMotorista {

    public void Cadastrar() {

        Scanner scanner = new Scanner(System.in);
        ArrayList<Motorista> listaMotorista = new ArrayList<>();
        int opcao = 0;

        while (opcao <=3){
            System.out.println("Bem-vindo a sessão de Cadastro de motoristas");
            System.out.println("Selecione a opção desejada:");
            System.out.println("1- Cadastrar novo motorista:");
            System.out.println("2- Consultar dados do motorista:");
            System.out.println("3- Remover cadastro do motorista:");
            opcao = scanner.nextInt();
            scanner.nextLine();
        switch (opcao){
            case 1:
           System.out.println("Vamos efetuar o cadastro do novo motorista");
           System.out.println("Digite o nome do motorista:");
           String nome = scanner.nextLine();

           while (nome.trim().isEmpty()){
               System.out.println("Nome invalido! O campo não pode ficar em branco, digite o nome novamente");
               nome = scanner.nextLine();
           }
               System.out.println("Digite o numero da carteira de motorista:");
               String numeroCarteira = scanner.nextLine();
           while (numeroCarteira.trim().isEmpty()){
               System.out.println("Carteira de motorista invalida! O Campo não pode ficar em branco,digite novamente");
               numeroCarteira =scanner.nextLine();
           }
               System.out.println("Digite a idade do motorista:");
               int idade = scanner.nextInt();
            while (idade < 0 || idade < 18){
                System.out.println("Idade invalida, ou digitada idade negativa,ou motorista menor de idade, gentileza digitar novamente:");
                idade = scanner.nextInt();
            }
               scanner.nextLine();

               System.out.println("Digite o sexo do motorista: Caso masculino(M) ou feminino (F)");
               String sexo = scanner.nextLine();
               while (sexo.trim().isEmpty()){
                   System.out.println("O genero do motorista não pode ficar em branco, por favor digite novamente");
                   sexo = scanner.nextLine();
               }
               Motorista novoMotorista = new Motorista(nome, numeroCarteira, idade, sexo);
               listaMotorista.add(novoMotorista);
               System.out.println("Motorista cadastrado com sucesso.");

           break;
            case 2:
                System.out.println("Lista de motoristas cadastrados");
                for(Motorista m: listaMotorista){
                    System.out.println("Nome: " + m.getNomeMotorista() + " | Carteira: " + m.getCarteiraMotorista() + " | Idade " + m.getIdade() + " | Sexo " + m.getSexo() );

                }
                break;
            case 3:
                System.out.println("Bem vindo a tela de remoção de motorista:");
                System.out.println("digite o numero da carteira do motorista há ser removida");
                String carteiraPararemover = scanner.nextLine();

                Motorista motoristaEncontrado = null;
                for (Motorista m : listaMotorista){
                    if (m.getCarteiraMotorista().equals(carteiraPararemover)){
                        motoristaEncontrado = m;
                     break;
                    }
                }
             if (motoristaEncontrado != null){
                 listaMotorista.remove(motoristaEncontrado);
                 System.out.println("Motorista removido com sucesso");
             }else{
                 System.out.println("Nenhum motorista encontrado");
             }
             break;
        }


        }


    }


}

