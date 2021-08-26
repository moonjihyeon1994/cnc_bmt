#!/bin/bash
ab -n 200 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=0" > multi_10_1.info
ab -n 200 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=1" > multi_10_2.info
ab -n 200 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=2" > multi_10_3.info
ab -n 200 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=3" > multi_10_4.info
ab -n 200 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=4" > multi_10_5.info
ab -n 200 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=5" > multi_10_6.info
ab -n 200 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=6" > multi_10_7.info
ab -n 200 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=7" > multi_10_8.info
ab -n 200 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=8" > multi_10_9.info
ab -n 200 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=9" > multi_10_10.info
ab -n 200 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=10" > multi_10_11.info
ab -n 200 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=11" > multi_10_12.info


