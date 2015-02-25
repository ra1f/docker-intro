# Dockerfile for groovy
# Version 1.0
FROM ubuntu:14.04

MAINTAINER Ralf Düerkop <ralf.dueerkop@m-net.de>

# Install JDK, unzip, curl
RUN apt-get update && apt-get install -y openjdk-7-jdk
RUN apt-get install -y --no-install-recommends unzip
RUN apt-get install -y --no-install-recommends curl
RUN apt-get clean

# Install Groovy 
RUN curl -s get.gvmtool.net | bash
RUN ["/bin/bash", "-c", "source $HOME/.gvm/bin/gvm-init.sh"]
RUN ["/bin/bash", "-c", "-l", "gvm install groovy"]

# Set environment path for Groovy
ENV GROOVY_HOME $HOME/.gvm/groovy/current
ENV PATH $GROOVY_HOME/bin:$PATH

