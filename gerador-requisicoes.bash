#!/bin/bash
SLEEP_TIME=1;

for((;;)); do {
    curl -X POST http://localhost:8080/hello2 \
        -d '{ "name": "'`uuidgen`'" }' \
        -H 'Content-Type: application/json'; 
    echo;
    sleep $SLEEP_TIME;
}; done;
