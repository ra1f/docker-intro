if (!session) {
  session = request.getSession(true);
  you = request.getRemoteHost()
  me = java.net.InetAddress.getLocalHost().getHostAddress()
}
 
if (!session.counter) {
  session.counter = 1
}
 
html.html {
  head {
    title "Hello ${you}"
  }
  body {
    h1 "That's ${me}"
    p "The current time at this server is ${new Date()}"
    p "The session counter is now at ${session.counter}"
  }
}
 
session.counter += 1