package br.com.digitalhouse.ex4

class Funcionario(val nome:String,val numeroDeRegistro:Int) {
    override fun equals(other: Any?): Boolean {
        return other is Funcionario && other.numeroDeRegistro==this.numeroDeRegistro
    }
}