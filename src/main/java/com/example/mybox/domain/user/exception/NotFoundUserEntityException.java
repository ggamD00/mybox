package com.example.mybox.domain.user.exception;

import com.example.mybox.global.error.BusinessException;
import com.example.mybox.global.response.ErrorCode;

public class NotFoundUserEntityException extends BusinessException {

    public NotFoundUserEntityException() {
        super(ErrorCode.USER_NOT_FOUND);
    }
}
