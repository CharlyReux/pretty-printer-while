#!/usr/bin/env python3

import time
import os
import sys

def generatewhileimbriqued(i):
    k = 0
    f1 = open("bin/fichier1.wh",'a')
    f1.write("function p: read X % while X do ")
    for j in range (i):
        f1.write("while X do ")
    f1.write('nop ')
    for j in range(i):
        f1.write("od ")
    f1.write("od % write X")
    f1.close()

def generatewhilenonimbriqued(i):
    f1 = open("bin/fichier2.wh",'a')
    f1.write("function p: read X % ")
    for j in range (i):
        f1.write("while X do nop od; ")
    f1.write(" while X do nop od % write X")
    f1.close()


#os.system("java -jar generator.jar ./../input_files/test1.wh")
timeimbriqued = []
timenonimbriqued = []

for i in range(0,100,10):
    f1 = open("bin/fichier1.wh",'w')
    t1 = generatewhileimbriqued(i)

    f2 = open("bin/fichier2.wh",'w')
    t2 = generatewhilenonimbriqued(i)

    s = time.time()
    os.system("java -jar bin/generator.jar bin/fichier1.wh > bin/a")
    e = time.time()
    timeimbriqued.append(e-s)

    s = time.time()
    os.system("java -jar bin/generator.jar bin/fichier2.wh > bin/a")
    e = time.time()
    timenonimbriqued.append(e-s)

    f1.close()
    f2.close()
f = open("bin/result.txt",'w')
f.write('Temps d\'execution pour des boucles while imbriquées : '+ str(timeimbriqued) + '\nTemps d\'execution pour des boucles while non imbriquées : '+str(timenonimbriqued) )
f.close
