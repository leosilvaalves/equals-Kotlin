package br.com.digitalhouse.ex1

class Pessoa (val nome: String, val RG:Int){

    override fun equals(other: Any?): Boolean {

        return other is Pessoa && this.RG==other.RG
    }

}