RCP Demo
========

An RCP demo application.

The application's featuers are separated into modules which each contain:
* API - the contract for remote communication between server and client
* Server - the server implementation
* Client - the RCP implementation


Project Structure
-----------------

* Common - contains libraries that are for both the client and the server.
  * Misc 1
* Module 1 - a demo feature
  * API
  * Server
  * Client
    * Feature - The API and Client implementation are packaged in an Eclipse feature.
* Server - currently only a WAR aggregating all modules' server components.
* Client - a vanilla RCP application.
  * Feature - the client feature that contains only the application itself, not the modules.
  * Product - aggregates the client feature and the module features.
