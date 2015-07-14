INSERT INTO SiriusCluster (clusterName,description,isMaster,virtualIP,parentSiriusClusterID)
  VALUES ('clusterName','description',TRUE ,'virtualIP',1);
INSERT INTO SiriusCluster (clusterName,description,isMaster,virtualIP,parentSiriusClusterID)
  VALUES ('clusterName1','description1',TRUE ,'virtualIP1',1);
INSERT INTO SiriusCluster (clusterName,description,isMaster,virtualIP,parentSiriusClusterID)
  VALUES ('clusterName2','description2',TRUE ,'virtualIP2',1);

INSERT INTO SiriusServer(description,realIP,serverName) VALUES ('description1','100.100.100.1','serverName1');
INSERT INTO SiriusServer(description,realIP,serverName) VALUES ('description2','100.100.100.2','serverName2');
INSERT INTO SiriusServer(description,realIP,serverName) VALUES ('description3','100.100.100.3','serverName3');
INSERT INTO SiriusServer(description,realIP,serverName) VALUES ('description4','100.100.100.4','serverName4');
INSERT INTO SiriusServer(description,realIP,serverName) VALUES ('description5','100.100.100.5','serverName5');

INSERT INTO SERVER_CLUSTER(siriusServerID, siriusClusterID) VALUES (1,1);
INSERT INTO SERVER_CLUSTER(siriusServerID, siriusClusterID) VALUES (1,3);
INSERT INTO SERVER_CLUSTER(siriusServerID, siriusClusterID) VALUES (2,1);
INSERT INTO SERVER_CLUSTER(siriusServerID, siriusClusterID) VALUES (3,2);
INSERT INTO SERVER_CLUSTER(siriusServerID, siriusClusterID) VALUES (4,2);
INSERT INTO SERVER_CLUSTER(siriusServerID, siriusClusterID) VALUES (4,3);
INSERT INTO SERVER_CLUSTER(siriusServerID, siriusClusterID) VALUES (5,3);

INSERT INTO SiriusService(category,description,endpoint,entityKeyword,isHardcoded,isSecured,isSiriusService,managementObjectName,serviceName, siriusServerID)
  VALUES ('category','description','endpoint','entityKeyword',TRUE,TRUE,TRUE,'managementObjectName','serviceName',1);
INSERT  INTO SiriusService(category,description,endpoint,entityKeyword,isHardcoded,isSecured,isSiriusService,managementObjectName,serviceName, siriusServerID)
  VALUES ('category1','description1','endpoint1','entityKeyword1',TRUE,TRUE,TRUE,'managementObjectName1','serviceName1', 1);
INSERT  INTO SiriusService(category,description,endpoint,entityKeyword,isHardcoded,isSecured,isSiriusService,managementObjectName,serviceName, siriusServerID)
  VALUES ('category2','description2','endpoint2','entityKeyword2',TRUE,TRUE,TRUE,'managementObjectName2','serviceName2', 2);
INSERT  INTO SiriusService(category,description,endpoint,entityKeyword,isHardcoded,isSecured,isSiriusService,managementObjectName,serviceName, siriusServerID)
  VALUES ('category3','description3','endpoint3','entityKeyword3',TRUE,TRUE,TRUE,'managementObjectName3','serviceName3', 2);
INSERT  INTO SiriusService(category,description,endpoint,entityKeyword,isHardcoded,isSecured,isSiriusService,managementObjectName,serviceName, siriusServerID)
  VALUES ('category2','description4','endpoint4','entityKeyword4',TRUE,TRUE,TRUE,'managementObjectName4','serviceName4', 3);
INSERT  INTO SiriusService(category,description,endpoint,entityKeyword,isHardcoded,isSecured,isSiriusService,managementObjectName,serviceName, siriusServerID)
  VALUES ('category2','description5','endpoint5','entityKeyword5',TRUE,TRUE,TRUE,'managementObjectName5','serviceName5', 3);
INSERT  INTO SiriusService(category,description,endpoint,entityKeyword,isHardcoded,isSecured,isSiriusService,managementObjectName,serviceName, siriusServerID)
  VALUES ('category2','description6','endpoint6','entityKeyword6',TRUE,TRUE,TRUE,'managementObjectName6','serviceName6', 4);
INSERT  INTO SiriusService(category,description,endpoint,entityKeyword,isHardcoded,isSecured,isSiriusService,managementObjectName,serviceName, siriusServerID)
  VALUES ('category2','description7','endpoint7','entityKeyword7',TRUE,TRUE,TRUE,'managementObjectName7','serviceName7', 4);
INSERT  INTO SiriusService(category,description,endpoint,entityKeyword,isHardcoded,isSecured,isSiriusService,managementObjectName,serviceName, siriusServerID)
  VALUES ('category2','description8','endpoint8','entityKeyword8',TRUE,TRUE,TRUE,'managementObjectName8','serviceName8', 4);
INSERT  INTO SiriusService(category,description,endpoint,entityKeyword,isHardcoded,isSecured,isSiriusService,managementObjectName,serviceName, siriusServerID)
  VALUES ('category2','description9','endpoint9','entityKeyword9',TRUE,TRUE,TRUE,'managementObjectName9','serviceName9', 5);
INSERT  INTO SiriusService(category,description,endpoint,entityKeyword,isHardcoded,isSecured,isSiriusService,managementObjectName,serviceName, siriusServerID)
  VALUES ('category2','description10','endpoint10','entityKeyword10',TRUE,TRUE,TRUE,'managementObjectName10','serviceName10', 5);
INSERT  INTO SiriusService(category,description,endpoint,entityKeyword,isHardcoded,isSecured,isSiriusService,managementObjectName,serviceName, siriusServerID)
  VALUES ('category2','description11','endpoint11','entityKeyword11',TRUE,TRUE,TRUE,'managementObjectName11','serviceName11', 5);

INSERT INTO SiriusServiceMethod(description,managementObjectName,serviceKeyword,siriusServiceMethodName,siriusServiceID)
  VALUES('method', 'objectName', 'keyword','methodName',1);
INSERT INTO SiriusServiceMethod(description,managementObjectName,serviceKeyword,siriusServiceMethodName,siriusServiceID)
  VALUES('method1', 'objectName1', 'keyword1','methodName1',1);
INSERT INTO SiriusServiceMethod(description,managementObjectName,serviceKeyword,siriusServiceMethodName,siriusServiceID)
  VALUES('method2', 'objectName2', 'keyword2','methodName2',2);
INSERT INTO SiriusServiceMethod(description,managementObjectName,serviceKeyword,siriusServiceMethodName,siriusServiceID)
  VALUES('method3', 'objectName3', 'keyword3','methodName3',2);
INSERT INTO SiriusServiceMethod(description,managementObjectName,serviceKeyword,siriusServiceMethodName,siriusServiceID)
  VALUES('method4', 'objectName4', 'keyword4','methodName4',2);

