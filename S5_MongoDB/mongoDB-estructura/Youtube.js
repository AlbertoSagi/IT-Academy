const conn = new Mongo("localhost:27017")
//Crea DataBase Optica
const db = conn.getDB("youtube")

//Crea collection Usuaris
db.createCollection("usuaris");

db.usuaris.insertMany({
    _id: ObjectId('60i59f4acdo4r223f890m9a1'),
    username: 'kaotiko',
    email: 'kaotiko@hotmail.com',
    dataNaixement: ISODate('2000-05-07T09:23:42Z'),
    sexe: 'M',
    pais: 'Espanya',
    cpostal: 08695,
    canal: {
        nom: 'Noticias de actulidad',
        descripció: 'Canal de noticies',
        dataCreació: ISODate('2000-05-07T09:23:42Z'),
        suscriptors: [
            ObjectId('60i59f4acdo4r223f890m9a2'),
            ObjectId('60i59f4acdo4r223f890m9a3')
        ]
    }
}, {
    _id: ObjectId('60i59f4acdo4r223f890m9a2'),
    username: 'Ken',
    email: 'ken@hotmail.com',
    dataNaixement: ISODate('1990-08-07T09:23:42Z'),
    sexe: 'M',
    pais: 'Espanya',
    cpostal: 603254,
    canal: null
})

//Crea collection videos
db.createCollection("videos");

db.videos.insertOne({
    _id: ObjectId('70i59f4acdo4r223f890m9a1'),
    titol: 'Guerra en el mundo',
    descripció: 'Analitza les guerres en el planeta',
    size: '120MB',
    fileName: 'guerra.mp4',
    duració: '2:05:30',
    thumbnail: 'aof5548.png',
    reproduccions: 5447,
    dataCreació: ISODate('1990-08-07T09:23:42Z'),
    usuari: ObjectId('60i59f4acdo4r223f890m9a1'),
    estat: 'Públic',
    etiquetes: ['notices', 'guerra', 'planeta'],
    feedback: {
        likes: [{
                usuari: ObjectId('60i59f4acdo4r223f890m9a2'),
                data: ISODate('1990-08-07T09:23:42Z')
            },
            {
                usuari: ObjectId('60i59f4acdo4r223f890m9a3'),
                data: ISODate('1999-04-04T09:21:32Z')
            }
        ],
        dislikes: [{
            usuari: ObjectId('60i59f4acdo4r223f890m9a4'),
            data: ISODate('2001-04-04T09:21:22Z')
        }]
    },
    comentaris: [{
        text: 'Documental molt interessant',
        data: ISODate('1990-08-07T09:23:42Z'),
        usuari: ObjectId('60i59f4acdo4r223f890m9a2'),
        feedback: {
            likes: [{
                    usuari: ObjectId('60i59f4acdo4r223f890m9a1'),
                    data: ISODate('2020-05-07T09:23:42Z')
                },
                {
                    usuari: ObjectId('60i59f4acdo4r223f890m9a5'),
                    data: ISODate('2014-05-07T09:23:42Z')
                }
            ],
            dislikes: [{
                usuari: ObjectId('60i59f4acdo4r223f890m9a6'),
                data: ISODate('2012-01-05T03:21:45Z')
            }]
        }
    }]
})

//Crea collection playlists
db.createCollection("playlists");

db.playlists.insertOne({
    _id: ObjectId('80i59f4acdo4r223f890m9a1'),
    nom: 'videos favoritos',
    dataCreació: ISODate('1986-04-07T09:23:42Z'),
    estat: 'Publica',
    usuari: ObjectId('60i59f4acdo4r223f890m9a1'),
    videos: [
        ObjectId('70i59f4acdo4r223f890m9a1'),
        ObjectId('70i59f4acdo4r223f890m9a')
    ]
})