import sys

# import subprocess
# import os
# import time
# import matplotlib.pyplot as plt

if __name__ == "__main__":
    file_name = sys.argv[1]  # param 1
    block_sizes = map(lambda block_size: int(block_size), sys.argv[2:])  # params 2 to n

    print(
        f"This script executes matrix rotations for the matrices in file '{file_name}'",
        f"using the naive strategy, and the blocked strategy for block sizes: {', '.join(sys.argv[2:])}.",
    )
    print(
        "The result of this script is a graph 'graph.png' that shows the results",
        "with matrix size on the x-axis and time on the y-axis.",
    )
    print("Create one line for each block size and one line for the naive strategy.")
