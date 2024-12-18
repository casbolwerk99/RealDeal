# Real Deal

## Run the project

You can run by using the command `.mvnw spring-boot:run` in the root folder.

## Run the dev database

You can run the dev database by using the command `docker-compose up` in the root folder.
Then you can login to PgAdmin and create a new server with the credentials from the docker-compose file.

## HTTP request examples

Format is as follows

REQUEST_TYPE URL  
JSON BODY

### Create user

POST http://localhost:8090/users

```
{
"name": "Sam Al-Habash",
"email": "samsuckspp@hotmail.nl",
"products": [
{
"name": "Product A",
"price": 19.99
},
{
"name": "Product B",
"price": 29.99
}
]
}
```

It will create the user and subsequent products

### Create product

POST http://localhost:8090/products

```
{
    "name": "Socks",
    "price": 19.99,
    "userId": 7
}
```

Where userId refers to an existing user

## Development

This project uses [Project Lombok](https://projectlombok.org/). Please install the appropriate plugin for your code editor.
