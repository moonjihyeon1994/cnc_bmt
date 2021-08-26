#!/bin/bash
ab -n 100 -c 50 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=0" > multi_50_1.info
ab -n 100 -c 50 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=1" > multi_50_2.info
ab -n 100 -c 50 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=2" > multi_50_3.info
ab -n 100 -c 50 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=3" > multi_50_4.info
ab -n 100 -c 50 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=4" > multi_50_5.info
ab -n 100 -c 50 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=5" > multi_50_6.info
ab -n 100 -c 50 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=6" > multi_50_7.info
ab -n 100 -c 50 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=7" > multi_50_8.info
ab -n 100 -c 50 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=8" > multi_50_9.info
ab -n 100 -c 50 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=9" > multi_50_10.info
ab -n 100 -c 50 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=10" > multi_50_11.info
ab -n 100 -c 50 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=11" > multi_50_12.info


