package com.bmw.ptad.io.control;

import com.bmw.ptad.Control;
import com.bmw.ptad.openapi.model.MDDataModelUploadRequest;

@Control
public class UploadService {

    public void upload(MDDataModelUploadRequest request) {
        if (request == null) {
            throw new NullPointerException();
        }
    }
}
