'''
Created on 17 Nov 2020

@author: xXxArroyoxXx
'''
def menu():
    eleccion=0
    while eleccion!=7:
        eleccion=int(input(''' 1.Cambio de euros a dolares
        2.Cambio de dólares a euros
        3.Cambio de euros a libras
        4.Cambio de libras a euros.
        5.Cambio de libras a dolares
        6.Cambio de dolares a libras
        7.Salir
        '''))
        if eleccion==1:
            print(eurtodolar(eur=eurtodolar(eur=float(input("Introduce los euros a convertir")))))
        elif eleccion==2:
            print(dolartoeur(dol=dolartoeur(dol=float(input("Introduce los dolares a convertir")))))
        elif eleccion==3:
            print(eurtolib(eur=eurtolib(eur=int(float("Introduce los euros a convertir")))))
        elif eleccion==4:
            print(libtoeur(dol=libtoeur(dol=int(float("Introduce las libras a convertir")))))
        elif eleccion==5:
            print(libtodol(lib=libtodol(dol=int(float("Introduce los dolares a convertir")))))
        elif eleccion==6:
            print(doltolib(dol=doltolib(dol=int(float("Introduce los dolares a convertir")))))
        elif eleccion==7:
            return "Hasta la proxxiiiiimaa"

def eurtodolar (eur):
    dolar=eur*1.19
    return dolar
def dolartoeur(dol):
    eur=dol*0.89
    return eur
def eurtolib(eur):
    lib=eur*0.89
    return lib
def libtoeur(lib):
    eur=lib*1.12
    return eur
def libtodol(lib):
    dol=lib*1.33
    return dol
def doltolib(dol):
    lib=dol*0.75
    return lib
print(menu())
