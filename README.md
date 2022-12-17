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


findDogBreeds
{
    "query":"{findAllDogs { id breed } }"
}
which returns:

{
    "data": {
        "findAllDogs": [
            {
                "id": "1",
                "breed": "Pomeranian"
            },
            {
                "id": "2",
                "breed": "Pit Bull"
            },
            {
                "id": "3",
                "breed": "Cocker Spaniel"
            },
            {
                "id": "4",
                "breed": "Direwolf"
            },
            {
                "id": "5",
                "breed": "Husky"
            }
        ]
    }
}
findDogBreedById
{
    "query":"{findAllDogs { id breed } }"
}
which returns:

{
    "data": {
        "findDogById": {
            "id": "1",
            "breed": "Pomeranian"
        }
    }
}
You should also try out an invalid ID with this to check your error handling. As part of the returned JSON, I got Exception while fetching data (/findDogById) : Dog Not Found.

findAllDogNames
{
    "query":"{findAllDogs { id name } }"
}
which returns:

{
    "data": {
        "findAllDogs": [
            {
                "id": "1",
                "name": "Fluffy"
            },
            {
                "id": "2",
                "name": "Spot"
            },
            {
                "id": "3",
                "name": "Ginger"
            },
            {
                "id": "4",
                "name": "Lady"
            },
            {
                "id": "5",
                "name": "Sasha"
            }
        ]
    }
}
Mutations
Let's say we want to change the name of dog four to "Ghost". There's a slightly different syntax, that needs mutation included in the query as well. Also, make sure to use the escape character \ to include quotation marks for strings.

updateDogName
{
    "query":"mutation {updateDogName(newName:\"Ghost\", id:4) { id name breed } }"
}
which returns:

{
    "data": {
        "updateDogName": {
            "id": "4",
            "name": "Ghost",
            "breed": "Direwolf"
        }
    }
}
Make sure to test out an invalid ID here too!

deleteDogBreed
For this, you do not need to add the field specifications afterward.

{
    "query":"mutation {deleteDogBreed(breed:\"Pomeranian\")}"
}
which returns:

{
    "data": {
        "deleteDogBreed": true
    }
}



