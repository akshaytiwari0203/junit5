#!/bin/bash
# Calculate the sum of two integers with pre initialize values
# in a shell script
 
a=$1
b=$2
 
sum=$(( $a + $b ))

sleep 5

 
echo "Sum is: $sum"
