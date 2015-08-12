# -*- mode: ruby -*-
# vi: set ft=ruby :
Vagrant.require_version ">= 1.7.3"

BOX_NAME = "docker-intro"
#PROXY_NAME = "<proxyname>:<proxyport>"

Vagrant.configure("2") do |config|
  config.vm.box = "ubuntu/trusty64"

  config.ssh.shell = "bash -c 'BASH_ENV=/etc/profile exec bash'"

  config.vm.define BOX_NAME do |t| end

  config.vm.hostname = "#{BOX_NAME}.localdomain"
  config.vm.provider :virtualbox do |vbox|
    vbox.name = BOX_NAME
    vbox.memory = 1024
  end
  
  ########################################################################################
  # In case you sit behind a firewall uncomment this and provide the proxy server (see above)
  #config.proxy.http     = "http://#{PROXY_NAME}"
  #config.proxy.https    = "https://#{PROXY_NAME}"
  #config.proxy.no_proxy = "localhost,127.0.0.1,/var/run/docker.sock"

  config.vm.provision :shell, :inline => "apt-get update"
  config.vm.provision :shell, :inline => "mkdir -p /var/lib/cloud/instance; touch /var/lib/cloud/instance/locale-check.skip"
  config.vm.provision :shell, :inline => "curl -sSL https://get.docker.com/ubuntu/ | sudo sh"
  config.vm.provision "docker", version: "1.7.1"
end

