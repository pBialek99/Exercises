from random import random


def get_number(a, b, text):
    x = input(f"Podaj liczbę z zakresu {a}-{b}: ")
    x = int(x)

    while True:
        if isinstance(x, int):
            if a <= x <= b:
                return x
                break


def lay_mines(number_of_mines, a, b):
    placed_mines = []

    for i in range(number_of_mines):
        x = random.randint(a, b)
        y = random.randint(a, b)
        mine = (x, y)

        while True:
            if mine in placed_mines:
                x = random.randint(a, b)
                y = random.randint(a, b)
                mine = (x, y)
            else:
                placed_mines.append(mine)
                break

    return set(placed_mines)


def number_of_neighbouring_mines(x, y, mines):
    number = 0
    possible_neighbours = ((x-1, y-1), (x, y-1), (x+1, y-1),
                  (x-1, y), (x, y), (x+1, y),
                  (x-1, y+1), (x, y+1), (x+1, y+1))

    for neighbour in possible_neighbours:
        if neighbour in mines:
            number += 1

    if number == 0:
        return ' '
    else:
        return str(number)

# a, b -> rozmiar planszy
# mines -> zbiór min (współrzędne)
def create_board(a, b, mines):
    board = []

    for i in range(a):
        row = []
        for j in range(b):
            if (i, j) in mines:
                row[j] = '*'
            else:
                row[j] = number_of_neighbouring_mines(i, j, mines)
        board.append(row)

    return board


def reveal_fields(x, y, board):
    possible_neighbours = ((x - 1, y - 1), (x, y - 1), (x + 1, y - 1),
                           (x - 1, y), (x, y), (x + 1, y),
                           (x - 1, y + 1), (x, y + 1), (x + 1, y + 1))

    # kiedy trafimy minę
    if board[x][y] == '*':
        pass
    # kiedy trafimy pole bez sąsiadujących min
    if board[x][y] == ' ':
        for field in possible_neighbours:
            reveal_fields(field[0], field[1], board)
    # kiedy trafimy pole z sąsiadującymi minami
    if board[x][y] != ' ' and board[x][y] != '*':
        pass


def print_board(a, b, board):
    for i in range(a):
        for j in range(b):
            print(board[i])