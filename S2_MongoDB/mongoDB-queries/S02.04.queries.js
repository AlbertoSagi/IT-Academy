const {
    isDoWhileStatement
} = require("@babel/types")

//1.Escriu una consulta per mostrar tots els documents en la col·lecció Restaurants
db.restaurant.find().pretty()

//2. Escriu una consulta per mostrar el restaurant_id, name, borough i cuisine per tots els documents en la col·lecció Restaurants
db.restaurant.find({}, {
    restaurant_id: 1,
    name: 1,
    borough: 1,
    cuisine: 1
}).pretty()

//3. Escriu una consulta per mostrar el restaurant_id, name, borough i cuisine, però excloure el camp _id per tots els documents en la col·lecció Restaurants
db.restaurant.find({}, {
    restaurant_id: 1,
    name: 1,
    borough: 1,
    cuisine: 1,
    _id: 0
}).pretty()

//4. Escriu una consulta per mostrar restaurant_id, name, borough i zip code, però excloure el camp _id per tots els documents en la col·lecció Restaurants
db.restaurant.find({}, {
    restaurant_id: 1,
    name: 1,
    borough: 1,
    "address.zipcode": 1,
    _id: 0
}).pretty()

//5. Escriu una consulta per mostrar tot els restaurants que estan en el Bronx
db.restaurant.find({
    borough: "Bronx"
}).pretty()

//6.Escriu una consulta per mostrar els primers 5 restaurants que estan en el Bronx
db.restaurant.find({
    borough: "Bronx"
}).limit(5).pretty()

//7. Escriu una consulta per mostrar el pròxim 5 restaurants després de saltar els primers 5 del Bronx
db.restaurant.find({
    borough: "Bronx"
}).skip(5).limit(5).pretty()

//8. Escriu una consulta per trobar els restaurants que tenen un score de més de 90
db.restaurant.find({
    "grades.score": {
        $gt: 90
    }
}).pretty()

//9. Escriu una consulta per trobar els restaurants que tenen un score de més que 80 però menys que 100
db.restaurant.find({
    "grades.score": {
        $gt: 80,
        $lt: 100
    }
}).pretty()

//10. Escriu una consulta per trobar els restaurants quins localitzen en valor de latitud menys que -95.754168
db.restaurant.find({
    "address.coord": {
        $lt: -92.754168
    }
}).pretty()

//11. Escriu una consulta de MongoDB per a trobar els restaurants que no preparen cap cuisine de 'American' i el seu puntaje de qualificació superior a 70 i latitud inferior a -65.754168

//No me funciona el $ne:"American". Alternativa ({cuisine:{$not:/^A.*/}})

db.restaurant.find({
    $and: [{
        cuisine: {
            $ne: "American "
        }
    }, {
        "grades.score": {
            $gt: 70
        }
    }, {
        "address.coord": {
            $lt: -65.754168
        }
    }]
}).pretty()

//12. Escriu una consulta per trobar els restaurants quins no preparen cap cuisine de 'American' i va aconseguir un marcador més que 70 i localitzat en la longitud menys que -65.754168. Nota : Fes aquesta consulta sense utilitzar $and operador


db.restaurant.find({
    cuisine: {
        $ne: "American "
    },
    "grades.score": {
        $gt: 70
    },
    "address.coord": {
        $lt: -65.754168
    }
}).pretty()


//13. Escriu una consulta per trobar els restaurants quins no preparen cap cuisine de 'American ' i va aconseguir un punt de grau 'A' no pertany a Brooklyn. S'ha de mostrar el document segons la cuisine en ordre descendent

db.restaurant.find({
    cuisine: {
        $ne: "American "
    },
    "grades.grade": "A",
    borough: {
        $ne: "Brooklyn"
    }
}).sort({
    cuisine: -1
}).pretty()

//14. Escriu una consulta per trobar el restaurant_id, name, borough i cuisine per a aquells restaurants quin contenir 'Wil' com les tres primeres lletres en el seu nom

db.restaurant.find({
    name: {
        $regex: "^Wil"
    }
}, {
    restaurant_id: 1,
    name: 1,
    borough: 1
}).pretty()

//15. Escriu una consulta per trobar el restaurant_id, name, borough i cuisine per a aquells restaurants quin contenir 'ces' com les últim tres lletres en el seu nom

db.restaurant.find({
    name: {
        $regex: "ces$"
    }
}, {
    restaurant_id: 1,
    name: 1,
    borough: 1,
    cuisine: 1
}).pretty()

//16. Escriu una consulta per trobar el restaurant_id, name, borough i cuisine per a aquells restaurants quin contenir 'Reg' com tres lletres en algun lloc en el seu nom

db.restaurant.find({
    name: /Reg/
}, {
    restaurant_id: 1,
    name: 1,
    borough: 1,
    cuisine: 1
}).pretty()

//17. Escriu una consulta per trobar els restaurants quins pertanyen al Bronx i va preparar qualsevol plat American o xinès

db.restaurant.find({
    borough: "Bronx",
    $or: [{
        cuisine: "American "
    }, {
        cuisine: "Chinese"
    }]
}).pretty()

