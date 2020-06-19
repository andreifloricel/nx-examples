package com.bmw.ptad.io.boundary;

import com.bmw.ptad.Boundary;
import com.bmw.ptad.openapi.api.UploadApi;
import com.bmw.ptad.openapi.model.MDDataModelUploadRequest;
import com.bmw.ptad.openapi.model.MDDataModelUploadResponse;

@Boundary
public class UploadResource implements UploadApi {
    public static final String MESSAGE_OK = "OK";

    @Override
    public MDDataModelUploadResponse uploadReport(MDDataModelUploadRequest mdDataModelUploadRequest) {
        return (MDDataModelUploadResponse) new MDDataModelUploadResponse()
                .message(
                        MESSAGE_OK
                );
    }
}
