class Account:

    def __init__(self, name, balance):
        self.name = name
        if isinstance(balance, (int, float)) or balance >= 0:
            self.balance = float(balance)
        else:
            raise ValueError("Balance can't be negative and must be either int or float!")

    def deposit(self, x):
        if not isinstance(x, (int, float)) or x < 0:
            raise ValueError("Deposit can't be negative and must be either int or float!")
        else:
            self.balance += x

    def withdraw(self, x):
        if not isinstance(x, (int, float)) or x > self.balance:
            raise ValueError("Can't withdraw more than is deposited and must be either int or float!")
        else:
            self.balance -= x

    def __str__(self):
        return f"Name: {self.name}\nBalance: ${self.balance}"


try:
    acc_1 = Account("Mirek", 200)
    acc_2 = Account("Beatka", 150)

    acc_1.deposit(200)
    acc_2.withdraw(50)

    acc_1.withdraw(-20)
    acc_2.deposit("ouff")

except ValueError as e:
    print(f"{e} - Error has occured!")

finally:
    print(acc_1)
    print(acc_2)