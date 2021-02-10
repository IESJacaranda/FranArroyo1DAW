'''
Created on 10 dic. 2020

@author: fran
Design a method called numberDivisorPrime that receives a positive number as a parameter. 
The method should return the number of prime divisors for this parameter. 
If the parameter is not valid the method should return -1.
'''
def introduceunnumero (num):
    lista=[]
    for i in range (2,num):
        if esprimo(i)==True:
            print("El numero",i,"es primo")
            lista.append(i)
            return lista
        else:
            return -1
def esprimo(num):
    numdivisores=0 
    for i in range(2, num):
        if num%i==0:
            numdivisores+=1
        elif numdivisores==2:
            return True

print(introduceunnumero(num=int(input("Introduce un numero"))))