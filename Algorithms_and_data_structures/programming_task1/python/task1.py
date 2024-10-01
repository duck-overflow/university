import time
import matplotlib.pyplot as mpl
import numpy as np
from scipy.optimize import curve_fit

# pip install matplotlib numpy scipy

def fibonacci_recursive(n):
    if n <= 1:
        return n
    else:
        return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2)
    
def fibonacci_iterative(n):
    a, b = 0, 1
    for _ in range(n):
        a, b = b, a + b
    return a

n_values = range(3, 31)
recursive_time_list = []
recursive_result_list = []
iterative_time_list = []
iterative_result_list = []

for n in n_values:
    start_time = time.time()
    recursive_result_list.append(fibonacci_recursive(n))
    recursive_time_list.append(time.time() - start_time)
    
    start_time = time.time()
    iterative_result_list.append(fibonacci_iterative(n))
    iterative_time_list.append(time.time() - start_time)

result_match = recursive_result_list == iterative_result_list
print("Ergebnisübereinstimmung: ", result_match)

# Grafik

mpl.figure(figsize=(10, 6))
mpl.plot(n_values, recursive_time_list, label="Rekursiv", marker="D")
mpl.plot(n_values, iterative_time_list, label="Iterativ", marker="o")
mpl.xlabel("N-Werte")
mpl.ylabel("Rechenzeit in Sekunden")
mpl.title("Rechenzeit der Fibonacci-Zahlen")
mpl.legend()
mpl.grid(True)
mpl.show()

def exponential_fit(n, a, b):
    return a * np.exp(b * n)

params, _ = curve_fit(exponential_fit, list(n_values), recursive_time_list)

fitted_time_list = [exponential_fit(n, params[0], params[1]) for n in n_values]

mpl.figure(figsize=(10, 6))
mpl.plot(n_values, recursive_time_list, label="Rekursiv-Messung", marker="D")
mpl.plot(n_values, fitted_time_list, label="Rekursiv (gefitted)", linestyle="--")
mpl.xlabel("N-Werte")
mpl.ylabel("Rechenzeit in Sekunden")
mpl.title("Rekursive Rechenzeiten und gefittete Funktion")
mpl.legend()
mpl.grid(True)
mpl.show()

print("Fit-Parameter a & b: ", params)
