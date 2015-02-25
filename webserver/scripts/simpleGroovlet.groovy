import java.net.InetAddress

if (!session) {
  session = request.getSession(true);
}
 
if (!session.counter) {
      session.counter = 1
}
 
html.html {
  head {
    title 'Hello ${request.getRemoteAddr()}'
  }
  body {
    h1 'Welcome to my Groovlet'
    p "I am ${InetAddress.getLocalHost().getHostAddress()}"
    p "The current time at this server is ${new Date()}"
    p "The session counter is now at ${session.counter}"
    br()
    p "System properties:"
    ul {
      for (prop in System.properties.keySet()) {
        li "$prop: ${System.getProperty(prop)}"
      }
    }
  }
}
 
session.counter += 1