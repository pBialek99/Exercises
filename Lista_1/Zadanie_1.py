import random


class Coin:

    def __init__(self, denomination):
        self.side = "tails"
        self.denomination = denomination

    def throw(self):
        self.side = random.choice(["tails", "heads"])
        # print(self)

    def __str__(self):
        if self.side == "tails":
            return "tails"
        else:
            return f"heads - ${self.denomination}"


coin_1 = Coin(1)
coin_2 = Coin(2)
coin_3 = Coin(5)
coins = [coin_1, coin_2, coin_3]
balance = 0
wins = 0
loses = 0

for round in range(100):
    print(f"Round no.{round}")
    while balance < 20:
        for coin in coins:
            coin.throw()
            if coin.side == "tails":
                balance += coin.denomination
    if balance == 20:
        wins += 1
        print("You won!\n")
    else:
        loses += 1
        print("You lost!\n")
    balance = 0

print(f"You have won {wins} times.")
print(f"You have lost {loses} times.")
