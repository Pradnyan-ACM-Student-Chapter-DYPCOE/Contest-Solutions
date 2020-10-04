t = int(input())
for p in range(t):
    bill = input()
    num = []
    numbers = []
    for i in range(0,len(bill)):
        if bill[i].isdigit():
            num.append(bill[i])
            if i!=len(bill)-1 and not bill[i+1].isdigit():
                ch = ""
                for x in num:
                    ch = ch+x
                numbers.append(ch)
                num = []
            if i+1 == len(bill)-1:
                num.append(bill[i+1])
                ch = ""
                for x in num:
                    ch = ch+x
                numbers.append(ch)
                break
    sum = 0
    for x in numbers:
        sum = sum + int(x)
    print(sum)