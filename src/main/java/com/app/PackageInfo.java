package com.app;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: CuiCan
 * @Date: 2017/6/7
 * @Time: 15:42
 * @Description: 该项目各个包说明
 */
public class PackageInfo {

    /**
    app
    ├─api           ：接口包，前端控制器controller
    │  ├─customer       ：
    │  ├─employee
    │  ├─order
    │  ├─product
    │  └─user
    ├─config        ：配置文件
    ├─identity      ：身份验证
    ├─model         ：数据模型，dto
    │  ├─customer
    │  ├─data
    │  ├─employee
    │  ├─order
    │  ├─product
    │  ├─response       ：http响应模型--VO
    │  ├─session
    │  └─user
    └─repo          ：数据交互层，访问数据库
    */

    /**
     * Technology Stack
     *
     *  Component	        Technology
        Frontend	        Angular 4+
        Backend (REST)	    SpringBoot (Java)
        Security	        Token Based (Spring Security and JWT )
        REST Documentation	Swagger UI / Springfox and ReDoc
        REST Spec	        Open API Standard
        In Memory DB	    H2
        Persistence	        JPA (Using Spring Data)
        Client Build Tools	angular-cli, Webpack, npm
        Server Build Tools	Maven(Java) or Gradle
     */

    /**
     * PROJECT_FOLDER
        │  README.md
        │  pom.xml
        │  build.gradle
        └──[src]
        │  └──[main]
        │     └──[java]
        │     └──[resources]
        │        │  application.properties #contains springboot cofigurations
        │        │  - schema.sql  # Contains DB Script to create tables that executes during the App Startup
        │        │  - data.sql    # Contains DB Script to Insert data that executes during the App Startup (after schema.sql)
        │        └──[public]    # keep all html,css etc, resources that needs to be exposed to user without security
        │
        └──[target]              #Java build files, auto-created after running java build: mvn install
        │  └──[classes]
        │     └──[public]
        │     └──[webui]         #webui folder is created by (maven/gradle) which copies webui/dist folder
        │                        #the application.properties file list webui as a resource folder that means
                                    files can be accesses http://localhost/<files_inside_webui>
        │
        └──[webui]
           │  package.json
           │  angular-cli.json   #ng build configurations)
           └──[node_modules]
           └──[src]              #frontend source files
           └──[dist]             #frontend build files, auto-created after running angular build: ng -build
   */

}
