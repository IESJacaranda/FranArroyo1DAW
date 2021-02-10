ano = 1980
def leapYear(ano):
    if ano%4==0 and (ano%100!=0 or ano%400==0):
        return 1
    else:
        return -1

print(leapYear(ano))