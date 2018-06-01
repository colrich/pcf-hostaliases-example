# pcf-hostaliases-example
How to use - 
* mvn package
* cf push
* visit "your-app-url.yourappsdomain.com/privatesite" in your browser

How it works - 
the HOSTALIASES environment variable is set in the manifest; it points to the hosts file in the src/main/resources/ directory, which will end up at the path /app/BOOT-INF/classes directory inside the container on Cloud Foundry.

