FROM adoptopenjdk/openjdk15:x86_64-ubuntu-jdk-15.0.2_7-slim

RUN curl -L -o sbt.deb http://dl.bintray.com/sbt/debian/sbt-1.4.7.deb && \
    dpkg -i sbt.deb && \
    apt-get update && \
    apt-get upgrade -y && \
    apt-get install -y git unzip wget libvips-tools && \
    apt-get clean -y && \
    apt-get autoremove --purge -y
