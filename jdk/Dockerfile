# Dockerfile for groovy
# Version 1.0
FROM ubuntu:14.04

MAINTAINER Ralf Düerkop <ralf.dueerkop@m-net.de>

#ENV PROXY_BASE="<host>:<port>"
#ENV HTTPS_PROXY https://$PROXY_BASE
#ENV https_proxy https://$PROXY_BASE
#ENV HTTP_PROXY https://$PROXY_BASE
#ENV http_proxy https://$PROXY_BASE

# Install JDK, unzip, curl
RUN apt-get update && apt-get install -y --no-install-recommends openjdk-7-jdk unzip curl
RUN apt-get clean