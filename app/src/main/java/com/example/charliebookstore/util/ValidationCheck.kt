package com.example.charliebookstore.util

import android.util.Patterns
import java.util.regex.Pattern

fun validateEmail(email: String): RegisterValidation{
    if (email.isEmpty())
        return RegisterValidation.Failed("O campo de E-mail está vazio")

    if (Patterns.EMAIL_ADDRESS.matcher(email).equals(email))
        return RegisterValidation.Failed("Formato de e-mail incorreto")

    return  RegisterValidation.Success
}

fun validatePassword(password: String): RegisterValidation{
    if (password.isEmpty())
        return  RegisterValidation.Failed("Campo senha está vazio")

    if (password.length < 6)
        return RegisterValidation.Failed("Senha precisa ter mais de 6 caracteres")

    return RegisterValidation.Success
}