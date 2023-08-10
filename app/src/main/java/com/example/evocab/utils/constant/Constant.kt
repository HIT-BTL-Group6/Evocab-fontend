package com.example.evocab.utils.constant

object Constant {
    private const val PROJECT_NAME = "com.example.evocab."
    object MessageAPI{
        const val USERNAME_ALREADY = "Username already exists!"
        const val EMAIL_ALREADY = "Email already exists!"
        const val LOGIN_ERROR = "Username or password is incorrect!"
        const val LOGIN_SUCCESSFUL = "Login successfully!"
        object ForgotPass{
            const val EMAIL_VERIFIED_FAIL = "Email has not been verified!"
            const val EMAIL_VERIFIED_PASS = "Created emailToken successfully!"
        }
        object GetUser{
            const val GET_USER_INFRO_SUCCESSFUL = "Get user by id successfully!"
            const val GET_USER_INFRO_BAD = "invalid token"
        }
    }
    const val SHARED_PREF_ROOT = PROJECT_NAME + "SHARED_PREF"
    const val SHARED_PREF_DEFAULT_STRING = ""
    const val SHARED_PREF_TOKEN_LOGIN = PROJECT_NAME + "TOKEN_LOGIN"
//    const val SHARED_PREF_TOKEN_MESSAGE = PROJECT_NAME + "TOKEN_MESSAGE"
//    const val SHARED_PREF_EMAIL = PROJECT_NAME + "EMAIL"
}