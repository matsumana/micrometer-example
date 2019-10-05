# How to build

```bash
$ docker-compose up -d mysql
$ ./mvnw clean package
```

# How to launch

```bash
$ docker-compose up --build app1
$ docker-compose up --build app2
```

# How to dispose containers

```bash
$ docker-compose down
```
