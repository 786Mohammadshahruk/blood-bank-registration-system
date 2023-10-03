package com.sthumbh.bloodbankregistrationsystem.response;

import lombok.Data;

@Data
public class ResourceData<T> {
    private T data;
}
