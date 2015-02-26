#!/bin/bash

LOGDIR=$1
MY_IP=$(ip addr show dev eth0 scope global | grep inet | awk -F'[/ ]' '{print $6}')

cd /opt/webserver/

$HOME/.gvm/groovy/current/bin/groovy webServer.groovy 2> $LOGDIR/${MY_IP}.log

