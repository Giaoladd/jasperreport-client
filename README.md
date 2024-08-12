# JasperClient

#### 介绍
本项目对JasperReports进行了高度封装，使得生成PDF文档变得异常简便。用户只需要将生成PDF的原始数据存储在MinIO或本地磁盘目录上，然后调用客户端接口便可以轻松实现PDF的生成，大大减少了开发时间。


#### 源数据配置

yaml配置:

	1.存储在本地
	jasper:
  	  print:
        storage: local 
    	local:
      	  templatePath: static/file/jasper

	2.存储在minio
	jasper:
      print:
		storage: minio
		minio:
		  bucket: jasper #存储源数据的桶名
		  config:
		    url: 127.0.0.1
			port: 9000
			accessKey: admin
			secretKey: 123456


#### 使用说明

	@Autowired
    private JasperClient jasperClient;

	/**
	 * name:    模板名称
	 * jsonstr：json格式的源数据
	 **/
	DataBuffer dataBuffer = jasperClient.printPDFByJson(name, jsonstr);

#### 付费购买源码

	微信支付100RMB并备注邮箱，我们将在24小时内发送源码到指定邮箱
    **注意: 请考虑清楚后购买，源代码一但发出之后概不退款。**

	WX(卫星)扫码:


![image](https://github.com/Giaoladd/jasperreport-client/blob/master/paycode.png)
