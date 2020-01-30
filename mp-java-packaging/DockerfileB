# Multistage Docker build. 
# Stage 1: Build custom Java 11 JRE and put it in /var/tmp/myjre 
FROM openjdk:11-slim AS myjre
RUN ["jlink", "--compress=2", "--strip-debug", "--no-header-files", \
     "--add-modules", \
     "java.base,java.logging,java.sql,java.desktop,java.management,java.naming,jdk.unsupported", \
     "--output", "/var/tmp/myjre"]

# Work around for https://github.com/docker-library/openjdk/issues/217 
RUN [ "apt", "update"]
RUN [ "apt-get", "install", "-y", "binutils"]
RUN ["strip", "-p", "--strip-unneeded", "/var/tmp/myjre/lib/server/libjvm.so"]
# End work-around

# Stage 2: Build application image using JRE from Stage 1 
FROM debian:sid-slim 
COPY --from=myjre /var/tmp/myjre /opt/jre 
ENV PATH=$PATH:/opt/jre/bin

RUN mkdir /app
COPY libs /app/libs
COPY ${project.artifactId}.jar /app

CMD ["java", "-jar", "/app/${project.artifactId}.jar"]
