package br.com.digitalhouse.ex2

class Coca (val tamanho:Int, val preco:Double) {
    override fun equals(other: Any?): Boolean {
        return other is Coca && other.tamanho==this.tamanho
    }
}