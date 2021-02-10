
def factorial(number):
    factorial=1
    if number<0:
        factorial= -1
    else:
        for i in range(number):
            factorial=factorial*(i+1)
    return factorial

print(factorial(-2))
print(factorial(5))
