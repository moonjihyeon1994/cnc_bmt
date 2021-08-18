#!/bin/bash
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=0" > a_s1.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=1" > a_s2.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=2" > a_s3.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=3" > a_s4.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=4" > a_s5.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=5" > a_s6.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=6" > a_s7.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=7" > a_s8.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=8" > a_s9.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=9" > a_s10.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=10" > a_s11.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=11" > a_s12.info
ab -n 500 -c 1 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=12" > a_s13.info
ab -n 500 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=0" > a_m1.info
ab -n 500 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=1" > a_m2.info
ab -n 500 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=2" > a_m3.info
ab -n 500 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=3" > a_m4.info
ab -n 500 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=4" > a_m5.info
ab -n 500 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=5" > a_m6.info
ab -n 500 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=6" > a_m7.info
ab -n 500 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=7" > a_m8.info
ab -n 500 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=8" > a_m9.info
ab -n 500 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=9" > a_m10.info
ab -n 500 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=10" > a_m11.info
ab -n 500 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=11" > a_m12.info
ab -n 500 -c 10 -s 50000 "http://localhost:8081/selectCdrNew?rangeMonth=12" > a_m13.info

