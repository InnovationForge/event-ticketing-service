# Event Ticketing Service (ETS)
ETS is a REST API ticketing platform service that allows people to buy tickets for various events such as concerts, sports games, theater shows, and more. Here's how Ticketmaster typically works:

## ETS - How it works
* Event Listing: Event organizers or venues partner with Ticketmaster to list their events on the platform. These events are displayed on the Ticketmaster website or mobile app, along with relevant details like date, time, venue, seating chart, and ticket prices. 
* Ticket Selection: Users visit the Ticketmaster website or app and search for the event they are interested in attending. They can browse through the available ticket options, which may include different seating sections, price ranges, and ticket types (e.g., general admission, VIP, etc.). 
* Seat Selection: Once the user selects an event and ticket type, they are usually presented with a seating chart for the venue. They can visually see the layout of the seats and choose their preferred seating location based on availability. In some cases, events may have assigned seating, while others may have general admission, where seats are not pre-assigned. 
* Ticket Quantity and Payment: After selecting the seats, users specify the number of tickets they want to purchase. They proceed to the payment section, where they enter their payment details, such as credit card information or use alternative payment methods like digital wallets. The total cost of the tickets, along with any additional fees or taxes, is displayed before completing the transaction. 
* Delivery Method: Ticketmaster offers various delivery options, which can include electronic tickets (e-tickets) that are emailed or sent to a mobile app, physical tickets that are shipped to the customer's address, or sometimes ticket pickup at the venue's box office. The available delivery methods depend on the event and the organizer's preferences. 
* Account Creation: During the ticket purchase process, users may be required to create a Ticketmaster account. This account allows them to manage their tickets, access event information, receive notifications, and potentially transfer or sell tickets if permitted. 
* Confirmation and Ticket Access: After completing the purchase, users receive a confirmation email or ticket confirmation within their Ticketmaster account. The confirmation typically includes details such as the event name, date, time, venue, seat location, and any instructions or restrictions related to the event. 
* Event Attendance: On the day of the event, attendees usually present their tickets in the chosen format (e-ticket, physical ticket, etc.) at the venue's entrance for verification. The venue staff scans the tickets or validates them using specific procedures to ensure their authenticity, and the attendees are granted entry to enjoy the event.

## ETS - Modular Structure of the application
* **Core Module**: This module will contain the core domain model and business logic of your application. It should be independent of any specific frameworks or technologies. The functionality may include:
  1. Event: Define the Event class with properties such as event ID, name, date, venue, and ticket details. 
  2. Ticket: Define the Ticket class with properties like ticket ID, seat number, ticket type, and price. 
  3. EventService: Implement the business logic for managing events, such as creating events, retrieving event details, and managing ticket availability. 

* **Persistence Module**: This module focuses on data storage and access. You can use a relational database or any other persistence mechanism. Some of the functionality may include:
  1. EventRepository**: Define an interface or class responsible for data access operations related to events, such as saving events, retrieving events by ID, etc. 
  2. TicketRepository: Define an interface or class for managing tickets' data, including CRUD operations. 
  3. Database Configuration: Set up the database connection and configuration, including the necessary dependencies. 
* **API Module**: This module handles the RESTful API endpoints and interactions with the client. Here's an overview of the functionality:
  1. EventController: Implement the REST API endpoints for creating events, retrieving event details, and managing ticket availability. Use Spring's @RestController and appropriate annotations to handle requests and responses.
  2. DTOs (Data Transfer Objects): Create DTO classes to define the structure of data transferred between the client and server. For example, EventDTO can be used to receive event creation requests or send event details in response.
  3. API Documentation: Use Swagger or Springfox libraries to generate API documentation, making it easier for others to understand and use your API.
* **Security Module**: This module focuses on authentication and authorization if required. It can include:
  1. User entity: Define a user model with properties like username, password, roles, etc.
  2. UserService: Implement user-related operations like user registration, authentication, and authorization.
  3. Security Configuration: Configure Spring Security to handle authentication and authorization based on roles or permissions. 
