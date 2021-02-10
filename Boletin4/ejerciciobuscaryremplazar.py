'''
Created on 1 Dec 2020

@author: estudiante
'''
frase="La lluvia en Sevilla"
oalabra="Sevilla"
def buscaryremplazar(frase,palabra,remplazo):
    cadenafinal=""
    indicadorfrase=0
    while indicadorfrase<len(frase):
        coincidencia=True
        indicadorpalabra=0
        while indicadorpalabra<len(palabra) and coincidencia:
            if not palabra[indicadorpalabra]==frase[indicadorfrase+indicadorpalabra]:
                coincidencia=False
            indicadorpalabra+=1
        #Busqueda
            
        #Concatenacion o remplazo
        if not coincidencia:
            cadenafinal+=frase[indicadorfrase]
            indicadorfrase+=1
            
        else:
            for i in remplazo:
                cadenafinal+=i
                indicadorfrase+=len(palabra)
    return cadenafinal

print(buscaryremplazar(frase, palabra, remplazo))
