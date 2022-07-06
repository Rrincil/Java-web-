# 一、初识JavaWeb
## 1.1什么是JavaWeb
* 所有通过Java语言编写可以通过浏览器访问的总称
* JavaWeb是基于请求和响应来开发的
## web资源分类
- 静态资源和动态资源（按照实现技术和呈现效果来分类）
  1. 静态资源
     * html,css,js,txt,mp4,jpg....
  2. 动态资源
     * JSP页面、Servlet程序
# 二、常用的服务器介绍
1. Tomcat：免费，支持Servlet,JSP，轻量级JavaWeb容器（应用广）
2. Jboss：免费开源，遵从JavaEE规范，纯Java的EJB服务器
3. GlassFish：Oracle公司开发的一款JavaWeb服务器，强健商业性服务器，达到产品级质量（应用很少）
4. Resin：非常流行，CAUCHO公司的产品，对Servlet,JSP提供了良好的支持，性能优越resin自身采用Java开发（收费，应用较多）
5. WebLogic：Oracle公司开产品，运用最广泛的Web服务器，支持JavaEE规范（收费，适合大公司）

# 三、Tomcat_JavaWeb工程目录介绍
* webapp---存放web工程资源文件：html,js,css等
* WEB-INF---该目录是受服务器保护的目录，浏览器无法直接访问到此目录的内容
* WEB-INF/---lib目录用来存放第三方jar包
* WEB-INF/web.xml---它是整个动态web工程描述文件，可以配置很多web组件：Servlet程序，Filter过滤器，Listener监听器，Session超时等等
* 