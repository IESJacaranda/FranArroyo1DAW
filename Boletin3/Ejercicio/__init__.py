numeropartidos=int(input("Introduce el numero de partidos"))
while numeropartidos<=0:
    numeropartidos=int(input("Introduce el numero de partidos"))
def calcularesultadoquiniela(partidos):
        resultado=[]
        for i in range(partidos):
            goleslocal=int(input("Introduce los goles locales"))
            while goleslocal<0:
                goleslocal=int(input("Introduce los goles locales"))
            golesvisitante=int(input("Introduce los goles visitantes"))
            while golesvisitante<0:
                golesvisitante=int(input("Introduce los goles visitantes"))
            if goleslocal>golesvisitante:
                resultado.append("2")
            elif golesvisitante>goleslocal:
                resultado.append("1")
            else:
                resultado.append("x")
        return resultado
    
print(calcularesultadoquiniela(numeropartidos))