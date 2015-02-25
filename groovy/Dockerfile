# Dockerfile for groovy
# Version 1.0
# FROM dockerbase/devbase-gvm
FROM ubuntu:14.04

MAINTAINER Ralf Düerkop <ralf.dueerkop@m-net.de>

RUN rm /bin/sh && ln -s /bin/bash /bin/sh
RUN apt-get update && apt-get install -y openjdk-7-jdk
RUN apt-get install -y --no-install-recommends unzip
RUN apt-get install -y --no-install-recommends curl
RUN apt-get clean
RUN curl -s get.gvmtool.net | bash
RUN ["/bin/bash", "-c", "source $HOME/.gvm/bin/gvm-init.sh"]
RUN ["/bin/bash", "-c", "-l", "gvm install groovy"]

