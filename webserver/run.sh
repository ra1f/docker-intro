#!/bin/bash

LOGDIR=$1
MY_IP=$(ip addr show dev eth0 scope global | grep inet | awk -F'[/ ]' '{print $6}')

/opt/webserver/webServer.groovy 2> $LOGDIR/${MY_IP}.log

