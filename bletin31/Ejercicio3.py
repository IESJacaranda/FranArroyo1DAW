'''
Created on 9 Dec 2020

@author: estudiante
'''
'''
Created on 30 nov. 2020

@author: fran
Design a method called daysInMonth that returns the integer number of days in 
the month and year that received as arguments. 
You can use the method leapYear. 
If the arguments are not valid the method should return -1
'''
mes=2
ano = 1980
def leapYear(ano):
    if ano%4==0 and (ano%100!=0 or ano%400==0):
        return True
    else:
        return False
def daysInMonth(mes):
    if mes>=1 and mes<=12:
        if mes==1 or mes==3 or mes==5 or mes==7 or mes==8 or mes==10 or mes==12:
            return "31"
        elif mes==4 or mes==6 or mes==9 or mes==11:
            return "30"
        if leapYear(ano)==True:
            if mes==2:
                return "29"
            else:
                return "28"
print(leapYear(ano))
print(daysInMonth(mes))