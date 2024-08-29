package br.com.dio.desafio;

import br.com.dio.desafio.domain.Bootcamp;
import br.com.dio.desafio.domain.Curso;
import br.com.dio.desafio.domain.Dev;
import br.com.dio.desafio.domain.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição curso Java");
        curso1.setCargaHoraria(40);

        Curso curso2 = new Curso();

        curso2.setTitulo("Curso C");
        curso2.setDescricao("Descrição curso C");
        curso2.setCargaHoraria(40);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descrição mentoria Java");
        mentoria.setData(LocalDate.now());


        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);

        Bootcamp bootcampJava = new Bootcamp();
        bootcampJava.setNome("Bootcamp Java");
        bootcampJava.setDescricao("Descrição Bootcamp Java");
        bootcampJava.getConteudos().add(curso1);
        bootcampJava.getConteudos().add(curso2);
        bootcampJava.getConteudos().add(mentoria);

        Dev devDaniel = new Dev();
        devDaniel.setNome("Daniel");
        devDaniel.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos BootCamp: " + devDaniel.getConteudosInscritos());
        devDaniel.progredir();
        devDaniel.progredir();
        System.out.println("Conteúdos BootCamp: " + devDaniel.getConteudosInscritos());
        System.out.println("XP: "+ devDaniel.calcularXp());

        Dev devMaria = new Dev();
        devMaria.setNome("Maria");
        devMaria.inscreverBootcamp(bootcampJava);
        System.out.println("Conteúdos BootCamp: " + devMaria.getConteudosInscritos());
        devMaria.progredir();
        System.out.println("Conteúdos BootCamp: " + devMaria.getConteudosInscritos());
        System.out.println("XP: "+ devMaria.calcularXp());

    }
}
