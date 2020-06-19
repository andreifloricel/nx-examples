# From https://atc.bmwgroup.net/bitbucket/projects/webcol/repos/web-collaboration-bmw-ojdk11-minimal-community/browse
FROM docker-registry.default.svc:5000/openshift/bmw-ojdk11-minimal-community:latest
LABEL maintainer="camicro.bmwgroup.net" description="CA.micro for quarkus"

COPY target/lib/*  /opt/java/applications/lib/
COPY target/camicro-runner.jar /opt/java/applications/

ENTRYPOINT java -XshowSettings:vm -Dquarkus.http.host=0.0.0.0 -Djava.util.logging.manager=org.jboss.logmanager.LogManager -jar /opt/java/applications/camicro-runner.jar
EXPOSE 8080
