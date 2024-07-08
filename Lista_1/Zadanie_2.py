import random


class Dice:

    def __init__(self, sides):
        self.__sides = sides
        self.__value = None

    @property
    def sides(self):
        return self.__sides

    @property
    def value(self):
        return self.__value

    def roll(self):
        self.__value = random.randint(1, self.sides)

    def __str__(self):
        return f"Sides - {self.sides}\nValue - {self.value}"

p_score = 0
c_score = 0
die_1p = Dice(6)
die_2p = Dice(6)
die_1c = Dice(6)
die_2c = Dice(6)

while True:
    choice = input("Do you want to continue rolling dice (Y/N)?")
    if choice.lower() == 'y':
        die_1c.roll()
        die_2c.roll()
        c_score += die_1c.value + die_2c.value

        turn = input("Do you want to roll your dice (Y/N)?")
        if turn.lower() == 'y':
            die_1p.roll()
            die_2p.roll()
            p_score += die_1p.value + die_2p.value

        print(f"Your score: {p_score}.\n")
    if p_score >= 21 or choice.lower() == 'n':
        break

if p_score < 21 and (p_score > c_score or c_score > 21):
    print("You won!")
    print(f"You: {p_score}\nComputer: {c_score}")
else:
    print("You lost!")
    print(f"You: {p_score}\nComputer: {c_score}")
