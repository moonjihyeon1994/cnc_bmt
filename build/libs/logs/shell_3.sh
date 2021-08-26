#!/bin/bash
ab -n 100 -c 20 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=0" > multi_20_1.info
ab -n 100 -c 20 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=1" > multi_20_2.info
ab -n 100 -c 20 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=2" > multi_20_3.info
ab -n 100 -c 20 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=3" > multi_20_4.info
ab -n 100 -c 20 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=4" > multi_20_5.info
ab -n 100 -c 20 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=5" > multi_20_6.info
ab -n 100 -c 20 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=6" > multi_20_7.info
ab -n 100 -c 20 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=7" > multi_20_8.info
ab -n 100 -c 20 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=8" > multi_20_9.info
ab -n 100 -c 20 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=9" > multi_20_10.info
ab -n 100 -c 20 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=10" > multi_20_11.info
ab -n 100 -c 20 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=11" > multi_20_12.info


