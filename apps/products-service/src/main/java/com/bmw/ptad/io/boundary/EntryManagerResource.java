package com.bmw.ptad.io.boundary;

import com.bmw.ptad.Boundary;
import com.bmw.ptad.openapi.api.EntriesApi;
import com.bmw.ptad.openapi.model.Entries;
import com.bmw.ptad.openapi.model.SaveEntryRequest;
import com.bmw.ptad.openapi.model.SaveEntryResponse;

@Boundary
public class EntryManagerResource implements EntriesApi {
    public static final String MESSAGE_OK = "OK";

    @Override
    public Entries getEntries() {
        return new Entries();
    }

    @Override
    public SaveEntryResponse saveEntry(SaveEntryRequest saveEntryRequest) {
        return (SaveEntryResponse) new SaveEntryResponse()
                .entries(new Entries())
                .message(MESSAGE_OK);
    }
}
