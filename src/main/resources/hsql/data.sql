INSERT INTO SiriusServiceMethod(description,managementObjectName,serviceKeyword,siriusServiceMethodName)
  VALUES('method', 'objectName', 'keyword','methodName');
INSERT INTO SiriusServiceMethod(description,managementObjectName,serviceKeyword,siriusServiceMethodName)
  VALUES('method1', 'objectName1', 'keyword1','methodName1');
INSERT INTO SiriusServiceMethod(description,managementObjectName,serviceKeyword,siriusServiceMethodName)
  VALUES('method2', 'objectName2', 'keyword2','methodName2');
INSERT INTO SiriusServiceMethod(description,managementObjectName,serviceKeyword,siriusServiceMethodName)
  VALUES('method3', 'objectName3', 'keyword3','methodName3');
INSERT INTO SiriusServiceMethod(description,managementObjectName,serviceKeyword,siriusServiceMethodName)
  VALUES('method4', 'objectName4', 'keyword4','methodName4');

INSERT INTO SiriusService(category,description,endpoint,entityKeyword,isHardcoded,isSecured,isSiriusService,managementObjectName,serviceName)
  VALUES ('category','description','endpoint','entityKeyword',TRUE,TRUE,TRUE,'managementObjectName','serviceName');
INSERT  INTO SiriusService(category,description,endpoint,entityKeyword,isHardcoded,isSecured,isSiriusService,managementObjectName,serviceName)
  VALUES ('category1','description1','endpoint1','entityKeyword1',TRUE,TRUE,TRUE,'managementObjectName1','serviceName1');
INSERT  INTO SiriusService(category,description,endpoint,entityKeyword,isHardcoded,isSecured,isSiriusService,managementObjectName,serviceName)
  VALUES ('category2','description2','endpoint2','entityKeyword2',TRUE,TRUE,TRUE,'managementObjectName2','serviceName2');

INSERT INTO SiriusCluster (clusterName,description,isMaster,virtualIP)
    VALUES ('clusterName','description',TRUE ,'virtualIP');
INSERT INTO SiriusCluster (clusterName,description,isMaster,virtualIP)
    VALUES ('clusterName1','description1',TRUE ,'virtualIP1');
INSERT INTO SiriusCluster (clusterName,description,isMaster,virtualIP)
    VALUES ('clusterName2','description2',TRUE ,'virtualIP2');
