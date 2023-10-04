package com.sthumbh.bloodbankregistrationsystem.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@AllArgsConstructor
@Builder
public class MetaData {

    private String status;
    private String code;
    private String message;
    private Set<String> errorMessage;
    private String version;

}
