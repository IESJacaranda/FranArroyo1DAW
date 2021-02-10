'''
Created on 11 Nov 2020
 
@author: xXxArroyoxXx
'''
def introduceunnumero (num):
    for i in range (2,num):
        if esPrimo(i)==True:
            print("El numero",i,"es primo")
        else:
            print("No es primo el numero",i)
 
def esPrimo(i):
    acumulaor=0
    if i<2:
        return False
    if i>2:
        for j in range(2,i):
            if i%j==0:
                acumulaor+=1
                if acumulaor==1:
                    return False
            else:
                return True
    elif i==2:
        return True
print(introduceunnumero(num=int(input("Introdcue un numero"))))







