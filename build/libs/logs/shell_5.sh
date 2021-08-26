#!/bin/bash
ab -n 100 -c 100 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=0" > multi_100_1.info
ab -n 100 -c 100 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=1" > multi_100_2.info
ab -n 100 -c 100 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=2" > multi_100_3.info
ab -n 100 -c 100 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=3" > multi_100_4.info
ab -n 100 -c 100 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=4" > multi_100_5.info
ab -n 100 -c 100 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=5" > multi_100_6.info
ab -n 100 -c 100 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=6" > multi_100_7.info
ab -n 100 -c 100 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=7" > multi_100_8.info
ab -n 100 -c 100 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=8" > multi_100_9.info
ab -n 100 -c 100 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=9" > multi_100_10.info
ab -n 100 -c 100 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=10" > multi_100_11.info
ab -n 100 -c 100 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=11" > multi_100_12.info

