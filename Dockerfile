FROM frolvlad/alpine-oraclejdk8:slim
MAINTAINER Frank Belter
ADD target/mobile-remote-control-demo-0.0.1.jar app.jar
RUN sh -c 'touch /app.jar'
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
