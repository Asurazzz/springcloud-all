# 获取配置信息
/{label}/{application}-{profile}
# 获取配置文件信息
/{label}/{application}-{profile}.yml


占位符相关解释
application：代表应用名称，默认为配置文件中的spring.application.name，如果配置了spring.cloud.config.name，则为该名称；
label：代表分支名称，对应配置文件中的spring.cloud.config.label；
profile：代表环境名称，对应配置文件中的spring.cloud.config.profile。




启动eureka-server、config-server服务；

访问http://localhost:8901/master/config-dev来获取master分支上dev环境的配置信息；
访问http://localhost:8901/master/config-dev.yml来获取master分支上dev环境的配置文件信息，对比上面信息，可以看出配置信息和配置文件信息并不是同一个概念；
访问http://localhost:8901/master/config-test.yml来获取master分支上test环境的配置文件信息:
访问http://localhost:8901/dev/config-dev.yml来获取dev分支上dev环境的配置文件信息: