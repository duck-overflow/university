import random
import time
import matplotlib.pyplot as mpl
import numpy as np

def bubblesort(arr):
    n = len(arr)
    for i in range(n):
        swapped = False
        for j in range(0, n-i-1):
            if arr[j] > arr[j + 1]:
                arr[j], arr[j + 1] = arr[j + 1], arr[j]
                swapped = True
        if not swapped:
            break

def generate_data(size):
    return random.sample(range(1, size * 10), size)

def average_sort_time(sizes, iterations):
    avg_time = []
    for size in sizes:
        total_time = 0
        for _ in range(iterations):
            data = generate_data(size)
            start_time = time.time()
            bubblesort(data)
            end_time = time.time()
            total_time += (end_time - start_time)
        avg_time.append(total_time / iterations)
    return avg_time

sizes = [1000, 2000, 3000, 4000, 5000, 6000, 7000, 8000, 9000, 10000]
iterations = 10
avg_times = average_sort_time(sizes, iterations)

mpl.figure(figsize=(10, 6))
mpl.plot(sizes, avg_times, marker='o')
mpl.title("Durchschnittliche Sortierzeit Bubblesort")
mpl.xlabel("Anzahl Elemente")
mpl.ylabel("Durchschnittszeit in Sekunden")
mpl.xscale("linear")
mpl.yscale("log")
mpl.grid()
mpl.show()

log_sizes = np.log(sizes)
log_avg_time = np.log(avg_times)
coeffs = np.polyfit(log_sizes, log_avg_time, 1)
poly = np.poly1d(coeffs)
fitted_time = np.exp(poly(log_sizes))

mpl.figure(figsize=(10, 6))
mpl.plot(sizes, avg_times, marker='o', label="Gemessene Zeit")
mpl.plot(sizes, fitted_time, label="Gefittete Kurve", linestyle="--")
mpl.title("Fit der Sortierzeiten")
mpl.xlabel("Anzahl der Elemente")
mpl.ylabel("Durchschnittszeit in Sekunden")
mpl.xscale("linear")
mpl.yscale("log")
mpl.grid()
mpl.legend()
mpl.show()
