const conn = new Mongo("localhost:27017")
//Crea DataBase Optica
const db = conn.getDB("pizzeria")

//Crea collection Clients
db.createCollection("Clients");
//Inserta documents a la collection de clients
db.clients.insertMany({
    _id: ObjectId('60e554e3354e44995cfbe40a'),
    nom: 'Joan',
    cognoms: 'Cara Barber',
    adreça: 'c/ Mallorca 25',
    telefon: 933358759,
    localitat: {
        nom: 'Terrassa',
        provincia: 'Barcelona',
    }
}, {
    _id: ObjectId('60e554e3354e44995cfbe41a'),
    nom: 'Chloe',
    cognoms: 'Sayavera Vicente',
    adreça: 'c/ Costa Daurada 69',
    telefon: 665987541,
    localitat: {
        nom: 'Cubelles',
        provincia: 'Barcelona',
    }
})
//Crea collection comandes
db.createCollection("Comandes");
//inserta los documentos a la collection comandes
db.comandes.insertMany({
    _id: ObjectId('70e554e3354e44995cfbe40b'),
    data: new Date("2021-04-25T13:05:00Z"),
    preuTotal: 16.80,
    detall: [{
        producte: ObjectId('80e554e3354e44995cfbe40c'),
        preu: 1.50,
        quantitat: 1
    }, {
        producte: ObjectId('80e554e3354e44995cfbe41c'),
        preu: 1.80,
        quantitat: 1
    }, {
        producte: ObjectId('80e554e3354e44995cfbe42c'),
        preu: 13.50,
        quantitat: 1
    }],
    repartiment: null,
    botiga: ObjectId('90e554e3354e44995cfbe40d'),
    client: ObjectId('60e554e3354e44995cfbe40a')
}, {
    _id: ObjectId('70e554e3354e44995cfbe41b'),
    data: new Date("2021-04-25T13:05:00Z"),
    preuTotal: 16.80,
    detall: [{
        producte: ObjectId('80e554e3354e44995cfbe40c'),
        preu: 1.50,
        quantitat: 1
    }, {
        producte: ObjectId('80e554e3354e44995cfbe41c'),
        preu: 1.80,
        quantitat: 1
    }, {
        producte: ObjectId('80e554e3354e44995cfbe42c'),
        preu: 13.50,
        quantitat: 1
    }],
    repartiment: null,
    botiga: ObjectId('90e554e3354e44995cfbe40d'),
    client: ObjectId('60e554e3354e44995cfbe41a')
})
//Crea collection de productes
db.createCollection("Productes");
//Inserta documents a la collections de productes
db.comandes.insertMany({
    _id: ObjectId('80e554e3354e44995cfbe40c'),
    descripció: 'Aigüa mineral 33cl',
    preu: 1.50,
    tipus: 'Beguda',
    categorizaPizza: null,
    imatge: 'aigua.png'
}, {
    _id: ObjectId('80e554e3354e44995cfbe41c'),
    descripció: 'Estrella Damm 33cl',
    preu: 1.80,
    tipus: 'Beguda',
    categorizaPizza: null,
    imatge: 'estrella.png'
}, {
    _id: ObjectId('80e554e3354e44995cfbe42c'),
    descripció: 'Pizza bbq',
    preu: 13.50,
    tipus: 'Pizza',
    categorizaPizza: 'Barbacoa',
    imatge: 'bbq.png'
})
//Crea collection de botigues
db.createCollection("Botigues");
//Inserta un document a la collection de botigues
db.botigues.insertOne({
    _id: ObjectId('90e554e3354e44995cfbe40d'),
    nom: "Botiga1",
    adreça: 'c/Fontana 13',
    localitat: {
        nom: 'Matorell'
        provincia: 'Barcelona'
    },
    empleats: [{
        ObjectId('30e554e3354e44995cfbe40e')
    }, {
        ObjectId('30e554e3354e44995cfbe41e')
    }],
})
//Crea collection de empleats
db.createCollection("Empleats");
//Inserta documents a la collection de empleats
db.empleats.insertMany({
    _id: ObjectId('30e554e3354e44995cfbe40e'),
    nom: 'Albert',
    congnoms: 'Vicent Martí',
    nif: '02225879',
    telefon: '936597845',
    posició: 'cuiner'
}, {
    _id: ObjectId('30e554e3354e44995cfbe41e'),
    nom: 'Oriol',
    congnoms: 'Vilà Garcia',
    nif: '365978547',
    telefon: '936547821',
    posició: 'repartidor'
})