##########################################################################################
# Dockerfile to install nodejs runtime and its dependencies
##########################################################################################
FROM centos:centos7

MAINTAINER Ralf Düerkop <ralf.dueerkop@m-net.de>

##########################################################################################
# In case you sit behind a firewall uncomment this and provide the proxy server
#ENV PROXY_BASE="<host>:<port>"
#ENV HTTPS_PROXY https://$PROXY_BASE
#ENV https_proxy https://$PROXY_BASE
#ENV HTTP_PROXY https://$PROXY_BASE
#ENV http_proxy https://$PROXY_BASE

# Enable EPEL for Node.js
#RUN rpm -Uvh http://download.fedoraproject.org/pub/epel/6/i386/epel-release-6-8.noarch.rpm
RUN yum install -y epel-release

# Install Node.js and npm
RUN yum install -y npm


# Install app dependencies
ADD package.json /opt/njs_webserver/package.json
RUN cd /opt/njs_webserver; npm install