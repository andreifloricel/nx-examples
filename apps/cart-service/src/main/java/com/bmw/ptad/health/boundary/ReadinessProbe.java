//==============================================================================
// Copyright (c) 2020 BMW Group. All rights reserved.
//==============================================================================
package com.bmw.ptad.health.boundary;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;

import javax.enterprise.context.ApplicationScoped;

@Readiness
@ApplicationScoped
public class ReadinessProbe implements HealthCheck {

    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up("ready for traffic");
    }

}
