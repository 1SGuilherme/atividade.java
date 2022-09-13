/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade.lp;



// ATRIBUTOS
public class Canetas {
    private String modelo;
    private String cor;
    private float ponta;
    private int carga;
    private boolean tampada;
    
    
    public Canetas(){
    }
    
    public Canetas(String modelo, String cor, float ponta, int carga, boolean tampada){
        this.modelo = modelo;
        this.cor = cor;
        this.ponta = ponta;
        this.carga = carga;
        this.tampada = tampada;
    }

    
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public float getPonta() {
        return ponta;
    }

    public void setPonta(float ponta) {
        this.ponta = ponta;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }
 
    
    
    
   
    
    public void desenhar(boolean des){
        if (des == true){
            System.out.println("Erro! Não posso desenhar");
        } else {
            System.out.println("Voce pode desenhar!");
        }
    }
    
    public void tampar(String resp){
        if (resp.equals("sim")){
            System.out.println("A caneta esta tampada");
        }else if (resp.equals("nao")) {
            System.out.println("A caneta esta destampada");
        } 
    }
    
    public void guardar(){
        System.out.println("A caneta esta guardada");
       
    }
    
    public void testar(){
        System.out.println("Testando a caneta");
    }
    public void escrever(boolean esc){
        if (esc == true){
            System.out.println("Erro! caneta esta tampada");
        } else {
            System.out.println("Voce pode escrever!");
        }
    }
    
    public void pintar(boolean pint){
        if (pint == true){
            System.out.println("Erro! destampe a caneta para pintar");
        } else {
            System.out.println("Voce pode pintar!");
        }
    }
}
