### Debug记录

**0718** 

1. IDEA报错：Plugin ‘org.springframework.boot:spring-boot-maven-plugin:‘ not found

手动添加maven本地仓库版本号（pom.xml)

![image-20220718152534025](/Users/ldjtc/Library/Application Support/typora-user-images/image-20220718152534025.png)

2. IDEA报错-pom.xml

spring-boot-starter-thymeleaf飘红：添加新依赖后未下载依赖 - maven设置中选择下载

![image-20220718152638584](/Users/ldjtc/Library/Application Support/typora-user-images/image-20220718152638584.png)



**0721**

1.本地项目上传至github失败 - GitHub现已停止使用用户名加密码push - 改用生成的token进行验证 可成功push

**GitHub token**

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

2. 登录界面-我-下拉菜单失败：

原因：Bootstrap 插件全部依赖 jQuery

请注意，**Bootstrap 的所有 JavaScript 插件都依赖 jQuery，**因此 jQuery 必须在 Bootstrap 之前引入



引入CDN中的jQuery v3.2.1 

![image-20220721165438763](/Users/ldjtc/Library/Application Support/typora-user-images/image-20220721165438763.png)

![image-20220721165313936](/Users/ldjtc/Library/Application Support/typora-user-images/image-20220721165313936.png)

成功出现下拉菜单，第一次加载较慢，后面无影响

![image-20220721165518575](/Users/ldjtc/Library/Application Support/typora-user-images/image-20220721165518575.png)