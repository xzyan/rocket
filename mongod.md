```sh
# 生成 keyFile
openssl rand -base64 756 > mongo.pem; chmod 400 mongo.pem

# 缓存容量上限
wiredTigerCacheSizeGB = 30

# 日志
logappend = true
logpath = mongod.log

# 实例
dbpath = db
port = 28001
bind_ip = 0.0.0.0
fork = true

# 复制集
keyFile   = mongo.pem
replSet   = MYDB
oplogSize = 10240 # MB

# 复制集初始化
rs.initiate({
    _id: "MYDB",
    members: [
        { _id: 0, host: "127.0.0.1:28001", priority: 10 },
    ]
})

# 创建超级用户
db.createUser({ user: "root", pwd: "<password>", roles: [{ role: "root", db: "admin" }] })
db.auth("root", "<password>")

# 创建读写用户
db.createUser({ user: "<dbname>", pwd: "<password>", roles: [{ role: "readWrite", db: "<dbname>" }] })

# 查看复制集状态
rs.status()

# 添加复制集节点
rs.add({ host: "127.0.0.1:28001", priority: 1 })

# 删除复制集节点
rs.remove("127.0.0.1:28001")

# 修改复制集节点的优先级
cfg = rs.conf()
cfg.members[0].priority = 10
rs.reconfig(cfg)

// 修改密码
db.changeUserPassword("用户", "密码")

// 创建索引
db.users.createIndex({"name":1})
db.users.dropIndex("name")
db.users.getIndexes()
```
