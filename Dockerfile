FROM bellsoft/liberica-openjdk-centos:13
ADD ./target/micrometer-example-*.jar /root/app.jar
CMD ["bash"]
