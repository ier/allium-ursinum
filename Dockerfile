FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/allium-ursinum.jar /allium-ursinum/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/allium-ursinum/app.jar"]
