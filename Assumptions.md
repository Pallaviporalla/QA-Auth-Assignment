Assumptions



1.Environment Setup

* The application is available and the Registration, Login, and Dashboard pages are accessible for testing.



2.JWT Authentication

* A JWT token is generated after a successful login and is required to access the Dashboard. Without a valid JWT token, the user is redirected to the Login page.



3.Token Expiration

* The JWT token is valid until it expires. After it expires, the user must log in again to access the application.



4. Validation Rules

   * The application validates all required fields, email format, password rules, and duplicate email addresses before allowing registration or login.



5. Application Behaviour

   * The application returns the expected HTTP status codes and validation messages for both successful and unsuccessful requests.

