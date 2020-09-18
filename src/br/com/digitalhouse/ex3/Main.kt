package br.com.digitalhouse.ex3

fun main() {

    val aluno1=Aluno("Leonardo",1)
    val aluno2=Aluno("Victoria",2)
    val aluno3=Aluno("Lucas",3)
    val aluno4=Aluno("Kaio",4)
    val alunoNOvo=Aluno("João",1)
    val listaAlunos=mutableListOf(aluno1,aluno2,aluno3,aluno4)

    println(listaAlunos.contains(alunoNOvo))



}