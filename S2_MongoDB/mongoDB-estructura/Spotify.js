const conn = new Mongo("localhost:27017")
//Crea DataBase Optica
const db = conn.getDB("spotify")

//Crea collection Usuaris
db.createCollection("usuaris");
//Insertem varis usuaris a la collection Usuaris
db.usuaris.insertMany({
    _id: ObjectId('60i59f4acdo4r223f890m9a1'),
    username: 'kaotiko',
    email: 'kaotiko@hotmail.com',
    password: '125a89',
    dataNaixement: ISODate('2000-05-07T09:23:42Z'),
    sexe: 'M',
    pais: 'Espanya',
    cpostal: 08695,
    suscripció: {
        dataInici: ISODate('2009-05-07T09:23:42Z'),
        dataRenovació: ISODate('2020-05-07T09:23:42Z'),
        formaPagament: 'paypal',
        pagament: {
            data: ISODate('2020-05-07T09:23:42Z'),
            numOrdre: 5,
            total: 7.50,
            tarjeta: null,
            paypal: {
                username: 'kaotiko@hotmail.com',
            },
        },
    },
    artistasFavorits: [ObjectId('70i59f4acdo4r223f890m9b1')],
    cançonsFavorites: [
        ObjectId('80i59f4acdo4r223f890m9a1'),
        ObjectId('80i59f4acdo4r223f890m9a2')
    ],
    albumsFavorits: [ObjectId('90i59f4acdo4r223f890m9c1')],
    playlistsFavorites: [
        ObjectId('10i59f4acdo4r223f890m9a1'),
        ObjectId('10i59f4acdo4r223f890m9a2')
    ],
}, {
    _id: ObjectId('60i59f4acdo4r223f890m9a2'),
    username: 'Safir',
    email: 'safir@hotmail.com',
    password: '5698a47',
    dataNaixement: ISODate('1986-04-07T09:23:42Z'),
    sexe: 'D',
    pais: 'USA',
    cpostal: 965874,
    suscripció: {
        dataInici: ISODate('2001-07-07T07:23:42Z'),
        dataRenovació: ISODate('2015-06-07T07:45:25Z'),
        formaPagament: 'tarjeta',
        pagament: {
            data: ISODate('2001-05-07T09:23:42Z'),
            numOrdre: 5,
            total: 8.99,
            tarjeta: {
                numero: 521469874521436,
                mes: 12,
                any: 2021,
                csv: 258,
            },
            paypal: null,
        },
    },
    artistasFavorits: [ObjectId('70i59f4acdo4r223f890m9b2')],
    cançonsFavorites: [
        ObjectId('80i59f4acdo4r223f890m9a3'),
        ObjectId('80i59f4acdo4r223f890m9a4')
    ],
    albumsFavorits: [ObjectId('90i59f4acdo4r223f890m9c2')],
    playlistsFavorites: [
        ObjectId('10i59f4acdo4r223f890m9a3'),
        ObjectId('10i59f4acdo4r223f890m9a4')
    ],
})
//Crear collection d'artistes
db.createCollection("artistes");
//Insertem varis usuaris a la collection artistes
db.artistes.insertMany({
    _id: ObjectId('70i59f4acdo4r223f890m9b1'),
    nom: 'U2',
    imatge: 'u2.png',
    albums: [{
        _id: ObjectId('90i59f4acdo4r223f890m9c1'),
        titol: 'Songs of Ascent',
        data: ISODate('2001-05-07T07:23:42Z'),
        imatge: 'songs.png',
        cançons: [{
                _id: ObjectId('80i59f4acdo4r223f890m9a1'),
                titol: 'Pain in my heart',
                duració: '3:05',
                reproduccions: 2589
            },
            {
                _id: ObjectId('80i59f4acdo4r223f890m9a2'),
                titol: 'Bye Bye',
                duració: '2:35',
                reproduccions: 5638
            }
        ]
    }],
    estils: ['pop', 'rock'],
    artistesRelacionats: [ObjectId('70i59f4acdo4r223f890m9b2')]
}, {
    _id: ObjectId('70i59f4acdo4r223f890m9b2'),
    nom: 'Coldplay',
    imatge: 'coldplay.png',
    albums: [{
        _id: ObjectId('90i59f4acdo4r223f890m9c3'),
        titol: 'Everyday Life',
        data: ISODate('2001-05-07T07:23:42Z'),
        imatge: 'everyday.png',
        cançons: [{
                _id: ObjectId('80i59f4acdo4r223f890m9a3'),
                titol: 'Sunrise',
                duració: '3:05',
                reproduccions: 69541
            },
            {
                _id: ObjectId('80i59f4acdo4r223f890m9a4'),
                titol: 'Church',
                duració: '2:29',
                reproduccions: 1240
            }
        ]
    }],
    estils: ['pop', 'rock'],
    artistesRelacionats: [ObjectId('70i59f4acdo4r223f890m9b3')]
})

//Crear collection playlists
db.createCollection("playlists");
//Insertem varis usuaris a la collection playlists
db.playlists.insertMany({
    _id: ObjectId('10i59f4acdo4r223f890m9a1'),
    titol: 'rock classics',
    dataCreació: ISODate('2001-05-07T07:23:42Z'),
    dataEliminació: null,
    estat: 'activa',
    creador: ObjectId('60i59f4acdo4r223f890m9a1'),
    cançons: [
        ObjectId('80i59f4acdo4r223f890m9a1'),
        ObjectId('80i59f4acdo4r223f890m9a2')
    ],
}, {
    _id: ObjectId('10i59f4acdo4r223f890m9a2'),
    titol: 'pop classics',
    dataCreació: ISODate('2004-05-07T07:23:42Z'),
    dataEliminació: ISODate('2009-06-08T08:45:24Z'),
    estat: 'eliminada',
    creador: ObjectId('60i59f4acdo4r223f890m9a2'),
    cançons: [
        ObjectId('80i59f4acdo4r223f890m9a3'),
        ObjectId('80i59f4acdo4r223f890m9a4')
    ],
})