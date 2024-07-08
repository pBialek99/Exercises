class Matrix:

    def __init__(self, row, col, value=None):
        self.__row = row
        self.__col = col
        self.__matrix = []

        for r in range(self.__row):
            l = []
            for c in range(self.__col):
                l.append(value)
            self.__matrix.append(l)


    @property
    def size(self):
        return (self.row, self.col)

    def __check_index(self, r, c):
        if r not in range(self.__row) or c not in range(self.__col):
            raise IndexError("Given index not in range of matrix!")
        else:
            return True

    def get_cell(self, r, c):
        if self.__check_index(r, c):
            return self.__matrix[r][c]

    def set_cell(self, r, c, value):
        if self.__check_index(r, c):
            self.__matrix[r][c] = value

    def __str__(self):
        l = []
        for row in self.__matrix:
            l.append(" ".join(map(str, row)))
        return "\n".join(l)


m1 = Matrix(10, 10)
for i in range(10):
    for j in range(10):
        if (i+j) % 2 == 0:
            m1.set_cell(i, j, 20)

print(m1)