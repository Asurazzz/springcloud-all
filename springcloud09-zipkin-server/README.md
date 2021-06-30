Zipkin是Twitter的一个开源项目
可以用来获取和分析Spring Cloud Sleuth 中产生的请求链路跟踪日志，
它提供了Web界面来帮助我们直观地查看请求链路跟踪信息。

SpringBoot 2.0以上版本已经不需要自行搭建zipkin-server，我们可以从该地址下载zipkin-server：
https://repo1.maven.org/maven2/io/zipkin/java/zipkin-server/2.12.9/zipkin-server-2.12.9-exec.jar

下载完成后使用以下命令运行zipkin-server：

java -jar zipkin-server-2.12.9-exec.jar
Zipkin页面访问地址：http://localhost:9411

启动eureka-sever，ribbon-service，user-service：
多次调用（Sleuth为抽样收集）ribbon-service的接口http://localhost:8301/user/1 ，
调用完后查看Zipkin首页发现已经有请求链路跟踪信息了；




使用Elasticsearch存储跟踪信息
安装Elasticsearch
下载Elasticsearch6.2.2的zip包，并解压到指定目录，下载地址：https://www.elastic.co/cn/downloads/past-releases/elasticsearch-6-2-2

运行bin目录下的elasticsearch.bat启动Elasticsearch

修改启动参数将信息存储到Elasticsearch

使用以下命令运行，就可以把跟踪信息存储到Elasticsearch里面去了，重新启动也不会丢失；
# STORAGE_TYPE：表示存储类型 ES_HOSTS：表示ES的访问地址
java -jar zipkin-server-2.12.9-exec.jar --STORAGE_TYPE=elasticsearch --ES_HOSTS=localhost:9200 

之后需要重新启动user-service和ribbon-service才能生效，重启后多次调用ribbon-service的接口http://localhost:8301/user/1；

如果安装了Elasticsearch的可视化工具Kibana的话，可以看到里面已经存储了跟踪信息：