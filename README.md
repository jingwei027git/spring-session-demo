# spring-session-demo

## Prepare environment

### mysql

docker pull mysql/mysql-server

docker run -p 33060:3306 --name docker-mysql -e MYSQL_ROOT_PASSWORD=!XXXXXXXXXXX3 -d mysql

connect mysql and create new schema [demo-spring-session] with collation [utf8mb4_generic_ci]

### redis

docker pull redis

docker run -p 63790:6379 --name docker-redis -d redis

### Spring Boot

launch SpringSessionApplication.main()

### Testing page

http://localhost:8080 (login page)

http://localhost:8080/security/currentUser (view current login user) (anonymousUser - not login)

Login account for testing ::

softpower / 11111
eddie / 12345
david / 13579
chad / 2468a
