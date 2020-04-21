# Configure in the application.properties

```
keycloak.realm = keycloak-demo //realm name configured in keycloak
keycloak.auth-server-url = //keycloak server url
keycloak.resource = //keycloak client id
keycloak.principal-attribute=preferred_username
keycloak.public-client=true //use if the client is set to public access
keycloak.credentials.secret= //use if the client is set to confidential access (provide secret key) 

keycloak.bearer-only=false //set to true if you want stateless auth (e.g. securing REST endpoints) using bearer token

spring.main.allow-bean-definition-overriding=true
server.port=8080
```


# Build & Run
`mvn clean spring-boot:run`
