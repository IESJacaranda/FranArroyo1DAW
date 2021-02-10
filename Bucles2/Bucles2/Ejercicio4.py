'''
Created on 3 Nov 2020

@author: xXxArroyoxXx
'''
'''
Design a program that reads a positive number N greater than 0 
and show the resultof the sum of the N numbers between 1 and N. 
If the number N is not valid, theprogram should ask for it again. 
The messages are the following:“Enter one number greater than 0:
”“The number is not right, try again.”
“The sum of the N first numbers is XX.”
'''
num = int(input("Enter one number greater than 0:"))
suma = 0
if num>0:
    for i in range(1,num+1):
        suma = suma+i
    print("The sum of the "+str(num)+" first numbers is "+str(suma))
else:
    print("The number is not right, try again.")
