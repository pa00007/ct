# ct

Run the system by typing from the folder containing this README file

Windows - gradlew bootRun

Linux or Mac - ./gradlew bootRun

Test by using versions of the following URL from a browser

http://localhost:8080/customer/{id}/generateGreeting?greeting={greetingText}

id is an integer

greetingText is a string.

The greeting parameter is optional in which case the default "Welcome" is used

e.g.
http://localhost:8080/customer/2/generateGreeting?greeting=Yo