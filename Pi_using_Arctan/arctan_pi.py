from decimal import Decimal, getcontext
from math import atan, pi

ctx = getcontext()
ctx.prec = 60

def arctan(x,n):
    x = dec(x)
    total = dec(0)
    # for -1 <= x <= 1
    for i in range(n):
        sign = -1 if i%2 else 1
        f = dec(2*i + 1)
        denom = dec(f * dec(x**f))
        total += dec(sign / denom)
    return total

def pie(fun):
    if fun==1:
        at1 = dec(atan(dec(1/5)))
        at2 = dec(atan(dec(1/239)))
    elif fun==2:
        # Machin-like formula
        at1 = arctan(5, terms_5)
        at2 = arctan(239, terms_239)
    elif fun==3:
        # arctan properties
        # pi/4 = arctan(1/2) + arctan(1/3)
        return dec(4*(arctan(2,terms_5)+arctan(3,terms_239)))
    
    return dec(4 * dec(4*at1 - at2))

print('Using atan: ', pie(1))
print('Using func1: ',pie(2))
print('Using func2: ',pie(3))
print('Math lib  : ',Decimal(pi))
print(pi)
