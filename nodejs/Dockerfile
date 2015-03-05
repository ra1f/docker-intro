##########################################################################################
# Dockerfile to install nodejs runtime and its dependencies
##########################################################################################
FROM centos:centos7

##########################################################################################
# In case you sit behind a firewall uncomment this and provide the proxy server
#ENV PROXY_BASE="<proxyname>:<proxyport>"
#ENV https_proxy https://$PROXY_BASE
#ENV http_proxy https://$PROXY_BASE

MAINTAINER Ralf Düerkop <ralf.dueerkop@m-net.de>

# Install EPEL for Node.js
RUN yum install -y epel-release

# Install npm
RUN yum install -y npm

# Install app dependencies
ADD package.json /opt/webserver/package.json

##########################################################################################
# In case you sit behind a firewall uncomment this
#RUN npm config set https-proxy http://$PROXY_BASE

RUN cd /opt/webserver; npm install