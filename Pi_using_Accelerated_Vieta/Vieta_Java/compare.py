with open('actual.txt') as f1:
    actualPi = f1.readline();

with open('output.txt') as f2:
    computedPi = f2.readline();

count = 0
an = len(actualPi)
bn = len(computedPi)
i=0 

while(i<an and i<bn):
    if actualPi[i] != computedPi[i]:
        print(actualPi[i], computedPi[i], i)
        break
    count+=1
    i+=1
print('Accuracy: ',count);
