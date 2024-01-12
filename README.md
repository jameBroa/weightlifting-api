# A Weightlifting API coded using Spring Boot

This Weightlifting API can be used to retrieve competition lifts from the Olympic Weightlifting during the Olympics in 2012.

## Data retrievable
- rank (result in competition) | Integer
- athlete name and country | String
- group | String
- bodyweight | Double
- snatch attempts 1-3 | Integer
- best successful snatch lift | Integer
- cj attempts 1-3 | Integer
- best successful cj attempt | Integer
- total | Integer
- weight category | String
- snatch % to cj | String
- snatch % to bw | String
- cj % to bw | String

Notes:
Any instance when an athlete decides to not attempt a lift, it has been reset to 0.

### API Functionality
- Get all Athletes
- Get all Athletes by category
- Get all Athletes by Group and Category
- Get all Athletes by rank across all categories
![homepage](https://github.com/jameBroa/weightlifting-api/assets/117519294/9d0546dc-41f7-4177-8eb3-74185de56e12)
![all](https://github.com/jameBroa/weightlifting-api/assets/117519294/2ee6da23-3f6d-4073-89c0-aee1de1f130c)


# Notes on technology used

Frontend: Basic HTML & CSS
Backend: Java Spring Boot and MongoDB

In order to setup connection with MongoDB, connection to a MongoDB cluster with a database named 'oly-lifts-2012' with a collection 'lifts' is necessary.

A .env file should be placed in /src/main/resources which contains sensitive information establishing connection to MongoDB. An example .env file is placed in this repo.

A .csv file is included which is cleaned. The .csv file is created from a publicly available spreadsheet found at: https://docs.google.com/spreadsheets/d/1zh7tsZXB-akd9eexTnZg-EeFoKQJ6h4mvvfszR-YTO0/edit#gid=2






