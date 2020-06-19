#!/bin/sh
oc create -f camicro-app.yaml
echo "Pipeline start automatically, for subsequent builds execute:"
echo "oc start-build microsonic-pipeline"