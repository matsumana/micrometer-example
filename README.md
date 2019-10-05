# How to build

```bash
$ ./mvnw clean package
```

# How to launch

```bash
$ docker-compose up -d mysql
$ docker-compose up --build app1
$ docker-compose up --build app2
```

# How to dispose containers

```bash
$ docker-compose down
```
