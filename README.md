running mvn compile in the server folder will create/update the swaggerdemoapi folder.

the swaggerdemoapi folder is the api.  running mvn install on this will install the jar in your maven repo.

you should now be able to run the swagger demo server.

now run the demo client and hit http://localhost:8080/hello