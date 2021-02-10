'''
8.Design a program that asks for a set of numbers. After inputting each number, 
theprogram should ask “Do you want to enter more numbers (Y/N)?”.
If the answer is “Y”the program asks for other numbers. 
When the user finishes to enter all the numbers,the program should say which one is the smallest. 
The messages are the following:
“Enter one number:”
“Do you want to enter more number (Y/N)?”
“The smallest number is XX”'''
'''
'''
i=0
nummaschico=0
def introduccionnums():
    numaintroducir=int(input("Introduce el numero a introducir"))
    if numaintroducir<0:
        print("EL numero no te vale bro")
        introduccionnums()
    return numaintroducir
def introducciondenums (numaintroducir):
   if numaintroducir<0:
        num=int(input("Introduce un numero"))
        if num<0:
            print("Ese numero no te vale bro")
            introducciondenums(numaintroducir)
        if num>0:
            i+=1
            if nummaschico<num:
                nummaschico=num
                introducciondenums(numaintroducir)
            else:
                introducciondenums(numaintroducir)
        return nummaschico
def principal ():
    introducccionnums()
    introducciondenums(numaintroducir)
    return nummaschico


print(principal)