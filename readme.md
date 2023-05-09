# insentek-serverless-template 帮助文档


<table>

## 前期准备
使用该项目，推荐您拥有以下的产品权限 / 策略：

| 服务/业务 | 函数计算 |     
| --- |  --- |   
| 权限/策略 | AliyunFCFullAccess |  

</table>

<codepre id="codepre">

# 代码 & 预览

- [ :smiley_cat:  源代码](https://github.com/devsapp/start-web-framework/blob/master/web-framework/java/springboot)

</codepre>

<deploy>

## 部署 & 体验

<appcenter>

-  :fire:  通过 [Serverless 应用中心](https://fcnext.console.aliyun.com/applications/create?template=start-springboot) ，
[![Deploy with Severless Devs](https://img.alicdn.com/imgextra/i1/O1CN01w5RFbX1v45s8TIXPz_!!6000000006118-55-tps-95-28.svg)](https://fcnext.console.aliyun.com/applications/create?template=start-springboot)  该应用。 

</appcenter>

- 通过 [Serverless Devs Cli](https://www.serverless-devs.com/serverless-devs/install) 进行部署：
    - [安装 Serverless Devs Cli 开发者工具](https://www.serverless-devs.com/serverless-devs/install) ，并进行[授权信息配置](https://www.serverless-devs.com/fc/config) ；
    - 初始化项目：`s init start-springboot -d start-springboot`   
    - 进入项目，并进行项目部署：`cd start-springboot && s deploy -y`

</deploy>

<appdetail id="flushContent">

# 应用详情


本项目是将 Springboot 项目部署到阿里云 Serverless 平台（函数计算 FC）。

通过 Serverless Devs 开发者工具，您只需要几步，就可以体验 Serverless 架构，带来的降本提效的技术红利。

部署完成之后，您可以看到系统返回给您的案例地址，例如：

![图片alt](https://img.alicdn.com/imgextra/i4/O1CN01Tcewz51vRS4HsahtZ_!!6000000006169-2-tps-2554-918.png)

此时，打开案例地址，就可以进入 Springboot 项目首页：

![图片alt](https://img.alicdn.com/imgextra/i3/O1CN01jLfCaE1amQGuXQI8Q_!!6000000003372-2-tps-2594-1558.png)

> 注意: 如果您这边部署的 Springboot 项目的 jar 包很大， 超过了函数计算最大的 500M 限制，可以参考[函数计算大代码包部署的实践](https://github.com/awesome-fc/fc-faq/blob/main/docs/%E5%A4%A7%E4%BB%A3%E7%A0%81%E5%8C%85%E9%83%A8%E7%BD%B2%E7%9A%84%E5%AE%9E%E8%B7%B5%E6%A1%88%E4%BE%8B.md)



</appdetail>
