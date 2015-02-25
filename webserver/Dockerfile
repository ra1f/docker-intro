# Dockerfile for simple groovy webserver
# Version 1.0
FROM ra1f/docker_intro_groovy

MAINTAINER Ralf Düerkop <ralf.dueerkop@m-net.de>

EXPOSE 8080

ADD webServer.groovy /opt/webserver/webServer.groovy
ADD scripts /opt/webserver/scripts
ADD run.sh /opt/webserver/run.sh

VOLUME ["/logs"]

