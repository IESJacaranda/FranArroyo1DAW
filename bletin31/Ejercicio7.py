'''
Created on 10 Dec 2020

@author: estudiante
Design a method called isPrime that receives one integer positive number greater than 0 as parameter.
The method should return 1 if the number is prime or 0 if the number is not prime.
If the parameter is not valid the method should return -1.
'''
def isPrime(num):
    if num<2:
        return -1
    for i in range(2,num):
        if num%i==0:
            return -1
        return 1
    
print(isPrime(6))