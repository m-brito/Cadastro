package com.github.mbrito.cadastro

class Formulario(
    var name: String,
    var email: String,
    var phone: String,
    var city: String,
    var state: String?,
    var sexo: String,
    var join: Boolean
) {
    override fun toString(): String {
        return  "Nome completo: $name\n" +
                "Email: $email\n" +
                "Telefone: $phone\n" +
                "Cidade: $city\n" +
                "Estado: $state\n" +
                "Sexo: $sexo\n" +
                "Ingressar nos emails: " + if (join) "Sim" else "Não"
    }
}