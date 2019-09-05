# springboot+mongodb+jpa

### 这是一个案例整合demo

##### 采用docker部署mongodb

##### 踩坑记录：

###### 对应的用户名密码权限为：

```
// 进入命令行
>user mongodb
>db.createUser("root",{roles:[ 
{"role" : "userAdminAnyDatabase","db" : "admin"},
{"role" : "dbOwner","db" : "admin"},
{"role" : "clusterAdmin", "db": "admin"},
{"role":"readWrite","db":"mymongo"}]});
// 注意最后一行的readWrite对应数据库为mymongo
```

###### yml配置连接如下：

```
spring:
  data:
    mongodb:
      uri: mongodb://用户名:密码@IP地址:端口/对应的库
```

###### 而非采用：（此方式会导致连接后无权限无法正常执行操作）

```
spring:
  data:
    mongodb:
      host: ip地址
      port: 端口号
      database: mymongo
      authentication-database: admin
      username: 用户名
      password: 密码
```

