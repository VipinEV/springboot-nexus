FROM adoptopenjdk/openjdk11:latest

VOLUME /tmp

ARG VERSION

ADD target/service.jar /etc/app/service.jar

EXPOSE 8080 8080

RUN echo '#!/bin/sh' > ./entrypoint.sh \
 && echo 'exec java -jar /etc/app/service.jar' >> ./entrypoint.sh

RUN chmod +x ./entrypoint.sh

ENTRYPOINT ["./entrypoint.sh"]