# Dockerfile for simple groovy webserver
# Version 1.0
FROM ra1f/docker_intro_groovy

MAINTAINER Ralf Dueerkop <ralf.dueerkop@m-net.de>

EXPOSE 8080

ADD webServer.groovy /opt/webserver/webServer.groovy
ADD scripts/simpleGroovlet.groovy /opt/webserver/scripts/simpleGroovlet.groovy
ADD run.sh /opt/webserver/run.sh

VOLUME ["/logs"]

