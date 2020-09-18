package br.com.digitalhouse.ex4

fun main() {
    val funcionario1=Funcionario("Leonardo",1)
    val funcionario2=Funcionario("Lucas",2)
    val funcionario3=Funcionario("Juarez",3)
    val funcionario4=Funcionario("Simone",4)

    val listaFuncionario=mutableListOf(funcionario1,funcionario2,funcionario3,funcionario4)

    val funcionarioNovo=Funcionario("João",1)

    println(listaFuncionario.contains(funcionarioNovo))

}