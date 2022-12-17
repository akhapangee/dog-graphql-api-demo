#Tools for testing
* graphiql
* postman

# Check schema from url
http://localhost:8080/graphql/schema.json

# Install graphiql
brew install --cask graphiql

#Access GraphiQL on postman and test with JSON
http://localhost:8080/graphiql
{
"query": "{findAllDogs{id name breed origin}}"
}


#Query example test in GragphiQL

query{

    findAllDogs{id name breed origin}
}

{

    findDogById(id: 5) {
    id
    name
    }
}

# Mutation GraphQL example
mutation{

    deleteDogBreed(breed:"Pomeranian")
}

mutation{

    updateDogName(newName:"Akhilesh" id:3) {
        id
        name
        breed
        origin
        }
}