* **Integration Module (Optional)**: This module can be used to integrate with external services or APIs. For example, if you want to provide payment processing or integrate with a notification service, you can define appropriate classes and interfaces here.

## Event Management
1. **GET /events**: Retrieves a list of all events.
   * Fetches a list of all events available in the system.
   * May support pagination and filtering options for better retrieval control.
2. **POST /events**: Creates a new event.
   * Accepts the necessary data to create a new event, such as event name, date, venue, and ticket details.
   * Performs validation and saves the new event to the database.
3. **GET /events/{eventId}**: Retrieves a specific event by its ID.
   * Retrieves the details of a specific event based on the provided event ID.
4. **PUT /events/{eventId}**: Updates an existing event.
   * Accepts updated event data for a specific event identified by its ID.
   * Validates the data and updates the event's information in the database.
5. **DELETE /events/{eventId}**: Deletes an event.
   * Deletes a specific event based on the provided event ID.
   * Removes the event and associated data from the database.
## Ticket Management
1. **GET /events/{eventId}/tickets** : Retrieves a list of tickets for a specific event.
   * Fetches a list of all tickets available for a specific event based on the provided event ID.
   * May support pagination and filtering options for better retrieval control.
2. **POST /events/{eventId}/tickets**: Creates a new ticket for a specific event.
   * Accepts ticket data, such as seat number, ticket type, and price, to create a new ticket for a specific event.
   * Validates the data, checks for ticket availability, and saves the ticket information to the database.
3. **GET /events/{eventId}/tickets/{ticketId}**: Retrieves a specific ticket for a specific event.
   * Retrieves the details of a specific ticket for a specific event based on the provided ticket ID and event ID.
4. **PUT /events/{eventId}/tickets/{ticketId}**: Updates an existing ticket for a specific event.
   * Accepts updated ticket data for a specific ticket identified by its ID and event ID.
   * Validates the data and updates the ticket information in the database.
5. **DELETE /events/{eventId}/tickets/{ticketId}**: Deletes a ticket for a specific event.
   * Deletes a specific ticket based on the provided ticket ID and event ID.
   * Removes the ticket information from the database.
## User Management
Endpoints for user authentication and user-related operations like registration and login typically involve working with the **users** resource. Here's an example of how these endpoints might look:

* User Registration:
   * **POST /users/register**: Creates a new user account. 
   * Accepts user registration data such as username, email, password, etc. 
   * Validates the data and creates a new user account in the system. 
   * May generate a verification email or perform other account verification processes if required. 
* User Login:
  * **POST /users/login**: Authenticates a user and generates an access token. 
  * Accepts user login credentials, such as username/email and password. 
  * Validates the credentials and generates an access token upon successful authentication. 
  * The access token can be used for subsequent authenticated requests.
* User Profile:
  * **GET /users/profile**: Retrieves the profile information of the authenticated user. 
  * Requires the inclusion of an access token in the request header for authentication. 
  * Retrieves and returns the user's profile information, such as username, email, etc.
* User Update:
  * **PUT /users/profile**: Updates the profile information of the authenticated user. 
  * Requires the inclusion of an access token in the request header for authentication. 
  * Accepts updated user profile data, such as username, email, etc. 
  * Validates the data and updates the user's profile information in the system.
* User Password Reset:
  * **POST /users/reset-password**: Initiates the process for resetting a user's password. 
  * Accepts the user's email or username as input. 
  * Generates a password reset token and sends it to the user's registered email. 
  * The token is used to verify the user's identity during the password reset process.
* User Password Update:
  * **PUT /users/reset-password**: Updates the user's password after password reset. 
  * Accepts the reset password token and the new password. 
  * Validates the token and updates the user's password in the system.

## Technologies
* [Spring-boot v3 (Java 17 & Jakarta EE 9)](https://start.spring.io/)
* [springdoc-openapi v2.1.0](https://springdoc.org/v2/)
* 

