# hello-finagle-maven

A simple Finagle hello world project using maven and java for saying "hi" with Apache Thrift.

# Why ?

Today's microservices are a big challenge and Finagle is a key tool in help and support of this.
Finagle is the fundation to do clean, resilent, solid and fast calls between microservices.

Finagle is done with Scala and normally is used with SBT as a build tool but most projects
out there use a lot of Maven and are done with Java so they normally use Netflix's Hystrix
as a good foundation but Finagle has a lot of good and valuable things to offer to the
Java and Maven ecosystem. Here the beginning ...

# Compile

Just go to the project root and run "mvn clean package"

# Usage

Go to the project root and run the server with the command "java -jar hello-service/target/hello-service-*.jar"

Also at the project root run the client with the command "java -jar hello-client/target/hello-client-*.jar"

# References

* Parsing Apache Thrift with Scrooge plugin for Maven at https://twitter.github.io/scrooge/MVNPlugin.html
* Adding Scala to Maven sample at https://github.com/scala/scala-module-dependency-sample/tree/master/maven-sample
* Jar repackaging for easy run with Spring Boot at https://docs.spring.io/spring-boot/docs/current/maven-plugin/repackage-mojo.html
* Apache Thrift at https://thrift.apache.org/ and https://thrift.apache.org/docs/idl
* And of course, more info about Finagle at https://twitter.github.io/finagle/