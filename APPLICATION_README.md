# Activity Tracker

[Deployed Front End](http://seca-activity-tracker.s3-website-us-east-1.amazonaws.com/) | [React Client Repo](https://github.com/sjciasullo/activity-tracker-react-client) \
Deployed back-end is off | [API Repo](https://github.com/sjciasullo/activity-tracker-api)

* Application successfully deployed but API is turned off to preserve cost
* Front and Back require SSL certificates to use Google API
* Full Stack CRUD functions locally

# Client

### Problem Statement
- Has a monolithic API to track some activities that a user enters. The client needs to handle some improvements with the API as well as the UI to allow for activities to have specific dates for activities and render that data. Long term, the client would like to be able to create a web application and include user authentication and testing.

### Solution
- convert monolithic API to microservices structure
- Revamp User interface

# Technological Concerns

#### Debate Resources
- [Netflix Microservices example](https://medium.com/netflix-techblog/embracing-the-differences-inside-the-netflix-api-redesign-15fd8b3dc49d)
- [Microservices general info](http://microservices.io/patterns/apigateway.html)
- [Microservices and joins debate](https://stackoverflow.com/questions/29761872/microservices-and-database-joins)
- [Many-to-many associations with microservices](https://softwareengineering.stackexchange.com/questions/361975/many-to-many-associations-in-microservices)

#### Monolith
  - greater simplicity in data relationships, easier to setup and create
  - small startup does not have scalability concerns

#### Microservices
  - separation of concerns for future testing, authentication and business logic
  - solve the problem of handling data formatting for visuals
  - future development of Mobile App would use a different subset of services
  - Challenges
    - complexity and moving parts would increase
    - how is user's data encapsulated? Is auth service really separated from activitiesApi service? How is the data related? Does the data have a userId or is it linked using a syntax for the API URI as the real practice would be to not have linked primary keys across services?

### API Data management
  - change data type of column
  - separate out columns to different tables 
    - category
    - location

### UX concerns
  - cleaner interface components, integrate Material UI
  - Routing
    - Landing page is login / create user
    - Dashboard for user shows cumulative growth barth chart and some stats?
    - single activity view has 
  - make sure data persists in date order

# To-Do Features
1. ~~Migration for date type~~ 
2. handle front end for date
    - ~~input~~
    - filter
3. ~~change monolith to microservice~~
4. add security to api-gateway
5. ~~put cors onto api-gateway rather than controllers~~
4. add react router to front end
    - welcome page
    - dashboard page
    - single activity ends up being the view that we currently have from client
5. deploy on aws
6. branch for kubernetes
7. show growth in front end or integrate materials UI

# Long-term Improvements
  - create testing service
  - handle data formatting in a separate service (Node server?)
  - integrate Materials UI
  - Create React Native client
  - add redux to client
  - fix double google maps import