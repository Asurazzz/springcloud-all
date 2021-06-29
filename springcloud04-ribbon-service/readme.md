将127.0.0.1 user-service 添加到本地host文件中
启动eureka-server服务器
然后启动ribbon-service：8301服务
依次启动user-service1:8201和 user-service2:8202 
使用http://localhost:8301/userRibbon/1 访问之后获得数据
发现service1和service2轮询打印了输出信息