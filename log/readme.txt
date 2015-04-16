Web-Service soap wsdl : 
http://<HOST>:<PORT>/nnsplims-ws/ws/itemWs.wsdl
Solution :
1. create file.xsd in src/main/resources consist request and response of Web-Service
2. run mvn clean install 
3. create Endpoint Web-Service

Restful :
http://localhost:8022/nnsplims-ws/item?name=i
Solution : 
1. define @RestController on Controller