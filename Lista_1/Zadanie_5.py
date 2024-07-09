class Time:

    def __init__(self, hour=0, minute=0, second=0):
        self.hour = hour
        self.minute = minute
        self.second = second

    def hour(self, x):
        if isinstance(x, int):
            if 0 <= x <= 23:
                self.hour = x
            else:
                raise ValueError("Inserted argument is not of right value!")
        else:
            raise TypeError("Inserted argument is not of 'int' type!")

    def minute(self, x):
        if isinstance(x, int):
            if 0 <= x <= 59:
                self.minute = x
            else:
                raise ValueError("Inserted argument is not of right value!")
        else:
            raise TypeError("Inserted argument is not of 'int' type!")

    def second(self, x):
        if isinstance(x, int):
            if 0 <= x <= 59:
                self.second = x
            else:
                raise ValueError("Inserted argument is not of right value!")
        else:
            raise TypeError("Inserted argument is not of 'int' type!")

    def set_time(self, h=0, m=0, s=0):
        self.hour(h)
        self.minute(m)
        self.second(s)

    def __repr__(self):
        return f"Time(hour={self.hour}, minute={self.minute}, second={self.second})"

    def __str__(self):
        if 0 <= self.hour <= 11:
            return f"It is: {str(self.hour).zfill(2)}:{str(self.minute).zfill(2)}:{str(self.second).zfill(2)} AM"
        else:
            return f"It is: {str(self.hour).zfill(2)}:{str(self.minute).zfill(2)}:{str(self.second).zfill(2)} PM"


t1 = Time()
t2 = Time(11, 59, 59)
t3 = Time(12, 0, 18)

print(f"{t1}\n")
print(f"{t2}\n")
print(f"{t3}\n")