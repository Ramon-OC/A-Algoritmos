def busca_repetido(A):
    n = len(A) 
    r = -1 # Elemento repetido
    p = n # Elemento faltante
    
    for i in range(n): # Pues sabemos que puede empezar de 0 a n
        if A[abs(A[i])] < 0:
            r = abs(A[i])
        else:
            A[abs(A[i])] = -A[abs(A[i])]
        if A[i] == 0:
            p = i
    
    for i in range(n): # Se busca el elemento faltante
        if A[i] > 0:
            p = i
    
    return (r, p) # Regresa el elemento repetido y faltante


A = [0, 1, 2, 3, 4, 4, 6] # Reptido: 4 y Faltante: 5
(r, p) = busca_repetido(A)
print("El valor repetido es: ", r)
print("El valor faltante es: ", p)


A = [0, 2, 3, 1, 4, 5, 4] # Reptido: 4 y Faltante: 6
(r, p) = busca_repetido(A)
print("El valor repetido es: ", r)
print("El valor faltante es: ", p)


A = [4, 1, 0, 3, 4] # Reptido: 4 y Faltante: 2
(r, p) = busca_repetido(A)
print("El valor repetido es: ", r)
print("El valor faltante es: ", p)

A = [1, 2, 3, 3, 4, 5, 6] # Reptido: 3 y Faltante: 0
(r, p) = busca_repetido(A)
print("El valor repetido es: ", r)
print("El valor faltante es: ", p)
