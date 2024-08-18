# Stage 1. Build
FROM azul/zulu-openjdk:21-latest as build

ARG VERSION

COPY build/libs/test-server-spring-$VERSION.jar /app/test-server-spring.jar

# Stage 2. Runtime (JRE is more lightweight than JDK)
FROM azul/zulu-openjdk:21-jre-latest as runtime

# default environment variables
ENV LOG_HOME=./logs
ENV SERVER_PORT=8900
ENV SPRING_PROFILES_ACTIVE=local

# copy the jar file from the build stage
COPY --from=build /app/test-server-spring.jar /app/test-server-spring.jar

EXPOSE ${SERVER_PORT}

ENTRYPOINT ["java", "-jar", "/app/test-server-spring.jar"]