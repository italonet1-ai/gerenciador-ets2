package com.ets2manager;

public class Motorista {
    private String nomeMotorista;
    private String carteiraMotorista;
    private int idade;
    private String sexo;
 public Motorista(String nomeMotorista, String carteiraMotorista, int idade, String sexo){
     this.nomeMotorista =nomeMotorista;
     this.carteiraMotorista = carteiraMotorista;
     this.idade = idade;
     this.sexo = sexo;
 }
public String getNomeMotorista(){
     return  nomeMotorista;
}
public String getCarteiraMotorista(){
     return  carteiraMotorista;
}
public int getIdade(){
     return idade;
}
public String getSexo(){
     return sexo;
}
}
