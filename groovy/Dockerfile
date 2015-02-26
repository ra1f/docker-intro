# Dockerfile for groovy
# Version 1.0
FROM ra1f/docker_intro_jdk

MAINTAINER Ralf Düerkop <ralf.dueerkop@m-net.de>

#ENV PROXY_BASE="<host>:<port>"
#ENV HTTPS_PROXY https://$PROXY_BASE
#ENV https_proxy https://$PROXY_BASE
#ENV HTTP_PROXY https://$PROXY_BASE
#ENV http_proxy https://$PROXY_BASE

# Install Groovy 
RUN curl -s get.gvmtool.net | bash
RUN ["/bin/bash", "-c", "source $HOME/.gvm/bin/gvm-init.sh"]
RUN ["/bin/bash", "-c", "-l", "gvm install groovy"]

# Set environment path for Groovy
ENV GROOVY_HOME $HOME/.gvm/groovy/current
ENV PATH $GROOVY_HOME/bin:$PATH

