class Pet:

    def __init__(self, name, hunger=0, tiredness=0):
        self.name = name
        self.hunger = hunger
        self.tiredness = tiredness

    @property
    def name(self):
        return self._name

    @name.setter
    def name(self, s):
        if not isinstance(s, str):
            raise ValueError("Name must be a string!")
        if len(s) < 3:
            raise ValueError("Name must be at least 3 characters long!")
        if not s.isalpha():
            raise ValueError("Characters in a name must all be letters!")
        self._name = s

    def __passage_of_time(self):
        self.hunger += 1
        self.tiredness += 1

    @property
    def mood(self):
        if (self.hunger + self.tiredness) < 5:
            return "very happy"
        if 5 <= (self.hunger + self.tiredness) <= 10:
            return "happy"
        if 11 <= (self.hunger + self.tiredness) <= 15:
            return "iritated"
        if (self.hunger + self.tiredness) > 15:
            return "furious"

    def talk(self):
        self.__passage_of_time()
        print(f"I am {self.mood}.")

    def eat(self, food=4):
        self.__passage_of_time()
        self.hunger -= food
        if self.hunger < 0:
            self.hunger = 0

    def play(self, fun=4):
        self.__passage_of_time()
        self.tiredness -= fun
        if self.tiredness < 0:
            self.tiredness = 0

    def __str__(self):
        return (f"Pet's name: {self.name}"
                f"Pet's hunger: {self.hunger}"
                f"Pet's tiredness: {self.tiredness}"
                f"Pet's mood: {self.mood()}")


pet = Pet("Steven")

pet.talk()
pet.play(0)
pet.play(0)
pet.play(0)
pet.talk()
pet.play(0)
pet.play(0)
pet.play(0)
pet.talk()
pet.eat(10)
pet.play(5)
pet.talk()
