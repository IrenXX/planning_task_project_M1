package ru.kemova.task_planning.exception.error;

public enum MessageError {

    USER_NOT_FOUND,
    USER_ALREADY_EXIST,
    PASSWORDS_ARE_NOT_EQUAL,
    CREDENTIALS_IS_NOT_VALID,
    JWT_TOKEN_NOT_VALID,
    CONFIRMATION_TOKEN_NOT_VALID,
    COULD_NOT_CREATE_ENTITY,
    COULD_NOT_UPDATE_ENTITY,
    COULD_NOT_DELETE_ENTITY,
    UNAUTHORIZED
}
