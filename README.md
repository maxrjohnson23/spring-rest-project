# Spring REST Project 
## Simple REST service using Spring Boot

## Run
 *  `mvn spring-boot:run`

## Sample POST


 	{
 	  "name": "John Doe",
 	  "company": "",
 	  "favorite": false,
 	  "smallImageURL": "https://s3.amazonaws.com/test/images/img1_small.jpeg",
 	  "largeImageURL": "https://s3.amazonaws.com/test/images/img1_large.jpeg",
 	  "email": "john@doe.com",
 	  "website": "http://www.johndoe.com",
 	  "birthdate": "631152000",
 	  "phone": {
 		  "work": "123-456-7890",
 		  "home": "123-654-8709",
 		  "mobile": "123-432-0011"
 	  },
 	  "address": {
  		"street": "123 Wacker Drive", 
 	  	"city": "Chicago",
 		  "state": "IL",
 		  "country": "US",
 		  "zip": "60600",
 		  "latitude": 40.8781,
 		  "longitude": -87.6298
 	}