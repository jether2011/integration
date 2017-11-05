# Integration
The little example with little integration.

I did this little example with some integration between Heroku to run the validation CPF with Stella (thanks Caelum) API and an Ionic client to consume the API with post one CPF and validate if that is correct or no.

In this example I used:
- Spring Boot to make the endpoint (You can start your project here: https://start.spring.io/);
- Spring Security to do the security on consume of the endpoint;
- Spring Data to insert in data base the request executed in consume of the endpoint;
- I defined profile to make more easy to execute this example with DBMS the user want;
- Some good pratice like Strategy and Singleton pattern and good pratice to make the code clean;
- Swagger to documentation the endpoint;
- Test with JUnit and mock;

I used:
- Heroku integrated with Github repository of the API project to build and publish the application;
- PostgreSQL integrated on Heroku;
- Simple mobile Ionic app to make one client to test the API to validate the CPF (you can run the Ionic app localhost or generate the IOs or Android build application);

To test with POSTMAN (extension and app with test API):

@POST
- https://integration-apps.herokuapp.com/api/v1/client
```
{
  "name" : "name",
  "email" : "email",
  "cpf"  : "cpf"
}
```

@GET
- https://integration-apps.herokuapp.com/api/v1/client
- https://integration-apps.herokuapp.com/api/v1/client/cpf/{some-cpf-to-find-someone}

I just wanna help some developer if need the real example to create something.
