curl -i -X POST -H "Content-Type:application/json" -d '{  "treasury" : "true" , "currencyId" : 1, "nameId" : "abc", "balance" : 1000 }' http://localhost:8080/payment/pay?key=SHARED_KEY

curl http://75.126.254.59:8080/accounts

curl -i -X POST -H "Content-Type:application/json" -d '{"number":30000,"name":"Dima","currentBalance":1000.00,"treasury":true}' http://localhost:8080/accounts