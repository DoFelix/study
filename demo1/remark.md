1.springboot 用来简化spring应用的快速开发，是spring技术栈的大整合 原则：约定大于配置 去繁从简 可以运行一个独立的产品级应用
    其底层是使用的spring
    
    特点：独立应用
          嵌入式Servlet容器 应用无需打成war包
          starters启动器自动依赖和版本控制，web-starter mysql-starter
          大量自动配置 简化开发 也可修改默认值
          无需配置xml 无代码生成 开箱即用
          运行时应用监控
          适合云计算  
          
     缺点：入门容易 精通难  因为需要对spring十分了解
     
    *微服务：架构风格 一个应用是由一组小型应用组成 且各应用直接可以通过http方式进行信息互通
            特点：每一个功能元素即小型应用最周都是一个可独立替换和独立升级的软件单元
            
            快速构建应用   应用之间的分布式网调用    分布式间流数据计算，批量处理
            springboot     springCould               springCouldDataFlow     
        



