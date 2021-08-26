#!/bin/bash
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=0" > single_1.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=1" > single_2.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=2" > single_3.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=3" > single_4.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=4" > single_5.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=5" > single_6.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=6" > single_7.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=7" > single_8.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=8" > single_9.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=9" > single_10.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=10" > single_11.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=11" > single_12.info


