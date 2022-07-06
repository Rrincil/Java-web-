# 一、什么是Servlet
1. Servlet 是Java EE 规范之一；规范：接口
2. Servlet 是Java web三大组件之一。（Servlet程序,Filter过滤器，Listener监听器）
3. <span style="color:red;font-weight:800;">Servlet 是运行在服务器上的一个Java小程序，它可以接收客户端发送的请求，并响应给客户端数据</span>
# 二、实现Servlet程序
1. 编写一个类实现Servlet接口
2. 实现service方法，处理请求并且响应数据
3. 到web.xml中配置Servlet程序的访问地址