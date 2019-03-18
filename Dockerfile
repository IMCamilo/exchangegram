FROM java:8-jre-alpine

ADD /build/libs/wlx-challenge-0.0.1-SNAPSHOT.jar /usr/local/wlx-app.jar

CMD ["java", "-jar", "/usr/local/wlx-app.jar"]