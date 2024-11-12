FROM openjdk:17
VOLUME /tmp
EXPOSE 8090
ADD ./target/ms-products-intk-0.2.jar ms-products-intk-0.2.jar
ENTRYPOINT ["java", "-jar", "/ms-products-intk-0.2.jar"]