//18. Escriu una consulta per trobar el restaurant_id, name, borough i cuisine per a aquells restaurants que pertanyen a Staten Island o Queens o Bronx or Brooklyn

db.restaurant.find({
    $or: [{
        borough: {
            $in: ["Staten Island", "Queens", "Bronx", "Brooklyn"]
        }
    }]
}, {
    restaurant_id: 1,
    name: 1,
    borough: 1,
    cuisine: 1
}).pretty()

//19. Escriu una consulta per trobar el restaurant_id, name, borough i cuisine per a aquells restaurants que no pertanyen a Staten Island o Queens o Bronxor Brooklyn

db.restaurant.find({
    $or: [{
        borough: {
            $not: {
                $in: ["Staten Island", "Queens", "Bronx", "Brooklyn"]
            }
        }
    }]
}, {
    restaurant_id: 1,
    name: 1,
    borough: 1,
    cuisine: 1
}).pretty()

//20. Escriu una consulta per trobar el restaurant_id, name, borough i cuisine per a aquells restaurants que aconsegueixin un marcador quin no és més que 10

db.restaurant.find({
    "grades.score": {
        $lt: 10
    }
}, {
    restaurant_id: 1,
    name: 1,
    borough: 1,
    cuisine: 1
}).pretty()

//21. Escriu una consulta per trobar el restaurant_id, name, borough i cuisine per a aquells restaurants que preparen peix excepte 'American' i 'Chinees' o el name del restaurant comença amb lletres 'Wil'

db.restaurant.find({
    $or: [{
        $nor: [{
            cuisine: {
                $in: ["American ", "Chinese"]
            }
        }]
    }, {
        name: {
            $regex: "^Wil"
        }
    }]
}, {
    restaurant_id: 1,
    name: 1,
    borough: 1,
    cuisine: 1
}).pretty()

//22. Escriu una consulta per trobar el restaurant_id, name, i grades per a aquells restaurants que aconsegueixin un grau "A" i un score 11 en dades d'estudi ISODate "2014-08-11T00:00:00Z"

db.restaurant.find({
    grades: {
        $elemMatch: {
            score: 11,
            grade: "A",
            date: ISODate("2014-08-11T00:00:00Z")
        }
    }
}, {
    restaurant_id: 1,
    name: 1,
    grades: 1
}).pretty()

//23. Escriu una consulta per trobar el restaurant_id, name i grades per a aquells restaurants on el 2n element de varietat de graus conté un grau de "A" i marcador 9 sobre un ISODate "2014-08-11T00:00:00Z"

db.restaurant.find({
    "grades.1.score": 9,
    "grades.1.grade": "A",
    "grades.1.date": ISODate("2014-08-11T00:00:00Z")
}, {
    restaurant_id: 1,
    name: 1,
    grades: 1
}).pretty()


//24. Escriu una consulta per trobar el restaurant_id, name, adreça i ubicació geogràfica per a aquells restaurants on el segon element del array coord conté un valor quin és més que 42 i fins a 52
//
db.restaurant.find({
    "address.coord.1": {
        $gt: 42,
        $lt: 52
    }
}, {
    restaurant_id: 1,
    name: 1,
    "address.coord": 1
}).pretty()


//25. Escriu una consulta per organitzar el nom dels restaurants en ordre ascendent juntament amb totes les columnes

db.restaurant.find().sort({
    name: 1
}).pretty()

//26. Escriu una consulta per organitzar el nom dels restaurants en descendir juntament amb totes les columnes

db.restaurant.find().sort({
    name: -1
}).pretty()

//27. Escriu una consulta a organitzar el nom de la cuisine en ordre ascendent i per el mateix barri de cuisine. Ordre descendint

db.restaurant.find().sort({
    cuisine: 1,
    borough: 1
}).pretty()

//28. Escriu una consulta per saber tant si totes les direccions contenen el carrer o no

db.restaurant.find({
    "address.street": {
        $exists: true
    }
}).pretty()

//29. Escriu una consulta quin seleccionarà tots el documents en la col·lecció de restaurants on el valor del camp coord és Double

db.restaurant.find({
    "address.coord": {
        $type: "double"
    }
}).pretty()

//30. Escriu una consulta quin seleccionarà el restaurant_id, name i grade per a aquells restaurants quins retorns 0 com a resta després de dividir el marcador per 7
//
db.restaurant.find({
    $divide: ["grades.score", 7]
}, {
    restaurant_id: 1,
    name: 1,
    grades: 1
}).pretty()


//31. Escriu una consulta per trobar el name de restaurant, borough, longitud i altitud i cuisine per a aquells restaurants que contenen 'mon' com tres lletres en algun lloc del seu name

db.restaurant.find({
    name: /mon/
}, {
    restaurant_id: 1,
    name: 1,
    borough: 1,
    "address.coord": 1
}).pretty()


//32. Escriu una consulta per trobar el name de restaurant, borough, longitud i latitud i cuisine per a aquells restaurants que conteinen 'Mad' com primeres tres lletres del seu name

db.restaurant.find({
    name: {
        $regex: "^Mad"
    }
}, {
    name: 1,
    borough: 1,
    "address.coord": 1,
    cuisine: 1
}).pretty()