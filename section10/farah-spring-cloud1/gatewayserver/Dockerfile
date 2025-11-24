# Start with a base image containing Java runtime
FROM eclipse-temurin:21-jdk

# Information about the maintainer
LABEL "org.opencontainers.image.authors"="farah.com"

# Add the application's jar to the image
COPY target/gatewayserver-0.0.1-SNAPSHOT.jar gatewayserver-0.0.1-SNAPSHOT.jar

# Execute the application
ENTRYPOINT ["java", "-jar", "gatewayserver-0.0.1-SNAPSHOT.jar"]
