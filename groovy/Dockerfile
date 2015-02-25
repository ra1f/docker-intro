# Dockerfile for groovy
# Version 1.0
FROM ubuntu:14.04

MAINTAINER Ralf Dueerkop <ralf.dueerkop@m-net.de>

ENV PROXY_BASE="mnetwebproxy01.m-net.de:3128"
ENV HTTPS_PROXY https://$PROXY_BASE
ENV https_proxy https://$PROXY_BASE
ENV HTTP_PROXY https://$PROXY_BASE
ENV http_proxy https://$PROXY_BASE

# Install JDK, unzip, curl
RUN apt-get update && apt-get install -y --no-install-recommends openjdk-7-jdk unzip curl
RUN apt-get clean

# Install Groovy 
RUN curl -s get.gvmtool.net | bash
RUN ["/bin/bash", "-c", "source $HOME/.gvm/bin/gvm-init.sh"]
RUN ["/bin/bash", "-c", "-l", "gvm install groovy"]

# Set environment path for Groovy
ENV GROOVY_HOME $HOME/.gvm/groovy/current
ENV PATH $GROOVY_HOME/bin:$PATH

