package com.roboproject;

public class App 
{
    public static void main( String[] args )
    {
        Robo robo = new Robo();
        for (int d = 0; d< 4; d++){
            for (int j = 1; j<= 10; j++){
                robo.printPosicao();
                switch(d){
                    case 0:
                    robo.move(50 + j * 4, 50);
                    break;
                    case 1:
                    robo.move (90, 50 + j * 4);
                    break;
                    case 2:
                    robo.move(90 - j * 4, 90);
                    break;
                    case 3:
                    robo.move(50, 90 - j * 4);
                    break;
                    default:
                    System.out.println("Tecla inválida");
                    break;
                }
            }
        }
        robo.printPosicao();
    }
}
