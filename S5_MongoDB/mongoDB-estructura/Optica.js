const conn = new Mongo("localhost:27017")
//Crea DataBase Optica
const db = conn.getDB("optica")

//Crea collection Clients
db.createCollection("Clients");

db.clients.insertMany({
    _id: ObjectId('60e554e3354e44995cfbe40a'),
    telefon: 933356472,
    email: 'alberto@gmail.com',
    dataRegistre: ISODate('2021-04-22T00:00:00Z'),
    adreça: {
        carrer: 'Les fonts',
        numero: 20,
        pis: '4',
        porta: '6',
        ciutat: 'Barcelona',
        cpostal: '086549',
        pais: 'Espanya'
    },
    referit: ObjectId('60e554e3354e44995cfbe41a')
}, {
    _id: ObjectId('60e554e3354e44995cfbe41a'),
    telefon: 933356472,
    email: 'alberto@gmail.com',
    dataRegistre: ISODate('2021-04-22T00:00:00Z'),
    adreça: {
        carrer: 'Les fonts',
        numero: 20,
        pis: '4',
        porta: '6',
        ciutat: 'Barcelona',
        cpostal: '086549',
        pais: 'Espanya'
    },
    referit: null
})

//Crea collection de ulleres
db.createCollection("Ulleres");

db.ulleres.insertMany({
        _id: ObjectId('70e554e3354e44995cfbe40b'),
        client: ObjectId('60e554e3354e44995cfbe40a'),
        graduacioDDreta: 0.2,
        graduacioEsquerra: 0.4,
        muntura: "pasta",
        monturaColor: "negra",
        colorCristallEsq: "transparent",
        colorCristallDret: "trasnparent",
        preu: 69.99,
        marca: "Ray-B",
        dataVenda: new Date("2021-03-23"),
        proveïdor: {
            nom: "Prov1",
            telefon: "937775645",
            fax: "937775646",
            adreça: {
                carrer: "Aragó",
                numero: 123,
                pis: "1",
                porta: "1",
                ciutat: "Barcelona",
                cpostal: "00001",
                pais: "ES"
            },
            nif: 95811852
        },
        empleat: {
            nom: "Josep Capdevila"
        }
    })


    , {
        _id: ObjectId('70e554e3354e44995cfbe41b'),
        client: ObjectId('60e554e3354e44995cfbe41a'),
        graduacioDDreta: 1.2,
        graduacioEsquerra: 2.5,
        muntura: "metàl·lica",
        monturaColor: "blau",
        colorCristallEsq: "transparent",
        colorCristallDret: "trasnparent",
        preu: 80.99,
        marca: "GlassStyle",
        dataVenda: new Date("2021-05-29"),
        proveïdor: {
            nom: "Prov2",
            telefon: "938855645",
            fax: "939965646",
            adreça: {
                carrer: "Ugell",
                numero: 23,
                pis: "3",
                porta: "2",
                ciutat: "Tarragona",
                cpostal: "00235",
                pais: "ES"
            },
            nif: 58736452
        },
        empleat: {
            nom: "María Sanchez"
        }
    })