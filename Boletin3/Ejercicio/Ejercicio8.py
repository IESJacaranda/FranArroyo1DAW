'''
Created on 24 Nov 2020

@author: xXxArroyoxXx
'''
'''
Realizar un programa que pregunte el número de partidos jugados en esta jornada.
Luego para cada uno de las jornadas debe preguntar el número de goles 
del equipo local y del equipo visitante y el programa debe determinar 
el resultado de la quiniela.
Debe asegurarse que los valores son correctos.
'''

def introducedatos (numpartidos):
    mensaje=""
    for i in range(0,numpartidos):
        goleslocal=int(input("Introduce los goles locales"))
        golesvisitante=int(input("Introduce los goles visitantes"))
        if goleslocal>golesvisitante:
            mensaje+="X_0\n"
        elif golesvisitante>goleslocal:
            mensaje+="0_X\n"
        elif golesvisitante==goleslocal:
            mensaje+="_X_\n"
    return mensaje
print(introducedatos(numpartidos=int(input("Introduce el numero de partidos"))))
        
        
        
        
        
        
        
        
        