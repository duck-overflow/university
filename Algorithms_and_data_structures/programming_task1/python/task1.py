import time
import matplotlib.pyplot as plt
import numpy as np
from scipy.optimize import curve_fit

# pip install matplotlib numpy scipy

# Rekursive Methode zur Berechnung der Fibonacci-Zahl
def fibonacci_recursive(n):
    if n <= 1:
        return n
    else:
        return fibonacci_recursive(n - 1) + fibonacci_recursive(n - 2)

# Iterative Methode zur Berechnung der Fibonacci-Zahl
def fibonacci_iterative(n):
    a, b = 0, 1
    for _ in range(n):
        a, b = b, a + b
    return a

# Zeitmessung für rekursiven und iterativen Algorithmus
n_values = range(3, 31)
recursive_times = []
iterative_times = []
recursive_results = []
iterative_results = []

for n in n_values:
    # Rekursive Berechnung und Zeitmessung
    start_time = time.time()
    recursive_result = fibonacci_recursive(n)
    recursive_time = time.time() - start_time
    recursive_times.append(recursive_time)
    recursive_results.append(recursive_result)
    
    # Iterative Berechnung und Zeitmessung
    start_time = time.time()
    iterative_result = fibonacci_iterative(n)
    iterative_time = time.time() - start_time
    iterative_times.append(iterative_time)
    iterative_results.append(iterative_result)

# Vergleich der Resultate
results_match = recursive_results == iterative_results
print("Ergebnisse stimmen überein:", results_match)

# Grafische Darstellung der Rechenzeiten
plt.figure(figsize=(10, 6))
plt.plot(n_values, recursive_times, label='Rekursiv', marker='o')
plt.plot(n_values, iterative_times, label='Iterativ', marker='s')
plt.xlabel('n')
plt.ylabel('Rechenzeit (Sekunden)')
plt.title('Rechenzeitvergleich der Fibonacci-Berechnung')
plt.legend()
plt.grid(True)
plt.show()

# Fitten der rekursiven Daten
def exponential_fit(n, a, b):
    return a * np.exp(b * n)

# Fitten der Rekursionszeiten mit einer exponentiellen Funktion
params, _ = curve_fit(exponential_fit, list(n_values), recursive_times)

# Plot der gefitteten Funktion
fitted_times = [exponential_fit(n, params[0], params[1]) for n in n_values]

plt.figure(figsize=(10, 6))
plt.plot(n_values, recursive_times, label='Rekursiv (gemessen)', marker='o')
plt.plot(n_values, fitted_times, label='Rekursiv (gefitte Funktion)', linestyle='--')
plt.xlabel('n')
plt.ylabel('Rechenzeit (Sekunden)')
plt.title('Rekursive Rechenzeit und gefittete Funktion')
plt.legend()
plt.grid(True)
plt.show()

# Ausgabe der Fit-Parameter
print("Fit-Parameter (a, b):", params)
