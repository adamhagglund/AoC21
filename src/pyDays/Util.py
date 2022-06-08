default_location = "../input/"

def parse_input_check(file):
    with open(default_location + file) as f:
        read_data = f.read()
        print(read_data)


def parse_input_to_array(file):
    with open(default_location + file) as f:
        array = f.read()
        return array

def parse_input_to_map(file, regex):
    with open(default_location + file) as f:
        array = f.read()
        return array
