##########################################################################################
# Dockerfile to start a nodejs server
##########################################################################################
FROM ra1f/docker_intro_nodejs

MAINTAINER Ralf Düerkop <ralf.dueerkop@m-net.de>

COPY . /opt/njs_webserver

EXPOSE 8080

VOLUME ["/logs"]

#CMD ["/opt/njs_webserver/run.sh", "/logs"]