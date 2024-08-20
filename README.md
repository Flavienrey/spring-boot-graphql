# Spring Boot and GraphQL

This repo contains:

- Spring Boot and Graphql
- Frontend With React, Next.js and TailwindCSS

## How to query

Run the Java Application

Then go to the following link :

- <http://localhost:8080/graphiql?path=/graphql>

Finally, query using the graphql syntax:

'{
  bookById(id: 1) {
    id
    name
    pageCount
    author {
      id
      name
    }
  }
}'

---
