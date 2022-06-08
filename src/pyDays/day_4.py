from Util import *

def set_up():
    ret_array = parse_input_to_array("4.txt").split(",")
    bingo_array = []
    bingo_list = []
    print(ret_array)
    counter = 0
    for entry in ret_array:
        if "\n" not in entry:
            bingo_array.append(entry)
            bingo_array.append(15)
        else:
            sub_entry = entry.replace("\n", " ")
            bingo_list = sub_entry.split(" ")

    print(bingo_array)
    print(bingo_list)
if __name__ == '__main__':
    set_up()

