package TPE_Programacion;

import TPE_Programacion.Comparadores.CompEdad;


public class Main {
    public static void main(String []args){
        Participante pepe=new Participante("pepe","pipito",23);
        pepe.addGenero("rock");
        pepe.addIdioma("ingles");


        Participante pepe2=new Participante("carlito","carlos",33);
        pepe2.addGenero("rock");
        pepe2.addGenero("cumbia");
        pepe2.addIdioma("ingles");
        pepe2.addInstrumento("triangulo");

        System.out.println(pepe2.getInstrumento());
        CompEdad edad=new CompEdad();
        Coach c=new Coach("coach");
        c.addParticipante(pepe);
        c.addParticipante(pepe2);
        System.out.println(c.getParticipantes());
        Coach c2=new Coach("coach2");
        Participante carlos=new Participante("carlos","c",2);
        carlos.addGenero("rock");
        carlos.addIdioma("ingles");


        Participante kun=new Participante("kun","b",1);
        kun.addGenero("rock");
        kun.addGenero("cumbia");
        kun.addIdioma("ingles");
        kun.addInstrumento("triangulo");
        c2.addParticipante(kun);
        c2.addParticipante(carlos);
        Reality r=new Reality("show");
        r.addCoach(c);
        r.addCoach(c2);
        System.out.println(r.batalla(kun,carlos,edad));

    }

}
