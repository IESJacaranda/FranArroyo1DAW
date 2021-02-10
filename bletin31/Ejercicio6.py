'''
Design a method called numberOfNumbers that receives one integer positive number as parameter. 
The method should return the number of digits of the number that received by parameter. 
If the parameter is not valid the method should return -1.
'''
def numberofnumbers(numbers):
    i=0
    if numbers<0:
        return -1
    else:
        while (i!=numbers):
            num=int(input("Introduce un numero"))
            while num<0:
                print("Solo numeros positivos")
                num=int(input("Introduce un numero"))
            i=+1
    return i

print(numberofnumbers(2))