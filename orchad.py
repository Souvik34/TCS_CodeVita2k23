def c(r):

    c = 0
    last = -1

    for i in range(l(r) - 1):

         if r[i] != r[i + 1]:
             c += (i-last) *(l(r) -i - 1)
             last = i

    return c

ashok_r = input().strip()
anand_r= input().strip()

if not all(tree in 'ML' for tree in ashok_r + anand_r):
      print("Invalid input", end="")
else:
      ashok = c(ashok_r)
      anand= c(anand_r)
     
      if ashok > anand:
         print("Ashok", end="")

      elif anand > ashok:
         print("Anand", end="")

      else:
         print("Draw", end="")
