## _exchangegram_

`Java 8`
`Gradle`
`Docker`

#### _Tasks_
```
gradle clean
```
```
gradle build
```
```
gradle test
```
```
gradle bootRun
```

#### _Docker_
```
gradle clean build
```
```
docker build -t wlx-app .
```
```
docker run -p 8766:8766 -t wlx-app
```

#### _Test the app_

> Permisos [READ, WRITE, ALL]

* Registrar un álbum compartido con un usuario y su permiso. **POST**
```
http://localhost:8766/api/v1/exchangegram
{
	"albumId":1,
	"ownerId":1,
	"friendId":4,
	"permission":"READ"
}
```

* Traer todos los albumes compartidos. **GET**
```
http://localhost:8766/api/v1/exchangegram
```

* Cambiar los permisos de un usuario para un álbum determinado. **PUT**
```
http://localhost:8766/api/v1/exchangegram
 {
    "id": 1,
    "albumId": 1,
    "ownerId": 1,
    "friendId": 4,
    "permission": "WRITE"
 }
```


* Traer todos los usuarios que tienen un permiso determinado respecto a un
álbum específico. **GET**
```
http://localhost:8766/api/v1/albums/1/permissions/READ
```

* Busca comentarios por nombre. **GET**

```
http://localhost:8766/api/v1/comments/name/sit
```

* Busca comentarios por userId. **GET**

```
http://localhost:8766/api/v1/comments/users/8
```
