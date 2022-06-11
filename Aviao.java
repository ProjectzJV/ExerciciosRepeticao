package ExercicioMetodo;

public class Aviao {

    String cor;
    String modelo;
    String ano;
    boolean legalizado;
    int altitude;

    //metodos
    void acelerar(int aceleracao) {
    	altitude = altitude + aceleracao;
    }

    void inclinar(int inclinar) {
    	altitude = altitude - inclinar;
    }
}