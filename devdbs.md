# dbs
使用Docker快速搭建测试数据库环境

### MongoDB

```
docker pull mongo
docker run --name mongo -p 27017:27017 -it mongo
```

### MariaDB

```
docker pull mariadb
docker run --name maria -p 3306:3306 -it mariadb
```

### Clickhouse

```
```
