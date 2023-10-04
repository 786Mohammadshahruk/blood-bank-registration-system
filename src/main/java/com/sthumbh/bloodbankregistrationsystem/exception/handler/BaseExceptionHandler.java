package com.sthumbh.bloodbankregistrationsystem.exception.handler;

import com.sthumbh.bloodbankregistrationsystem.response.MetaData;
import com.sthumbh.bloodbankregistrationsystem.response.StatusCodes;
import com.sthumbh.bloodbankregistrationsystem.response.UserResponseModel;
import jakarta.validation.UnexpectedTypeException;
import jakarta.validation.ValidationException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import java.util.HashSet;
import java.util.Set;

@ControllerAdvice
public class BaseExceptionHandler {
    @ExceptionHandler(UnexpectedTypeException.class)
    public ResponseEntity<UserResponseModel> unexpectedTypeExceptionException(ValidationException exception) {
        MetaData metaData = MetaData.builder()
                .code(StatusCodes.BUSINESS_ERROR_CODE)
                .message(exception.getMessage())
                .status(StatusCodes.BUSINESS_ERROR_STATUS)
                .version("1.0")
                .build();
        UserResponseModel responseModel = UserResponseModel.builder().metaData(metaData).build();
        return new ResponseEntity<>(responseModel, HttpStatus.BAD_REQUEST);
    }

    @ExceptionHandler(MethodArgumentNotValidException.class)
    public ResponseEntity<UserResponseModel> unexpectedException(MethodArgumentNotValidException exception) {
        Set<String> stringSet = new HashSet<>();
        for (ObjectError objectError : exception.getBindingResult().getAllErrors()) {
            stringSet.add(objectError.getDefaultMessage());
        }
        MetaData metaData = MetaData.builder()
                .code(StatusCodes.BUSINESS_ERROR_CODE)
                .errorMessage(stringSet)
                .status(StatusCodes.BUSINESS_ERROR_STATUS)
                .version("1.0")
                .build();
        UserResponseModel responseModel = UserResponseModel.builder().metaData(metaData).build();
        return new ResponseEntity<>(responseModel, HttpStatus.BAD_REQUEST);
    }

}
