package ejerciciovideojuego;

import ejerciciovideojuego.logica.VideoJuego;

import java.util.ArrayList;

import java.util.List;

public class EjercicioVideojuego {

    public static void main(String[] args) {
        
   List<VideoJuego> listaVideojuegos = new ArrayList<VideoJuego>();
   
   VideoJuego video1 = new VideoJuego  (123, "Super Mario Kart", "Nintendo 64", 4, "Plataforma");
   
   VideoJuego video2 = new VideoJuego  (456, "Mario Party 3", "Nintendo 64", 4, "Plataforma");
   
   VideoJuego video3 = new VideoJuego  (789, "Fifa 23", "PlayStation", 2, "Plataforma");
   
   VideoJuego video4 = new VideoJuego  (321, "Guardian Of Zelda", "Nintendo 64", 1, "Plataforma");
   
   VideoJuego video5 = new VideoJuego  (445, "Donkey Kong Country", "Nintendo 64", 2, "Plataforma");
   
   VideoJuego video6 = new VideoJuego  (261, "Smash Party", "Nintendo 64", 4, "Plataforma");
   
   VideoJuego video7 = new VideoJuego  (351, "Halo", "X-BOX One", 2, "Plataforma");
   
   VideoJuego video8 = new VideoJuego  (333, "Super Mario Paper", "Nintendo 64", 4, "Plataforma");
   
   VideoJuego video9 = new VideoJuego  (849, "The Last of Us", "PlayStation", 2, "Plataforma");
   
   VideoJuego video10 = new VideoJuego (666, "The Last of Us Part II", "PlayStation", 2, "Plataforma");
   
   
   listaVideojuegos.add(video1);
   listaVideojuegos.add(video2);
   listaVideojuegos.add(video3);
   listaVideojuegos.add(video4);
   listaVideojuegos.add(video5);
   listaVideojuegos.add(video6);
   listaVideojuegos.add(video7);
   listaVideojuegos.add(video8);
   listaVideojuegos.add(video9);
   listaVideojuegos.add(video10);
   
           
    for (VideoJuego video :listaVideojuegos){
      System.out.println(" Titulo : " + video.getTitulo () + " Consola: " + video.getConsola () + " Jugadores: " + video.getCantJugadores ());
  }
        System.out.println("---------------------------------------------");
    video3.setTitulo("Fifa 2023");
    video3.setCantJugadores(1);
    
    video1.setTitulo("Super Mario Kart 22");
    video1.setCantJugadores(6);
    
    for (VideoJuego video : listaVideojuegos){
        if (video.getConsola ().equals(" Nintendo 64 ")) {
            System.out.println(video.toString()); 
        }
  }
    
     }
    
}
