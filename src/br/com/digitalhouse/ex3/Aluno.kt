package br.com.digitalhouse.ex3

class Aluno(val nome: String, val numeroDeAluno:Int) {

    override fun equals(other: Any?): Boolean {

        return other is Aluno && this.numeroDeAluno == other.numeroDeAluno

    }
}