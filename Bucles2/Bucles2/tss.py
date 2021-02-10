def introduceunnumero (num):
	lista=[]
    for i in range (2,num):
        if esprimo(i)==True:
            print("El numero",i,"es primo")
            lista.append(i)
        else:
            print("No es primo el numero",i)
def esprimo(num):
    numdivisores=0 
    for i in range(2, num):
        if num%i==0:
            numdivisores+=1
        elif numdivisores==2:
            return True

print(introduceunnumero(num=int(input("Introduce un numero"))))
print (lista)
